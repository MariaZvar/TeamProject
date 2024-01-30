package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ConfigureMetadataPage {

    public ConfigureMetadataPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void validationOfFindPatientRecordPage(WebDriver driver, String expectedTitleOfConfigureMetadata){

        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, expectedTitleOfConfigureMetadata, "Failed validation");

    }
}
