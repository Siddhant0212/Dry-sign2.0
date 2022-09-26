@Delete
Feature: To Verify Delete User Functionality
 
 @DrySign
  Scenario: To Verify the Delete Account button is present in Profile page under the Manage Account Tab
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid211@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    And user click on continue with free version
    #And user click on mat icon
    And user click on profile icon
    And user click on manage account
    Then Delete Account button should be present
    
  @DrySign
  Scenario: To Verify the Delete Account button functionality on the Manage Account Tab in Profile Page
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid211@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    #And user click on the sign in button
    #And user click on continue with free version
    #And user click on mat icon
    And user click on profile icon
    And user click on manage account
    Then Delete Account button should be present
    And user click on delete account
    And Pop up get display
    Then user should get displayed Cancel button
    Then user should get displayed Delete Account button
    When user click on the cancel button
    And user click on delete account
    And user again click on the delete account
    And user select the check box
    And user click on confirm button
    #Then user should get display another pop up
    When user Click on Ok button present on the pop up
    
   
  #And user recevied verify email as "sid94@mailinator.com"
  #Then An Confirmation screen should get displayed as "You have successfully deleted the account.".
  #Then pop-up should get closed
  #When user open the mail to check if the Delete account mail is received or not
  #Then Delete Account mail should be received by the user
  #When Click on the Delete Account link present in the email
  #Then Confirmation screen should get displayed the you have successfully deleted the account
  
  
  @DrySign
  Scenario: To Verify on Login by the same deleted user into the Drysign Application
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid203@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    #Then user should not be able to Login again into the application
    Then user should get display the validation message as "Not a registered user."

  @DrySign
  Scenario: To Verify the Forgot password for the deleted user into the Drysign Application
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    And user click on forgot password
    And user enter deleted email address as "sid22@mailinator.com"
    And user click on the send reset email
    Then user should get displayed message as "Invalid email or user does not exist"

@DrySign
  Scenario: To Verify re-registering again with the deleted user with the same email id and mobile no.
    Given navigate to URL "https://drysign-dev.exela.global/#/login"
    When user click on the signUp link
    And user display registration form
    And enter first name as "Sid"
    And enter last name as "Ing"
    #And enter company name as "Pes"
    And enter mobile number as "2082082012"
    And enter email as "sid208@mailinator.com"
    And enter password as "Malin@555"
    And enter confirm password as "Malin@555"
    And click on check box
    And click on signUp icon
    Then user display message as "YOUR ACCOUNT HAS BEEN CREATED!  You will soon receive an email with a link to activate your new account."
   
 @DrySign
  Scenario: To Verify the new re-register user is by default get register as Free user
   Given navigate to URL "https://drysign-dev.exela.global/#/"
    When already deleted user enter the user name as "sid207@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    And user click on continue with free version
    Then display all the details related to Free user on the Dashboard
