Feature: Test cases/Scenario for Foodstore applicaton

  Scenario: Verify customer can search hotel using search feature
    Given Foodstore website should up and running
    When I Go to homepage
    Then I should available on home page
    When I Enter Mumbai in search box and click on Search button
    Then I should see list of hotels
    When I Go back to homepage
    Then I should see search box again
    When I Enter Pune in search box and hit ENTER button from keyboard
    Then I should see list of hotels
    When close the browser

  Scenario: Verify user is avaialble on home page
    Given Foodstore website should up and running
    When I Go to homepage
    Then I should available on home page
    When close the browser

  Scenario Outline: Verify Join now
    When user enter <name>
    And :user enter <email>
    And user enter <password>
    Then I should see <error>
    Examples:
      | name   | email             | password | error              |
      |        |                   |          | auth/invalid-email |
      | sushil | abc@foodstore.com |          | auth/weak-password |
      |        |                   |          | auth/invalid-email |
      | sushil |                   | asd12345 | auth/invalid-email |
      |        | abc@foodstore.com | asd12345 | auth/invalid-email |





