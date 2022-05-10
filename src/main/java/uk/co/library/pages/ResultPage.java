package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//h1[@class='search-header__title']")
    WebElement results;
    public String setResults() {
        Reporter.log("getting result text from "+results.toString()+"<br>");

        return getTextFromElement(results);
    }

}
