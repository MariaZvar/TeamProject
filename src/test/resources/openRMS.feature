Feature:WebPages Functionality
  @LoginPage
  Scenario: login positive with location
    When user provide 'userName' and 'password'
    |userName|admin|
    |password|Admin123|
    Then user choose the location and click on login button
    And validate title of main page

