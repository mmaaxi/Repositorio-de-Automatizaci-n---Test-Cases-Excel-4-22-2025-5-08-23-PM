package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_014Page;

public class tc_014Steps {

    tc_014Page reportePage = new tc_014Page();

    @Given("el usuario ha iniciado sesión y navegado al módulo de reportes")
    public void usuarioNavegaReporte() {
        reportePage.iniciarSesion();
        reportePage.navegarModuloReportes();
    }

    @When("el usuario exporta el reporte")
    public void usuarioExportaReporte() {
        reportePage.exportarReporte();
    }

    @Then("la fórmula en la columna 'IVA Acumulado' debe incluir tipos de IVA 16%, FRONTERIZO, 0% y EXENTO, excluyendo retenidos")
    public void verificarFormulaIVA() {
        String formulaAplicada = reportePage.obtenerFormulaIVA();
        Assert.assertTrue("La fórmula no se aplicó correctamente", 
            formulaAplicada.contains("16%") &&
            formulaAplicada.contains("FRONTERIZO") &&
            formulaAplicada.contains("0%") &&
            formulaAplicada.contains("EXENTO") &&
            !formulaAplicada.contains("retenidos"));
    }
}