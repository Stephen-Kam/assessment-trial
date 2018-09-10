Feature: PHP Travels Site

  @smoke
  Scenario: Exercise One
    Given A user is on the php travels page
    When They click on the sign up link
    When They fill in valid registration details
    And click Sign Up