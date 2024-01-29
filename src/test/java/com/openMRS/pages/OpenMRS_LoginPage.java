package com.openMRS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRS_LoginPage {

    public OpenMRS_LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);}
    @FindBy(css = "input[id='username']")
    WebElement userName;
    @FindBy(css = "input[id='password']")
    WebElement password;


}
