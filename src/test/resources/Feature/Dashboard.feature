@Dashboard
Feature: To Verify Dashboard

  Background: 
    Given navigate to URL "https://drysign-dev.exela.global/#/"

  @Dashboard1
  Scenario: To Verify the UI elements present on the View Plan button pop-up present on the Dashboard
    When enter the user name as "sid12@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on the sign in button
    #And dashboard window get display
    #And individual plan get display
    #Then View Plan buttons should be present
    #Then user click on View Plan button
    Then user click on View Details button
    #Then Pop Up get displayed with elements
    Then Pop Up get displayed with Elements
      |Self Sign |        
      |Group Sign|
      |Signature: Type,Draw and upload|
      |Upload Pdf using Google Drive|
      |Upload PDF using Dropbox|
      |Upload PDF using OneDrive|
 Then user get display upgrade plan button 
 #Then user click on close icon
  Then user click on Cancel Button




  @Dashboard2
  Scenario: To Verify the Close icon functionality present on the View Plan pop-up screen present on the Dashboard
    When enter the user name as "sid12@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
   Then user click on View Details button
      Then Pop Up get displayed with Elements
      |Self Sign |        
      |Group Sign|
      |Signature: Type,Draw and upload|
      |Upload Pdf using Google Drive|
      |Upload PDF using Dropbox|
      |Upload PDF using OneDrive|
      Then user get display upgrade plan button 
    #Then existing plan details of the user should get displayed with Upgrade Plan button
    Then user verify that close icon is present on the pop up

  @Dashboard3
  Scenario: To Verify register user is able to view only the Higher Plan details than the exisiting plan through Upgrade Plan button present on the View Plan pop-up screen
    Hirarchy of plans:free trial<individual monthly <premium monthly<individual annual<premium annual<professional

    When enter the user name as "sid12@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    Then user click on View Details button
      Then Pop Up get displayed with Elements
      |Self Sign |        
      |Group Sign|
      |Signature: Type,Draw and upload|
      |Upload Pdf using Google Drive|
      |Upload PDF using Dropbox|
      |Upload PDF using OneDrive|
    Then user get display upgrade plan button 
    And user click on Upgrade Plan button
    Then pop up should display only the higher plan than the exisiting
    Then Pop Up get displayed with Elements
      | 25 Templates  |        
      | 600 Documents |
      |Upload PDF using Google Drive |        
      |Upload PDF using Dropbox|
      |Upload PDF using OneDrive|  
      |Self Sign |         
      |Group Sign|

  @Dashboard4
  Scenario: To Verify Subscribed Register user is able to Purchase the higher plan then the exisiting plan successfully through Upgrade Plan button present on View Plan pop-up
    When enter the user name as "sid87@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #Then user click on View Details button
     #Then Pop Up get displayed with Elements
      #|Self Sign |        
      #|Group Sign|
      #|Signature: Type,Draw and upload|
      #|Upload Pdf using Google Drive|
      #|Upload PDF using Dropbox|
      #|Upload PDF using OneDrive|
    #Then user get display upgrade plan button
    #Then pop up should display only the higher plan than the exisiting
    #Then Pop Up get displayed with Elements
      #| 25 Templates  |        
      #| 600 Documents |
      #|Upload PDF using Google Drive |        
      #|Upload PDF using Dropbox|
      #|Upload PDF using OneDrive|  
      #|Self Sign |         
      #|Group Sign|
     Then user Click On upgrade plan button
    And user click on the BuyNow button
    Then user navigate to payment page
    And user enter name of the card as "Test"
    And enter card number as "4242424242424242"
    And enter expire month as "07"
    And enter expire year as "27"
    And enter cvv nunber as "789"
    Then user click on pay button
    Then confirmation message get display as "PAYMENT CONFIRMATION"
    #Then Verify approved plan and activated image is displayed
    Then user click on login button
    When enter the User name as "sid87@mailinator.com"
    When enter the Password as"Malin@555"
    And user click on the Login Button
    Then new plan details and its related features should get Displayed
      |600|        
      
    

  @Dashboard5
  Scenario: To Verify the View Plan or Buy now button is present or not on the Dashboard for the Premium/corporate registered users
    When enter the user name as "sid12@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user get displayed the View Plan or Buy Now button is present

  @Dashboard6
  Scenario: To Verify on Cancel Subscription or Refund for existing register user Buy Now button is displayed on the Dashboard
    When enter the user name as "sid87@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
   #And user click on mat icon
    And user click on profile icon
    And user click on manage account
    And click on cancel subscription button
    And user click on confirm button
    #Then user should get display exisiting Plan get cancelled successfully
    #And user click on mat icon
    Then user click on Cross icon
    And user click on logout
    Then user click on LogOut button present on PopUp
    When enter the user name as "sid87@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login Button
    And user click on continue with free version
    #Then user display three pie chart
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
    And user click on the Login button
    Then on Dashboard Buy Now button should get displayed

  @Dashboard10
  Scenario: To verify that For paid user Upgrade button is present or not on dashboard.
    When enter the user name as "sid02@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #Then Upgrade button should not display on dashboard to paid user as "Upgrade"
    Then Upgrade button should be display on dashboard to paid user as "Upgrade Plan"

  @Dashboard11
  Scenario: To verify that Document received count on dashboard
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    Then user should display the correct document received count
    Then following get Elements display
    |Signed |
    |Pending |
    |Rejected |
    

  @Dashboard12
  Scenario: To verify that Document Sent count on dashboard
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    Then user should display the correct document sent count
     Then following get Elements display
    |Completed |
    |Out for Signature |
    |Draft  |
    |Rejected  |
    
      @Dashboard013
  Scenario: To verify that user is  able to Draw/Type/Upload Signature on dashboard
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    Then user click on Signature edit
     And click on "TYPE"
     Then user select the signature
     And user click Save button
     Then message get display as "Signature saved."
     
       @Dashboard14
  Scenario: To verify that the Signature upload file max size is 50 kb 
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    Then user click on Signature edit
    Then user click on upload
    Then user click on upload and browser option as "signature.png"
    And user click Save button
    Then message get display as "Signature saved."
    
     @Dashboard15
  Scenario: To verify that the Signature upload file size is more than 50 kb 
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    Then user click on Signature edit
    Then user click on upload
    Then user click on upload and browser option as "signature-scan.png"
    #And user click Save button
    Then Error message get display as "File size exceeds the maximum limit of 50KB."

  @Dashboard13
  Scenario: To verify that user is  able to Draw/Type/Upload Signature on dashboard
    #When enter the user name as "sid02@mailinator.com"
    When enter the user name as "sid92@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    Then user click on self sign
    When user click on browser and upload "small.pdf"
    Then user get display message as "File uploaded successfully"
    When user click on save and continue
    Then User drag and drop the signature

  @Dashboard16
  Scenario: To verify that feedback option is present or not on Dashboard
    When enter the user name as "sid92@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    Then verify that Feedback rating UI should be present
    Then clickable Smiley icon should be present
    
    
 

  @Dashboard17
  Scenario: To verify Self sign and Group sign options are present or not on Dashboard
    When enter the user name as "sid92@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    #And dashboard window get display
    Then user display self sign and group sign and it should be clickable
    
     @Dashboard18
  Scenario: To verify that used/remaining document count and days is displaying on dashboard correct or not
    
    When enter the user name as "sid12@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    Then dashboard window get display
    
    

  @Dashboard19
  Scenario: To Verify if the Account is Inactive, user should be able to purchase plan from Buy Now button present on Dashboard
    When enter the user name as "sid09@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    #And user click on continue with free version
    And user click on buy now button
    Then pop up should display only the higher plan than the exisiting
    And user click on the Upgrade button
    Then user navigate to payment page
    And user enter name of the card as "Test"
    And enter card number as "4242424242424242"
    And enter expire month as "07"
    And enter expire year as "27"
    And enter cvv nunber as "789"
    Then user click on pay button
    Then confirmation message get display as "PAYMENT CONFIRMATION"
