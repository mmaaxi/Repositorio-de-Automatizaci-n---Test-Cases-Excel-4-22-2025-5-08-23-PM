package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_014Page {
    WebDriver driver;

    // Locators
    By botonIniciarSesion = By.id("btn-login");
    By moduloReportes = By.id("module-reportes");
    By botonExportarReporte = By.id("exportar-reporte");
    By columnaIvaAcumulado = By.id("columna-iva-acumulado");

    public tc_014Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarSesion() {
        driver.findElement(botonIniciarSesion).click();
        // agregar otros pasos como llenar usuario/contraseña si es necesario
    }

    public void navegarModuloReportes() {
        driver.findElement(moduloReportes).click();
    }

    public void exportarReporte() {
        driver.findElement(botonExportarReporte).click();
    }

    public String obtenerFormulaIVA() {
        // Obtener el contenido de la columna donde se encuentra la fórmula
        return driver.findElement(columnaIvaAcumulado).getText();
    }
}