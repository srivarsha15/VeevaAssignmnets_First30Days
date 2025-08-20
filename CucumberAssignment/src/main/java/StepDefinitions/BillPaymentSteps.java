package StepDefinitions;

import Driver.Driver;
import Pages.BillPaymentPage;
import Pages.OverviewPage;
import Pages.ParabankLogin;
import io.cucumber.java.en.*;

public class BillPaymentSteps {
    ParabankLogin parabankLogin=new ParabankLogin();
    OverviewPage overviewPage=new OverviewPage();
    BillPaymentPage billPaymentPage=new BillPaymentPage();
    @Given("User is on parabankPage")
    public void user_is_on_parabank_page() {
        System.out.println("User is on Parabank Page");
    }
    @When("User enter username{string} and password{string} and logs in")
    public void user_enter_username_and_password__and_logs_in(String username,String password) {
        parabankLogin.enterUsername(username);
        parabankLogin.enterPassword(password);
        parabankLogin.clickLogin();
    }
    @Then("User is navigated to OverviewPage")
    public void user_is_navigated_to_overview_page() {
        System.out.println("User is navigated to overview page");
    }
    @When("User clicks on BillPaymentLink")
    public void user_clicks_on_bill_payment_link() {
        overviewPage.clickBillPaymentLink();
    }
    @Then("User is redirected to BillPaymentPage")
    public void user_is_redirected_to_bill_payment_page() {
        System.out.println("User is navigated to billpayment page");
    }
    @When("User enters the payeeName{string}")
    public void user_enters_the_payee_name(String payeename) {

        billPaymentPage.enterPayeeName(payeename);
    }
    @When("User enters the billAddress{string}")
    public void user_enters_the_bill_address(String address) {
        billPaymentPage.enterAddress(address);
    }

    @When("User enters the billCity{string} and billState{string}")
    public void user_enters_the_bill_city_and_bill_state(String city,String state) {
        billPaymentPage.enterCity(city);
        billPaymentPage.enterState(state);
    }
    @When("User enters the zipCode{string}")
    public void user_enters_the_zip_code(String zipcode) {
        billPaymentPage.enterZipcode(zipcode);
    }

    @When("User enters the phoneNo{string}")
    public void user_enters_the_phone_no(String phoneno) {
        billPaymentPage.enterPhoneNumber(phoneno);
    }
    @When("User enters the accountNo{string}")
    public void user_enters_the_account_no(String accountno) {
        billPaymentPage.enterAccountNumber(accountno);
    }
    @When("User enters the verifyAccountNo{string}")
    public void user_enters_the_verify_account_no(String verifyaccountno) {
        billPaymentPage.enterVerifyAccount(verifyaccountno);
    }
    @When("User enters the amount{string}")
    public void user_enters_the_amount(String amount) {
        billPaymentPage.enterAmount(amount);
    }

    @When("User clicks on send payment")
    public void user_clicks_on_send_payment() {
        billPaymentPage.clickPaymentButton();
    }
    @Then("Billpayment is completed")
    public void billpayment_is_completed() {
        System.out.println("BillPaymentDetails");
        System.out.println(billPaymentPage.isSuccess());
    }
    @Then("the payment logs are printed")
    public void the_payment_logs_are_printed() {
        System.out.println(billPaymentPage.successMessage());
        billPaymentPage.logoutUser();
    }
}
