Feature: Validar inserción de la columna 'IVA exento'

  Scenario: Exportar el Excel a partir del reporte
    Given el usuario está en la página de reporte
    When el usuario exporta el reporte a Excel
    Then el Excel contiene la columna 'IVA exento' con los montos correspondientes