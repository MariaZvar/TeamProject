package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class RegisterPatientPage {

    public RegisterPatientPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void validationOfFindPatientRecordPage(WebDriver driver, String OpenMRS_RegisterPatient){

        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, OpenMRS_RegisterPatient, "Failed validation");

    }
}
