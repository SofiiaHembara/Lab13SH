import org.example.task2.ReportBuilderAdapter;
import org.example.task2.UkrainianReportBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestTask2 {

    @Test
    void testCreateReport() {
        UkrainianReportBuilder ukrainianReportBuilder = new UkrainianReportBuilder();
        ReportBuilderAdapter adapter = new ReportBuilderAdapter(ukrainianReportBuilder);
        assertDoesNotThrow(adapter::createReport, "createReport should not throw an exception");
    }

    @Test
    void testAddData() {
        UkrainianReportBuilder ukrainianReportBuilder = new UkrainianReportBuilder();
        ReportBuilderAdapter adapter = new ReportBuilderAdapter(ukrainianReportBuilder);
        assertDoesNotThrow(() -> adapter.addData("Test Data"), "addData should not throw an exception");
    }

    @Test
    void testFinishReport() {
        UkrainianReportBuilder ukrainianReportBuilder = new UkrainianReportBuilder();
        ReportBuilderAdapter adapter = new ReportBuilderAdapter(ukrainianReportBuilder);
        assertDoesNotThrow(adapter::finishReport, "finishReport should not throw an exception");
    }
}