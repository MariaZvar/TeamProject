package com.openMRS.step_defenitions;

import com.openMRS.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

import java.util.Map;

public class PatientRecord {
    WebDriver driver= DriverHelper.getDriver();
    LoginPage loginPage=new LoginPage(driver);
    MainPage mainPage=new MainPage(driver);
    ActiveVisitsPage activeVisitsPage=new ActiveVisitsPage(driver);
    AppointmentSchedulingPage appointmentSchedulingPage=new AppointmentSchedulingPage(driver);
    CaptureVitalsPage captureVitalsPage=new CaptureVitalsPage(driver);
    ConfigureMetadataPage configureMetadataPage=new ConfigureMetadataPage(driver);
    DataManagementPage dataManagementPage=new DataManagementPage(driver);
    FindPatientRecordPage findPatientRecordPage=new FindPatientRecordPage(driver);
    RegisterPatientPage registerPatientPage=new RegisterPatientPage(driver);
    ReportsPage reportsPage=new ReportsPage(driver);
    SystemAdministrationPage systemAdministrationPage = new SystemAdministrationPage(driver);

    @When("user provide userName and password")
    public void user_provide_user_name_and_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

        Thread.sleep(3000);
        Map<String,String> PositiveUserNameAndPassword=dataTable.asMap();
        loginPage.PositiveUserNameAndPassword(PositiveUserNameAndPassword.get("userName"),PositiveUserNameAndPassword.get("password"));
    }
    @Then("user choose the location and click on login button")
    public void user_choose_the_location_and_click_on_login_button() {
        loginPage.PositiveLocation();
    }
    @Then("validate title of main page")
    public void validate_title_of_main_page() {
        Assert.assertEquals("Home", BrowserUtils.getTitle(driver));
    }

    @When("user provide wrong wrongUserName and wrongPassword")
    public void user_provide_wrong_wrong_user_name_and_wrong_password(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String> NegativeUserNameAndPassword=dataTable.asMap();
        loginPage.NegativeUserNameAndPassword(NegativeUserNameAndPassword.get("wrongUserName"),NegativeUserNameAndPassword.get("wrongPassword"));
    }
    @Then("user click in login btn validate text of errorMessage")
    public void user_click_in_login_btn_validate_text_of_error_message(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String > negativeValidateErrorMsg=dataTable.asMap();
        loginPage.negativeValidateErrorMsg(negativeValidateErrorMsg.get("errorMessage"));
    }



    //KANAT

    @When("user clicks on the RegistrationDeskBtn")
    public void user_clicks_on_the_registration_desk_btn() {
        mainPage.locationClick();
    }

