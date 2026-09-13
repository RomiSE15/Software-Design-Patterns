package builder;

import model.Report;
import java.util.ArrayList;
import java.util.List;

public class MarkdownReportBuilder implements ReportBuilder {
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
        this.metrics.add(String.format("| %-18s | %-10.2f | %-8s |", metricName, value, unit));
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
            throw new IllegalStateException("Build failed: 'systemName' is mandatory for Markdown report.");
        }
        if (status == null || status.isBlank()) {
            throw new IllegalStateException("Build failed: 'status' is mandatory for Markdown report.");
        }

        StringBuilder md = new StringBuilder();
        md.append("# System Health Report: ").append(systemName).append("\n\n");
        md.append("- **Environment:** ").append(environment != null ? environment : "N/A").append("\n");
        md.append("- **Current Status:** ").append(status).append("\n");
        md.append("- **Generated At:** ").append(timestamp != null ? timestamp : "N/A").append("\n\n");
        md.append("### Performance Metrics\n");
        md.append("| Metric Name        | Value      | Unit     |\n");
        md.append("|--------------------|------------|----------|\n");
        for (String metricRow : metrics) {
            md.append(metricRow).append("\n");
        }

        return new Report(systemName + " Health Check", md.toString(), "MARKDOWN");
    }
}