Feature: Home page for the foodstore application

  Scenario: Verify home page is displayed
    Given foodstore website is opened in browser
    Then I see "You order we deliver" text on the homepage

  Scenario: Verify cart button is displayed on the homepage
    Given foodstore website is opened in browser
    Then cart button is avaialble on the page
