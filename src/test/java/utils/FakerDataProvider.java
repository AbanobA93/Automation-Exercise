package utils;

import org.testng.annotations.DataProvider;
import com.github.javafaker.Faker;

public class FakerDataProvider {

    @DataProvider(name = "fullUserData")
    public Object[][] provideFullUserData() {
        Faker faker = new Faker();

        return new Object[][] {
                {
                        // (LoginAndSignUpPage)
                        faker.name().username(),                // username
                        faker.internet().emailAddress(),        // email

                        //  (SignupPage)
                        faker.name().firstName(),
                        faker.name().lastName(),
                        faker.internet().password(),
                        faker.company().name(),
                        faker.address().streetAddress(),
                        faker.address().secondaryAddress(),
                        "Canada",
                        faker.address().state(),
                        faker.address().city(),
                        faker.address().zipCode(),
                        faker.phoneNumber().cellPhone(),
                        "10",
                        "May",
                        "1995"
                }
        };
    }
}
