Feature: login action
  Scenario Outline:  8 login with valid data

Given user is on Home Page
    When user navigate to Login Page
    And user Enters "<username>" and "<password>"
    Then Message displayed login seccessfully
    Examples:
     |username | password  |
     |standard_user|secret_sauce|
     |locked_out_user|secret_sauce|
     |problem_user|secret_sauce|
     |performance_glitch_user|secret_sauce|

