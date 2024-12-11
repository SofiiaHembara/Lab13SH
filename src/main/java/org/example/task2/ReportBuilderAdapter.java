package org.example.task2;

public class ReportBuilderAdapter implements ReportBuilder {
    private final UkrainianReportBuilder ukrainianReportBuilder;

    public ReportBuilderAdapter(UkrainianReportBuilder ukrainianReportBuilder) {
        this.ukrainianReportBuilder = ukrainianReportBuilder;
    }

    @Override
    public void createReport() {
        ukrainianReportBuilder.create();
    }

    @Override
    public void addData(String data) {
        ukrainianReportBuilder.add(data);
    }

    @Override
    public void finishReport() {
        ukrainianReportBuilder.complete();
    }
}
