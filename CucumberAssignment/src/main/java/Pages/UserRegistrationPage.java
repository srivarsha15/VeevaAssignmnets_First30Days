package Pages;

import Selectors.UserRegistrationSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import Driver.Driver;
public class UserRegistrationPage {

    ChromeDriver driver = Driver.getDriver();

    public void enterFirstName(String firstName){
        driver.findElement(UserRegistrationSelectors.userFirstNameElement).sendKeys(firstName);
    }
    public  void enterLastName(String lastname){
        driver.findElement(UserRegistrationSelectors.userLastNamElement).sendKeys(lastname);
    }
    public  void enterAddress(String address){
        driver.findElement(UserRegistrationSelectors.userAddressElement).sendKeys(address);
    }
    public void enterCity(String city){
        driver.findElement(UserRegistrationSelectors.userCityElement).sendKeys(city);
    }
    public  void enterState(String state){
        driver.findElement(UserRegistrationSelectors.userStateElement).sendKeys(state);
    }
    public void enterZipcode(String zipcode){
        driver.findElement(UserRegistrationSelectors.UserZipCodeElement).sendKeys(zipcode);
    }
    public void enterPhoneNumber(String phoneno){
        driver.findElement(UserRegistrationSelectors.UserPhoneNumberElement).sendKeys(phoneno);
    }
    public void enterSSN(String ssn){
        driver.findElement(UserRegistrationSelectors.userSSNElement).sendKeys(ssn);
    }
    public void enterUsername(String username){
        driver.findElement(UserRegistrationSelectors.userUsernameElement).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(UserRegistrationSelectors.userPasswordElement).sendKeys(password);
    }
    public void enterConfirmPassword(String confirmpassword){
        driver.findElement(UserRegistrationSelectors.userConfirmPasswordElement).sendKeys(confirmpassword);
    }
    public void clickRegisterButton(){
        driver.findElement(UserRegistrationSelectors.userRegisterButtonElement).click();
    }

}
