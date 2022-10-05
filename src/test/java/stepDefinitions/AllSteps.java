package stepDefinitions;

import io.cucumber.java.en.Given;

public class AllSteps extends GeneralSteps{
    @Given("^I am on Demo Shop page$")
    public void iAmOnPage(){
        driver.openBrowser("chrome", "http://www.demoshop24.com/");
    }
}
