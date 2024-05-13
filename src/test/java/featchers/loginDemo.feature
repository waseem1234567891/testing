Feature: login demo
  Scenario Outline: login with different user
Given Browser is opened
    When User is on login page on sauce
    And User enter "<username>" and "<password>"
    And Click on login button
    Then user navigate to home page
    Examples:
      |username | password  |
      |standard_user|secret_sauce|
      |problem_user|secret_sauce|