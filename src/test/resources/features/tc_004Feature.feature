Feature: Validate insertion of the column 'Monto acumulado Folio Reserva 5401'

  Scenario: Export Excel and validate new column insertion
    Given I navigate to the report page
    When I export the report to Excel
    Then I should see a new column 'Monto acumulado Folio Reserva 5401' inserted next to 'Monto (reserva)'
    And the column should contain the correct sum formula