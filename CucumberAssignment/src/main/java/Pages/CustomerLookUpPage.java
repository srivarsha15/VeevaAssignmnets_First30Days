package Pages;

import Driver.Driver;
import Selectors.CustomerLookUpSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerLookUpPage {
    ChromeDriver driver = Driver.getDriver();



    public void enterFirstName(String firstName){
        driver.findElement(CustomerLookUpSelectors.LookUpFirstNameElement).sendKeys(firstName);
    }
    public  void enterLastName(String lastname){
        driver.findElement(CustomerLookUpSelectors.LookUpLastNameElement).sendKeys(lastname);
    }
    public  void enterAddress(String address){
        driver.findElement(CustomerLookUpSelectors.LookUpAddressElement).sendKeys(address);
    }
    public void enterCity(String city){
        driver.findElement(CustomerLookUpSelectors.LookUpCityElement).sendKeys(city);
    }
    public  void enterState(String state){
        driver.findElement(CustomerLookUpSelectors.LookUpStateElement).sendKeys(state);
    }
    public void enterZipcode(String zipcode){
        driver.findElement(CustomerLookUpSelectors.LookUpZipCodeElement).sendKeys(zipcode);
    }
    public void enterSSN(String ssn){
        driver.findElement(CustomerLookUpSelectors.LookUpSSNElement).sendKeys(ssn);
    }
    public void forgotInfoButton(){
        driver.findElement(CustomerLookUpSelectors.LookUpForgotInfoButtonElement).click();
    }

}
