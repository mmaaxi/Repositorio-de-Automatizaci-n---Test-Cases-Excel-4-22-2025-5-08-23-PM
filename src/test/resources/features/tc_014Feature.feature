Feature: Validar actualización de la fórmula en 'IVA Acumulado'

  Scenario: Exportar reporte y verificar fórmula en 'IVA Acumulado'
    Given el usuario ha iniciado sesión y navegado al módulo de reportes
    When el usuario exporta el reporte
    Then la fórmula en la columna 'IVA Acumulado' debe incluir tipos de IVA 16%, FRONTERIZO, 0% y EXENTO, excluyendo retenidos