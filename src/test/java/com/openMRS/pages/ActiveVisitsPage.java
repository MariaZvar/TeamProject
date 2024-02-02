package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class ActiveVisitsPage {
    public ActiveVisitsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='logo']")
    WebElement logoBtn;
    public void validationActiveVisitsPage(WebDriver driver, String expectedTitleOfActiveVisits) {
        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, expectedTitleOfActiveVisits);
    }
    public void getToHomePage() {
        logoBtn.click();
    }
    @FindBy(css = "a[id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")
    WebElement findPatientRecordBtn;
    @FindBy(css = "input[id='patient-search']")
    WebElement searchByIdName;
    @FindBy(xpath = "//td[contains(text(),'100J35')]")
    WebElement clickOnPatient;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[9]/div[2]/div/ul/li[1]/a/div/div[2]")
    WebElement startVisit;
    @FindBy(css = "button[id='start-visit-with-visittype-confirm']")
    WebElement confirmPopUp;
    @FindBy(xpath = "/html/body/ul/li[2]/a")
    WebElement patientName;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[9]/div/div[1]/div[3]/div[1]/div[2]/a[2]")
    WebElement visitNote;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/form/htmlform/div[4]/button")
    WebElement cancelBtn;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[9]/div/div[1]/div[3]/div[1]/div[2]/a[1]")
    WebElement endVisit;
    @FindBy(xpath = "//*[@id='end-visit-dialog']/div[2]/button[1]")
    WebElement yesPopUp;
    @FindBy(xpath = "//div[@class='logo']")
    WebElement openMrsMainPage;
    @FindBy(css = "/html/body/div/div[3]/div[3]/div/a[2]")
    WebElement activeVisitBtn;
    @FindBy(xpath = "/html/body/div/div[3]/div/div[1]/label/input")
    WebElement noPatient;
    @FindBy(xpath = "//td[1]")
    WebElement idCheck;
    public void findPatient() {
        if (this.findPatientRecordBtn.isDisplayed()) {
            this.findPatientRecordBtn.click();
        } else {
            System.out.println("The button is not displayed.");}
    }
    public void setSearchByIdName(String patientID) {
        this.searchByIdName.sendKeys("100J35");
        clickOnPatient.click();
    }
    public void setStartVisit() {
        startVisit.click();
        confirmPopUp.click();
    }
    public void setNameClick(String name) {
        patientName.click();
    }
    public void setVisitNote() {
        visitNote.click();
        cancelBtn.click();
    }
    public void setEndVisit() {
        endVisit.click();
        yesPopUp.click();
    }
    public void setOpenMrsMainPage() {
        openMrsMainPage.click();
    }
    public void validateEmptyActivePatientList(WebDriver driver) {
        this.noPatient.sendKeys("100J35");
        if (!BrowserUtils.getText(driver, idCheck).isEmpty()) {
            System.out.println("Patient is no longer in inactive visits");
        } else {
            System.out.println("Patient is in inactive visits");
        }
    }
}










