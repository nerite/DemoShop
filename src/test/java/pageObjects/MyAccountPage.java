package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage{

    @FindBy(how = How.XPATH, using = "//div[@id='content']//h2[text()='My Account']")
    public WebElement myAccTxt;

    public MyAccountPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getMyAccountText(){
        return myAccTxt.getText();
    }
}
