package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("^I am on the report export page$")
    public void i_am_on_the_report_export_page() {
        page.navigateToReportExportPage();
    }

    @When("^I export the report as Excel$")
    public void i_export_the_report_as_Excel() {
        page.exportReportAsExcel();
    }

    @Then("^the Excel file should have a new column titled 'IVA 0%' filled with amounts applicable to 0% IVA$")
    public void validate_ivazero_column_in_excel() {
        Assert.assertTrue(page.isIvaZeroColumnPresentAndCorrect());
    }
}