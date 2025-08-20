Feature: Checking Account Recovery Functionality

  Scenario Outline:

    Given User is on parabank homepage
    When User clicks on Forgot Login Info
    Then User is navigated to CustomerLookUPPage
    And  User enters firstname<firstname> and lastname<lastname>
    And User enters the address<address>
    And User enters the city<city> and state<state>
    And User enters the zipcode<zipcode>
    And User enters the ssn<snn>
    And User clicks on Find My Login Info
    Then User can finds the bank details


  Examples:
    | firstname   | lastname     | address    | city       | state       | zipcode  | snn         |  |
    | "Srivarsha" | "Thatikonda" | "Siddipet" | "Siddipet" | "Telangana" | "502103" | "123456789" |  |
