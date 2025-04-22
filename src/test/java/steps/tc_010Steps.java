package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("I have exported the Excel")
    public void exportExcel() {
        page.exportExcel();
    }

    @When("I locate the 'Ramo' column")
    public void locateRamoColumn() {
        page.locateRamoColumn();
    }

    @Then("A new column 'Folio Pre solicitud' should be inserted immediately to the right of 'Ramo'")
    public void validateColumnInsertion() {
        boolean isColumnInserted = page.isFolioPreSolicitudColumnInserted();
        Assert.assertTrue("The column 'Folio Pre solicitud' was not inserted correctly.", isColumnInserted);
    }
}