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




}
