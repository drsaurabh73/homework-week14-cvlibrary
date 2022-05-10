package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
               {"Tester","Harrow on the Hill, Greater London","up to 5 miles","30000","500000","annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
            {"Test Technician","London","up to 25 miles","30000","50000","annum","Permanent","Permanent Test Technician jobs in London"},
                {"Test Manager","London","up to 15 miles","35000","500000","annum","Permanent","Permanent Test Manager jobs in London"},
                {"Tester","Leeds","up to 10 miles","3000","5000","month","Permanent","Permanent Tester jobs in Leeds"},
              {"Tester","Luton","up to 5 miles","2000","8000","month","Permanent","Permanent Tester jobs in Luton"},
               {"Tester","Luton","up to 25 miles","30000","55000","annum","Permanent","Permanent Tester jobs in Luton"},



        };
        return data;
    }
}