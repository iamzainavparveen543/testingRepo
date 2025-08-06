Feature: login

  @sanity @regression
  Scenario: successful login with valid credentials
    Given user open Chrome Browser
    When user open url "https://www.facebook.com/"
    And user enters Email as "zainav1278@gmail.com" and password as "123451291"
    And user click on login button
    Then user should be redirected to the dashboard

    @regression
    Scenario Outline: successful login with valid credentials DDT
      Given user open Chrome Browser
      When user open url "https://www.facebook.com/"
      And user enters Email as "<email>" and password as "<password>"
      And user click on login button
      Then user should be redirected to the dashboard


      Examples:
      |email|password|
      |zainav1278@gmail.com|12345129|
      |anjum1278@gmail.com|78678629|
      |sayva1278@gmail.com|12345129|

