Feature: Smoke test
  we are waiting for this feature from long time

  @smoke
  Scenario: Verify scenario 1
    Given I have a pre-condition
    When I perform some action
    Then I should some result

  @regression
  Scenario: Verify scenario 2
    Given I have a pre-condition
    When I perform some action
    Then I should some result

  Scenario: Toy scenario
    Given I have toy ABC
    Given I have a pre-condition
    When I insert battery inside toy
    Then toy starts working
