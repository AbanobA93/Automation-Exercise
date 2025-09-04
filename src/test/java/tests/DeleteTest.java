package tests;

import Utils.FakerDataProvider;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LandingPage;

public class DeleteTest extends BaseTest {

    @Test(dataProvider = "fullUserData", dataProviderClass = FakerDataProvider.class)
    public void deleteAccount(String username,String email,
                              String firstname, String lastname, String password, String company,
                              String firstAddress, String secondAddress, String country, String stateName,
                              String cityName, String zipCodeNumber, String mobile,
                              String day, String month, String year) {

        Assert.assertTrue(
                        new LandingPage(driver, wait)
                                .moveToLoginAndSigunUp()
                                .moveToSignupPage(username, email)
                                .moveToAccountCreatedPage(
                                        password
                                        ,firstname
                                        ,day
                                        ,month
                                        ,year
                                        ,lastname
                                        ,company
                                        ,firstAddress
                                        ,secondAddress
                                        ,country
                                        ,stateName
                                        ,zipCodeNumber
                                        ,cityName
                                        ,mobile)
                        .moveToDeleteAccountPage()
                        .isDeleteAccountPageDisplayed()
        );
    }
}
