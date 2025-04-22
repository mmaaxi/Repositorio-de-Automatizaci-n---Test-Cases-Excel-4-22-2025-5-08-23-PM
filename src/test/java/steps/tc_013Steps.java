package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_013Page;

public class tc_013Steps {
    WebDriver driver;
    tc_013Page page;

    @Given("el usuario está en la página de exportación de informes")
    public void el_usuario_esta_en_la_pagina_de_exportacion_de_informes() {
        page = new tc_013Page(driver);
        page.navigateToExportPage();
    }

    @When("el usuario realiza la exportación del informe")
    public void el_usuario_realiza_la_exportacion_del_informe() {
        page.exportReport();
    }

    @Then("el nombre de la columna 'Status de Pago' debería cambiar a 'Descripción Status Pago'")
    public void el_nombre_de_la_columna_deberia_cambiar() {
        String columnHeader = page.getColumnHeader();
        Assert.assertEquals("Descripción Status Pago", columnHeader);
    }
}