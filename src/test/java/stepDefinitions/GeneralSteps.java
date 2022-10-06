package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GeneralSteps {

    public ChromeDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Given("^I am on Demo Shop page$")
    public void iAmOnShopPage(){
        driver.get("http://www.demoshop24.com/");
    }

    @After
    public void cleanUp(){
        driver.close();
    }

}
