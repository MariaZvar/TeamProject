package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class FindPatientRecordPage {
    public FindPatientRecordPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='logo']")
    WebElement logoBtn;

    public void validationOfFindPatientRecordPage(WebDriver driver, String expectedTitleOfFindPatientPage){
        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, expectedTitleOfFindPatientPage);
    }

    public void getToHomePage(){
        logoBtn.click();
    }

    public void validateHomePage(WebDriver driver, String expectedTitleHomePage ){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitleHomePage);
    }
}
