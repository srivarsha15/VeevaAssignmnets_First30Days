package Selectors;

import org.openqa.selenium.By;

public class BillPaymentSelectors {
    public static final By payeeNameElement = By.cssSelector("input[name='payee.name']");
    public static final By payeeAddressElement = By.cssSelector("input[name='payee.address.street']");
    public static final By payeeCityElement= By.cssSelector("input[name='payee.address.city']");
    public static final By payeeStateElement = By.cssSelector("input[name='payee.address.state']");
    public static final By payeeZipCodeElement = By.cssSelector("input[name='payee.address.zipCode']");
    public static final By payeePhoneNumberElement = By.cssSelector("input[name='payee.phoneNumber']");
    public static final By payeeAccountNoElement = By.cssSelector("input[name='payee.accountNumber']");
    public static final By payeeVerifyAccountNoElement = By.cssSelector("input[name='verifyAccount']");
    public static final By payeeAmountElement = By.cssSelector("input[name='amount']");
    public static final By payeePaymentButtonElement = By.cssSelector("input[value='Send Payment']");
    public static  final By payeeSuccessPayment = By.cssSelector("div#billpayResult");
    public static final By payeeLogoutElement = By.linkText("Log Out");
}
