package Tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LandingPage;

public class loginTest extends BaseTest {

    @Test(priority = 1)
    public void assertionLoginText(){
        Assert.assertTrue(
                new LandingPage(driver,wait)
                        .moveToLoginAndSigunUp()
                        .isLoginTextDisplayed()
        );
    }

    @Test(priority = 2)
    public void assertionSignUpText(){
        Assert.assertTrue(
                new LandingPage(driver,wait)
                        .moveToLoginAndSigunUp()
                        .isNewUserSignupTextDisplayed()
        );
    }

    @Test(priority = 3)
    public void validLogin(){
        Assert.assertTrue(
                new LandingPage(driver,wait)
                        .moveToLoginAndSigunUp()
                        .validLogin("test.testing@test.tester","test.tester@!#")
                        .urlLoginAndSignupPage()
        );
    }

    @Test(priority = 4)
    public void invalidLogin(){
        Assert.assertTrue(
                new LandingPage(driver,wait)
                        .moveToLoginAndSigunUp()
                        .invalidLogin()
                        .invalidUsernameOrPassMessageDisplayed()
        );
    }
}
