package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // constructor
    public SignupPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    // elements
    private By radioButtonMr = By.id("id_gender1");
    private By passwordField = By.id("password");
    private By dobDay = By.id("days");
    private By dobMonth = By.id("months");
    private By dobYears = By.id("years");
    private By checkBoxNewsletter = By.id("newsletter");
    private By checkBoxSpecialOffers = By.id("optin");
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

    // actions


    public AccountCreatedPage moveToAccountCreatedPage(String password,String firstname,String day,String month,
                                                       String year,String lastname,String company,String firstAddress,
                                                       String secondAddress,String country,String stateName,
                                                       String zipCodeNumber,String cityName,String mobile) {
        driver.findElement(radioButtonMr).click();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(dobDay).sendKeys(day);
        driver.findElement(dobMonth).sendKeys(month);
        driver.findElement(dobYears).sendKeys(year);
        driver.findElement(checkBoxNewsletter).click();
        driver.findElement(checkBoxSpecialOffers).click();
        driver.findElement(firstNameField).sendKeys(firstname);
        driver.findElement(lastNameField).sendKeys(lastname);
        driver.findElement(companyField).sendKeys(company);
        driver.findElement(addressField).sendKeys(firstAddress);
        driver.findElement(address2Field).sendKeys(secondAddress);
        driver.findElement(countryList).sendKeys(country + Keys.ENTER);
        driver.findElement(stateField).sendKeys(stateName);
        driver.findElement(cityField).sendKeys(cityName);
        driver.findElement(zipCodeField).sendKeys(zipCodeNumber);
        driver.findElement(mobileNumber).sendKeys(mobile);
        driver.findElement(createAccountButton).click();
        return new AccountCreatedPage(driver,wait);
    }


}
