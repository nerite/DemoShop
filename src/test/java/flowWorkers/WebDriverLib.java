package flowWorkers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class WebDriverLib {

    private static RemoteWebDriver driver;

    public void openBrowser(String browser, String url){
        try{
            if(browser.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }catch (WebDriverException e){}
    }

//    public WebElement locateElement(String selectorType, String selectorValue){
//        try{
//            switch(selectorType.toLowerCase()){
//                case "id": return driver.findElement(By.id(selectorValue));
//                case "name": return driver.findElement(By.name(selectorValue));
//                case "class": return driver.findElement(By.className(selectorValue));
//                case "link": return driver.findElement(By.linkText(selectorValue));
//                case "plink": return driver.findElement(By.partialLinkText(selectorValue));
//                case "tag": return driver.findElement(By.tagName(selectorValue));
//                case "xpath": return driver.findElement(By.xpath(selectorValue));
//                case "css": return driver.findElement(By.cssSelector(selectorValue));
//            }
//            return null;
//        } catch (Exception e){}
//        return null;
//    }


}
