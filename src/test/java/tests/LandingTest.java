package Tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LandingPage;

public class LandingTest extends BaseTest {

    @Test
    public void assertLandingPage() {
        Assert.assertTrue(
                new LandingPage(driver, wait)
                        .currentURL()
                        .isAtLandingPage()
        );
    }
    @Test
    public void moveToLoginAndSignup() {
                new LandingPage(driver, wait)
                        .moveToLoginAndSigunUp();
    }
}
