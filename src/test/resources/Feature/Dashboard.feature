
@Dashboard
Feature: To Verify Dashboard
  
  Background: 
    Given navigate to URL "https://drysign-qa.exela.global/#/"
    
    

  @Dashboard1
  Scenario: To Verify the UI elements present on the View Plan button pop-up present on the Dashboard
    When enter the user name as "sid12@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And dashboard window get display
    #And individual plan get display
    Then View Plan buttons should be present
    Then user click on View Plan button
    Then Pop Up get displayed with elements
    
      
      

  @Dashboard2
  Scenario: To Verify the Close icon functionality present on the View Plan pop-up screen present on the Dashboard
    When enter the user name as "sid12@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    Then user click on View Plan button
   Then Pop Up get displayed with elements
    Then existing plan details of the user should get displayed with Upgrade Plan button
    Then user verify that close icon is present on the pop up

  @Dashboard3
  Scenario: To Verify register user is able to view only the Higher Plan details than the exisiting plan through Upgrade Plan button present on the View Plan pop-up screen
    Hirarchy of plans:free trial<individual monthly <premium monthly<individual annual<premium annual<professional

    When enter the user name as "sid12@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    Then user click on View Plan button
    Then Pop Up get displayed with elements
    Then existing plan details of the user should get displayed with Upgrade Plan button
    And user click on Upgrade Plan button
    Then pop up should display only the higher plan than the exisiting

  @Dashboard4
  Scenario: To Verify Subscribed Register user is able to Purchase the higher plan then the exisiting plan successfully through Upgrade Plan button present on View Plan pop-up
    When enter the user name as "sid87@mailinator.com"
    
    When enter the password as"Malin@555"
    And user click on the sign in button
    Then user click on View Plan button
    Then Pop Up get displayed with elements
    
    And user click on Upgrade Plan button
    Then pop up should display only the higher plan than the exisiting
    And user click on the BuyNow button
    Then user navigate to payment page
    And user enter name of the card as "Test"
    And enter card number as "4242424242424242"
    And enter expire month as "07"
    And enter expire year as "27"
    And enter cvv nunber as "789"
    Then user click on pay button
    #Then Verify approved plan and activated image is displayed
  
    Then user click on login button
    When enter the user name as "sid87@mailinator.com"
    When enter the password as"Malin@555"
    And user click on sign in button
    Then new plan details and its related features should get displayed

  @Dashboard5
  Scenario: To Verify the View Plan or Buy now button is present or not on the Dashboard for the Premium/corporate registered users
    When enter the user name as "sid12@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user get displayed the View Plan or Buy Now button is present 

  @Dashboard6
  Scenario: To Verify on Cancel Subscription or Refund for existing register user Buy Now button is displayed on the Dashboard
    When enter the user name as "sid87@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on mat icon
    And user click on profile icon
    And user click on manage account
    And click on cancel subscription button
    And user click on confirm button
    #Then user should get display exisiting Plan get cancelled successfully
    And user click on mat icon
    And user click on logout
    When enter the user name as "sid87@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    Then user display three pie chart
    Then display as "individual plan" with upgrade button
    Then display as "professional plan" with Upgrade button
    #Then should display as "5 documents"
    
    
    #Then on Dashboard Buy Now button should get displayed
    #And user click on buy now button
    #Then all the available plan should get displayed to purchase for the user

  @Dashboard7
  Scenario: To Verify on Refund for existing register user Buy Now button is displayed on the Dashboard
    When user click on terms and conditions
    When user click on here link
    When enter the user name as "sid02@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    Then user should get display refund page
    And user enter name as "Sid Ingole"
    And user enter emai id as "sid02@mailinator.com"
    And user enter subscription plan as "INDIVIDUAL"
    And user enter subscription id as "3610"
    And user click on confirm button	
    Then refund pop up get display
    And user click on confirm button which present on pop up
    #Then user should get display message as your refund has been successful
    Then click on ok button
    When enter the user name as "sid09@mailinator.com"
    When enter the password as"Malin@555"
    And user click on sign in button
    
    #And user click on continue with free version
    #Then user display three pie chart
    #Then display as "individual plan" with upgrade button
    #Then display as "professional plan" with Upgrade button
    #Then should display as "5 documents"
   
    
    Then user get display Buy Now button
    #And user click on the Buy Now button
    #Then all the available plans should get displayed to purchase for the user
   
   
    
    
    
  #And check post the Refund is initiated the user is able to see the Buy Now button for post login
  #Then user should be able to see the Buy Now button once the refund is initiated
  #And user click on the Buy Now button
  #Then all the available plan should get displayed to purchase for the user
  
  
  @Dashboard8
  Scenario: To Verify the Go To Dashboard button functionality when user comes from Buy now option present on the Microsite pricing page
    Given user navigate to URL "https://drysignmsqa.exela.global"
    Then Enter Username "exelaGest" password "exl#Gest@01"
    Then accept the cookies
    And user click on the microsite click on the Pricing Tab
    
    #Given user navigate to URL "https://drysignmsqa.exela.global/"
    #And user click on accept all cookies
    #And user click on the microsite click on the Pricing Tab
    
    Then user should get display annual plan premium plan
    And user click on the monthly plan
    Then user should get display monthly plan
    And user click on the annual plan
    And user click on the Buy Now button of any Plan
    Then user display message on pop up as "To proceed further, please Sign In or Sign Up to DrySign."
    Then user should get display pop up with Cancel and Confirm button
    And user click on the Confirm button
    When user click on the signIn link
    
    When enter the user name as "sid98@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user login via secure code as "2"
    And user click on verify button
    And user click on continue with free version
    Then user display three pie chart
    Then display as "individual plan" with upgrade button
    Then display as "professional plan" with Upgrade button
    
  #And user click om sign in link
   #When enter the user name as "dik12@mailinator.com"
    #When enter the password as"Malin@555"
    #And user click on the sign in button
  #Then user will navigate to two factor screen
  #And user On two factor screen enter the secure code or OTP via mail
  #Then user should get display the Screen with the current exisiting Plan details
  #And user click on the Go To Dashboard button present on the screen
  #Then user should navigate the user on the Dashboard Screen
  
  
  @Dashboard9
  Scenario: To Verify for the free trial user the Buy Now button is displayed on the Dashboard
    When enter the user name as "sid13@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    Then on Dashboard Buy Now button should get displayed
