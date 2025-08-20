Feature: Registration as an user

  Scenario Outline:
    Given user is on parabank website
    When click on register link
    And user is redirected to registrationpage
    And user enter the firstname<firstname> and lastname<lastname>
    And user enter the address<address>
    And user enter the city<city> and state<state>
    And user enter the zipcode<zipcode>
    And user enter the phoneno<phoneno>
    And user enter the ssn<ssn>
    And user enter the username<username>
    And user enter the password<password> and confirmpassword<confirmpassword>
    And click on register
    Then user is navigated to homepage



    Examples:
      | firstname   | lastname     | address    | city       | state       | zipcode | phoneno      | ssn         | username    | password    | confirmpassword |
      | "Srivarsha" | "Thatikonda" | "Siddipet" | "Siddipet" | "Telangana" | "502103" | "1234567890" | "123456789" | "varsha123" | "varsha123" | "varsha123"     |
