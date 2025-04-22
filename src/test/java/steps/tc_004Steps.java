package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_004Page;
import org.junit.Assert;

public class tc_004Steps {

    tc_004Page reportPage = new tc_004Page();

    @Given("I navigate to the report page")
    public void navigateToReportPage() {
        reportPage.openReportPage();
    }

    @When("I export the report to Excel")
    public void exportReportToExcel() {
        reportPage.exportToExcel();
    }

    @Then("I should see a new column 'Monto acumulado Folio Reserva 5401' inserted next to 'Monto (reserva)'")
    public void validateNewColumnInsertion() {
        Assert.assertTrue(reportPage.isNewColumnInserted());
    }

    @Then("the column should contain the correct sum formula")
    public void validateSumFormulaInNewColumn() {
        Assert.assertTrue(reportPage.isSumFormulaCorrect());
    }
}