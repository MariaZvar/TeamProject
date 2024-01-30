package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ActiveVisitsPage {

    public ActiveVisitsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void validationOfOpenMRS_ActiveVisitsPage(WebDriver driver, String expectedTitleOfActiveVisits){

        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, expectedTitleOfActiveVisits, "Failed validation");

    }
}
