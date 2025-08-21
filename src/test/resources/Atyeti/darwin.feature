Feature: User is logged into Darwin
  Scenario: User does check in and check out
    Given When user click on "https://atyeti.darwinbox.in/user/login" and enters "user ID" and "Password"
    When User click on Submit
    Then Darwin Home Page should be displayed