package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreatedPage {
    private WebDriver driver;
    private WebDriverWait wait;

    //constructor
    public AccountCreatedPage(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    //elements
    private static String expectedString = "Account Created!";
    private By accountCreatedText = By.xpath("//*[text()='Account Created!']");
    private By continueButton = By.cssSelector("a[data-qa=\"continue-button\"]");
    private By deleteAccountButton = By.className("fa-trash-o");


    //assertion
    public boolean isAccountCreatedMessageDisplayed() {
        return driver.findElement(accountCreatedText).isDisplayed();
    }
    public HomePage moveToHomePage(){
        driver.findElement(continueButton).click();
        return new HomePage(driver,wait);
    }
    public DeleteAccountPage moveToDeleteAccountPage() {
        driver.findElement(deleteAccountButton).click();
        return new DeleteAccountPage(driver, wait);
    }
}
