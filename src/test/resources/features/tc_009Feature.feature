Feature: Validar actualización de la fórmula en 'Monto Acumulado Folio OPC 2121'

  Scenario: Verificar que la fórmula en la columna 'Monto Acumulado Folio OPC 2121' esté actualizada
    Given el usuario está en la página con la tabla de datos
    When el usuario verifica la celda que contiene la fórmula actualizada
    Then la fórmula debe ser "=Z4+AD5+AE5+AH5+AC5+AB5+AM5" sumando correctamente los montos de las columnas indicadas