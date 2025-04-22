package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;
import pages.tc_012Page;

public class tc_012Steps {
    tc_012Page page = new tc_012Page();

    @Given("el usuario ha exportado el archivo Excel")
    public void elUsuarioHaExportadoElArchivoExcel() {
        page.exportExcel();
    }

    @When("el usuario ubica la columna {string}")
    public void elUsuarioUbicaLaColumna(String columna) {
        page.locateColumn(columna);
    }

    @Then("se añade una nueva columna {string} justo al lado derecho de {string}")
    public void seAñadeUnaNuevaColumnaJustoALadoDerechoDe(String nuevaColumna, String columnaReferencia) {
        assertTrue(page.isColumnAddedRightTo(nuevaColumna, columnaReferencia));
    }
}