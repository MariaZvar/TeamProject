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
    When user provide wrong 'WrongUserName' and 'WrongPassword'
    |WrongUserName|ADMIN|
    |WrongPassword|Admin123|
    Then validate text of error message

