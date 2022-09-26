@Mobile
Feature: To Verify USA mobile number is Mandatory

  @DrySign
  Scenario: To Verify the contact no. field is mandatory field on the SignUp/Registration page for USA region
    Given navigate to URL "https://drysign-dev.exela.global/#/login"
    When user click on the signUp link
    And user display registration form
    Then user should display following fields
      | firstName        |
      | lastName         |
      | Company Name     |
      | Mobile Number    |
      | Email            |
      | Password         |
      | Confirm Password |
    Then user display Sign up button
    Then verify contact no. field needs to be mandatory field with the asterix symbol as "Mobile number is mandatory"

 
 
 
  @DrySign
  Scenario: To Verify the contact no. is of max. 10 digit for the USA region
    Given navigate to URL "https://drysign-dev.exela.global/#/login"
    When user click on the signUp link
    And user display registration form
    Then it should not allow to enter more than ten digits as "22277775555"


 
 
 
  @DrySign
  Scenario: To Verify the alphabets and special characters cannot be entered in the contact no. field for the USA region
    Given navigate to URL "https://drysign-dev.exela.global/#/login"
    When user click on the signUp link
    And user display registration form
    Then alphabets and special charcters should not get allowed to enter as "Ab@defgh"

  
 
 
  @DrySign
  Scenario: To Verify the Duplicate phone no is allowed during the registration of free and paid user
    Given navigate to URL "https://drysign-dev.exela.global/#/login"
    When user click on the signUp link
    And user display registration form
    And enter first name as "Siddhant"
    And enter last name as "Ingole"
    #And enter company name as "Pes"
    And enter mobile number as "8882224444"
    And enter email as "sid30@mailinator.com"
    And enter password as "Malin@555"
    And enter confirm password as "Malin@555"
    And click on check box
    And click on signUp icon
    Then user should not get registered should display Mobile number already Registered

  @DrySign
  Scenario: To Verify on the profile page the mobile no. and country information is saved or not  correctly.
    Given navigate to URL "https://drysign-dev.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    #And user click on mat icon
    When user click on profile icon
    Then user click on edit button
    Then user should display personal information with following fields
      | firstName        |
      | lastName         |
      | Mobile Number    |
      | Email            |                                       
                                               

    
    Then country field should not be editable
    And user click on save button
    Then user confirmation message get display as "Successfully Updated."
  
  #@Mobile6
  #Scenario: To Verify the registartion process for the Google Sign-in user for mandatory mobile no. for USA region
    #Given navigate to URL "https://drysign-qa.exela.global/#/login"
    #When click on the sign in with google
    #And pop up get display
    #And user enter the username as "sidingole8@gmail.com"
    #And user click on next button
    #And user enter password as "Malin@555"
    #And user click on next button
    #And dashboard window get display
    #And Mobile number field get display on pop up
    #And Enter the valid mobile number as "4442221111"
    #And Click on the Ok button


 #@Mobile7
 #Scenario: To Verify the registartion process for the Google Sign-in user for mandatory mobile no. for USA region
  #Given navigate to URL "https://drysign-qa.exela.global/#/login"
    #When click on the sign in with google
    #And pop up get display
    #And user enter the username as "sidingole8@gmail.com"
    #And user click on next button
    #And user enter password as "Malin@555"
    #And user click on next button
    #And dashboard window get display
 
 
  @DrySign
  Scenario: To Verify the field validation for the mobile no.
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When user click on the signUp link
    And user display registration form
    Then user verify that mobile number get displayed in correct format as "(888) 222-4444"


  
  
  
  @DrySign
  Scenario: To verify on the Success Document page the mobile no. field is mandatory or not
  #Given navigate to URL "https://drysign-qa.exela.global/#/login"
    #When enter the user name as "sid25@mailinator.com"
    #When enter the password as"Malin@555"
    #And user click on the sign in button
    #And user click on continue with free version
    #And user click on "out for signature"
    #And user click on plus icon
    Then user Navigate to URL "https://www.mailinator.com/v4/public/inboxes.jsp"
    And User enter email as "sid103"
    Then user click on Go button
    Then user click on Mail 
    And user click on sign document
    And user click on check box
    And user click on accept button
    And user clcik on ok button present on pop up
    And user click on signature
    
    #And user received mail as "sid39@mailinator.com"
    #And user click on check box
    #And user click on accept button
    #And user clcik on ok button present on pop up
    #And user click on signature
    And click on "TYPE"
    Then user select the signature
    And user click save button
    Then use click on "finish"
    Then successfully signed document page get display as"You have successfully signed this document."
    Then verify contact number field needs to be mandatory field with the asterix symbol
  
