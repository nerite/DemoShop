package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(how = How.ID, using = "input-email")
    public WebElement emailField;
    @FindBy(how = How.ID, using = "input-password")
    public WebElement passwordField;
    @FindBy(how = How.XPATH, using = "//input[@value='Login']")
    public WebElement loginBtn;

    public LoginPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String value){
        emailField.sendKeys(value);
    }
    public void enterPassword(String value){
        passwordField.sendKeys(value);
    }
    public void clickLoginBtn(){
        loginBtn.click();
    }
}
