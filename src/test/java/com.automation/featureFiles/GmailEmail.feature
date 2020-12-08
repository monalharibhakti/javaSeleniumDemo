Feature: Gmail

  Scenario: Login and compose email
    When user is on Gmail login page
    And enter username and continue
    And enter password and login
    Then verify Compose button is displayed
    When user compose an email by enter to, subject and email body
    Then verify user can send the email