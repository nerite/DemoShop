package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    @FindBy(how = How.XPATH, using = "//a[@title='My Account']")
    public WebElement myAccBtn;
    @FindBy(how = How.XPATH, using = "//a[text()='Register']")
    public WebElement myAccRegBtn;
    @FindBy(how = How.XPATH, using = "//a[text()='Login']")
    public WebElement myAccLogBtn;

    public MainPage(WebDriverLib driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickMyAccountBtn(){
        myAccBtn.click();
    }

    public void clickMyAccLogBtn() {
        myAccLogBtn.click();
    }
}
