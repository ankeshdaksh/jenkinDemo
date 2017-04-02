Feature: As a customer i want to check end to end functionality

  @live
  Scenario: User wants to register his valid detail
    Given User is on home page
    When user entered his valid details
    Then user will get msg register successful
