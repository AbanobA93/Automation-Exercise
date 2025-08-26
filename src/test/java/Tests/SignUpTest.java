package Tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LandingPage;

public class SignUpTest extends BaseTest {
    @Test
    public void signupNameAndEmail() {
        Assert.assertTrue(
                new LandingPage(driver, wait)
                        .moveToLoginAndSigunUp()
                        .moveToSignupPage()
                        .moveToAccountPage()
                        .isAccountCreatedMessageDisplayed()
        );
    }
        @Test
    public void moveToHomePage(){
        new LandingPage(driver,wait)
                .moveToLoginAndSigunUp()
                .moveToSignupPage()
                .moveToAccountPage().moveToHomePage();
    }
    public void deleteAccount(){
        Assert.assertTrue(
                new LandingPage(driver,wait)
                        .moveToLoginAndSigunUp()
                        .moveToSignupPage()
                        .moveToAccountPage()
                        .moveToDeleteAccountPage()
                        .isDeleteAccountPageDisplayed()
        );
    }
}
