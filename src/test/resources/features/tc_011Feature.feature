Feature: Validar inserción de la columna 'Folio de Pago'

  Scenario: Verificar la posición de la columna 'Folio de Pago' tras exportar el archivo
    Given que el usuario ha exportado el archivo
    When se verifica la posición de las columnas
    Then la columna 'Folio de Pago' se muestra al lado derecho de 'Folio Pre solicitud'