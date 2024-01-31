package com.openMRS.pages;

import org.junit.Assert;
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

    @FindBy(xpath = "//a[@href='javascript:void(0);']")
    WebElement location;

    @FindBy(xpath = "//li[@class='nav-item identifier']")
    WebElement userNameBtn;



    @FindBy(xpath = "//a[@href='/openmrs/coreapps/activeVisits.page?app=coreapps.activeVisits']")
    WebElement findPatientRecordBtn;

    @FindBy(xpath = "//a[@href='/openmrs/coreapps/activeVisits.page?app=coreapps.activeVisits']")
    WebElement activeVisitsBtn;

    @FindBy(xpath = "//a[@href='/openmrs/coreapps/findpatient/findPatient.page?app=referenceapplication.vitals']")
    WebElement captureVitalsBtn;

    @FindBy(xpath = "//a[@href='/openmrs/registrationapp/registerPatient.page?appId=referenceapplication.registrationapp.registerPatient']")
    WebElement registerPatientBtn;


    @FindBy(xpath = "//a[@href='/openmrs//appointmentschedulingui/home.page']")
    WebElement appointmentSchedulingBtn;

    @FindBy(xpath = "//a[@href='/openmrs/reportingui/reportsapp/home.page']")
    WebElement reportsBtn;

    @FindBy(xpath = "//a[@href='/openmrs/coreapps/datamanagement/dataManagement.page']")
    WebElement dataManagementBtn;

    @FindBy(xpath = "//a[@href='/openmrs/adminui/metadata/configureMetadata.page']")
    WebElement configureMetadataBtn;

    @FindBy(xpath = "//a[@href='/openmrs/coreapps/systemadministration/systemAdministration.page']")
    WebElement systemAdministrationBtn;

//    @FindBy(xpath = "//a[@class='btn btn-default btn-lg button app big align-self-center']")
//    List<WebElement> allDeparmentsPages;
//    public void clickOnPage(String pageName){
//        for (WebElement page : allDeparmentsPages){
//            if (page.getText().equalsIgnoreCase(pageName)){
//                page.click();

    public void locationClick(){
        location.click();
    }
//    public String actualLocation(){
//
//    }
    public void validateUserName(String userName){
        Assert.assertEquals(userNameBtn.getText(), userName);
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
