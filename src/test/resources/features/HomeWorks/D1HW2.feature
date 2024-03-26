Feature: Click buttons to see message

  Scenario: Click buttons to see message 'All Buttons Clicked!
    Given I am on the dynamic buttons page
    When I click the first button
    And I click the second button
    And I click the third button
    And I click the fourth button
    Then I should see the message 'All Buttons Clicked!'