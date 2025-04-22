Feature: Validar inserción de la columna "Status Pago Código"

  Scenario: Añadir columna Status Pago Código después de Fecha de Pago
    Given el usuario ha exportado el archivo Excel
    When el usuario ubica la columna "Fecha de Pago"
    Then se añade una nueva columna "Status Pago Código" justo al lado derecho de "Fecha de Pago"