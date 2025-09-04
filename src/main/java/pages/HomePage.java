package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    //constructor
    public HomePage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait =wait;
    }

}
