package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);}
    @FindBy(css = "input[id='username']")
    WebElement userNameBtn;
    @FindBy(css = "input[id='password']")
    WebElement passwordBtn;

    @FindBy(css = "li[id='Pharmacy']")
    WebElement location;
    @FindBy(css = "input[id='loginButton']")
    WebElement loginBtn;
    @FindBy(css = "div[id='error-message']")
    WebElement errorMsg;
    @FindBy(css = "i[class='icon-signout small']")
    WebElement logOutBtn;

    public void PositiveUserNameAndPassword(String userName, String password){

        this.userNameBtn.sendKeys(userName);
        this.passwordBtn.sendKeys(password);
    }
    public void PositiveLocation(){
        location.click();
        loginBtn.click();
//        logOutBtn.click();
    }

    public void NegativeUserNameAndPassword(String wrongUserName, String wrongPassword) throws InterruptedException {
        Thread.sleep(1000);
        this.userNameBtn.sendKeys(wrongUserName);
        this.passwordBtn.sendKeys(wrongPassword);
    }
    public void negativeValidateErrorMsg(String errorMessage) throws InterruptedException {
        Thread.sleep(1000);
        loginBtn.click();
        String actualText=this.errorMsg.getText();
        Assert.assertEquals(actualText,errorMessage);


    }


}
