Feature: Input Validation

  Background:
    Given I am on the input validation page

  Scenario: Fill form with valid data and submit
    When I fill the form with valid data
    And I submit the form
    Then I should see the success message

  Scenario: Fill form with invalid data and submit
    When I fill the form with invalid data
    And I submit the form
    Then I should see the validation error message

  Scenario: Fill form with empty data and submit
    When I leave the form fields empty
    And I submit the form
    Then I should see the validation error message
