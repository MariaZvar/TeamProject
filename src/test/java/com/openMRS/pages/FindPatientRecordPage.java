package com.openMRS.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class FindPatientRecordPage {
    public FindPatientRecordPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='logo']")
    WebElement logoBtn;
    @FindBy(xpath = "//input[@id='patient-search']")
    WebElement searchBar;
    @FindBy(xpath = "//i[@id='patient-search-clear-button']")
    WebElement clearButton;
    @FindBy(xpath = "//tbody")
    WebElement resultBtn;
    @FindBy(xpath = "//td[1]")
    List<WebElement> id;
    @FindBy(xpath = "//td[2]")
    List<WebElement> name;
    @FindBy(xpath = "//td[3]")
    List<WebElement> gender;
    @FindBy(xpath = "//td[4]")
    List<WebElement> age;
    @FindBy(xpath = "//div[@class='float-sm-right']")
    WebElement id1;

    // Webelements for patient information

@FindBy(xpath = "//div[@class='info-body']")
List<WebElement> infoBody;
    @FindBy(xpath = "//div[@class='info-header']")
    List<WebElement> headers;

    @FindBy(xpath = "//div[contains(text(),'Delete Patient')]")
    WebElement deletePatientBtn;

    @FindBy(xpath = "//input[@id='delete-reason']")
    WebElement reasonForDelete;
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    List<WebElement> confirmDelete;
    @FindBy(xpath = "//li[@class='nav-item logout']")
    WebElement logout;


public void validateHeaders(){
    for(WebElement header: headers){
        Assert.assertTrue(header.isDisplayed());
    }
}
public void validateInfoBody(){
    for(WebElement info:infoBody){
        Assert.assertTrue(info.isDisplayed());
    }
}
public void validatePatientId(String id){
    String actualId = id1.getText().substring(id1.getText().length()-6);
    if(actualId.equalsIgnoreCase(id)){
        System.out.println("patient id matched");
    } else if (!(actualId.equalsIgnoreCase(id))) {
        System.out.println("patient is registered multiple times");
    }

}
public void setLogout(){
    logout.click();
}
public void setDeletePatient(){
    if(deletePatientBtn.isDisplayed()){
        deletePatientBtn.click();
        reasonForDelete.sendKeys("moved to another country");
for(WebElement x:confirmDelete){
    if(x.getText().equalsIgnoreCase("Confirm")){
        x.click();
    }
}
    }
}









public void clickOnFirstResult(){
    resultBtn.click();
}


    public void validateSearch(){
        org.testng.Assert.assertTrue(searchBar.isDisplayed(),"search bar is displayed");
    }
    public void validateClearBtn(String Search) throws InterruptedException {
        org.testng.Assert.assertTrue(clearButton.isDisplayed(),"clear button is displayed");
        searchBar.sendKeys(Search);
        Thread.sleep(3000);
        clearButton.click();
        org.testng.Assert.assertEquals(searchBar.getText(),"");
    }

    public void searchPatient(String idOrName){
        searchBar.sendKeys(idOrName );
    }
    public void validatePatient(String idOrName){
        if(resultBtn.getText() != ""){
     Assert.assertTrue(resultBtn.getText().contains(idOrName));
        System.out.println("patient is registered with id: "+id.get(0).getText().substring(0,6)+" and name:"+name.get(0).getText());}
        else if (resultBtn.getText().contains( "No matching records found") ){
            Assert.assertTrue(resultBtn.getText().equalsIgnoreCase("No matching records found"));

            System.out.println("patient is unregistered");
        }

    }


    public void validationOfFindPatientRecordPage(WebDriver driver, String expectedTitleOfFindPatientPage){
        String actualTitle = BrowserUtils.getTitle(driver);
        Assert.assertEquals(actualTitle, expectedTitleOfFindPatientPage);
    }

    public void getToHomePage(){
        logoBtn.click();
    }

    public void validateHomePage(WebDriver driver, String expectedTitleHomePage ){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitleHomePage);
    }
}
