Feature: user can post message and video on his wall
  @smockytest
  Scenario: Post a message on user wall
    Given user should be logged in and must present on his wall
    When user type the message in message box
    And click on post Message Button
    Then message should be get posted
    Scenario: Post a video on user wall
      Given user should be logged in and must present on his wall
      When User supply the youtube link to the test box
      And click on post button
      Then video should be get posted on wall
      And video should have proper thumbnails