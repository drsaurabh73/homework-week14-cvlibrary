package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    //job title/job ref/keywords
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobtitlefield;
    public void setJobtitle(String jobtitle) {
        Reporter.log("sending  text from jobtitle/job ref "+jobtitlefield.toString()+"<br>");
        sendTextToElement(jobtitlefield,jobtitle);
    }
    //location
    @FindBy (xpath = "//input[@placeholder='e.g. town or postcode']")
    WebElement location;
    public void setLocation(String text) {
        Reporter.log("sending  text from location ref "+jobtitlefield.toString()+"<br>");
        sendTextToElement(location,text);
    }
    //Distance
    @FindBy (xpath = "//select[@id='distance']")
    WebElement distance;
    public void setDistance(String text){
        Reporter.log("Selecting distance from location"+distance+" from dropdown "+distance.toString() + "<br>");
        selectByVisibleTextFromDropDown(distance,text);
    }

    // more search options
    @FindBy (xpath = "//button[@id='toggle-hp-search']")
    WebElement moresearch;
    public void clickOnMoreSearchOption() {
        Reporter.log("Clicking on more search option"+ moresearch.toString()+ "<br>");
        clickOnElement(moresearch);
    }
    //salary minimum
    @FindBy (xpath = "//input[@id='salarymin']")
    WebElement salaryminimum;
    public void setSalaryminimum(String text) {
        Reporter.log("Selecting Minumum salary from location"+salaryminimum+" from dropdown "+salaryminimum.toString() + "<br>");
        sendTextToElement(salaryminimum,text);
    }

    //salary maximum
    @FindBy (xpath = "//input[@id='salarymax']")
    WebElement maximumsalary;
    public void setMaximumsalary(String text) {
        Reporter.log("Selecting Maximum salary from location"+maximumsalary+" from dropdown "+maximumsalary.toString() + "<br>");
        sendTextToElement(maximumsalary,text);
    }
    // salary type
    @FindBy (xpath = "//select[@id='salarytype']")
    WebElement salarytype;
    public void setSalarytype(String text) {
        Reporter.log("Selecting salary type"+salarytype+" from dropdown "+salarytype.toString() + "<br>");
        selectByValueFromDropDown(salarytype,text);
    }
    //job type
    @FindBy(xpath = "//select[@class='hp-jobtype form__select']")
    WebElement jobtype;
    public void setJobtype(String text) {
        Reporter.log("Selecting Job type"+jobtype+" from dropdown "+jobtype.toString() + "<br>");
        selectByValueFromDropDown(jobtype,text);
    }
    // click find job button
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findjob;
    public void clickOnFindJobButton() {
        Reporter.log("Clicking on findjob"+ findjob.toString()+ "<br>");
        clickOnElement(findjob);
    }

@FindBy(xpath = "//*[contains(text(),'Accept')]")
WebElement cookies;
    public void clickOnAcceptCookie(){
        Reporter.log("Clicking on Accept Cookies : " + cookies.toString());
        switchToiFrame("gdpr-consent-notice");
        clickOnElement(cookies);
    }


}
