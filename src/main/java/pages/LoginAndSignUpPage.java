package pages;

import com.sun.nio.file.ExtendedOpenOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAndSignUpPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // constructor
    public LoginAndSignUpPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // elements
    private By loginToYourAccountText = By.xpath("//h2[text()='Login to your account']");
    private By newUserSignUpText = By.xpath("//h2[text()='New User Signup!']");
    private By loginEmailField = By.cssSelector("input[data-qa='login-email']");
    private By passwordField = By.cssSelector("input[data-qa='login-password']");
    private By loginButton = By.cssSelector("button[data-qa='login-button']");
    private By invalidUsernameOrPassMessage = By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");
    private By signupNameField = By.cssSelector("input[data-qa=\"signup-name\"]");
    private By signupEmailField = By.cssSelector("input[data-qa='signup-email']");
    private By signupButton = By.cssSelector("button[data-qa=\"signup-button\"]");
    private By logoutButton = By.className("fa-lock");
    // methods
    public LoginAndSignUpPage validLogin(String username, String password){
        driver.findElement(loginEmailField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return this;
    }

    public LoginAndSignUpPage invalidLogin(){
        driver.findElement(loginEmailField).sendKeys("invalidUserName@invalid.com");
        driver.findElement(passwordField).sendKeys("invalidPassword");
        driver.findElement(loginButton).click();
        return this;
    }
    public SignupPage moveToSignupPage(String username,String email){
        driver.findElement(signupNameField).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(signupEmailField));
        driver.findElement(signupEmailField).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(signupButton));
        driver.findElement(signupButton).click();
    return new SignupPage(driver,wait);}


    // assertions
    public boolean isLoginTextDisplayed(){
        return driver.findElement(loginToYourAccountText).isDisplayed();
    }

    public boolean isNewUserSignupTextDisplayed(){
        return driver.findElement(newUserSignUpText).isDisplayed();
    }

    public boolean invalidUsernameOrPassMessageDisplayed() {
        return driver.findElement(invalidUsernameOrPassMessage).isDisplayed();
    }
    public boolean isLogoutButtonDisplayed (){
        return driver.findElement(logoutButton).isDisplayed();
    }
}
