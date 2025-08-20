package Pages;

import Driver.Driver;
import Selectors.BillPaymentSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
;import java.time.Duration;

public class BillPaymentPage {
    ChromeDriver driver = Driver.getDriver();

    public void enterPayeeName(String payeeName) {
        driver.findElement(BillPaymentSelectors.payeeNameElement).sendKeys(payeeName);
    }

    public void enterAddress(String address) {
        driver.findElement(BillPaymentSelectors.payeeAddressElement).sendKeys(address);
    }

    public void enterCity(String city) {
        driver.findElement(BillPaymentSelectors.payeeCityElement).sendKeys(city);
    }

    public void enterState(String state) {
        driver.findElement(BillPaymentSelectors.payeeStateElement).sendKeys(state);
    }

    public void enterZipcode(String zipCode) {
        driver.findElement(BillPaymentSelectors.payeeZipCodeElement).sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(BillPaymentSelectors.payeePhoneNumberElement).sendKeys(phoneNumber);
    }

    public void enterAccountNumber(String accountNumber) {
        driver.findElement(BillPaymentSelectors.payeeAccountNoElement).sendKeys(accountNumber);
    }

    public void enterVerifyAccount(String verifyAccount) {
        driver.findElement(BillPaymentSelectors.payeeVerifyAccountNoElement).sendKeys(verifyAccount);
    }

    public void enterAmount(String amount) {
        driver.findElement(BillPaymentSelectors.payeeAmountElement).sendKeys(amount);
    }

    public void clickPaymentButton() {
        driver.findElement(BillPaymentSelectors.payeePaymentButtonElement).click();
    }
    public boolean isSuccess(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        WebElement element = Driver.getDriver().findElement(BillPaymentSelectors.payeeSuccessPayment);

        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public String successMessage(){
        if(isSuccess()){
            return Driver.getDriver().findElement(BillPaymentSelectors.payeeSuccessPayment).getText();
        }
        return null;
    }
    public void logoutUser(){
        Driver.getDriver().findElement(BillPaymentSelectors.payeeLogoutElement).click();
    }



}
