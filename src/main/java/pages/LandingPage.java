package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
    private WebDriver driver;
    private WebDriverWait wait;

    //constructor
    public LandingPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    //elements
    private static String expectedUrl = "https://www.automationexercise.com/";
    private By loginAndSigunUpButtons = By.className("fa-lock");


    //methods
    public LandingPage currentURL() {
        driver.getCurrentUrl();
        return this;
    }
    public LoginAndSignUpPage moveToLoginAndSigunUp(){
        driver.findElement(loginAndSigunUpButtons).click();
        return new LoginAndSignUpPage(driver,wait);
    }
    //assertion
    public boolean isAtLandingPage() {
        return driver.getCurrentUrl().equals(expectedUrl);
    }
}

