package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class tc_008Page {

    private WebDriver driver;

    private By exportButton = By.id("exportReportButton");
    private By reportTable = By.id("reportTable");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickExportReport() {
        driver.findElement(exportButton).click();
    }

    public boolean isReportGenerated() {
        // Add logic to verify that the report is generated
        return driver.findElements(reportTable).size() > 0;
    }

    public boolean doesColumnExistWithValues(String columnName) {
        // Add logic to check if column exists in Excel and has values
        List<WebElement> columns = driver.findElements(By.xpath("//th[contains(text(),'" + columnName + "')]"));
        boolean columnExists = !columns.isEmpty();
        boolean columnHasValues = driver.findElements(By.xpath("//td[contains(text(),'someExpectedValue')]")).size() > 0;

        return columnExists && columnHasValues;
    }
}