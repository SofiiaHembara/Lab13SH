import org.example.task3.BrandFetchReader;
import org.example.task3.Company;
import org.example.task3.CompanyReaderFacade;
import org.example.task3.PDLReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTask3 {

    @Test
    void testFetchWithPDLAndBrandFetch() {
        CompanyReaderFacade facade = new CompanyReaderFacade();

        // Mock dependencies (if real API calls are unavailable)
        PDLReader pdlReader = new PDLReader() {
            @Override
            public Company fetch(String companyName) {
                Company company = new Company();
                company.setName("Mocked PDL Name");
                company.setDescription("Mocked PDL Description");
                return company;
            }
        };

        BrandFetchReader brandFetchReader = new BrandFetchReader() {
            @Override
            public Company fetch(String companyName) {
                Company company = new Company();
                company.setName("Mocked BrandFetch Name");
                company.setDescription(null);
                return company;
            }
        };

        Company company = facade.fetch("mock.com");

        assertEquals("Mocked BrandFetch Name", company.getName(), "Name should prefer BrandFetch");
        assertNull(company.getDescription(), "Description should be null if not provided by BrandFetch");
    }
}