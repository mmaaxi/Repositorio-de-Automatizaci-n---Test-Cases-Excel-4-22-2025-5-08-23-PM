import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {

    WebDriver driver;

    // Selector para la celda que contiene la fórmula
    By selectorCeldaFormula = By.xpath("//path/to/cell[contains(@class, 'formula')]");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    // Método para hacer clic en la celda de la fórmula
    public void clickEnCeldaFormula() {
        WebElement celdaFormula = driver.findElement(selectorCeldaFormula);
        celdaFormula.click();
    }

    // Método para obtener la fórmula de la celda
    public String obtenerFormulaDeCelda() {
        WebElement celdaFormula = driver.findElement(selectorCeldaFormula);
        return celdaFormula.getAttribute("innerText");
    }
}