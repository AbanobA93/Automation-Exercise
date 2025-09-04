package Utils;

import org.testng.annotations.DataProvider;

public class Faker {

    @DataProvider(name = "usernameAndEmailData")
    public Object[][] provideUsernameAndEmail() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker();
        return new Object[][] {
                { faker.name().username(), faker.internet().emailAddress() },
                { faker.name().username(), faker.internet().emailAddress() }
        };
    }
}