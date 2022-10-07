package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.MyAccountPage;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps extends GeneralSteps{

    private MainPage mainPage = new MainPage(driver);
    private LoginPage loginPage = new LoginPage(driver);
    private MyAccountPage myAccPage = new MyAccountPage(driver);

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
        loginPage.enterEmail(value);
    }

    @And("^Enter Password \"([^\"]*)\"$")
    public void enterPassword(String value){
        loginPage.enterPassword(value);
    }

    @And("^Click Login button$")
    public void clickLoginButton(){
        loginPage.clickLoginBtn();
    }

    @Then("^Verifying that I am on \"([^\"]*)\" page$")
    public void verifyIAmOnMyAccountPage(String value){
        assertEquals(value, myAccPage.getMyAccountText());
        assertTrue(myAccPage.myAccTxt.isDisplayed());
    }

//    @After
//    public void cleanUp(){
//        driver.close();
//    }

}
