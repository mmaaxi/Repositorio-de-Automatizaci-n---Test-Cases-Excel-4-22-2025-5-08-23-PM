package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {

    WebDriver driver;

    private By reportPageLocator = By.id("reportPageId");
    private By exportButtonLocator = By.id("exportButton");
    private String newColumnHeader = "Monto acumulado Folio Reserva 5401";
    private String existingColumnHeader = "Monto (reserva)";

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openReportPage() {
        driver.findElement(reportPageLocator).click();
    }

    public void exportToExcel() {
        driver.findElement(exportButtonLocator).click();
    }

    public boolean isNewColumnInserted() {
        // Implement logic to confirm 'Monto acumulado Folio Reserva 5401' is inserted correctly
        WebElement newColumn = driver.findElement(By.xpath("//th[contains(text(),'" + newColumnHeader + "')]"));
        WebElement adjacentColumn = newColumn.findElement(By.xpath("preceding-sibling::th[contains(text(),'" + existingColumnHeader + "')]"));
        return (newColumn != null && adjacentColumn != null);
    }

    public boolean isSumFormulaCorrect() {
        // Implement logic to validate sum formula in new column
        // This might require reading contents of the cell and verifying formula
        return true; // Placeholder
    }
}