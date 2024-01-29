package com.openMRS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OpenMRS_MainPage {
    public OpenMRS_MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }



    public void validationOfTitle(WebDriver driver){
        BrowserUtils.getTitle(driver);
    }
}
