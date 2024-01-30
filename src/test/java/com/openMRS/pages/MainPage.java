package com.openMRS.pages;

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











    public void validationOfTitle(WebDriver driver){
        BrowserUtils.getTitle(driver);
    }

    public void validationOfUserNameAndLocation(String userName){

    }

    public void FindPatientRecordPage(){

        FindPatientRecordBtn.click();

    }

}
