package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

import java.util.List;

public class tc_011Page {

    WebDriver driver = DriverFactory.getDriver();

    private By exportarButton = By.id("exportar");
    private By columnas = By.cssSelector("table thead tr th");

    public void exportarArchivo() {
        driver.findElement(exportarButton).click();
    }

    public void verificarPosicionColumnas() {
        List<WebElement> allColumns = driver.findElements(columnas);
        int precSolicitudIndex = -1;
        int folioPagoIndex = -1;

        for (int i = 0; i < allColumns.size(); i++) {
            String columnName = allColumns.get(i).getText();
            if (columnName.equals("Folio Pre solicitud")) {
                precSolicitudIndex = i;
            }
            if (columnName.equals("Folio de Pago")) {
                folioPagoIndex = i;
            }
        }

        if (precSolicitudIndex == -1 || folioPagoIndex != precSolicitudIndex + 1) {
            throw new AssertionError("La columna 'Folio de Pago' no está al lado derecho de 'Folio Pre solicitud'");
        }
    }

    public boolean isColumnaFolioDePagoCorrecta() {
        List<WebElement> allColumns = driver.findElements(columnas);
        int precSolicitudIndex = -1;
        int folioPagoIndex = -1;

        for (int i = 0; i < allColumns.size(); i++) {
            String columnName = allColumns.get(i).getText();
            if (columnName.equals("Folio Pre solicitud")) {
                precSolicitudIndex = i;
            }
            if (columnName.equals("Folio de Pago")) {
                folioPagoIndex = i;
            }
        }

        return folioPagoIndex == precSolicitudIndex + 1;
    }
}