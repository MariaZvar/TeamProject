package com.openMRS.step_defenitions;

import com.openMRS.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

import java.util.Map;

public class PatientRecord {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    MainPage mainPage = new MainPage(driver);
    ActiveVisitsPage activeVisitsPage = new ActiveVisitsPage(driver);
    AppointmentSchedulingPage appointmentSchedulingPage = new AppointmentSchedulingPage(driver);
    CaptureVitalsPage captureVitalsPage = new CaptureVitalsPage(driver);
    ConfigureMetadataPage configureMetadataPage = new ConfigureMetadataPage(driver);
    DataManagementPage dataManagementPage = new DataManagementPage(driver);
    FindPatientRecordPage findPatientRecordPage = new FindPatientRecordPage(driver);
    RegisterPatientPage registerPatientPage = new RegisterPatientPage(driver);
    ReportsPage reportsPage = new ReportsPage(driver);
    private RegisterPatientPage registrationPage;

    @When("user provide userName and password")
    public void user_provide_user_name_and_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

        Thread.sleep(3000);
        Map<String, String> PositiveUserNameAndPassword = dataTable.asMap();
        loginPage.PositiveUserNameAndPassword(PositiveUserNameAndPassword.get("userName"), PositiveUserNameAndPassword.get("password"));
    }

    @Then("user choose the location and click on login button")
    public void user_choose_the_location_and_click_on_login_button() {
        loginPage.PositiveLocation();
    }

    @Then("validate title of main page")
    public void validate_title_of_main_page() {
        Assert.assertEquals("Login", BrowserUtils.getTitle(driver));
    }

    @When("user provide wrong wrongUserName and wrongPassword")
    public void user_provide_wrong_wrong_user_name_and_wrong_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        Map<String,String> NegativeUserNameAndPassword=dataTable.asMap();
        loginPage.NegativeUserNameAndPassword(NegativeUserNameAndPassword.get("wrongUserName"),NegativeUserNameAndPassword.get("wrongPassword"));
    }

    @Then("user click in login btn validate text of errorMessage")

    public void user_click_in_login_btn_validate_text_of_error_message(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        Map<String,String > negativeValidateErrorMsg=dataTable.asMap();
        loginPage.negativeValidateErrorMsg(negativeValidateErrorMsg.get("errorMessage"));
    }

    //KANAT
    @When("user clicks on the RegistrationDeskBtn")
    public void user_clicks_on_the_registration_desk_btn() {

    }

    @When("validate location of RegistrationDeskBtn")
    public void validate_location_of_registration_desk_btn() {

    }

    @When("validate if userName is displayed")
    public void validate_if_user_name_is_displayed(io.cucumber.datatable.DataTable dataTable) {

    }

    @When("user clicks on the FindPatientRecordBtn")
    public void user_clicks_on_the_find_patient_record_btn() {

    }

    @When("validate expectedTitleOfFindPatientPage of FindPatientRecord")
    public void validate_expected_title_of_find_patient_page_of_find_patient_record() {

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

    @When("validate expectedTitleOfActiveVisits of ActiveVisitsBtn")
    public void validate_expected_title_of_active_visits_of_active_visits_btn() {

    }

    @When("user clicks on the CaptureVitalsBtn")
    public void user_clicks_on_the_capture_vitals_btn() {

    }

    @When("validate expectedTitleOfCaptureVitals of CaptureVitalsBtn")
    public void validate_expected_title_of_capture_vitals_of_capture_vitals_btn() {

    }

    @When("user clicks on the RegisterPatientBtn")
    public void user_clicks_on_the_register_patient_btn() {

    }

    @When("validate expectedTitleOfRegisterPatient of RegisterPatientBtn")
    public void validate_expected_title_of_register_patient_of_register_patient_btn() {

    }

    @When("user clicks on the AppointmentSchedulingBtn")
    public void user_clicks_on_the_appointment_scheduling_btn() {

    }

    @When("validate expectedTitleOfAppointmentScheduling of AppointmentSchedulingBtn")
    public void validate_expected_title_of_appointment_scheduling_of_appointment_scheduling_btn() {

    }

    @When("user clicks on the ReportsBtn")
    public void user_clicks_on_the_reports_btn() {

    }

    @When("validate expectedTitleOfReports of ReportsBtn")
    public void validate_expected_title_of_reports_of_reports_btn() {

    }

    @When("user clicks on the DataManagementBtn")
    public void user_clicks_on_the_data_management_btn() {

    }

    @When("validate expectedTitleOfDataManagement of DataManagementBtn")
    public void validate_expected_title_of_data_management_of_data_management_btn() {

    }

    @When("user clicks on the ConfigureMetadataBtn")
    public void user_clicks_on_the_configure_metadata_btn() {

    }

    @When("validate expectedTitleOfConfigureMetadata of ConfigureMetadataBtn")
    public void validate_expected_title_of_configure_metadata_of_configure_metadata_btn() {

    }

    @When("user clicks on the SystemAdministrationBtn")
    public void user_clicks_on_the_system_administration_btn() {

    }

    @When("validate expectedTitleOfSystemAdministration of SystemAdministrationBtn")
    public void validate_expected_title_of_system_administration_of_system_administration_btn() {

    }

    ///VERA
    @Then("user goes to the System Administrations and clicks Advanced Administrations")
    public void user_goes_to_the_system_administrations_and_clicks_advanced_administrations() {

    }

    @Then("user clicks manage-person and finds the deleted person by name")
    public void user_clicks_manage_person_and_finds_the_deleted_person_by_name(io.cucumber.datatable.DataTable dataTable) {

    }

    @Then("user changes the address and saves person")
    public void user_changes_the_address_and_saves_person(io.cucumber.datatable.DataTable dataTable) {

    }

    @Then("user comes back and clicks Find Person Record")
    public void user_comes_back_and_clicks_find_person_record() {

    }

    @Then("user finds updated person by nameWithUpdated")
    public void user_finds_updated_person_by_name_with_updated(io.cucumber.datatable.DataTable dataTable) {

    }

    @Then("user checks the updatedInfo")
    public void user_checks_the_updated_info(io.cucumber.datatable.DataTable dataTable) {


    }




    @Given("user is on the login page and provide login credentials")
    public void user_is_on_the_login_page_and_provide_login_credentials() throws InterruptedException {
        loginPage.PositiveUserNameAndPassword("admin","Admin123");
        loginPage.PositiveLocation();
        Thread.sleep(2000);

    }
    @When("user clicks register a  patient button")
    public void user_clicks_register_a_patient_button() throws InterruptedException {
        registerPatientPage.clikOnRegisterPatient();
Thread.sleep(2000);
    }
    @Then("user enters all the valid information and click confirm")
    public void user_enters_all_the_valid_information_and_click_confirm() {
registerPatientPage.fillInfoOnPatientPager();
    }

    @Then("user validates patient id")
    public void user_validates_patient_id() {
        registerPatientPage.patientId();
    }


//Alena -active visits

    @Given("the User is on the login page  he provides login credentials")
    public void the_user_is_on_the_login_page_he_provides_login_credentials() {
       loginPage.PositiveUserNameAndPassword("admin","Admin123");
    }
    @Then("user select the location and click login")
    public void user_select_the_location_and_click_login() {
       loginPage.PositiveLocation();
    }
    @When("Find Patient button is displayed  the user clicks on Find patient")
    public void find_patient_button_is_displayed_the_user_clicks_on_find_patient() {

    }
    @Then("user search by id and clicks patient")
    public void user_search_by_id_and_clicks_patient() {

    }
    @Then("Active patient requests  Start Visit and confirms")
    public void active_patient_requests_start_visit_and_confirms() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the User adds  a  Note to visit")
    public void the_user_adds_a_note_to_visit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("requests cancel  and goes to his profile Family Name")
    public void requests_cancel_and_goes_to_his_profile_family_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Active patient ends the visit  and confirms with Yes")
    public void active_patient_ends_the_visit_and_confirms_with_yes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the User navigates back to the main page")
    public void the_user_navigates_back_to_the_main_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters  Active Visit")
    public void user_enters_active_visit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("patient should be able to check that  he is no longer in active visits")
    public void patient_should_be_able_to_check_that_he_is_no_longer_in_active_visits() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }








}
