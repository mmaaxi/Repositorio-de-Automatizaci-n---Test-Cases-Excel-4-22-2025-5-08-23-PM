Feature: Validación del cambio de nombre de la columna 'Status de Pago'
  Para verificar el correcto cambio de nombre de la columna 'Status de Pago' a 'Descripción Status Pago'

  Scenario: Exportar informe y verificar la cabecera de la columna
    Given el usuario está en la página de exportación de informes
    When el usuario realiza la exportación del informe
    Then el nombre de la columna 'Status de Pago' debería cambiar a 'Descripción Status Pago'