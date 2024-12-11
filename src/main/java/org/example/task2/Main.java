package org.example.task2;

public class Main {
    public static void main(String[] args) {
        // Ukrainian legacy report builder
        UkrainianReportBuilder ukrainianReportBuilder = new UkrainianReportBuilder();

        // Use adapter to align with new interface
        ReportBuilder reportBuilder = new ReportBuilderAdapter(ukrainianReportBuilder);

        // New unified methods
        reportBuilder.createReport();
        reportBuilder.addData("Company data");
        reportBuilder.finishReport();
    }
}