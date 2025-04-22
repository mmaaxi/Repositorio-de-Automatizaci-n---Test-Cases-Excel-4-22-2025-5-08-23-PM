Feature: Validate insertion of 'Folio Pre solicitud' column

  Scenario: Insert 'Folio Pre solicitud' column immediately to the right of 'Ramo' after exporting Excel
    Given I have exported the Excel
    When I locate the 'Ramo' column
    Then A new column 'Folio Pre solicitud' should be inserted immediately to the right of 'Ramo'