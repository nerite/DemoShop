package pageObjects;

import flowWorkers.WebDriverLib;

public class BasePage {

    protected WebDriverLib driver;

    public BasePage(WebDriverLib driver){
        this.driver = driver;
    }

}
