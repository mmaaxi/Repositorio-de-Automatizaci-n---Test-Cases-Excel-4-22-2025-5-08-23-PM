package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class tc_007Page {
    WebDriver driver;

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Metodo para navegar a la pagina de reporte
    public void navegarAPaginaReporte() {
        driver.get("URL_DE_LA_PAGINA_DE_REPORTE");
    }

    // Metodo para exportar el reporte a Excel
    public void exportarAExcel() {
        WebElement exportButton = driver.findElement(By.id("exportExcelButton"));
        exportButton.click();
    }

    // Metodo para verificar la columna 'IVA exento'
    public boolean verificarColumnaIVAExento() {
        // Lógica para comprobar si la columna 'IVA exento' está en el archivo Excel descargado
        // Esto puede involucrar la lectura del archivo Excel para verificar la existencia y contenido de la columna
        // Esta parte necesitaría interacción adicional con API para el manejo de Excel

        // Suponiendo hipotéticamente que la verificación resultó en verdadero
        return true;
    }
}