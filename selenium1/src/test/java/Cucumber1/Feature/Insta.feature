
Feature: Instagram Login

  @regression
  Scenario: User login to Instagram with valid credentials
    Given open chrome browser
    When open url "https://www.instagram.com/accounts/login/"
    And enter user email
    And enter user password
    And user click on login
    Then account successfully created



