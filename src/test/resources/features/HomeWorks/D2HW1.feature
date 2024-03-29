Feature: Scenario Outline Example

  Scenario Outline: Dynamic URLs
    Given the user navigates to the "<page_url>" page
    Then the user waits for 5 seconds
    And the user verifies that the page title contains "<keyword>"
    And the user closes the page

    Examples:
      | page_url    | keyword |
      | IgoogleUrl  | googleKeyword |
      | amazonUrl   | amazonKeyword |
      | trendyolUrl | trendyolKeyword |