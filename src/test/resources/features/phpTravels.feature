@smoke
Feature: PHP Travels Site

  Scenario: Exercise One
    Given A user is on the php travels page
    When They click on the sign up link
    When They fill in valid registration details
    And click Sign Up

  Scenario: Exercise Two
    Given A user is on the php travels page
    When They click on the login link
    Then The user will be on the login page
    When They submit valid details
    Then The user will be on the profile page