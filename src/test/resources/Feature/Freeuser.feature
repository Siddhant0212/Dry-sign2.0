@FreeUser
Feature: To Verify Free User functions




  @DrySign
  Scenario: To Verify for paid user the "switch to free user" button text is changed to "Switch to free version"
   Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid12@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
   #And user click on the sign in button
    #And user click on mat icon
    And user click on profile icon
    And user click on manage account
    Then Delete Account button should be present
    And user click on delete account
    And Pop up get display
    Then On the Delete pop up the text on the button as "Are you sure you want to delete your account? Deleting your account will also delete all your data. You can continue with our Free Version instead."

  # Given user navigate to URL "https://drysign-qa.exela.global/#/"
  #  When user is on Login page
  # And user clicks on Sign in with Google
  #  And user enter the username as "siddhantingole348@gmail.com"
  #  And user enter password as "Malin@555"
  #  When User is on dashboard screen
  #  And Mobile number field get display on pop-up
  #  And Enter the valid mobile number as "1111212222" into the mobile field
  #  And user click on ok
  #  And new pop window get displayed
  #  Then verify user should get displayed continue with free version
  # Then user should also displayed Individual and Professional plan it should have Upgrade button
  #Then Verify that user should click on  continue with free version
  # And user click on Continue to free version button
  #  Then user should navigate to the Dashboard screen
  #Then user should get display three pie charts
  # Then user should display five Documents and one template by default for free user
  #Then user Verify the document count and template count is updated for existing free user
  
   @FreeUser2
  Scenario: To Verify for the new free user, on login everytime the pricing plan is displayed in the pop-up window (i.e. free version, Individual, professional (monthly and annual))
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    Then user should get display pop up
    Then under free version "continue with free version" button present
    Then under individual "upgrade" button present
    Then under professional "upgrade" button present
    And user click on continue with free version
    #Then user display three pie chart
    Then display as "individual plan" with upgrade button
    Then display as "professional plan" with Upgrade button
    Then should display as "5" documents
    
   @FreeUser3
  Scenario: To Verify for the new free user, on login everytime the pricing plan is displayed in the pop-up window (i.e. free version, Individual, professional (monthly and annual))
    
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    Then user should get display pop up
    Then under free version "continue with free version" button present
    Then under individual "upgrade" button present
    Then under professional "upgrade" button present
    And user click on continue with free version
    Then user display three pie chart
    Then display as "individual plan" with upgrade button
    Then display as "professional plan" with Upgrade button
    Then should display as "5" documents
    
    @FreeUser4
  Scenario: To Verify for the new free user, on login everytime the pricing plan is displayed in the pop-up window (i.e. free version, Individual, professional (monthly and annual))
  
   Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    Then user should get display pop up
    Then under free version "continue with free version" button present
    Then under individual "upgrade" button present
    Then under professional "upgrade" button present
    And user click on continue with free version
    Then user display three pie chart
    Then display as "individual plan" with upgrade button
    Then display as "professional plan" with Upgrade button
    Then should display as "5" documents
  
  @DrySign1
  Scenario: To Verify if the document count gets exhausted before 1month of time for the free user
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid211@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    And user click on continue with free version
    Then user should display document count zero
  
  @DrySign
 Scenario: To Verify if the user clicks on the upgrade button present on pricing plan page or on the pie-chart he is able to upgrade the new Plan through banchub page.
   Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid201@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    And user click on continue with free version
    Then user click on Upgrade button 
    And click on Upgrade 
    Then user navigate to payment page
    And user enter name of the card as "Test"
    And enter card number as "4242424242424242"
    And enter expire month as "07"
    And enter expire year as "27"
    And enter cvv nunber as "789"
    Then user click on pay button
    #Then Verify approved plan and activated image is displayed
    Then confirmation message get display as "PAYMENT CONFIRMATION"
    
    @DrySign
 Scenario: To Verify on cancel subscription if we login by that user, everytime the pricing plan is displayed in the pop-up window (i.e. free version, Individual, professional (monthly and annual))
    
  Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    Then user should get display pop up
    Then under free version "continue with free version" button present
    Then under individual "upgrade" button present
    Then under professional "upgrade" button present
    And user click on continue with free version
    #Then user display three pie chart
    Then display as "Individual Plan" with upgrade button
    Then display as "Professional Plan" with Upgrade button
    Then should display as "5" documents
    
     @DrySign
 Scenario: To Verify on Refund if we login by that user, everytime the pricing plan is displayed in the pop-up window (i.e. free version, Individual, professional (monthly and annual))
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When user click on terms and conditions
    When user click on here link
    When enter the user name as "sid213@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    Then user should get display refund page
    #And user enter name as "Siddhu Ingole"
    #And user enter emai id as "sid13@mailinator.com"
    #And user enter subscription plan as "INDIVIDUAL"
    #And user enter subscription id as "3526"
    And user click on confirm button	
    Then refund pop up get display
    And user click on confirm button which present on pop up
    Then user should get display message as your refund has been successful
    Then click on ok button
    When enter the user name as "sid87@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    And user click on continue with free version
    #Then user display three pie chart
    Then display as "Individual Plan" with upgrade button
    Then display as "Professional Plan" with Upgrade button
    Then should display as "5" documents
  
   @DrySign
 Scenario: To Verify for the active free user, the document count is set to 5 everymonth and template count to 1
  
   Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    And user click on continue with free version
    
    #Then user display three pie chart
    Then display as "Individual Plan" with upgrade button
    Then display as "Professional Plan" with Upgrade button
    Then should display as "5" documents
  
   @DrySign
 Scenario: To Verify Validity is displayed or not on the Dashboard when login by the free user
  Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid103@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    And user click on continue with free version
    Then user should not display as "validity" option
    
   @DrySign
 Scenario: To Verify Dashboard for paid users, coporate users and enterprise users is not changed.
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid12@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    Then Post login the Plan the pre dashboard pop up screen should not get displayed as "continue with free version"
    Then for paid user no change on dashboard
    
    @DrySign
 Scenario: To verify that the plan pop up doesn't close unless "continue to free verison" or upgrade button is clicked.
  Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid103@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    And user click on continue with free version and pop up should get closed
    #Then user display three pie chart
    Then display as "Individual Plan" with upgrade button
    Then display as "Professional Plan" with Upgrade button
    Then should display as "5" documents
    
    @DrySign
 Scenario: To Verify for the new free user, on login every time the pricing plan is displayed in the pop-up window 
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid103@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    And user click on continue with free version
    #Then user display three pie chart
    Then display as "Individual Plan" with upgrade button
    Then display as "Professional Plan" with Upgrade button
    Then should display as "5" documents
    Then upgrade button should get display as "Upgrade Plan,Upgrade Plan"
  
  @DrySign
 Scenario: To Verify for the new free user Dashboard Display
  Given navigate to URL "https://drysign-dev.exela.global/#/"
   When enter the user name as "sid103@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    #Then user should get display pop up
   Then under Free Version "continue with free version" Button present
   Then Pop Up get displayed with Elements
      |5 Documents|
      |Self Sign |        
      |Group Sign|
      |Signature: Type,Draw and upload|
      
    Then under individual "Upgrade" button present
    Then Pop Up get displayed with Elements
      |20 Documents|
      |Self Sign |        
      |Group Sign|
      |Signature: Type,Draw and upload|
    Then under professional "Upgrade" button present
     Then Pop Up get displayed with Elements
      |300 Documents|
      |Self Sign |        
      |Group Sign|
      |Signature: Type,Draw and upload|
    
    
      @DrySign
 Scenario: To verify for free user After 5 documents are utilized next document should not be allowed
   Given navigate to URL "https://drysign-dev.exela.global/#/"
   When enter the user name as "sid211@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
     And user click on continue with free version
     Then user click on self sign
     Then user click on browser
     Then user get display error message as "You have reached the document upload count, please subscribe to upload more documents."
    
         @DrySign
 Scenario: To verify If 1 template is utilized next template should not be allowed
   Given navigate to URL "https://drysign-dev.exela.global/#/"
   When enter the user name as "sid211@mailinator.com"
   When enter the password as"Malin@555"
   And user click on the Login button
   #And user click on the sign in button
   And user click on continue with free version
   And user click on Template tab
   Then click on Add New Template
   #Then click on upload new template
   Then user click on browser
   Then user Get display error message as "You have reached the template upload count, please subscribe to upload more templates."
  
  
  