//    @When("validate expectedLocation")
//    public void validate_expected_location(io.cucumber.datatable.DataTable expectedLocation) {
//        Assert.assertEquals(mainPage.actualLocation(), expectedLocation);
//    }

    @When("validate if userName is displayed")
    public void validate_if_user_name_is_displayed(io.cucumber.datatable.DataTable userName) {
        Map<String, String> validateUserName = userName.asMap();
        mainPage.validateUserName(validateUserName.get("userName"));
    }

    @When("user clicks on the FindPatientRecordBtn")
    public void user_clicks_on_the_find_patient_record_btn() {
        mainPage.findPatientRecordClick();
    }
    @When("validate expectedTitleOfFindPatientPage of FindPatientRecord")
    public void validate_expected_title_of_find_patient_page_of_find_patient_record(io.cucumber.datatable.DataTable expectedTitleOfFindPatientPage) {
        Map<String, String> validateTitle = expectedTitleOfFindPatientPage.asMap();
        findPatientRecordPage.validationOfFindPatientRecordPage( driver, validateTitle.get("expectedTitleOfFindPatientPage"));
    }

    @When("user clicks on the Logo button to get to the home page")
    public void user_clicks_on_the_logo_button_to_get_to_the_home_page() {
        findPatientRecordPage.getToHomePage();
    }
    @Then("user validate again home page")
    public void user_validate_again_home_page(io.cucumber.datatable.DataTable expectedTitleHomePage) {
        Map<String, String> validateTitle = expectedTitleHomePage.asMap();
        findPatientRecordPage.validateHomePage(driver, validateTitle.get("expectedTitleHomePage"));
    }

    @When("user clicks on the CaptureVitalsBtn")
    public void user_clicks_on_the_capture_vitals_btn() {
        mainPage.captureVitalsClick();
    }
    @When("validate expectedTitleOfCaptureVitals of CaptureVitalsBtn")
    public void validate_expected_title_of_capture_vitals_of_capture_vitals_btn(io.cucumber.datatable.DataTable expectedTitleOfCaptureVitals) {
        Map<String, String> validateTitle = expectedTitleOfCaptureVitals.asMap();
        activeVisitsPage.validationActiveVisitsPage(driver, validateTitle.get("expectedTitleOfCaptureVitals"));
        activeVisitsPage.getToHomePage();
    }
    @When("user clicks on the RegisterPatientBtn")
    public void user_clicks_on_the_register_patient_btn() {
        mainPage.registerPatientClick();
    }
    @When("validate expectedTitleOfRegisterPatient of RegisterPatientBtn")
    public void validate_expected_title_of_register_patient_of_register_patient_btn(io.cucumber.datatable.DataTable expectedTitleOfRegisterPatient){
        Map<String, String> validateTitle = expectedTitleOfRegisterPatient.asMap();
        registerPatientPage.validationOfFindPatientRecordPage(driver, validateTitle.get("expectedTitleOfRegisterPatient"));
        registerPatientPage.getToHomePage();
    }
    @When("user clicks on the AppointmentSchedulingBtn")
    public void user_clicks_on_the_appointment_scheduling_btn() {
        mainPage.appointmentSchedulingClick();
    }
    @When("validate expectedTitleOfAppointmentScheduling of AppointmentSchedulingBtn")
    public void validate_expected_title_of_appointment_scheduling_of_appointment_scheduling_btn(io.cucumber.datatable.DataTable expectedTitleOfAppointmentScheduling) {
        Map<String, String> validateTitle = expectedTitleOfAppointmentScheduling.asMap();
        appointmentSchedulingPage.validationOfFindPatientRecordPage(driver, validateTitle.get("expectedTitleOfAppointmentScheduling"));
        appointmentSchedulingPage.getToHomePage();
    }

    @When("user clicks on the ReportsBtn")
    public void user_clicks_on_the_reports_btn() {
        mainPage.reportsClick();
    }
    @When("validate expectedTitleOfReports of ReportsBtn")
    public void validate_expected_title_of_reports_of_reports_btn(io.cucumber.datatable.DataTable expectedTitleOfReports){
        Map<String, String> validateTitle = expectedTitleOfReports.asMap();
        reportsPage.validationOfFindPatientRecordPage(driver, validateTitle.get("expectedTitleOfReports"));
        reportsPage.getToHomePage();
    }

    @When("user clicks on the DataManagementBtn")
    public void user_clicks_on_the_data_management_btn() {
        mainPage.dataManagementClick();
    }
    @When("validate expectedTitleOfDataManagement of DataManagementBtn")
    public void validate_expected_title_of_data_management_of_data_management_btn(io.cucumber.datatable.DataTable expectedTitleOfDataManagement) {
        Map<String, String> validateTitle = expectedTitleOfDataManagement.asMap();
        dataManagementPage.validationOfFindPatientRecordPage(driver, validateTitle.get("expectedTitleOfDataManagement"));
        dataManagementPage.getToHomePage();
    }

    @When("user clicks on the ConfigureMetadataBtn")
    public void user_clicks_on_the_configure_metadata_btn() {
        mainPage.configureMetadataClick();
    }
    @When("validate expectedTitleOfConfigureMetadata of ConfigureMetadataBtn")
    public void validate_expected_title_of_configure_metadata_of_configure_metadata_btn(io.cucumber.datatable.DataTable expectedTitleOfConfigureMetadata){
        Map<String, String> validateTitle = expectedTitleOfConfigureMetadata.asMap();
        configureMetadataPage.validationOfFindPatientRecordPage(driver,validateTitle.get("expectedTitleOfConfigureMetadata"));
        configureMetadataPage.getToHomePage();
    }
    @When("user clicks on the SystemAdministrationBtn")
    public void user_clicks_on_the_system_administration_btn() {
        mainPage.systemAdministrationClick();
    }
    @When("validate expectedTitleOfSystemAdministration of SystemAdministrationBtn")
    public void validate_expected_title_of_system_administration_of_system_administration_btn(io.cucumber.datatable.DataTable expectedTitleOfSystemAdministration) {
        Map<String, String> validateTitle = expectedTitleOfSystemAdministration.asMap();
        systemAdministrationPage.validationOfSystemAdministration(driver, validateTitle.get("expectedTitleOfSystemAdministration"));
        systemAdministrationPage.getToHomePage();
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


}
