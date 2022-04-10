@123
Feature: Login page of the Application

  Background: 
    Given user is opening the browser

  Scenario: Check login with valid credentials
    Then clicks on login button
    When user enters valid username
    And user enters valid password
    Then user should appear on dashboard

  Scenario Outline: Check login with valid credentials
    Then clicks on login button
    When user enters valid username "<Username>"
    And user enter valid password "<Password>"
    Then user should appear on dashboard

    Examples: 
      | Username               | Password   |
      | abc@xyz.com            | pqr@1234   |
      | tipyana@rocketmail.com | Mwakapiso7 |

  @Sanity
  Scenario Outline: Check login with invalid credentials
    Then clicks on login button
    When user enters valid username "abc@xyz.com"
    And user enter valid password "Pqr@1234"
    Then user should appear on dashboard
    Then user should get the error message as "The email or password you have entered is invalid."
