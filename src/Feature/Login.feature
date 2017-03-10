Feature: Login Action

  Scenario: Successful SignIn with Valid Credentials
    Given User is on Home Page
    When User Navigate to SignIn Page
    And User enters UserName and Password
    Then Message displayed Signin Successfully

  Scenario: Successful SignOut
    When User SignOut from the Application
    Then Message displayed SignOut Successfully