package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    tc_005Page claimAccountingPage = new tc_005Page();

    @Given("^I have accessed the 'Claim Accounting Report' export function$")
    public void accessClaimAccountingReportExportFunction() {
        claimAccountingPage.navigateToClaimAccountingReport();
    }

    @When("^I export the report as an Excel file$")
    public void exportReportAsExcelFile() {
        claimAccountingPage.exportReportToExcel();
    }

    @Then("^the Excel file should contain a column with the title 'Monto Acumulado Folio OPC \\(2121\\)'$")
    public void verifyExcelColumnName() {
        boolean isColumnNameCorrect = claimAccountingPage.isColumnNameCorrectInExcel("Monto Acumulado Folio OPC (2121)");
        Assert.assertTrue("The column name is not as expected in the Excel report", isColumnNameCorrect);
    }
}