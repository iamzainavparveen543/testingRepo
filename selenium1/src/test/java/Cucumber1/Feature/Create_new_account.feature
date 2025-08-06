Feature: create new account
  @regression
  Scenario: Successful create a new account with valid credentials
    Given user open Chrome browser
    When user open URL "https://www.facebook.com"
     And user enters email as "zainav1278@gmail.com" and password as "123451291"
    And user click on create a new account
    And user enters user_info
    Then account should be created successfully

