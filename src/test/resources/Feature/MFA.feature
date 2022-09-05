@MFA
Feature: To Check MFA(OTP/Secure Code) functionality

  Background: 
    Given navigate to URL "https://drysign-qa.exela.global/#/"

  @MFA1
  Scenario: To verify set OTP option while login to drysign account from profile
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    And user click on profile icon
    And user should display security tab
    When user click on security tab
    Then user should display setup secure code
    And user select on checkbox for email OTP

  @MFA2
  Scenario: Login to the drysign application through drysign credentials after set the MFA as 'OTP via Mail' from profile section
    When enter the user name as "sid11@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on send one time password
   # When OTP received mail as "sid11@mailinator.com"
    Then user click on resend one time password
    When OTP received on mail id as "sid11@mailinator.com"
    And user click on verify button
    Then user should display error message after entering old OTP as "The One Time Password provided is incorrect, please try again"
    

  #When user click on resend one time password link
  #Then user should get another OTP on email
  #Then user should entered new OTP
  #And user click on verify button
  #When user enter old OTP after receive new OTP
  #Then user Should display error message for incorrect OTP
  #When user enter incorrect OTP three times
  #Then User user should get error popup for account block
  #And user once click on OK button
  #Then user should redirect to login page to Reset his account
 
 
  @MFA3
  Scenario: To verify set Secure code option while login to drysign account from profile
    When enter the user name as "sid49@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    #And user login via secure code as "2"
    #Then user click on verify button
    And user click on continue with free version
    And user click on mat icon
    And user click on profile icon
    When user click on security tab
    And user select on checkbox for setup secure code
    And user enter secure code as "222222"
    Then user get displayed confirm secure code text
    And user enter confirm secure code as "222222"
    And user click on update button
    Then pop should get displayed
    And user click on ok button
    And user click on mat icon
    And user click on logout
    #Then user should get logout from application and redirect to login page
    
    When enter the user name as "sid31@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user login via secure code as "2"
    Then user click on verify button
    And user click on continue with free version
    And user click on mat icon
    And user click profile icon
    When user click on security tab
    When user enter different secure code in confirm secure code field as "555555"
    And user click on update button
    Then user Should get display error message as "Please enter the Valid Secure Code"
    And user click on cancel button
    And user select on checkbox for setup secure code
    And user enter five digit secure code as "22222"
    And user enter five digit confirm secure code as "22222"
    And user click on update button
    Then user Should get display error message as "Please enter the Valid Secure Code"
    And user click on cancel button
    And user select on checkbox for setup secure code
    When user enter characters or special characters as "#@SRN$"

 
  @MFA4
  Scenario: Login to the drysign application through drysign credentials after set the MFA as 'Secure Code' from profile section
    When enter the user name as "sid32@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user login via secure code as "2"
    And user click on verify button
    And user click on continue with free version
    And user click on mat icon
    And user click on logout
    #Then User navigate to URL "https://drysign-qa.exela.global/#/"
    
    When enter the user name as "sid32@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click link on "Forgot Your Secure Code?"
    Then email received on register mail id as "sid32@mailinator.com"
    When enter the user name as "sid32@mailinator.com"
    When enter the password as"Malin@555"
    And user Enter secure code as "2"
    And user Enter confirm secure code as "3"
    Then user display error message as "Secure Code doest not match"
    Then User navigate to URL "https://drysign-qa.exela.global/#/"
    When enter the user name as "sid41@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user login via secure code as "1"
    Then user click on verify button
    And user click on ok button
    Then user click on verify button
    And user click on ok button
    Then user click on verify button
    Then user display pop up as "The Secure Code provided is incorrect. Please enter the correct code and try again."
    And user click on ok button
    
    
  
  
  
  @MFA5
  Scenario: To verify set both OTP and Secure Code options while login to drysign account from profile
    When enter the user name as "sid37@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    And user click on profile icon
    And user should display security tab
    When user click on security tab
    Then user should display setup secure code
    And user select on checkbox for email OTP
    And user click on ok button present on pop up
    And user select on checkbox for setup secure code
    When user click on update button
    And user click on mat icon
    And user click on logout
    And user is on login page

  @MFA6
  Scenario: Login to the drysign application through drysign credentials and use OTP via Mail option for login after set the MFA as 'OTP via Mail' as well as 'Secure Code' from profile section
    When enter the user name as "sid11@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on send one time password button
    
    Then user Navigate to URL "https://www.mailinator.com/v4/public/inboxes.jsp"
    And user enter email as "sid11"
    Then user click on Go button
    Then user click on OTP message
    Then user copy the OTP
    
    #When OTP received on register mail id as "sid11@mailinator.com"
    And user click on verify button
    And user click on continue with free version
    And user click on mat icon
    And user click on logout
  
    #Then User navigate to URL "https://drysign-qa.exela.global/#/"
    When User enter name as "sid11@mailinator.com"
    When user enter the password as"Malin@555"
    And user click on the sign in button
    And user click on send one time password
    
    Then user click on resend one time password
    When OTP received on mail id as "sid11@mailinator.com"
    And user click on verify button
    Then user should display error message after entering old OTP as "The One Time Password provided is incorrect, please try again"
    

  #Given navigate to URL "https://www.mailinator.com/"
  #When enter the mailinator user name as "sid24"
  #And user click on go button
  #And user click on mail
  #And user copy the text
  #And user navigate to URL "https://drysign-qa.exela.global/#/two-step-verification"
  #And user paste one time password
  #And user click on verify button
  #And dashboard window get display
  #And user enter password
  #And user click on verify button
  #Then user should get received Otp on email
  #Then user should able to enter four digit OTP
  
  @MFA7
  Scenario: Login to the drysign application through drysign credentials and use Security Code option for login after set the MFA as 'OTP via Mail' as well as 'Secure Code' from profile section
    When enter the user name as "sid51@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user login via secure code as "2"
    And user click on verify button
    And user click on continue with free version
    And user click on mat icon
    And user click on logout
    
    When enter the user name as "sid32@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click link on "Forgot Your Secure Code?"
    Then email received on register mail id as "sid32@mailinator.com"
    When enter the user name as "sid32@mailinator.com"
    When enter the password as"Malin@555"
    And user Enter secure code as "2"
    And user Enter confirm secure code as "3"
    Then user display error message as "Secure Code doest not match"
    Then User navigate to URL "https://drysign-qa.exela.global/#/"
    When enter the user name as "sid41@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user login via secure code as "1"
    Then user click on verify button
    And user click on ok button
    Then user click on verify button
    And user click on ok button
    Then user click on verify button
    Then user display pop up as "The Secure Code provided is incorrect. Please enter the correct code and try again."
    And user click on ok button
    
    
    @MFA9
  Scenario: To verify the secure code box should get cleare on backspace and delete button from the keyboard.
    When enter the user name as "sid102@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    And user click profile icon
    When user click on security tab
    And user select on checkbox for setup secure code
    #And user click on ok button present on pop up
    And user enter secure code as "222222"
    Then user delete that secure code 
    
    #Then user get displayed confirm secure code text
    #And user enter confirm secure code as "222222"
    #Then user press delete button as "2"
    
       @MFA10
  Scenario: To check that verify button get click on Keyboard Enter key
        When enter the user name as "sid32@mailinator.com"
        When enter the password as"Malin@555"
        And user click on the sign in button
        And user login via secure code As "2"
        And user click on verify button
        And user click on continue with free version
        

  @MFA12
  Scenario: To verify functionality of Forgot Secure code on entering correct credientials
    When enter the user name as "sid28@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click link on "Forgot Your Secure Code?"
    And user received email as "sid28@mailinator.com"
    Then enter the user name as "sid28@mailinator.com"
    Then enter the password as"Malin@555"
    And enter secure code as "222222"
    And enter confirm secure code as "222222"
    Then user click on submit button
    Then user should get display pop up as "Successfully user Sidd secure code updated"
    
    @MFA13
    Scenario: To verify Functionality of forgot Secure code if incorrect credentials are entered
    
    When enter the user name as "sid28@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click link on "Forgot Your Secure Code?"
    And user received email as "sid28@mailinator.com"
    Then enter the user name as "sid28@mailinator.com"
    Then enter the password as"Malin@555"
    And enter secure code as "222222"
    And enter confirm secure code as "333333"
    Then user display error message as "Secure Code doest not match"
    
