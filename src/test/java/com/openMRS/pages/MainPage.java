package com.openMRS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "")
    WebElement RegistrationDeskBtn;

    @FindBy(xpath = "")
    WebElement UserNameBtn;



    @FindBy(xpath = "")
    WebElement FindPatientRecordBtn;

    @FindBy(xpath = "")
    WebElement ActiveVisitsBtn;

    @FindBy(xpath = "")
    WebElement CaptureVitalsBtn;

    @FindBy(xpath = "")
    WebElement RegisterPatientBtn;


    @FindBy(xpath = "")
    WebElement AppointmentSchedulingBtn;

    @FindBy(xpath = "")
    WebElement ReportsBtn;

    @FindBy(xpath = "")
    WebElement DataManagementBtn;

    @FindBy(xpath = "")
    WebElement ConfigureMetadataBtn;

    @FindBy(xpath = "")
    WebElement SystemAdministrationBtn;


//    @FindBy(xpath = "//a[@class='btn btn-default btn-lg button app big align-self-center']")
//    List<WebElement> allDeparmentsPages;
//    public void clickOnPage(String pageName){
//        for (WebElement page : allDeparmentsPages){
//
//            if (page.getText().equalsIgnoreCase(pageName)){
//                page.click();

    public void validationOfUserNameAndLocation(String userName){

    }



    public void RegistrationDeskClick(){
        RegistrationDeskBtn.click();
    }
    
    public void FindPatientRecordClick(){
        FindPatientRecordBtn.click();
    }

     public void ActiveVisitsClick(){
         ActiveVisitsBtn.click();
    }

    public void CaptureVitalsClick(){
        CaptureVitalsBtn.click();
    }

    public void RegisterPatientClick(){
        RegisterPatientBtn.click();
    }

    public void AppointmentSchedulingClick(){
        AppointmentSchedulingBtn.click();
    }

    public void ReportsClick(){
        ReportsBtn.click();
    }

     public void DataManagementClick(){
         DataManagementBtn.click();
    }

    public void ConfigureMetadataClick(){
        ConfigureMetadataBtn.click();
    }

    public void SystemAdministrationClick(){
        SystemAdministrationBtn.click();
    }




}
