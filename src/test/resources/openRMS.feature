Feature:WebPages Functionality


  Background: login positive with location
    When user provide userName and password
      | userName | admin    |
      | password | Admin123 |
    Then user choose the location and click on login button
    And validate title of main page

  @LoginPageNegativeTest
  Scenario: Handling Incorrect Login Credentials
    When user provide wrong wrongUserName and wrongPassword
      | wrongUserName | ADMIN    |
      | wrongPassword | Admin123 |
    Then user click in login btn validate text of errorMessage
    |errorMessage|You must choose a location!|

  @Task2
  Scenario: Validation of all pages
    When user clicks on the RegistrationDeskBtn
    When validate location of RegistrationDeskBtn
    And validate if userName is displayed
      | userName | admin |

    When user clicks on the FindPatientRecordBtn
    When validate expectedTitleOfFindPatientPage of FindPatientRecord
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleOfFindPatientPage | title |

    When user clicks on the ActiveVisitsBtn
    When validate expectedTitleOfActiveVisits of ActiveVisitsBtn
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleOfActiveVisits | title |

    When user clicks on the CaptureVitalsBtn
    When validate expectedTitleOfCaptureVitals of CaptureVitalsBtn
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleOfCaptureVitals | title |

    When user clicks on the RegisterPatientBtn
    When validate expectedTitleOfRegisterPatient of RegisterPatientBtn
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleOfRegisterPatient | title |

    When user clicks on the AppointmentSchedulingBtn
    When validate expectedTitleOfAppointmentScheduling of AppointmentSchedulingBtn
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleOfAppointmentScheduling | title |

    When user clicks on the ReportsBtn
    When validate expectedTitleOfReports of ReportsBtn
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleOfReports | title |

    When user clicks on the DataManagementBtn
    When validate expectedTitleOfDataManagement of DataManagementBtn
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleOfDataManagement | title |

    When user clicks on the ConfigureMetadataBtn
    When validate expectedTitleOfConfigureMetadata of ConfigureMetadataBtn
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleOfConfigureMetadata | title |

    When user clicks on the SystemAdministrationBtn
    When validate expectedTitleOfSystemAdministration of SystemAdministrationBtn
    And user clicks on the Logo button to get to the home page
    Then user validate again home page
      | expectedTitleOfSystemAdministration | title |



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






