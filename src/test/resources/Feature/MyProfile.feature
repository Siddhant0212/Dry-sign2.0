@MyProfile

Feature: To Verify My Profile Page

  @MyProfile01
  Scenario: To verify View profile option availability on dashboard right most corner
     Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    Then user Should display profile icon
    
    @MyProfile02
  Scenario: To verify On click of view profile,  personal information tab is displayed or not
    Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    When user click on profile icon
    Then user should display personal information tab by default as "PERSONAL INFORMATION" 
    
     @MyProfile03
  Scenario: Verify personal information tab functionality
    Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    When user click on profile icon
    Then user should display personal information
    Then following details get display
    
      |First Name|        
      |Last Name|
      |Email|
      |Country Code|
      |Contact Number|
      
      |Street Address|        
      |United States|
      |State|
      |City|
      |ZIP Code|
      
      @MyProfile04
  Scenario: To verify Saved information is displayed properly on personal information page
    Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    When user click on profile icon
    Then user should display personal information
    Then user click on edit button
    Then following details get display
    
      |First Name|        
      |Last Name|
      |Email|
      |Country Code|
      |Contact Number|
      
      |Street Address|        
      |United States|
      |State|
      |City|
      |ZIP Code|
      
        @MyProfile05
  Scenario: To Verify the UI elements present on the Edit profile pop-up screen
    Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    When user click on profile icon
    Then user should display personal information
    Then user click on edit button
    Then following details get display
    
      |First Name|        
      |Last Name|
      |Email|
      |Country Code|
      |Contact Number|
      
      |Street Address|        
      |United States|
      |State|
      |City|
      |ZIP Code|
    Then user click on save button
    Then user should display personal information
    Then user click on security 
    And user able to click on checkbox for email OTP
    And user able to click on checkbox for setup secure code
    
    #Then user leave the name field blank
    #Then user click on zip 
    #Then error message get Display as "First name is required." 
    
            @MyProfile06
  Scenario: To verify the Save button functionality present on the Edit Profile Screen
    Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    When user click on profile icon
    Then user should display personal information
    Then user click on edit button
    Then user enter Fname as "sidd"
    Then user enter Lname as "Ing"
    #Then user enter Email as "sid76@mailinator.com"
    Then user enter Contact Number as "6767676767"
    Then user click on save button
    Then user confirmation message get display as "Successfully Updated."
    Then user click on edit button
    Then user enter Lname as ""
    Then user click on mail tab then error get display for mandatory field as "Last name is required."
    Then user click on save button
    Then user confirmation message get display as "Successfully Updated."
    
    
    
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
    Then user click on upload photo button as "SeekPng.com_avatar-png_1149972.png"
    
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
    
           @MyProfile09
  Scenario: To verify Update payment method functionality for free user 
    Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid87@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on mat icon
    When user click on profile icon
    And user click on manage account
    And click on cancel subscription button
    And user click on confirm button
    Then user click on payment method 
    Then update payment method should be disable
   
    
         @MyProfile10
  Scenario: To verify update payment method functionality for paid user  
    Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid102@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    #And user click on continue with free version
    And user click on mat icon
    When user click on profile icon
    Then user click on payment method 
    Then user click on update payment method
    And user enter name of the card as "Test"
    And enter card number as "4242424242424242"
    And enter expire month as "07"
    And enter expire year as "27"
    And enter cvv nunber as "789"
    Then user click on pay button
    Then user display as "New Payment details has been updated"
    And user click on dashboard button
    
         @MyProfile11
  Scenario: To verify update payment method functionality for paid user 
   Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid102@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on mat icon
    When user click on profile icon
    Then user click on payment method 
    Then user click on update payment method
    And click on cancel button
    Then payment get fail as "PAYMENT FAILED"
    Then user click on go to home 
    
    
    
