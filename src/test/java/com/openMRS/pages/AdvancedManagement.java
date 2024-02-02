package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class AdvancedManagement {



    public AdvancedManagement(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[contains(.,'System Administration')]")
    WebElement systemAdministration;

    @FindBy(xpath = "//a[contains(.,'Advanced Administration')]")
    WebElement advancedAdministration;

    @FindBy(xpath = "//a[contains(.,'Manage Persons')]")
    WebElement managePerson;

    @FindBy(xpath = "//input[@id='inputNode']")
    WebElement personNameLine;


    @FindBy(xpath = "//tr[@class='even']")
    List<WebElement> personNames;

    @FindBy(xpath = "//tr//td//input[@id='addresses[0].address1']")
    WebElement lineAddress;

    @FindBy(css = "#saveButton")
    WebElement savePatientBtn;

    @FindBy(xpath = "//a[contains(.,'Home')]")
    WebElement homeBtn;

    @FindBy(xpath = "//a[contains(.,'Find Patient Record')]")
    WebElement findPatientRecord;

    @FindBy(xpath = "//input[@id='patient-search']")
    WebElement searchByNameLine;

    @FindBy(xpath = "//tr//td[3]")
    WebElement findPerson;

    @FindBy(css = "#coreapps-showContactInfo")
    WebElement showContactInfo;

    @FindBy(xpath = "//span[contains(.,'Address')]")
    WebElement address;

    @FindBy(xpath = "//tr//td[3]")
    WebElement nameVeraToClick;

    public void clickAdministrations() {

        systemAdministration.click();
        advancedAdministration.click();

    }

    public void clickOnManagePerson() {

        managePerson.click();


    }

    public void enterPersonInfo(String name) throws InterruptedException {

        Thread.sleep(2000);

        personNameLine.sendKeys(name);
    }

    public void clickOnPersonInfoField(String personName) {
        for (WebElement name : personNames) {
            if (BrowserUtils.getText(name).equals(personName)) {
                name.click();

            }
        }
    }

    public void changeUserInfo(String newAddress) throws InterruptedException {

        Thread.sleep(2000);
        lineAddress.clear();
        lineAddress.sendKeys(newAddress);
        savePatientBtn.click();

    }

    public void backToMainPage() {

        homeBtn.click();
    }

    public void findPatientRecord() {

        findPatientRecord.click();
    }

    public void findPatientName(String name) {

        searchByNameLine.sendKeys(name, Keys.ENTER);


    }

    public void clickONameWithUpdates() {
        findPerson.click();

    }

    public void validateUpdates() throws InterruptedException {
        Thread.sleep(1000);

        showContactInfo.click();
        Assert.assertTrue(BrowserUtils.getText(address).contains("171 N Bay Rd"));
        Assert.assertEquals(BrowserUtils.getText(address), "171 N Bay Rd\n" +
                "Address");

    }

    public void clickVeraName() {
        nameVeraToClick.click();
    }


}

