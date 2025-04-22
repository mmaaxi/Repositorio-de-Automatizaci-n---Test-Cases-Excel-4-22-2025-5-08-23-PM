Feature: Validate insertion of 'Estado Código' column

  Scenario: Export Excel and verify 'Estado Código' column
    Given I have access to the 'Claim Accounting Report'
    When I export the Excel report
    Then the Excel file should contain a column named 'Estado Código' immediately to the right of the column 'i'