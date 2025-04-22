package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_001Page;

import static org.junit.Assert.assertTrue;

public class tc_001Steps {
    private tc_001Page page;

    @Before
    public void setUp() {
        page = new tc_001Page();
        page.init();
    }

    @Given("I am logged into the application")
    public void iAmLoggedIntoTheApplication() {
        page.loginToApplication();
    }

    @When("I export the 'Claim Accounting Report'")
    public void iExportTheClaimAccountingReport() {
        page.exportClaimAccountingReport();
    }

    @Then("an Excel file is generated")
    public void anExcelFileIsGenerated() {
        assertTrue(page.isExcelGenerated());
    }

    @Then("the Excel contains a column with a composite key")
    public void theExcelContainsAColumnWithACompositeKey() {
        assertTrue(page.doesExcelContainCompositeKeyColumn());
    }
    
    @Then("the composite key in column C is generated with the formula =CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2)")
    public void theCompositeKeyIsGeneratedCorrectly() {
        assertTrue(page.isCompositeKeyGeneratedCorrectly());
    }

    @After
    public void tearDown() {
        page.cleanUp();
    }
}