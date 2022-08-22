  @Password
Feature: To Verify Password Protected Document can be signed


 #drag and drop issue
   # @Password1
  #Scenario: To verify that user is able to set password for all signatories and send for signature to the signatories
  #Given user navigate to URL "https://drysign-qa.exela.global/#/"
   #When enter the user name as "sid92@mailinator.com"
   #When enter the password as"Malin@555"
   #
   #And user click on the sign in button
   #And user click on continue with free version
  # When user click on group sign
  # When user click on browser and upload "small.pdf"
   #Then user get display message as "File uploaded successfully"
   #When user click on save and continue
   #And user click on Add More
   #When user enter signatory name as "siddhant"
   #When user enter signatory email id as "siddhantingole90@gmail.com"
   #And user select checkbox as "Protect my document with password" 
   #Then Enter password as ""
   #Then User should not be able to continue with blank password
   #Then Enter password as "Sid@222"
   #When user click on save and continue
   
   # Then Password field should get enabled
    #Then User should be able to add password between 6 to 20 characters
  #  Then field should accept numbers letters alphanumerics special characters
   # When user enters the password
   # Then verify that should display in asteric symbol or circular dots
    #When user Select checkbox for 'Protect my document with password'
   # When click on 'Save and Continue' button by keeping password field blank
   # Then user should not be able to continue with blank password
   # When user set password
   # When user click on save and continu
   # Then user should be able to move to Prepare Step
    #When user on Recipients Step
   # When user click on send button
   # Then there should be a prompt message on popup
    #When user clicks on Ok button
    #Then user should redirect to success page

    @Password2
 Scenario:To verify that signatory is able to sign password protected document
Given user navigate to "https://www.mailinator.com/v4/public/inboxes.jsp"
And user enter email id as "sid15@mailinator.com"
Then user click on Go button
Then user click on drysign 
And user click on sign document
Then user get display pop up with message as "Please enter the password to proceed"
And user enter Password as "Sid@555"
Then click on submit button
And user enter Password as "Sid@555"
Then click on submit button
And user enter Password as "Sid@555"
Then click on submit button
Then user should get display error message as "You have entered incorrect password"
Then user correct password as "Sid@222"
Then user should display in asteric symbol or circular dots 
Then click on submit button
Then Pop up get display as "Consent to Proceed Electronically"

@Password3
Scenario: To verify that signatory is able to sign password protected document after reassign the document
Given user navigate to "https://www.mailinator.com/v4/public/inboxes.jsp"
And user enter email id as "sid15"
Then user click on Go button
Then user click on drysign 
And user click on sign document
Then user get display pop up with message as "Please enter the password to proceed"
And user enter Password as "Sid@555"
Then click on submit button
And user enter Password as "Sid@555"
Then click on submit button
And user enter Password as "Sid@555"
Then click on submit button
Then user should get display error message as "You have entered incorrect password"
Then user correct password as "Sid@222"
Then user should display in asteric symbol or circular dots 
Then click on submit button
Then Pop up get display as "Consent to Proceed Electronically"

Given navigate to "https://drysign-qa.exela.global/#/login"
When enter the user name as "sid91@mailinator.com"
When enter the password as"Malin@555"
And user click on the sign in button
And user click on continue with free version
And user click on My Files
Then user click on out for signature
Then user click on plus icon as "grp"
And user click on reassign field
And click yes button present on pop up
Then user the enter name as "sid"
Then user enter email address as "sid13@mailinator.com"
Then user click on confirm button

Then  user navigate to "https://www.mailinator.com/v4/public/inboxes.jsp"
And user email id as "sid15"
Then user click on Go button
Then user click on drysign 
And user click on sign document
#Then Blank page should get display


   


