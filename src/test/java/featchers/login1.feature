Feature: User Login Feature
  Scenario: user login scenario
    Given User is on login page of the Application
    When user login with following user name and password
    |user1|pass1|
    |user2|pass2|
    |user3|pass3|
    Then user will login with correct user name and password
