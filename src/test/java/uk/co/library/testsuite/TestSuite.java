package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class TestSuite extends TestBase {

    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod
    public void init() {
        homePage = new HomePage();
        resultPage = new ResultPage();

    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class,groups = {"sanity","smoke","regression"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnAcceptCookie();
        homePage.setJobtitle(jobTitle);
        homePage.setLocation(location);
        homePage.setDistance(distance);
        Thread.sleep(1000);

        homePage.clickOnMoreSearchOption();
        homePage.setSalaryminimum(salaryMin);
        homePage.setMaximumsalary(salaryMax);
        homePage.setSalarytype(salaryType);
        Thread.sleep(1000);
        homePage.setJobtype(jobType);
        homePage.clickOnFindJobButton();
        //resultPage.setResults();
        softAssert.assertEquals(resultPage.setResults(),result,"");
        softAssert.assertAll();


    }

}
