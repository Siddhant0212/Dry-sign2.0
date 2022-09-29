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
  Scenario: To verify that signatory is able to sign password protected document
    #Given user navigate to "https://www.mailinator.com/v4/public/inboxes.jsp"
    #And user enter email id as "sid218@mailinator.com"
    #Then user click on Go button
    #Then user click on drysign
    #And user click on sign document
   # Then user get display pop up with message as "Please enter the password to proceed"
    #And user enter Password as "Sid@555"
    #Then click on submit button
    #And user enter Password as "Sid@555"
    #Then click on submit button
    #And user enter Password as "Sid@555"
    #Then click on submit button
    #Then user should get display error message as "You have entered incorrect password"
    #Then user correct password as "Sid@222"
    #Then user should display in asteric symbol or circular dots
    #Then click on submit button
    #Then Pop up get display as "Consent to Proceed Electronically"
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid218@mailinator.com"
    When enter the password as"Malin@555"
     And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    Then user get display pending tab
    And user click on pending tab
    Then user display subject
    Then user display document name
    Then user display assigned date
    Then user display requested by
    Then user display action
    Then user click on action link 
    Then user get display pop up with message as "Please enter the password to proceed"
    And user enter Password as "Sid@555"
    Then click On Submit button
    And user enter Password as "Sid@555"
    Then click On Submit button
    And user enter Password as "Sid@555"
    Then click On Submit button
    Then user should get display error message as "You have entered incorrect password"
    Then user correct password as "Sid@222"
    Then user should display in asteric symbol or circular dots
    Then click On Submit button
    Then Pop up get display as "Consent to Proceed Electronically"
    
    #And user click on check box
    #And user click on accept button
    #And user clcik on ok button present on pop up
    #Then document should get display

  @Password3
  Scenario: To verify that signatory is able to sign password protected document after reassign the document
    #Given user navigate to "https://www.mailinator.com/v4/public/inboxes.jsp"
    #And user enter email id as "sid15"
    #Then user click on Go button
    #Then user click on drysign
    #And user click on sign document
    #Then user get display pop up with message as "Please enter the password to proceed"
    #And user enter Password as "Sid@555"
    #Then click on submit button
    #And user enter Password as "Sid@555"
    #Then click on submit button
    #And user enter Password as "Sid@555"
    #Then click on submit button
    #Then user should get display error message as "You have entered incorrect password"
    #Then user correct password as "Sid@222"
    #Then user should display in asteric symbol or circular dots
    #Then click on submit button
    #Then Pop up get display as "Consent to Proceed Electronically"
    #Given navigate to "https://drysign-qa.exela.global/#/login"
    #When enter the user name as "sid91@mailinator.com"
    #When enter the password as"Malin@555"
    #And user click on the sign in button
    #And user click on continue with free version
    #And user click on My Files
    #Then user click on out for signature
    #Then user click on plus icon as "grp"
    #And user click on reassign field
    #And click yes button present on pop up
    #Then user the enter name as "sid"
    #Then user enter email address as "sid13@mailinator.com"
    #Then user click on confirm button
    #Then user navigate to "https://www.mailinator.com/v4/public/inboxes.jsp"
    #And user email id as "sid15"
    #Then user click on Go button
    #Then user click on drysign
    #And user click on sign document
    
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid218@mailinator.com"
    When enter the password as"Malin@555"
     And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    Then user get display pending tab
    And user click on pending tab
    #Then user display subject
    #Then user display document name
    #Then user display assigned date
    #Then user display requested by
    Then user display action
    Then user click on action link 
    Then user get display pop up with message as "Please enter the password to proceed"
    And user enter Password as "Sid@111"
    Then click On Submit button
    And user enter Password as "Sid@111"
    Then click On Submit button
    And user enter Password as "Sid@111"
    Then click On Submit button
    Then user should get display error message as "You have entered incorrect password"
    Then user correct password as "Sid@555"
    Then user should display in asteric symbol or circular dots
    Then click On Submit button
    Then Pop up get display as "Consent to Proceed Electronically"
 
    
    Given navigate to URL "https://drysign-dev.exela.global/#/my-files"
    
    And user click on out for signature tab
    Then user click on plus icon
    Then user click on mat icon
    Then click in reassign 
    Then pop up get Display as "Are you sure you want to reassign eSign authority to another signatory?"
    Then user click on "YES" button
    Then another pop get display as "Reassign"
    Then enter name as "Sid"
    Then enter email Address as "sid202@mailinator.com"
    Then user click on "CONFIRM"Button
    Then success message display
    Then click On Ok button
    And user click on pending tab
    Then Document is not present for old signatory

  #Then Blank page should get display
  @Password4
  Scenario: To verify that signatory is able to sign password protected document after delete signatory if document is not priority
    
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    When enter the user name as "sid221@mailinator.com"
    When enter the password as"Malin@555"
     And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    Then user get display pending tab
    #And user click on pending tab
     And user click on out for signature tab
    #Then user click On Mat icon
    When user click on plus icon
    Then user get display status as "Pending"
    Then user click On Mat icon
    And user click on remove icon
     Then user click on confirm
    Then succefully remove message display as "The signatory (sid103@mailinator.com) has been removed successfully."
    Then click OK button 
    
    Given user navigate to "https://www.mailinator.com/v4/public/inboxes.jsp"
    And user Enter email id as "sid231"
    Then user click on Go button
    Then user click on drysign
    And user click on sign document
    Then user get display Error Message as "Document is not completely prepared by the originator."

  @Password5
  Scenario: To verify that signatory is able to sign password protected document after delete signatory if document is priority
    Given user navigate to "https://www.mailinator.com/v4/public/inboxes.jsp"
    And User Enter email id as "sid202"
    Then user click on Go button
    Then user click on drysign
    And user click on sign document
    
    Then user correct password as "Sid@222"
    Then click on Submit button
    And user click on check box
    And user click on accept button
    And user clcik on ok button present on pop up
    And user click on signature
    And click on "TYPE"
    Then user select the signature
    And user click save button
    Then use click on "finish"
    Then successfully signed document page get display as"You have successfully signed this document."
    Then User navigate to URL "https://drysign-dev.exela.global/#/"
     When enter the user name as "sid221@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    And user click on out for signature tab
    When user click on plus icon
    Then user click On Mat icon
    And user click on remove icon
    Then user click on confirm
    Then succefully remove message display as "The signatory (sid103@mailinator.com) has been removed successfully."
    Then click OK button 
    Given user navigate to "https://www.mailinator.com/v4/public/inboxes.jsp"
    And user Enter email Id as "sid204"
    Then user click on Go button
    Then mail is not present
    #
       #Then user get display pending tab
    #And user click on pending tab
     #And user click on out for signature tab
    #Then user click On Mat icon
    #When user click on plus icon
    #Then user get display status as "Pending"
    #Then user click On Mat icon
    #And user click on remove icon
     #Then user click on confirm
    #Then succefully remove message display as "The signatory (sid103@mailinator.com) has been removed successfully."
    #Then click OK button 
    
    
    #mail from sid76
     @Password50
  Scenario: To verify that signatory is able to sign password protected document after delete signatory if document is priority
    
    Given user navigate to "https://www.mailinator.com/v4/public/inboxes.jsp"
    And user Enter email Id as "sid12"
    Then user click on Go button
    Then user click on drysign
    And user click on sign document
    Then user correct password as "Sid@555"
    Then click on Submit button
    And user click on check box
    And user click on accept button
    And user clcik on ok button present on pop up
    And user click on signature
    And click on "TYPE"
    Then user select the signature
    And user click save button
    Then use click on "finish"
    Then successfully signed document page get display as"You have successfully signed this document."
    
    Given user navigate to "https://www.mailinator.com/v4/public/inboxes.jsp"
     And user Enter email Id as "sid39"
    Then user click on Go button
    Then user click on drysign
    And user click on sign document
    Then user correct password as "Sid@222"
    Then click on Submit button
    And user click on check box
    And user click on accept button
    And user clcik on ok button present on pop up
    And user click on signature
    And click on "TYPE"
    Then user select the signature
    And user click save button
    Then use click on "finish"
    Then successfully signed document page get display as"You have successfully signed this document."
    
    Then User navigate to URL "https://drysign-qa.exela.global/#/"
    When enter the user name as "sid102@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    And user click on Out for signature tab
    Then user click on plus icon
    Then user click on remove
    Then user click on Confirm Btn
    Then click on Ok button
    
    Given user navigate to "https://www.mailinator.com/v4/public/inboxes.jsp"
    And user Enter email id as "sid13"
    Then user click on Go button
    Then user click on drysign
    And user click on sign document
    Then user get display Error Message as "Document is not completely prepared by the originator."
    
    
    