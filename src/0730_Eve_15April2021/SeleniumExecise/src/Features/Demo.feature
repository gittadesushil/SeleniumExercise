Feature: Demo purpose feature file

  Scenario: Test case one
    Given I have a precondition
    When I perform some action
    Then I see the result or verification

  Scenario: Test case two
    Given I have a precondition
    When I perform some action
    Then I see the result or verification

  Scenario Outline: Test case three
    Given I go to the icream shop
    When I purchase iceream <Name>
    And I pay amount <price>
    Then I can eat the icream <Name>
    Examples:
      | Name      |price|
      | Vanilla   |15   |
      | chocolate |20   |
      | straberry |10   |
      | pista     |25   |
