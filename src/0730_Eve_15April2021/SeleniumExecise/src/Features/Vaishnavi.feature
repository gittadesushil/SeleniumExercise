
Feature: Food_Store 001

  @Negative
    @Vaishnavi
    @001
  Scenario Outline: Verify when user enter a valid city name then user should see the list of hotels

    Given website is up and running
    And  user should already logged in to the website
    When user should enterd a "valid city name" like -"Nagpur"
    And  click on "Search" button
    Then user should see "list of hotels" available in that city.

    Examples:
      | Name           |
      | Babbu hotel    |
      | Bula's kitchen |
      | Mc Donald's    |



  @FSW_008
  @Negative
  @Vaishnavi

  Scenario: Verify user gets error when user search for invalid city

    Given foodstore website is opened in browser
    When user should entered a Invalid city name like "ABC"
    And  click on Search button
    Then user should see error msg "Cannot read property 'id' of undefined"












