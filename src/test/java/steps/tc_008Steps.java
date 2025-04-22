package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("The user exports the report")
    public void the_user_exports_the_report() {
        page.clickExportReport();
    }

    @When("The report is generated")
    public void the_report_is_generated() {
        Assert.assertTrue(page.isReportGenerated());
    }

    @Then("The Excel contains the column 'IVA retenido' with corresponding values")
    public void the_excel_contains_the_column_iva_retenido_with_corresponding_values() {
        Assert.assertTrue(page.doesColumnExistWithValues("IVA retenido"));
    }
}