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
    
    
          @MyFiles11
  Scenario: To verify When we send document to same User which is logged in 
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    Then document should present in pending tab
    
    
    
    
      @MyFiles12
  Scenario: To Verify the generic Data should load immediatly in all tabs
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    Then user is able to click on pending tab 
    Then user is able to click on Signed tab 
    
       @MyFiles13
  Scenario: To verify that all field are displaying proper or not.
   #When enter the user name as "sid39@mailinator.com"
    #When enter the password as"Malin@555"
    #And user click on the sign in button
    #And user click on continue with free version
    #And user click on My Files
    #Then user get display pending tab
    #Then user display subject
    #Then user display document name
    #Then user display assigned date
    #Then user display requested by
    #Then user display action
    #Then user click on action link 
    #And user click on check box
    #And user click on accept button
    #And user clcik on ok button present on pop up
    #Then document should get display
    
    Given navigate to URL "https://drysign-qa.exela.global/#/"
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    And user click on signed tab
    Then user display subject
    Then user display document name
    Then user display Assigned Date
    Then date Display in format as "08/17/2022 12:01:58 AM"
    Then user display requested by
    Then user display action
    And user click on View icon 
    Then Document should get display
    Then user click on close icon
    When user click on Download icon
    
     And user click on completed documents tab
      Then user display subject
      Then user display Sign Type
      Then user display Completed Date
      Then user display date in format as "08/09/2022 2:59:02 AM"
      Then user display action
      And user click on View icon 
      Then Document should get display
      Then user click on close icon
      When user click on Download icon
      Then user click on mail icon
      
       And user click on out for signature tab
       Then user display subject
       Then user display Document Name
       Then user display Assigned Date
       Then user Display date in format as "08/24/2022 2:55:23 AM"
       Then user display action
        When user click on Download icon
      
      And user click on drafts tab
      Then user display title
      Then user display Sign Type
      Then user display Date&Time
      Then user display action
      
      And user click on rejected tab
      Then user display subject
      Then user display Document Name
      Then user display Assigned Date
      Then user display Rejected Date
      Then user display Rejected By
      Then user display action
      
      
       @MyFiles14
  Scenario: To verify generic Date display proper or not
     When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    Then user get display pending tab
    Then user display Assigned Date
    Then date display in format as "08/17/2022 1:07:58 AM"
    
    And user click on signed tab
    Then user display Assigned Date
    Then date Display in format as "08/17/2022 12:01:58 AM"
    
    And user click on completed documents tab
    Then user display Completed Date
    Then user display date in format as "08/09/2022 2:59:02 AM"
    
    And user click on out for signature tab
    Then user display Assigned Date
    Then user Display date in format as "08/24/2022 2:55:23 AM"
    
    And user click on drafts tab
    Then user display Date&Time
    Then user Display Date in format as "08/16/2022, 11:24:02 AM"
    
    And user click on rejected tab
    Then user display Assigned Date
    Then user Display Date in Format as "08/16/2022 11:06:55 AM"
    
         @MyFiles15
  Scenario: To Verify the Expand and Collapse (+/-) document record functioanlity in Signed , Completed Documents, Out for Signature and Rejected Tab
      When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    And user click on completed documents tab
    Then user click on plus icon
    Then details get display 
    |Envelope Id:|        
      |Document Name:|
      |Requested By:|
      |Signatories:|
      |Subject:|
      |Message:|
      
    And user clicking on minus icon recorded details should get closed
    Then user click on plus icon
    Then details get display 
       |Envelope Id:|        
      |Document Name:|
      |Requested By:|
      |Signatories:|
      |Subject:|
      |Message:|
      When user click on another details plus icon
      Then new details get display
      |Envelope Id:|        
      |Document Name:|
      |Requested By:|
      |Signatories:|
      |Subject:|
      |Message:|
      
       @MyFiles16
  Scenario: To Verify the Pagination functionality in all the Tabs in My Files Section
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    Then Previous and next icon should get display
    Then page numeric value display next to the previous icon
    Then page default value is one
    Then default page should be first as "Displaying item : 1 - 4 of 4"
    Then on first page previous arrow icon should be disabled
    Then on last page next arror icon should be disabled
    
       @MyFiles18
  Scenario: To Verify on re-assign in Out for Signature Tab, the record cannot be re-assigned to the same signatory who is already in the List.
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on My Files
    And user click on out for signature tab
    Then user click on plus icon
    Then click in reassign 
    Then pop up get Display as "Are you sure you want to reassign eSign authority to another signatory?"
    Then user click on "YES" button
    Then another pop get display as "Reassign"
    Then enter name as "Sid"
    Then enter email Address as "sid103@mailinator.com"
    Then user click on "CONFIRM"Button
    Then validation message get display as "This email address already exists in your previously assigned list."
