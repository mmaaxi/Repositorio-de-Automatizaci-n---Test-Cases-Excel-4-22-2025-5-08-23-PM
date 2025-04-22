package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_010Page {

    WebDriver driver;

    public tc_010Page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    public void exportExcel() {
        // Code to export Excel
    }

    public void locateRamoColumn() {
        WebElement ramoColumn = driver.findElement(By.xpath("//th[contains(text(), 'Ramo')]"));
        // Further actions to validate location
    }

    public boolean isFolioPreSolicitudColumnInserted() {
        WebElement folioPreSolicitudColumn = driver.findElement(By.xpath("//th[contains(text(), 'Folio Pre solicitud')]"));
        return folioPreSolicitudColumn.isDisplayed(); // Confirming that column is displayed
    }
}