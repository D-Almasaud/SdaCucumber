
  Feature:  Task01 samsung and cucumber

  @samsung
  Scenario: TC01_samsungSearch
    Given user goes to google page
    When user searches for "samsung"
    Then  tests that the page title contains the word "samsung"
    And close the page

  @cucumber
  Scenario: TC02_cucumberSearch
    Given user goes to google page
    When user searches for "cucumber"
    Then  tests that the page title contains the word "cucumber"
    And close the page