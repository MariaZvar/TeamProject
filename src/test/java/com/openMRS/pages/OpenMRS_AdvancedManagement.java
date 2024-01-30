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


    @FindBy(xpath = "")
    WebElement systemAdministrations;

    @FindBy(xpath = "")
    WebElement advancedAdministrations;

    @FindBy(xpath = "")
    WebElement  managePerson;

    @FindBy(xpath = "")
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
        this.searchBarManage.sendKeys(name);

    }


    public void changeAndSave(String address){
        this.person.click();
        this.addressField.clear();
        this.addressField.sendKeys(address);



    }


    public void findPersonRecord(){

        this.findPersonRecord.click();




    }


    public void findUpdatedPerson(String nameWithUpdated){


        this.searchBarRecord.sendKeys(nameWithUpdated);

    }


    public void checkUpdatedInfo(String updatedInfo){

        this.personUpdated.click();
        Assert.assertEquals(this.updatedInformation.getText(),updatedInfo);

    }







}
