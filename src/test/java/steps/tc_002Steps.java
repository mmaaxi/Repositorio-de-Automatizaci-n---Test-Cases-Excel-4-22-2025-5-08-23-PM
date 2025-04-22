package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_002Page;
import static org.junit.Assert.*;

public class tc_002Steps {

    tc_002Page page = new tc_002Page();

    @Given("I have access to the 'Claim Accounting Report'")
    public void i_have_access_to_report() {
        page.openClaimAccountingReport();
    }

    @When("I export the Excel report")
    public void i_export_the_excel_report() {
        page.exportExcelReport();
    }

    @Then("the Excel file should contain a column named 'Estado Código' immediately to the right of the column 'i'")
    public void the_excel_file_should_contain_estado_codigo_column() {
        boolean isColumnPresent = page.isEstadoCodigoColumnPresent();
        assertTrue("The column 'Estado Código' is not present immediately to the right of column 'i'", isColumnPresent);
    }
}