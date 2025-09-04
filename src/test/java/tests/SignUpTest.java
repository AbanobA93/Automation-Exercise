package tests;

import Utils.SignupDataProvider;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.LandingPage;


public class SignUpTest extends BaseTest {

    @Test(dataProvider = "signupData", dataProviderClass = SignupDataProvider.class)
    public void signupNameAndEmail(String username, String email,String firstname, String lastname, String password, String company,
                                   String firstAddress, String secondAddress, String country, String stateName,
                                   String cityName, String zipCodeNumber, String mobile,
                                   String day, String month, String year) {

            new LandingPage(driver, wait)
                        .moveToLoginAndSigunUp()
                        .moveToSignupPage(username,email)
                        .moveToAccountCreatedPage(
                                 password
                                ,firstname
                                ,day
                                ,month
                                ,year
                                ,lastname
                                , company
                                , firstAddress
                                ,secondAddress
                                ,country
                                ,stateName
                                ,zipCodeNumber
                                ,cityName
                                ,mobile)
                        .isAccountCreatedMessageDisplayed();
    }

    @Test (dataProvider = "signupData", dataProviderClass = SignupDataProvider.class)
    public void moveToHomePage(String username, String email,String firstname, String lastname, String password, String company,
                               String firstAddress, String secondAddress, String country, String stateName,
                               String cityName, String zipCodeNumber, String mobile,
                               String day, String month, String year) {
        new LandingPage(driver, wait)
                .moveToLoginAndSigunUp()
                .moveToSignupPage(username,email)
                .moveToAccountCreatedPage(
                        password
                        ,firstname
                        ,day
                        ,month
                        ,year
                        ,lastname
                        , company
                        , firstAddress
                        ,secondAddress
                        ,country
                        ,stateName
                        ,zipCodeNumber
                        ,cityName
                        ,mobile)
                .moveToHomePage();
    }
}


