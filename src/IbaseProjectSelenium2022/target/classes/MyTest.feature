Feature: New way of writing test cases

  Scenario: Verify addition of two number is correct
    Given The calculator app is avaialble
    When  I enter 2 and 2
    And press = button
    Then I should see 4
