package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OpenMRS_LoginPage {

    public OpenMRS_LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);}
    @FindBy(css = "input[id='username']")
    WebElement userName;
    @FindBy(css = "input[id='password']")
    WebElement password;

    @FindBy(xpath = "")
    WebElement location;
    @FindBy(xpath = "")
    WebElement loginBtn;
    @FindBy(xpath = "")
    WebElement errorMsg;

    public void PositiveUserNameAndPassword(String userName, String password){
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
    }
    public void PositiveLocation(){
        location.click();
        loginBtn.click();
    }

    public void NegativeUserNameAndPassword(String wrongUserName, String wrongPassword){
        this.userName.sendKeys(wrongUserName);
        this.password.sendKeys(wrongPassword);
    }
    public void negativeValidateErrorMsg(){
        String actualText=errorMsg.getText();
        String expectedText="";
        Assert.assertEquals(actualText,expectedText);
    }


}
