package com.openMRS.step_defenitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class OpenMRS_Hook {
    WebDriver driver= DriverHelper.getDriver();
   @Before
    public void setUp(){
       driver.get(ConfigReader.readProperty("projectURL"));
    }
    @After
    public void teamDown(Scenario scenario){
        BrowserUtils.takeScreenshotCucumber(scenario,driver);
    }
}
