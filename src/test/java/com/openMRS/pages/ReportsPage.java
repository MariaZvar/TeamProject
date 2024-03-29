package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ReportsPage {
    public ReportsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='logo']")
    WebElement logoBtn;

    public void validationOfFindPatientRecordPage(WebDriver driver, String expectedTitleOfReports){
        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, expectedTitleOfReports);
    }
    public void getToHomePage(){
        logoBtn.click();
    }
}
