@MyProfile

Feature: To Verify My Profile Page

  @MyProfile1
  Scenario: To verify  if user is able to see and click profile on dashboard top right corner after login.
    Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    When user click on profile icon
    #Then user click on upload button
    #Then user click on upload photo button as "SeekPng.com_avatar-png_1149972.png"
    
     @MyProfile2
  Scenario: To verify  if user is able to see and click profile on dashboard top right corner after login.
    Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    When user click on profile icon
    Then user click on upload photo button as "SeekPng.com_avatar-png_1149972.png"
    Then user not get displayed profile picture
    And user click on manage account
    Then cancel option not present for free user as "Please Note: Cancel Subscription is not available for free corporate Subscription plan users."
    Then user click on security 
    And user select on checkbox for email OTP
    And user click on ok button
    And user select on checkbox for setup secure code
    And user enter secure code as "222222"
    Then user get displayed confirm secure code text
    And user enter confirm secure code as "222222"
    And user click on update button
    Then pop should get displayed
    And user click on ok button
    Then user click on personal information
    Then user click on security 
    And user select on checkbox for email OTP
    And user click on ok button
    And user select on checkbox for setup secure code
    And user click on ok button
    And user click on manage account
    And user click on delete account
    And Pop up get display
    Then user should get displayed Cancel button
    And user again click on the delete account
    And user select the check box
    And user click on confirm button
    Then user should get display another pop up
    When user Click on Ok button present on the pop up
    
      #Then user click on upload button 
    #Then upload profile picture as "SeekPng.com_avatar-png_1149972.png"
    #Then user not get displayed profile picture
   #Then user upload invalid file as "small.pdf"
    
   @MyProfile3
  Scenario: To verify  if user is able to see and click Edit Button
   Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    When user click on profile icon
    Then user click on edit button
    Then user leave the name field blank
    Then error message get Display as "First name is required."
    Then user click on save button
    Then user confirmation message get display as "Successfully Updated."
    #Then user Click on edit button
    
      @MyProfile4
  Scenario: To verify  if user is able to see and click Cancel Button
    Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    When user click on profile icon
    Then user click on edit button
    Then user leave the name field blank
    Then user click on cancel button
    
       @MyProfile5
  Scenario: To verify  if user is able to see and click Cancel Button
  
    Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    When user click on profile icon
    Then user click on edit button
    Then user enter zip code as "444"
    Then user click on save button
    Then error message should displayed as "ZiP code should be minimum of 4 digit."