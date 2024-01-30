package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRS_AdvancedManagement {



    public OpenMRS_AdvancedManagement(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[@href='/openmrs/coreapps/systemadministration/systemAdministration.page']")
    WebElement systemAdministrations;

    @FindBy(xpath = "//a[@href='/openmrs/admin/index.htm']")
    WebElement advancedAdministrations;

    @FindBy(xpath = "//a[@href='/openmrs/admin/patients/index.htm']")
    WebElement  managePerson;

    @FindBy(xpath = "//input[@id='inputNode']")
    WebElement searchBarManage;

    @FindBy(xpath = "")
    WebElement person;

    @FindBy(xpath = "")
    WebElement addressField;

    @FindBy(xpath = "")
    WebElement findPersonRecord;

    @FindBy(xpath = "")
    WebElement searchBarRecord;

    @FindBy(xpath = "")
    WebElement personUpdated;

    @FindBy(xpath = "")
    WebElement updatedInformation;



    public void clickAdministrations(){

        this.systemAdministrations.click();
        this.advancedAdministrations.click();


    }



    public void findDeletedPerson(String name){

        this.managePerson.click();
        this.searchBarManage.click();
        this.searchBarManage.sendKeys(name);

    }


    public void changeAndSave(String address){
        this.person.click();
        this.addressField.click();
        this.addressField.clear();
        this.addressField.sendKeys(address);



    }


    public void findPersonRecord(){

        this.findPersonRecord.click();




    }


    public void findUpdatedPerson(String nameWithUpdated){

        this.searchBarRecord.click();
        this.searchBarRecord.sendKeys(nameWithUpdated);

    }


    public void checkUpdatedInfo(String updatedInfo){

        this.personUpdated.click();
        Assert.assertEquals(this.updatedInformation.getText(),updatedInfo);

    }







}
