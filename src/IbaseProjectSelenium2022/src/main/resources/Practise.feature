Feature: :Verify  sign in functionality of food store application
  Scenario: verify  join in functionality with valid data
    Given : Website is up and running
    When :I Open a website in browser
    Then :I should see website is working
    When :I Click on sign button
    Then :I should navigate to sign in page
    When :I click on join in button
    Then :I should navigate to " create account page"
    When :I enter valid email id password and name then click on sign up button
    Then :I should able to enter data in all field after sign up user should see small icon with loggin name and sign in option should not present
    When :I go to back page
    Then :I should able to go on home page


  Scenario:Verify join now function with various  invalid data
    Given : Website is up and running
    When :I Open a website in browser
    Then :I should see website is working
    When :I Click on sign button
    Then :I should navigate to sign in page
    When :I click on JOIN NOW button
    Then :I should navigate to  create account page
    When :I keep all the field (Name,Email id and Password) empty and try to sign up button
    Then :I should see error message "Enter information"
    When :I keep name blank and enter email id and password
    Then :I should see error message "auth/network-request-failed"
    When :I keep the email id blank  and fill name and password
    Then :I should see error message "auth/invalid-email "
    When :I keep password field blank and enter email id and name
    Then :I should see this message "auth/weak-password"
    When :I enter space in all input field
    Then :I should not able to enter space
    When :I enter special character and number in name field
    Then :I should not able to enter number and  special character  name field .




  Scenario: verify various options available for sign in
    Given :- Website is up and running
    When  :I Open a website in browser
    Then :I should see website is working
    When :I Click on sign button
    Then :I should navigate to sign in page
    When :I Click on sign in with google
    Then :I should navigate to sign in page
    When :I enter email id or phone number click on next page
    Then :I should navigate to next page and user should see enter password field.
    When :I enter password click on next
    Then :I should successful login to food store application



  Scenario: Verify sign functionaliy with different set of invalid data
    Given :Website is up and running
    When :I Open a website in browser
    Then :I should see website is working
    When :I Click on sign button
    Then :I should navigate to sign in page
    When :I enter valid emailid and invalid password
    Then :I should see message"auth/wrong-password"
    When :I enter invalid email id valid password
    Then :I should see error message "auth/user-not-found"
    When :I keep email id and password blank and then sign in
    Then :I should see message "auth/invalid-email"
    When :I keep the email id blank enter  password and click on sign in
    Then :I should see error message "auth/invalid-email "
    When :I keep password field blank and enter email id
    Then :I should see message "auth/wrong-password"
    When :I enter space in all input field
    Then :I should not able to enter space in all input field














