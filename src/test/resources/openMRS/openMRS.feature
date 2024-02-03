Feature:WebPages Functionality


  Background: login positive with location
    When user provide userName and password
      | userName | admin    |
      | password | Admin123 |
    Then user choose the location and click on login button
    And validate title of main page

  @Task1
  Scenario: Handling Incorrect Login Credentials
    When user provide wrong wrongUserName and wrongPassword
      | wrongUserName | ADMIN    |
      | wrongPassword | ADMIN123 |
    Then user click in login btn validate text of errorMessage
      | errorMessage | You must choose a location!                  |
      | errorMessage | Invalid username/password. Please try again. |


  @Task2
  Scenario: Validation of all pages
    When user clicks on the RegistrationDeskBtn
    When validate expectedLocation
      | expectedLocation | Pharmacy |
    And validate if userName is displayed
      | userName | admin |

    When user clicks on the FindPatientRecordBtn
    When validate expectedTitleOfFindPatientPage of FindPatientRecord
      | expectedTitleOfFindPatientPage | OpenMRS Electronic Medical Record |
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleHomePage | Home |

    When user clicks on the ActiveVisitsBtn
    When validate expectedTitleOfActiveVisits of ActiveVisitsBtn
      | expectedTitleOfActiveVisits | OpenMRS Electronic Medical Record |
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleHomePage | Home |

    When user clicks on the CaptureVitalsBtn
    When validate expectedTitleOfCaptureVitals of CaptureVitalsBtn
      | expectedTitleOfCaptureVitals | OpenMRS Electronic Medical Record |
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleHomePage | Home |

    When user clicks on the RegisterPatientBtn
    When validate expectedTitleOfRegisterPatient of RegisterPatientBtn
      | expectedTitleOfRegisterPatient | OpenMRS Electronic Medical Record |
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleHomePage | Home |

    When user clicks on the AppointmentSchedulingBtn
    When validate expectedTitleOfAppointmentScheduling of AppointmentSchedulingBtn
      | expectedTitleOfAppointmentScheduling | OpenMRS Electronic Medical Record |
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleHomePage | Home |

    When user clicks on the ReportsBtn
    When validate expectedTitleOfReports of ReportsBtn
      | expectedTitleOfReports | OpenMRS Electronic Medical Record |
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleHomePage | Home |

    When user clicks on the DataManagementBtn
    When validate expectedTitleOfDataManagement of DataManagementBtn
      | expectedTitleOfDataManagement | Data Management |
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleHomePage | Home |

    When user clicks on the ConfigureMetadataBtn
    When validate expectedTitleOfConfigureMetadata of ConfigureMetadataBtn
      | expectedTitleOfConfigureMetadata | Configure Metadata |
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleHomePage | Home |

    When user clicks on the SystemAdministrationBtn
    When validate expectedTitleOfSystemAdministration of SystemAdministrationBtn
      | expectedTitleOfSystemAdministration | System Administration |
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleHomePage | Home |




  @Task5   #Alena
  Scenario: Managing Active Visits

    When Find Patient button is displayed  the user clicks on Find patient
    Then user search by id and clicks patient
    Then Active patient requests  Start Visit and confirms
    And the User adds  a  Note to visit and requests cancel
    Then User cancels the visit and confirms with yes
    When the User navigates back to the main page
    And  User enters  Active Visit
    Then patient should be able to check that  he is no longer in active visits

# alena 12.30 to Remote Alena






  Scenario Outline: Advanced Management
    Given User is on home page and clicks System Administration and  Advanced Administration buttons
    Then User clicks Manage Person
    And User enters '<name>' into Person Name Field and clicks include deleted button
    Then user clicks on person information line
    And User deletes address in line Address and enter updated '<newAddress>' and saves it
    Then User comes back on main page
    And User is on home page and clicks button Find Person Record
    Then enters patient '<findPersonName>' and click Enter
    And User clicks Show Contact Info and validates information about address

    Examples:
      | name      | newAddress   | findPersonName |
      | vera vera | 171 N Bay Rd | vera vera      |


