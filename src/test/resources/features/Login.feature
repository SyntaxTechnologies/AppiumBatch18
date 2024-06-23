Feature: Swag lab login scenarios

  @smoke
  Scenario: Valid user login
    Given user is able to launch swag labs application
    When user enters username and password
    And user clicks on login button
    Then user is navigated to products page

