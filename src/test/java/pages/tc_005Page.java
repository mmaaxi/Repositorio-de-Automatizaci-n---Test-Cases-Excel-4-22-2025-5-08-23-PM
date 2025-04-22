package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class tc_005Page {
    private WebDriver driver;
    private By exportButton = By.id("exportBtn");
    private By excelFileLink = By.id("downloadExcel");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToClaimAccountingReport() {
        // Code to navigate to the Claim Accounting Report page.
    }

    public void exportReportToExcel() {
        driver.findElement(exportButton).click();
        // Code to handle file download if necessary.
    }

    public boolean isColumnNameCorrectInExcel(String expectedColumnName) {
        // Code to open the downloaded Excel file and check for the column name.
        // This might involve using a library like Apache POI to read the Excel file.
        return true; // Replace with actual logic after reading the Excel file.
    }
}