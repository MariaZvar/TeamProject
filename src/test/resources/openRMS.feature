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
      | errorMessage | You must choose a location! |
    |errorMessage|Invalid username/password. Please try again.|


  @Task2
  Scenario: Validation of all pages
    When user clicks on the RegistrationDeskBtn
    When validate expectedLocation
      | expectedLocation | Registration Desk |
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
      | expectedTitleOfDataManagement | OpenMRS Electronic Medical Record |
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleHomePage | Home |

    When user clicks on the ConfigureMetadataBtn
    When validate expectedTitleOfConfigureMetadata of ConfigureMetadataBtn
      | expectedTitleOfConfigureMetadata | OpenMRS Electronic Medical Record |
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleHomePage | Home |

    When user clicks on the SystemAdministrationBtn
    When validate expectedTitleOfSystemAdministration of SystemAdministrationBtn
      | expectedTitleOfSystemAdministration |  OpenMRS Electronic Medical Record  |
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleHomePage | Home |


  @Task3
  Scenario: advanced Management

    Then user goes to the System Administrations and clicks Advanced Administrations

    And user clicks manage-person and finds the deleted person by name
      | name | baaber |

    Then user changes the address and saves person
      | address | 1712 Mailuusuu |

    And user comes back and clicks Find Person Record

    Then user finds updated person by nameWithUpdated
      | nameWithUpdated | baaber |

    And user checks the updatedInfo
      | updatedInfo | 1712 Mailuusuu, Des Plaines |






