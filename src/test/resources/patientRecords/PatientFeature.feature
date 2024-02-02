Feature: Patient search functionality

  Scenario Outline: search bar and clear button
    Given user login with '<username>' for username and '<password>' for password and select location and click login button
    When user is on home page and clicks find patient record
    Then user makes sure search bar is displayed and clear button is displayed

    Examples: test data for search bar and clear button
    |username|password|
    |admin   |Admin123|

Scenario Outline: validate search is working by id or name for registered patient
  Given user login with '<username>' and '<password>' and select location and click login button
  When user is on home page and clicks find patient record
  And user sends registered '<idOrName>' to searchBar and validate with idsOrNames
Examples:
  |idOrName|username|password|
  | Ajay  |admin    |Admin123|
  | Codefish  |admin    |Admin123|

Scenario Outline: validate patient profile
  Given user login and clicks find patient record page
  When user is on patient record page he search for patient with '<id>' in search bar
  Then he clicks on patient id in result box and navigates to profile page
  Then user validates all the headers are displayed and validates '<id>'
  Then user delete the patient and confirm

Examples:
  |id|
  |100JYD  |

