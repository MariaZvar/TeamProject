package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ReportsPage {
    public ReportsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void validationOfFindPatientRecordPage(WebDriver driver, String expectedTitleOfReports){

        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, expectedTitleOfReports, "Failed validation");

    }
}
