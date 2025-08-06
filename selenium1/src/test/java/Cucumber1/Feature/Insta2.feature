Feature: instagram login with facebook

  @regression
  Scenario: user Login using Facebook
    Given user open chrome browser
    When user open url "https://www.instagram.com/accounts/login/"
    And user enter email
    And user enter password
    And user click on login with facebook
    And user enter email address and password
    Then successful login