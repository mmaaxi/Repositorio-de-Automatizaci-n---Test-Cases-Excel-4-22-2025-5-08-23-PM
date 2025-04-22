Feature: Validate composite key generation in Excel

  Scenario: Generate 'Claim Accounting Report' and validate composite key
    Given I am logged into the application
    When I export the 'Claim Accounting Report'
    Then an Excel file is generated
    And the Excel contains a column with a composite key
    And the composite key in column C is generated with the formula =CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2)