package com.openMRS.step_defenitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class OpenMRS_Steps {
    WebDriver driver= DriverHelper.getDriver();


    @When("user provide {string} and {string}")
    public void user_provide_and(String userName, String password, io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("user choose the location and click on login button")
    public void user_choose_the_location_and_click_on_login_button() {

    }
    @Then("validate title of main page")
    public void validate_title_of_main_page() {

    }

    @When("user provide wrong {string} and {string}")
    public void user_provide_wrong_and(String WrongUserName, String WrongPassword, io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("user click in login btn validate text of error message")
    public void user_click_in_login_btn_validate_text_of_error_message() {

    }




    @When("user clicks on the RegistrationDeskBtn")
    public void user_clicks_on_the_registration_desk_btn() {

    }
    @When("validate location of RegistrationDeskBtn")
    public void validate_location_of_registration_desk_btn() {

    }
    @When("validate if {string} is displayed")
    public void validate_if_is_displayed(String userName, io.cucumber.datatable.DataTable dataTable) {

    }
    @When("user clicks on the FindPatientRecordBtn")
    public void user_clicks_on_the_find_patient_record_btn() {

    }
    @When("validate {string} of FindPatientRecord")
    public void validate_of_find_patient_record(String expectedTitleOfFindPatientPage) {

    }
    @When("user clicks on the Logo button to get to the home page")
    public void user_clicks_on_the_logo_button_to_get_to_the_home_page() {

    }
    @Then("user validate again home page")
    public void user_validate_again_home_page(io.cucumber.datatable.DataTable dataTable) {

    }
    @When("user clicks on the ActiveVisitsBtn")
    public void user_clicks_on_the_active_visits_btn() {

    }
    @When("validate {string} of ActiveVisitsBtn")
    public void validate_of_active_visits_btn(String expectedTitleOfActiveVisits) {

    }
    @When("user clicks on the CaptureVitalsBtn")
    public void user_clicks_on_the_capture_vitals_btn() {

    }
    @When("validate {string} of CaptureVitalsBtn")
    public void validate_of_capture_vitals_btn(String expectedTitleOfCaptureVitals) {

    }
    @When("user clicks on the RegisterPatientBtn")
    public void user_clicks_on_the_register_patient_btn() {

    }
    @When("validate {string} of RegisterPatientBtn")
    public void validate_of_register_patient_btn(String expectedTitleOfRegisterPatient) {

    }
    @When("user clicks on the AppointmentSchedulingBtn")
    public void user_clicks_on_the_appointment_scheduling_btn() {

    }
    @When("validate {string} of AppointmentSchedulingBtn")
    public void validate_of_appointment_scheduling_btn(String string) {

    }
    @When("user clicks on the ReportsBtn")
    public void user_clicks_on_the_reports_btn() {

    }
    @When("validate {string} of ReportsBtn")
    public void validate_of_reports_btn(String expectedTitleOfReports) {

    }
    @When("user clicks on the DataManagementBtn")
    public void user_clicks_on_the_data_management_btn() {
    }
    @When("validate {string} of DataManagementBtn")
    public void validate_of_data_management_btn(String expectedTitleOfDataManagement) {

    }
    @When("user clicks on the ConfigureMetadataBtn")
    public void user_clicks_on_the_configure_metadata_btn() {

    }
    @When("validate {string} of ConfigureMetadataBtn")
    public void validate_of_configure_metadata_btn(String expectedTitleOfConfigureMetadata) {

    }
    @When("user clicks on the SystemAdministrationBtn")
    public void user_clicks_on_the_system_administration_btn() {

    }
    @When("validate {string} of SystemAdministrationBtn")
    public void validate_of_system_administration_btn(String expectedTitleOfSystemAdministration) {

    }





}
