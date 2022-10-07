package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.MainPage;

public class LoginSteps extends GeneralSteps{

    private MainPage mainPage = new MainPage(driver);

    @Before
    public void setUp(){
        driver.openBrowser("chrome");
    }

    @Given("^I am on Demo Shop page$")
    public void iAmOnShopPage(){
        driver.openWebPage("http://www.demoshop24.com/");
    }

    @And("^Go to Login page$")
    public void goToLoginPage(){
        mainPage.clickMyAccountBtn();
        mainPage.clickMyAccLogBtn();
    }

    @And("^Enter E-mail Address \"([^\"]*)\"$")
    public void enterEmailAddress(String value){

    }

//    @After
//    public void cleanUp(){
//        driver.close();
//    }

}
