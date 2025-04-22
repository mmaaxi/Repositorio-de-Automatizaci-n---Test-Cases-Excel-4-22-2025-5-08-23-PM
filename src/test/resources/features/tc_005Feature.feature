Feature: Validate column name change in exported 'Claim Accounting Report'.

  Scenario: Verify the column name change from 'Monto Acumulado Folio OPC' to 'Monto Acumulado Folio OPC (2121)'
    Given I have accessed the 'Claim Accounting Report' export function
    When I export the report as an Excel file
    Then the Excel file should contain a column with the title 'Monto Acumulado Folio OPC (2121)'