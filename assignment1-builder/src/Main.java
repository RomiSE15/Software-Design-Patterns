import builder.JsonReportBuilder;
import builder.MarkdownReportBuilder;
import builder.ReportBuilder;
import director.ReportDirector;
import model.Report;

public class Main {
    public static void main(String[] args) {
        ReportDirector director = new ReportDirector();

        ReportBuilder jsonBuilder = new JsonReportBuilder();
        Report dailyJsonReport = director.constructDailyHealthCheck(jsonBuilder);
        dailyJsonReport.display();

        ReportBuilder mdBuilder = new MarkdownReportBuilder();
        Report dailyMdReport = director.constructDailyHealthCheck(mdBuilder);
        dailyMdReport.display();

        Report criticalIncidentReport = director.constructCriticalIncidentReport(mdBuilder);
        criticalIncidentReport.display();

        Report customReport = new JsonReportBuilder()
                .setHeader("Analytics-Worker", "Staging")
                .setStatus("DEGRADED")
                .setTimestamp("2026-09-13 20:45:00 UTC")
                .addMetric("Queue Backlog", 1450.0, "jobs")
                .build();
        customReport.display();
    }
}