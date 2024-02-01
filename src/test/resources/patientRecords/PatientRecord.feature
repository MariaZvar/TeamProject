Feature: Patient record functionality





Scenario: Successfully register a new patient
  Given  user is on the login page and provide login credentials
  When user clicks register a  patient button
  Then user enters all the valid information and click confirm
  Then user validates patient id



