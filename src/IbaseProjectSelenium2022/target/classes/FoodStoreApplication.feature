Feature: Test cases for the Food store application

  Scenario: mention the test case name here
    Given mention the pre-condition here
    When mention the action here
    Then mention the verification here

  @testId:1
  Scenario: Verify burger picture is avaialble on home screen
    Given Foodstore website should be live and available                     #pre-condition
    When check if bruger picutre is available on home page                   #action
    Then Bruger picutre should be availble on home page                      #verification

  @testId:2
  Scenario Outline: Verify customer can search hotel using search feature
    Given Foodstore website should up and running
    When I Go to homepage
    Then I should available on home page
    When Enter <city name> in search box and click on Search button
    Then I should see list of hotels
    When Go back to homepage
    Examples:
      | city name |
      | Mumbai    |
      | Pune      |

  @testId:3
  Scenario: Verify drop down feature is working
    Given Foodstore website should up and running
    When I Go to homepage
    Then I should available on home page
    When I Click on Top Cities
    Then the List of cities are displayed
    When I Select "Delhi" option
    Then the List of hotes should be displayed
    When I Go back to homepage
    Then I should be available on home page
    When I Click on Top Cities
    Then I should see only below cities in Top cities options
      | City names |
      | Mumbai     |
      | Delhi      |
      | Kolkata    |
      | Chennai    |
      | Chandigarh |
      | Pune       |
      | Ahmedbad   |

  @testId:4
  Scenario: Verify search box accepts valid data
    Given Foodstore website should up and running
    When I Go to homepage
    Then I should available on home page
    When I enter "1234" in search box and click search button
    But I should not see list of hotels
    Then I should see error message
    When I Go back to home page
    Then I am available on home page
    When Enter "1" in search box and click on button
    But user should not see list of hotels
    Then User should see error message

  @testId:5
  Scenario: Verify user should be able to Sign up on the website
    Given Foodstore website should up and running
    And Sign up functinality should be available
    When I Go to homepage
    Then I should available on home page
    When I Click on sign in button
    Then user should see Sign In form And user should see Join Now button
    When I Click on Join Now button
    Then I should see Create Account form
    When I Enter
      | Name | email             | password |
      | Sam  | sam@foodstore.com | 123489   |
    And Click on Sign up button
    But No Error should occur on the screen
    Then I should navigate to home page
    And I name should be displayed on top of Sign In button
    When I Click on button where user name is displayed
    Then User will see popup
    When I Click on sign out button
    But User should not see any error
    Then User should be sign out and Sign in button should be appear again


  @testId:9
  Scenario: Verify the lenght of the password
    Given Foodstore website should up and running
    And Sign up functionality should be available
    When I Go to homepage
    Then I should available on home page
    When I Click on sign in button
    Then user should see Sign In form And user should see Join Now button
    When I Click on Join Now button
    Then I should see Create Account form
    When Enter password less than 6 character
    Then I should see error message "auth/weak-password"












