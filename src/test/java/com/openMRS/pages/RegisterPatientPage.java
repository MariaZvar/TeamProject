package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;

public class RegisterPatientPage {

    public RegisterPatientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
     @FindBy(xpath = "//a[4]")
     WebElement registerPatient;

    @FindBy(xpath = "//input[@name='givenName']")
    WebElement givenName;

    @FindBy(xpath = "//input[@name='familyName']")
    WebElement familyName;

    @FindBy(xpath = "//select[@id='gender-field']//following-sibling::option[@value='F']")
    WebElement gender;


    @FindBy(xpath = "//input[@id='birthdateDay-field']")
    WebElement day;

    @FindBy(xpath = "//select[@name='birthdateMonth']")
    WebElement months;

    @FindBy(xpath = "//input[@name='birthdateYear']")
    WebElement years;

    @FindBy(xpath = "//input[@name='address1']")
    WebElement address;

    @FindBy(xpath = "//input[@name='country']")
    WebElement country;

    @FindBy(xpath= "//input[@name='stateProvince']")
    WebElement state;

    @FindBy(xpath= "//input[@name='cityVillage']")
    WebElement city;

    @FindBy(xpath = "//input[@name='cityVillage']")
    WebElement zipCode;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    WebElement phone;

    @FindBy(xpath = "//button[.='submitButton confirm right']")
    public WebElement createAccountBtn;

    @FindBy(xpath = "//input[@id='submit']")
    public WebElement confirm2;

    @FindBy(xpath = "//ul[@id='formBreadcrumb']//span[contains(.,'Name')]")
    WebElement nameBtn;
    @FindBy(xpath = "//span[contains(.,'Gender')]")
    WebElement genderBtn;
    @FindBy(xpath = "//span[contains(.,'Birthdate')]")
    WebElement birthdateBtn;
    @FindBy(xpath = "//span[contains(.,'Address')]")
    WebElement addressBtn;
    @FindBy(xpath = "//span[contains(.,'Phone Number')]")
    WebElement phonenumberBtn;
    @FindBy(xpath = "//span[contains(.,'Relationships')]")
    WebElement relativesBtn;

    @FindBy(xpath = "//span[contains(.,'Confirm')]")
    WebElement confirm1;

    @FindBy(xpath = "//div[@class='float-sm-right']")
    WebElement patientId;



    public void firstNameLastName(String firstName, String lastName) {

        this.givenName.sendKeys(firstName);
        this.familyName.sendKeys(lastName);
    }


    public void clikOnRegisterPatient(){

registerPatient.click();
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

    @FindBy(xpath = "//div[@class='logo']")
    WebElement logoBtn;
    public void validationOfFindPatientRecordPage(WebDriver driver, String OpenMRS_RegisterPatient){
        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, OpenMRS_RegisterPatient, "Failed validation");
    }
    public void getToHomePage(){
        logoBtn.click();
    }

    public void fillInfoOnPatientPager(){

       givenName.sendKeys("Codefish") ;
       familyName.sendKeys("Codefish18");
       genderBtn.click();

      gender.click();
      birthdateBtn.click();
       day.sendKeys("16");
       Select select= new Select(months);
       select.selectByVisibleText("May");
       years.sendKeys("1992");
       addressBtn.click();
       address.sendKeys("2200 Devon");
       country.sendKeys("USA");
       state.sendKeys("IL");
       city.sendKeys("Das Plaines");
       zipCode.sendKeys("60618");
       phonenumberBtn.click();
       phone.sendKeys("6753438899");
       relativesBtn.click();
       confirm1.click();
       confirm2.click();
    }

    public void patientId(){
        String patient= patientId.getText() ;
        System.out.println(patient);
    }
}
