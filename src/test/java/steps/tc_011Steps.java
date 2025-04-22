package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_011Page;

public class tc_011Steps {

    tc_011Page page = new tc_011Page();

    @Given("que el usuario ha exportado el archivo")
    public void exportarArchivo() {
        page.exportarArchivo();
    }

    @When("se verifica la posición de las columnas")
    public void verificarPosicionColumnas() {
        page.verificarPosicionColumnas();
    }

    @Then("la columna 'Folio de Pago' se muestra al lado derecho de 'Folio Pre solicitud'")
    public void validarColumnaFolioDePago() {
        Assert.assertTrue(page.isColumnaFolioDePagoCorrecta());
    }
}