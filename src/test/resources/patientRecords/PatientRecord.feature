Feature: Patient record functionality


Scenario: Successfully register a new patient
  Given  user is on the login page and provide login credentials
  When user clicks register a  patient button
  Then user enters all the valid information and click confirm
  Then user validates patient id


  Scenario Outline: register patients
    Given  user is on the login page and provide login credentials
    When user clicks register a  patient button
    Then user enters all the valid information like '<givenName>' '<familyName>' '<day>' '<month>' '<years>''<address>' '<country>' '<state>' '<city>' '<zipcode>' '<phone>'
    Then user validates patient id

Examples:
  |givenName|familyName|day |month|years|address|country|state|city|zipcode|phone|
  |  amit   |   kumar  | 24 | March |  1990 | abcd|  india | Haryana  |Kurukshetra|136118|9288825345   |