Feature: Actualización de campos en la columna "estado"

  Scenario: Validar actualización de campos en la columna "estado"
    Given el usuario está en la aplicación
    When el usuario exporta el Excel con datos de prueba en la columna "estado"
    Then los valores de la columna "estado" se actualizan según las especificaciones del requerimiento