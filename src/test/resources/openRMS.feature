Feature:WebPages Functionality
  @LoginPagePositiveTest
  Scenario: login positive with location
    When user provide 'userName' and 'password'
    |userName|admin|
    |password|Admin123|
    Then user choose the location and click on login button
    And validate title of main page
  @LoginPageNegativeTest
  Scenario: Handling Incorrect Login Credentials
    When user provide wrong 'wrongUserName' and 'wrongPassword'
    |wrongUserName|ADMIN|
    |wrongPassword|Admin123|
    Then user click in login btn validate text of error message


