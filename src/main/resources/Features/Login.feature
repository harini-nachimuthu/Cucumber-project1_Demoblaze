@tag
Feature: DemoBlaze Login

  @tag1
  Scenario: Demoblaze login for existing user
    Given User is on Login Homepage
    When User click on login button
    Then User enters valid username and password
    Then User login is successful
