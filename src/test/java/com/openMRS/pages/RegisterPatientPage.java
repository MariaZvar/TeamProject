package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class RegisterPatientPage {

    public RegisterPatientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    // @FindBy(css = "#referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")
    // WebElement RegisterPatient;

    @FindBy(css = "#givenName")
    WebElement givenName;

    @FindBy(css = "#familyName")
    WebElement familyName;

    @FindBy(xpath = "//select[@id='gender-field']//following-sibling::option[@value='F']")
    WebElement gender;


    @FindBy(css = "#birthdateDay-field")
    WebElement day;

    @FindBy(css = "#birthdateMonth-field")
    WebElement months;

    @FindBy(css = "#birthdateYear-field")
    WebElement years;

    @FindBy(css = "#address1")
    WebElement address;

    @FindBy(css = "#country")
    WebElement country;

    @FindBy(css = "#stateProvince")
    WebElement state;

    @FindBy(css = "#cityVillage")
    WebElement city;

    @FindBy(css = "#postalCode")
    WebElement zipCode;

    @FindBy(css = "#fr8056-field")
    WebElement phone;

    @FindBy(xpath = "//button[.='submitButton confirm right']")
    public WebElement createAccountBtn;


    public void firstNameLastName(String firstName, String lastName) {

        this.givenName.sendKeys(firstName);
        this.familyName.sendKeys(lastName);
    }

    public void chooseBirthdate(String days, String months, String years) {
        BrowserUtils.selectBy(this.day, days, "visibleText");
        BrowserUtils.selectBy(this.months, months, "visibleText");
        BrowserUtils.selectBy(this.years, years, "visibleText");
    }

    public void addresses(String address, String country) {

        this.address.sendKeys(address);
        BrowserUtils.selectBy(this.country, country, "visibleText");
    }

    public void stateAndCity(String state, String city) {

        this.state.sendKeys(state);
        this.city.sendKeys(city);
    }

    public void zipCodePhone(String zipCode, String phone) {

        this.zipCode.sendKeys(zipCode);
        this.phone.sendKeys(phone);
    }

    public void gender(String gender) {

        this.gender.sendKeys(gender);
    }

    public void clickOnCreateAccountBtn() {
        createAccountBtn.click();
    }


    public void validationOfFindPatientRecordPage(WebDriver driver, String OpenMRS_RegisterPatient){

        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, OpenMRS_RegisterPatient, "Failed validation");

    }
}
