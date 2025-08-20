package StepDefinitions;

import Driver.Driver;
import Pages.ParabankLogin;
import Pages.UserRegistrationPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Log;

public class UserResgistrationSteps {
    ParabankLogin ParabankLogin=new ParabankLogin();
    UserRegistrationPage RegistrationPage=new UserRegistrationPage();
    @Given("user is on parabank website")
    public void user_is_on_parabank_website() {
        System.out.println("User is on the Parabank Page");
        Log.info("User is on Parabank page");
    }
    @When("click on register link")
    public void click_on_register_link() {
        ParabankLogin.clickRegisterLink();
        Log.info("User clicks on Registration Link");
    }
    @And("user is redirected to registrationpage")
    public void user_is_redirected_to_registrationpage() {
        Log.info("User is navigated to registration page");
        System.out.println("You have entered the registration page");
    }
    @And("user enter the firstname{string} and lastname{string}")
    public void user_enter_the_firstname_and_lastname(String firstname,String lastname) {
        Log.info("User enters the credentials");
        RegistrationPage.enterFirstName(firstname);
        RegistrationPage.enterLastName(lastname);
    }
    @And("user enter the address{string}")
    public void user_enter_the_address(String address) {
        RegistrationPage.enterAddress(address);
    }
    @And("user enter the city{string} and state{string}")
    public void user_enter_the_city_and_state(String city,String state) {
        RegistrationPage.enterCity(city);
        RegistrationPage.enterState(state);
    }
    @And("user enter the zipcode{string}")
    public void user_enter_the_zipcode(String zipcode) {
        RegistrationPage.enterZipcode(zipcode);
    }
    @And("user enter the phoneno{string}")
    public void user_enter_the_phoneno(String phoneno) {
        RegistrationPage.enterPhoneNumber(phoneno);
    }
    @And("user enter the ssn{string}")
    public void user_enter_the_ssn(String ssn) {
        RegistrationPage.enterSSN(ssn);
    }
    @And("user enter the username{string}")
    public void user_enter_the_username(String username) {
        RegistrationPage.enterUsername(username);
    }
    @And("user enter the password{string} and confirmpassword{string}")
    public void user_enter_the_password_and_confirmpassword(String password,String confirmpassword) {
        RegistrationPage.enterPassword(password);
        RegistrationPage.enterConfirmPassword(confirmpassword);
    }
    @And("click on register")
    public void click_on_register() {
        RegistrationPage.clickRegisterButton();
        Log.info("User clicks on Register button");
    }
    @Then("user is navigated to homepage")
    public void user_is_navigated_to_homepage() {
        Log.info("User has registered successfully");
        System.out.println("Your account was created successfully. You are now logged in!!!");
    }
}
