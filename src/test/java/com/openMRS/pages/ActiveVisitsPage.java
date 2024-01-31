package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ActiveVisitsPage {

    public ActiveVisitsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void validationOfOpenMRS_ActiveVisitsPage(WebDriver driver, String expectedTitleOfActiveVisits) {

        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, expectedTitleOfActiveVisits, "Failed validation");
    }

        public class ActiveVisits {

            @FindBy(xpath = "//*[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")
            WebElement findPatientRecordBtn;
            @FindBy(xpath ="//*[@id='patient-search-results-table']/tbody/tr[1]/td[1]" )
            WebElement patient;
            @FindBy(xpath = "//*[@id='content']/div[9]/div[2]/div/ul/li[1]")
            WebElement startVisit;
            @FindBy(xpath = "//*[@id='start-visit-with-visittype-confirm']/text()")
            WebElement confirmPopUp;
            @FindBy(xpath = "")
            WebElement visitNote;
            @FindBy(xpath = "//*[@id='buttons']/button")
            WebElement cancelBtn;
            @FindBy(xpath = "//*[@id='error-message'] ")
            WebElement patientName;
            @FindBy(xpath = "//*[@id='referenceapplication.realTime.simpleVisitNote']")
            WebElement endVisit;
            @FindBy(xpath = "//*[@id='end-visit-dialog']/div[2]/button[1]")
            WebElement yesPopUp;

           // @FindBy(xpath = "")
           // WebElement yesPopUp;

            @FindBy(xpath = "/html/head/title")
            WebElement openMrsMainPage;
            @FindBy(xpath = " ")
            WebElement activeVisitBtn;
            @FindBy(xpath = "")
            WebElement noPatient;
            public void  findPatient() {
                findPatientRecordBtn.click();
            }
            public void setPatient(){
                patient.click();

            }
            public void setVisit() {
                startVisit.click();
                confirmPopUp.click();

            }
            public void setVisitNote(){
                visitNote.click();
            }
            public void setCancelPopUp(){
                cancelBtn.click();
            }
            public void patientNameClick(){
                patientName.click();
            }
            public void setEndVisit(){
                endVisit.click();
                yesPopUp.click();
            }
            public void  setOpenMrsMainPage() {
                openMrsMainPage.click();
            }
            public void checkActiveVisit(){
                activeVisitBtn.click();
            }
           // public void validateEmptyActivePatientList(String none){
              //  Assert.assertEquals(, this.none.getText());

            }



        }

