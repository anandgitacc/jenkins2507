Feature: Verifying Facebook details

  Scenario: Verifying Login page credentials
    Given User is on facebook login page
    When User should enter username and password
    And User should should click the login button
    Then User should verify successfully entered

