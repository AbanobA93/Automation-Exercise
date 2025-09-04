package utils;

import org.testng.annotations.DataProvider;
import com.github.javafaker.Faker;

public class FakerDataProvider {

    @DataProvider(name = "fullUserData")
    public Object[][] provideFullUserData() {
        Faker faker = new Faker();

        return new Object[][] {
                {
                        // الصفحة الأولى (LoginAndSignUpPage)
                        faker.name().username(),                // username
                        faker.internet().emailAddress(),        // email

                        // الصفحة التانية (SignupPage)
                        faker.name().firstName(),               // firstname
                        faker.name().lastName(),                // lastname
                        faker.internet().password(),            // password
                        faker.company().name(),                 // company
                        faker.address().streetAddress(),        // firstAddress
                        faker.address().secondaryAddress(),     // secondAddress
                        "Canada",                               // country (ممكن تخليها ثابتة أو random)
                        faker.address().state(),                // stateName
                        faker.address().city(),                 // cityName
                        faker.address().zipCode(),              // zipCodeNumber
                        faker.phoneNumber().cellPhone(),        // mobile
                        "10",                                   // day
                        "May",                                  // month
                        "1995"                                  // year
                }
        };
    }
}
