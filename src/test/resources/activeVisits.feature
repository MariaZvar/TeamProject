Feature:Active visits functionality

  Scenario: Managing Active Visits

    Given the User is on the login page  he provides login credentials
    Then user select the location and click login
    When Find Patient button is displayed  the user clicks on Find patient
    Then user search by id and clicks patient
    Then Active patient requests  Start Visit and confirms
    And the User adds  a  Note to visit
    And requests cancel  and goes to his profile Family Name
    Then Active patient ends the visit  and confirms with Yes
    When the User navigates back to the main page
    And  User enters  Active Visit
    Then patient should be able to check that  he is no longer in active visits


