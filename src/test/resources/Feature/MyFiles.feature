Feature: To Verify My Files Tabs Functionality

  Background: 
    Given navigate to URL "https://drysign-qa.exela.global/#/"

  @MyFiles2
  Scenario: To verify download functionality of signed document of DrySign
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    And user click on signed tab
    And user click on View icon under Action column
    And user should get display document
    Then user click on Close icon
    When user click on Download icon
    Then Document should get downloaded on local storage
    #When user open downloaded document
    #And check signature details
    #Then All signature details and document should display correctly

  @MyFiles3
  Scenario: To verify email functionality for sending completed documents of DrySign
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    And user click on completed documents tab
    And user click on Email icon for Completed Documents
    Then pop up get displayed
    And user enter recipient email address as "sid31@mailinator.com"
    And user enter CC email address as "sid32@mailinator.com"
    And user enter add subject as "Sign"
    And user enter Message "grpsign"
    And user click on Send button
    #Then user should get success message as Email successfully sent
    Then user Navigate to URL "https://www.mailinator.com/v4/public/inboxes.jsp"
    And user Enter email as "sid103"
    Then user click on Go button
    Then user click on Mail 
    And user click on sign document
    And user click on check box
    And user click on accept button
    And user clcik on ok button present on pop up
    Then click on the download link
    
  #When user check received email on user side whose email id is entered
  #Then document should get received
  #When user Download document
  #And open received document in email
  #Then Received document should have same content as in Completed Documents
  
  
  @MyFiles4
  Scenario: To verify functionality of View and Download the completed document of DrySign
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    And user click on completed documents tab
    When user click on plus icon
    And user click on View icon under Action column
    And user should get display document
    Then user click on Close icon
    When user click on Download icon
    Then Document should get downloaded on local storage

  @MyFiles5
  Scenario: To verify functionality of checking status of document which is Out for Signature of DrySign
    When enter the user name as "sidhuingole4@gmail.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    And user click on out for signature tab
    And user click on plus icon under out for signature

  #Then user should get display a status as Signed after signed a document
  #Then also user should get displayed as pending until user sign on it
  #When user click on Info icon under for signatories whose status is Waiting
  #Then Popup should contain Recent actions
  #Then recent added should display on top
  #-------------------------------------
  #--------------------------------------
  #-------------------------------------(remains)
  #When user click on reassign
  #And Popup should get displayed contains with no and yes button
  #And user click on yes
  #Then Popup should get opened contains Full Name and Email id fields with Confirm and Cancel button
  #When user Enter all valid details except duplicate email id
  #And user click on confirm
  #Then user should get displayed Success message as email has been sent to successfully
  #Then reassigned email id should be displayed on the UI
  #When user click on Remove icon under action column
  #Then user should get display pop up with Confirm and Cancel button
  #When user click on Confirm button
  #Then user should get display pop which contain successful message ok button
  #When user click on the Download icon
  #Then document should get downloaded successfully from the Out for Signature Tab
  @MyFiles6
  Scenario: To verify functionality of draft documents
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    And user click on drafts tab
    And user click on Edit icon to view Self sign or Group sign
    Then user should get redirect to same screen
    And user click on My Files
    And user click on drafts tab
    When user click on Delete icon under Action column
    Then user should get displayed pop up
    Then pop should contain confirm and cancel button
    When user click in confirm button
    Then user should be displayed message as deleted successfully

  #need account which contain 3-4 draft doc
  @MyFiles7
  Scenario: To verify download functionality of rejected document of DrySign
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    And user click on rejected tab
    And user click on View icon under Action column
    And user get display document rejected
    Then user click on Close icon
    When user click on Download icon
    Then Document should get downloaded on local storage
    #When user Open downloaded document and check
    #Then Rejected details and document should display correctly
    When user click on plus icon
    Then the details of the rejected document should be displayed

  @MyFiles8
  Scenario: To Verify the generic Search functionality present on all the Tabs in the My Files
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    And user click on completed documents tab
    And user search data from the generic search functionality as "sign"
    Then user should get displayed relevant data successfully through partial or fully searched

  @MyFiles9
  Scenario: To Verify the column sorting functioanlity is working in MY Files
    And user click on continue with free version
    And user click on My Files
    And user Sort the data by clicking on the arrow icon upward or downward
    Then user should sort column data correctly through ascending for descending order

  @MyFiles10
  Scenario: To Verify the individual column filter search functionality in My Files
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    And user click on completed documents tab
    And user enter subject in subject column filter as "sign"
    And user enter sign type as "Group"
    And user enter completed date as "08/09/2022"
    And user should get display the correct searched data for every column
