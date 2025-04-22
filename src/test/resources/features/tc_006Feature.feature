Feature: Validate insertion of 'IVA 0%' column

  Scenario: Export report and verify the generated columns in Excel
    Given I am on the report export page
    When I export the report as Excel
    Then the Excel file should have a new column titled 'IVA 0%' filled with amounts applicable to 0% IVA