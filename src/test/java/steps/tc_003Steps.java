package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("el usuario está en la aplicación")
    public void el_usuario_está_en_la_aplicación() {
        page.navigateToApp();
    }

    @When("el usuario exporta el Excel con datos de prueba en la columna 'estado'")
    public void el_usuario_exporta_el_Excel_con_datos_de_prueba_en_la_columna_estado() {
        page.exportExcelWithStateData();
    }

    @Then("los valores de la columna 'estado' se actualizan según las especificaciones del requerimiento")
    public void los_valores_de_la_columna_estado_se_actualizan_segun_las_especificaciones_del_requerimiento() {
        Assert.assertTrue(page.areStateValuesUpdatedCorrectly());
    }
}