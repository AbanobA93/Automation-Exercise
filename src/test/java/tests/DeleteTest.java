package tests;
import Utils.SignupDataProvider;
import Utils.UserData;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LandingPage;

public class DeleteTest extends BaseTest {
    @Test(dataProvider = "fullUserData", dataProviderClass = SignupDataProvider.class)
    public void deleteAccount() {
        Assert.assertTrue(
                new LandingPage(driver, wait)
                        .moveToLoginAndSigunUp()
                        .moveToSignupPage(UserData user)
                        .moveToAccountCreatedPage(UserData)
                        .moveToDeleteAccountPage()
                        .isDeleteAccountPageDisplayed()
        );
    }
}

