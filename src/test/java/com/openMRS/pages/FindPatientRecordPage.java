package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class FindPatientRecordPage {

    public FindPatientRecordPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void validationOfFindPatientRecordPage(WebDriver driver, String expectedTitleOfFindPatientPage){

        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, expectedTitleOfFindPatientPage, "Failed validation");

    }


}
