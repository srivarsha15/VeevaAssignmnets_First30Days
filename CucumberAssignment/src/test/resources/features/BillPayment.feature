Feature: Checking the functionality of Bill Payment

  Scenario Outline:
    Given User is on parabankPage
    When User enter username<username> and password<password> and logs in
    Then User is navigated to OverviewPage
    When User clicks on BillPaymentLink
    Then User is redirected to BillPaymentPage
    When User enters the payeeName<payeename>
    And User enters the billAddress<address>
    And User enters the billCity<city> and billState<state>
    And User enters the zipCode<zipcode>
    And User enters the phoneNo<phoneno>
    And User enters the accountNo<accountno>
    And User enters the verifyAccountNo<verifyaccountno>
    And User enters the amount<amount>
    And User clicks on send payment
    Then Billpayment is completed
    Then the payment logs are printed

  Examples:
    | username    | password    | payeename | address    | city       | zipcode  | state       | phoneno      | accountno | verifyaccountno | amount | fromaccount |
    | "varsha123" | "varsha123" | "Geeta"   | "Siddipet" | "Siddipet" | "502103" | "Telangana" | "1234567890" | "567890"  | "567890"        | "500"  | "123456"    |
