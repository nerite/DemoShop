Feature: Login to the system

  @test
  Scenario: Login feature with Positive data
    Given I am on Demo Shop page
    And Go to Login page
    And Enter E-mail Address "testerrrrr@gmail.com"
    And Enter Password "123456+789+"
    And Click Login button
    Then Verifying that I am on "My Account" page
