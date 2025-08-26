package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.TimeoutException;

public class DeleteAccountPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public DeleteAccountPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    private By accountDeletedMsg = By.xpath("//b[text()='Account Deleted!']");

    public boolean isDeleteAccountPageDisplayed() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(accountDeletedMsg)).isDisplayed();}
        catch (TimeoutException e) {
            return false;}
    }

    public String getAccountDeletedMessageText() {
        return driver.findElement(accountDeletedMsg).getText();}
}