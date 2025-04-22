package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {
    tc_007Page exportPage = new tc_007Page();

    @Given("el usuario está en la página de reporte")
    public void el_usuario_está_en_la_página_de_reporte() {
        exportPage.navegarAPaginaReporte();
    }

    @When("el usuario exporta el reporte a Excel")
    public void el_usuario_exporta_el_reporte_a_Excel() {
        exportPage.exportarAExcel();
    }

    @Then("el Excel contiene la columna 'IVA exento' con los montos correspondientes")
    public void el_Excel_contiene_la_columna_IVA_exento_con_los_montos_correspondientes() {
        Assert.assertTrue(exportPage.verificarColumnaIVAExento());
    }
}