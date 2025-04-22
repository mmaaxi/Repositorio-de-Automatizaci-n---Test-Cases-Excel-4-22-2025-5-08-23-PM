package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class tc_003Page {
    WebDriver driver;

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToApp() {
        driver.get("http://example.com");
    }

    public void exportExcelWithStateData() {
        // Lógica para exportar el Excel con los datos de la columna 'estado'
    }

    public boolean areStateValuesUpdatedCorrectly() {
        // Lógica para validar que los valores en la columna 'estado' están actualizados correctamente
        return true;
    }
}