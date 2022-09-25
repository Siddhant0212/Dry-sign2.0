@AutoRenewal
Feature: To Verify Auto Renewal (Recurrsive) functionality

    
      @AutoRenewal3
  Scenario: To verify functionality of Auto Renewal if documents are over and validity is still due
  Given navigate to URL "https://drysign-dev.exela.global/#/login"
    When enter the user name as "sidDB@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    
    
    #And user click on the sign in button
    And click on Upgrade Plan
    And click on Upgrade 
    
    #Then user click on View Plan button
    #Then Pop Up get displayed with elements
    #And user click on Upgrade Plan button
    #And user click on the BuyNow button
    Then user navigate to payment page
    And user enter name of the card as "Test"
    And enter card number as "4242424242424242"
    And enter expire month as "07"
    And enter expire year as "27"
    And enter cvv nunber as "789"
    Then user click on pay button
    Then confirmation message get display as "PAYMENT CONFIRMATION"
    Then user click on login button
    When enter the user Name as "sidDB@mailinator.com"
     When enter the Password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    Then plan should get renew and validity start from day of renewed
    
        @AutoRenewal4
  Scenario: To verify functionality of Auto Renewal if documents are available and validity is going to over today
  Given navigate to URL "https://drysign-dev.exela.global/#/login"
    When enter the user name as "sidDB@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    Then remaining document get display with validity of last day 
    And click on Upgrade Plan
    And click on Upgrade
    Then user navigate to payment page
    And user enter name of the card as "Test"
    And enter card number as "4242424242424242"
    And enter expire month as "07"
    And enter expire year as "27"
    And enter cvv nunber as "789"
    Then user click on pay button
    Then confirmation message get display as "PAYMENT CONFIRMATION"
    Then user click on login button
    When enter the user Name as "sidDB@mailinator.com"
    When enter the Password as"Malin@555"
    And user click on the Login Button
    Then User get display previous used document
    |Completed|
    |Out for Signature|
    |Draft|
    |Rejected|