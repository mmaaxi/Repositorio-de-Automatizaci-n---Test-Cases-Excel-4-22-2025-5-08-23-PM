Feature: Validar inserción de la columna 'IVA retenido'

  Scenario: Exportar reporte y verificar columna 'IVA retenido'
    Given The user exports the report
    When The report is generated
    Then The Excel contains the column 'IVA retenido' with corresponding values