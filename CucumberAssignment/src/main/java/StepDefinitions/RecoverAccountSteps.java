package StepDefinitions;

import Driver.Driver;
import Pages.CustomerLookUpPage;
import Pages.ParabankLogin;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;


public class RecoverAccountSteps {
    ParabankLogin parabankLogin=new ParabankLogin();
    CustomerLookUpPage lookUpPage=new CustomerLookUpPage();
    @Given("User is on parabank homepage")
    public void user_is_on_parabank_homepage() {
        System.out.println("User is on Parabank Page");
    }

    @When("User clicks on Forgot Login Info")
    public void user_clicks_on_forgot_login_info() {
        parabankLogin.clickForgotInfoLink();
    }

    @Then("User is navigated to CustomerLookUPPage")
    public void user_is_navigated_to_customer_look_up_page() {
        System.out.println("User is navigated to Customer");

    }

    @Then("User enters firstname{string} and lastname{string}")
    public void user_enters_firstname_and_lastname(String firstname,String lastname) {
        lookUpPage.enterFirstName(firstname);
        lookUpPage.enterLastName(lastname);
    }

    @Then("User enters the address{string}")
    public void user_enters_the_address(String address) {
        lookUpPage.enterAddress(address);
    }

    @Then("User enters the city{string} and state{string}")
    public void user_enters_the_city_and_state(String city,String state) {
        lookUpPage.enterCity(city);
        lookUpPage.enterState(state);
    }

    @Then("User enters the zipcode{string}")
    public void user_enters_the_zipcode(String zipcode) {
        lookUpPage.enterZipcode(zipcode);
    }

    @Then("User enters the ssn{string}")
    public void user_enters_the_ssn(String ssn) {
        lookUpPage.enterSSN(ssn);
    }

    @Then("User clicks on Find My Login Info")
    public void user_clicks_on_find_my_login_info() {
        lookUpPage.forgotInfoButton();
    }

    @Then("User can finds the bank details")
    public void user_can_finds_the_bank_details() {
        System.out.println("User Details are:");
        System.out.println(Driver.getDriver().findElement(By.cssSelector("div#rightPanel")).getText());
    }

}
