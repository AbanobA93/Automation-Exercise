package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
    private WebDriver driver;
    private WebDriverWait wait;
    //constructor
    public SignupPage(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    //elements
    private By radioButtonMr = By.id("id_gender1");
    private By passwordField = By.id("password");
    private By dobDay = By.id("days");
    private By dobMonth = By.id("months");
    private By dobYears = By.id("years");
    private By checkBoxNewsletter = By.id("newsletter");
    private By checkBoxSpecialOffers =By.id("optin");
    private By firstNameField = By.id("first_name");
    private By lastNameField = By.id("last_name");
    private By companyField = By.id("company");
    private By addressField = By.id("address1");
    private By address2Field = By.id("address2");
    private By countryList = By.id("country");
    private By stateField = By.id("state");
    private By cityField = By.id("city");
    private By zipCodeField = By.id("zipcode");
    private By mobileNumber = By.id("mobile_number");
    private By createAccountButton = By.className("btn-default");
    //methods
    public AccountCreatedPage moveToAccountPage(){
        driver.findElement(radioButtonMr).click();
        driver.findElement(passwordField).sendKeys("hellohalloa123!");
        driver.findElement(dobDay).sendKeys("15");
        driver.findElement(dobMonth).sendKeys("dec");
        driver.findElement(dobYears).sendKeys("1995");
        driver.findElement(checkBoxNewsletter).click();
        driver.findElement(checkBoxSpecialOffers).click();
        driver.findElement(firstNameField).sendKeys("tester");
        driver.findElement(lastNameField).sendKeys("testing");
        driver.findElement(companyField).sendKeys("SWtesting");
        driver.findElement(addressField).sendKeys("123");
        driver.findElement(address2Field).sendKeys("123");
        driver.findElement(countryList).sendKeys("uni"+ Keys.ENTER);
        driver.findElement(stateField).sendKeys("NY");
        driver.findElement(cityField).sendKeys("mataria");
        driver.findElement(zipCodeField).sendKeys("1322");
        driver.findElement(mobileNumber).sendKeys("132133");
        driver.findElement(createAccountButton).click();
        return new AccountCreatedPage(driver,wait);
    }

}