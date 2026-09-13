# Assignment 1: Builder Pattern

## Overview
Implementation of the Builder creational design pattern in Java for generating system health reports in multiple representations JSON and Markdown

## Structure
- `model/Report.java`: The immutable product class
- `builder/ReportBuilder.java`: Common builder interface declaring construction steps
- `builder/JsonReportBuilder.java`: Concrete builder creating structured machine-readable JSON reports
- `builder/MarkdownReportBuilder.java`: Concrete builder creating human-readable Markdown tables and summaries
- `director/ReportDirector.java`: Orchestrates standard build routines `DailyHealthCheck`, `CriticalIncidentReport`
- `Main.java`: Client demonstrating director-driven and custom fluent-API object construction

## How to Run
Run `Main.java` with JDK 17+ in IntelliJ IDEA