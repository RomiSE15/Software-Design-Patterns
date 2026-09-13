package builder;

import model.Report;
import java.util.ArrayList;
import java.util.List;

public class JsonReportBuilder implements ReportBuilder {
    private String systemName;
    private String environment;
    private String status;
    private String timestamp;
    private final List<String> metrics = new ArrayList<>();

    @Override
    public ReportBuilder reset() {
        this.systemName = null;
        this.environment = null;
        this.status = null;
        this.timestamp = null;
        this.metrics.clear();
        return this;
    }

    @Override
    public ReportBuilder setHeader(String systemName, String environment) {
        this.systemName = systemName;
        this.environment = environment;
        return this;
    }

    @Override
    public ReportBuilder addMetric(String metricName, double value, String unit) {
        String metricJson = String.format("    {\"metric\": \"%s\", \"value\": %.2f, \"unit\": \"%s\"}",
                metricName, value, unit);
        this.metrics.add(metricJson);
        return this;
    }

    @Override
    public ReportBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public ReportBuilder setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public Report build() {
        if (systemName == null || systemName.isBlank()) {
            throw new IllegalStateException("Build failed: 'systemName' is mandatory for JSON report.");
        }
        if (status == null || status.isBlank()) {
            throw new IllegalStateException("Build failed: 'status' is mandatory for JSON report.");
        }

        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append(String.format("  \"system\": \"%s\",\n", systemName));
        json.append(String.format("  \"environment\": \"%s\",\n", environment != null ? environment : "N/A"));
        json.append(String.format("  \"status\": \"%s\",\n", status));
        json.append(String.format("  \"timestamp\": \"%s\",\n", timestamp != null ? timestamp : "N/A"));
        json.append("  \"metrics\": [\n");
        json.append(String.join(",\n", metrics));
        json.append("\n  ]\n}");

        return new Report(systemName + " Health Check", json.toString(), "JSON");
    }
}