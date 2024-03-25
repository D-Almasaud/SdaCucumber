Feature: Task01

  This is the description that i am adding to the feature


  Scenario: TC01_samsungSearch
    Given user goes to google page
    When user search for "samsung"
    Then test the page title contain word "samsung"
    Then I close the browser


  Scenario: TC02_cucumberSearch
    Given user goes to google page
    When user search for "cucumber"
    Then test the page title contain word "cucmber"
    Then I close the browser
