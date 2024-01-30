package com.openMRS.step_defenitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class OpenMRS_Hook {
    WebDriver driver= DriverHelper.getDriver();
    @Before
    public void setUp(){
        BrowserUtils.getURL(driver,"projectURL");
    }
    @After
    public void teamDown(Scenario scenario){
        BrowserUtils.takeScreenshotCucumber(scenario,driver);
    }
}
