package Selectors;

import org.openqa.selenium.By;

public class UserRegistrationSelectors {
    public static final By userFirstNameElement = By.cssSelector("input[name='customer.firstName']");
    public static final By userLastNamElement = By.cssSelector("input[name='customer.lastName']");
    public static final By userAddressElement = By.cssSelector("input[name='customer.address.street']");
    public static final By userCityElement= By.cssSelector("input[name='customer.address.city']");
    public static final By userStateElement = By.cssSelector("input[name='customer.address.state']");
    public static final By UserZipCodeElement = By.cssSelector("input[name='customer.address.zipCode']");
    public static final By UserPhoneNumberElement = By.cssSelector("input[name='customer.phoneNumber']");
    public static final By userSSNElement = By.cssSelector("input[name='customer.ssn']");
    public static final By userUsernameElement = By.cssSelector("input[name='customer.username']");
    public static final By userPasswordElement = By.cssSelector("input[name='customer.password']");
    public static final By userConfirmPasswordElement = By.cssSelector("input[name='repeatedPassword']");
    public static final By userRegisterButtonElement = By.cssSelector("input[value='Register']");
}
