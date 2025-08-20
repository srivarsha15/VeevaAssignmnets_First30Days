package Selectors;

import org.openqa.selenium.By;

public class CustomerLookUpSelectors {

    public static final By LookUpFirstNameElement = By.cssSelector("input[name='firstName']");
    public static final By LookUpLastNameElement = By.cssSelector("input[name='lastName']");
    public static final By LookUpAddressElement = By.cssSelector("input[name='address.street']");
    public static final By LookUpCityElement= By.cssSelector("input[name='address.city']");
    public static final By LookUpStateElement = By.cssSelector("input[name='address.state']");
    public static final By LookUpZipCodeElement = By.cssSelector("input[name='address.zipCode']");
    public static final By LookUpSSNElement = By.cssSelector("input[name='ssn']");

    public static final By LookUpForgotInfoButtonElement = By.cssSelector("input[value='Find My Login Info']");
}
