package builder;

import model.Report;

public interface ReportBuilder {
    ReportBuilder reset();
    ReportBuilder setHeader(String systemName, String environment);
    ReportBuilder addMetric(String metricName, double value, String unit);
    ReportBuilder setStatus(String status);
    ReportBuilder setTimestamp(String timestamp);
    Report build();
}