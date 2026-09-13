package director;

import builder.ReportBuilder;
import model.Report;

public class ReportDirector {

    public Report constructDailyHealthCheck(ReportBuilder builder) {
        return builder.reset()
                .setHeader("Auth-Service", "Production-KZ")
                .setStatus("HEALTHY")
                .setTimestamp("2026-09-13 20:00:00 UTC")
                .addMetric("CPU Usage", 18.5, "%")
                .addMetric("RAM Consumption", 412.0, "MB")
                .addMetric("Network Latency", 12.4, "ms")
                .build();
    }

    public Report constructCriticalIncidentReport(ReportBuilder builder) {
        return builder.reset()
                .setHeader("Payment-Gateway", "Production-KZ")
                .setStatus("CRITICAL_OUTAGE")
                .setTimestamp("2026-09-13 20:30:15 UTC")
                .addMetric("Error Rate", 68.2, "%")
                .addMetric("Database Connection Pool", 100.0, "%")
                .build();
    }
}