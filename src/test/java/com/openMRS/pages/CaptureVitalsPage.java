package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CaptureVitalsPage {
    public CaptureVitalsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void validationOfOpenMRS_ActiveVisitsPage(WebDriver driver, String expectedTitleOfCaptureVitals) {

        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, expectedTitleOfCaptureVitals, "Failed validation");

    }
}