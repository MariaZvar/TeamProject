package com.openMRS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "")
    WebElement registrationDeskBtn;

    @FindBy(xpath = "//li[@class='nav-item identifier']")
    WebElement userNameBtn;



    @FindBy(xpath = "")
    WebElement findPatientRecordBtn;

    @FindBy(xpath = "")
    WebElement activeVisitsBtn;

    @FindBy(xpath = "")
    WebElement captureVitalsBtn;

    @FindBy(xpath = "")
    WebElement registerPatientBtn;


    @FindBy(xpath = "")
    WebElement appointmentSchedulingBtn;

    @FindBy(xpath = "")
    WebElement reportsBtn;

    @FindBy(xpath = "")
    WebElement dataManagementBtn;

    @FindBy(xpath = "")
    WebElement configureMetadataBtn;

    @FindBy(xpath = "")
    WebElement systemAdministrationBtn;

//    @FindBy(xpath = "//a[@class='btn btn-default btn-lg button app big align-self-center']")
//    List<WebElement> allDeparmentsPages;
//    public void clickOnPage(String pageName){
//        for (WebElement page : allDeparmentsPages){
//
//            if (page.getText().equalsIgnoreCase(pageName)){
//                page.click();

    public void validationOfUserNameAndLocation(WebDriver driver, String userName){
        BrowserUtils.hoverOver(driver, userNameBtn);
        WebElement actualAdmin = driver.findElement(By.xpath(
                "//a[@href='/openmrs/adminui/myaccount/myAccount.page']"));
    }

    public void registrationDeskClick(WebDriver driver){
        registrationDeskBtn.click();
    }

    public void validateLocation(){

    }
    
    public void findPatientRecordClick(){
        findPatientRecordBtn.click();
    }

     public void activeVisitsClick(){
         activeVisitsBtn.click();
    }

    public void captureVitalsClick(){
        captureVitalsBtn.click();
    }

    public void registerPatientClick(){
        registerPatientBtn.click();
    }

    public void appointmentSchedulingClick(){
        appointmentSchedulingBtn.click();
    }

    public void reportsClick(){
        reportsBtn.click();
    }

     public void dataManagementClick(){
         dataManagementBtn.click();
    }

    public void configureMetadataClick(){
        configureMetadataBtn.click();
    }

    public void systemAdministrationClick(){
        systemAdministrationBtn.click();
    }




}
