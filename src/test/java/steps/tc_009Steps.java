import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    WebDriver driver;
    tc_009Page page;

    public tc_009Steps() {
        this.driver = Hooks.getDriver();
        page = new tc_009Page(driver);
    }

    @Given("el usuario está en la página con la tabla de datos")
    public void el_usuario_esta_en_la_pagina_con_la_tabla_de_datos() {
        driver.get("URL_DE_LA_PAGINA_CON_LA_TABLA");
    }

    @When("el usuario verifica la celda que contiene la fórmula actualizada")
    public void el_usuario_verifica_la_celda_que_contiene_la_formua_actualizada() {
        page.clickEnCeldaFormula();
    }

    @Then("la fórmula debe ser {string} sumando correctamente los montos de las columnas indicadas")
    public void la_fórmula_debe_ser_sumando_correctamente_los_montos_de_las_columnas_indicadas(String formulaEsperada) {
        String formulaActual = page.obtenerFormulaDeCelda();
        Assert.assertEquals(formulaEsperada, formulaActual);
    }
}