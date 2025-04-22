package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_013Page {
    WebDriver driver;

    By exportButton = By.id("exportButton");
    By columnHeaderLocator = By.xpath("//table/thead/tr/th[contains(text(), 'Descripción Status Pago')]");

    public tc_013Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToExportPage() {
        driver.get("http://example.com/export");
    }

    public void exportReport() {
        driver.findElement(exportButton).click();
    }

    public String getColumnHeader() {
        return driver.findElement(columnHeaderLocator).getText();
    }
}