Feature: To Verify My Files Tabs Functionality

  Background: 
    Given navigate to URL "https://drysign-dev.exela.global/#/"
    
     @DrySign1
  Scenario: To verify functionality of sign on Pending document of DrySign
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
   And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    Then user get display pending tab
    #Then user display action
    #Then user click on Mat icon
    
    Then user click on action link 
    And user click on check box
    And user click on accept button
    And user clcik on ok button present on pop up
    #Then document should get display
    And user click on signature
    #And click on "TYPE"
    #Then user select the signature
    And user click save button
    Then use click on "finish"
    Then successfully signed document page get display as"You have successfully signed this document."
    Then verify contact number field needs to be mandatory field with the asterix symbol

  @DrySign1
  Scenario: To verify download functionality of signed document of DrySign
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    And user click on signed tab
    Then user click on Mat icon
    And user click on View icon under Action column
    And user should get display document
    Then user click on Close icon
    Then user click on Mat icon
    When user click on Download icon
    Then Document should get downloaded on local storage as "Holidays List 2022 Updated.pdf" 
    
    
    #When user open downloaded document
    #And check signature details
    #Then All signature details and document should display correctly

  @DrySign1
  Scenario: To verify email functionality for sending completed documents of DrySign
   When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    And user click on completed documents tab
    Then user click on Mat icon
    And user click on Email icon for Completed Documents
    And user enter recipient email address as "sid103@mailinator.com"
    And user enter CC email address as "sid32@mailinator.com"
    And user enter add subject as "Sign"
    And user enter Message "grpsign"
    And user click on Send button
    Then user should get success message as Email successfully sent
    Then user Navigate to URL "https://www.mailinator.com/v4/public/inboxes.jsp"
    And user Enter email as "sid103"
    Then user click on Go button
    Then user click on Mail 
    And user click on sign document
    And user click on check box
    And user click on accept button
    And user clcik on ok button present on pop up
    
    
    #When enter the user name as "sid39@mailinator.com"
    #When enter the password as"Malin@555"
    #And user click on the sign in button
    #And user click on continue with free version
    #And user click on My Files
    #And user click on completed documents tab
    #And user click on Email icon for Completed Documents
    #Then pop up get displayed
    #And user enter recipient email address as "sid31@mailinator.com"
    #And user enter CC email address as "sid32@mailinator.com"
    #And user enter add subject as "Sign"
    #And user enter Message "grpsign"
    #And user click on Send button
    #Then user should get success message as Email successfully sent
    #Then user Navigate to URL "https://www.mailinator.com/v4/public/inboxes.jsp"
    #And user Enter email as "sid103"
    #Then user click on Go button
    #Then user click on Mail 
    #And user click on sign document
    #And user click on check box
    #And user click on accept button
    #And user clcik on ok button present on pop up
    #Then click on the download link
    
  #When user check received email on user side whose email id is entered
  #Then document should get received
  #When user Download document
  #And open received document in email
  #Then Received document should have same content as in Completed Documents
  
  
  @DrySign1
  Scenario: To verify functionality of View and Download the completed document of DrySign
    When enter the user name as "sid211@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    And user click on completed documents tab
    When user click on plus icon
    Then user click on Mat icon
    And user click on View icon under Action column
    And user should get display document
    Then user click on Close icon
    Then user click on Mat icon
    When user click on Download icon
    Then Document should get downloaded on local storage as "TimoManual" 

  @DrySign1
  Scenario: To verify functionality of checking status of document which is Out for Signature of DrySign
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
   And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    And user click on out for signature tab
   
    When user click on plus icon
    Then user get display status as "Pending"
    Then user click On Mat icon
    And user click on info icon
    Then Pop up get display as "Recent Action" and recent added get display
    Then user click On Mat icon
    And user click on notify icon
    Then user click on confirm
    Then message display as "Reminder has been sent to Sid  (sid39@mailinator.com) successfully."
   
    Then user click On Mat icon
    Then click in reassign
    Then pop up get Display as "Are you sure you want to reassign eSign authority to another signatory?"
    Then user click on "YES" button
    Then another pop get display as "Reassign"
    Then enter name as "Sid"
    Then enter email Address as "sid218@mailinator.com"
    Then user click on "CONFIRM"Button
    Then success message get display as "Email has been sent to sid (sid12@mailinator.com) successfully."
    Then click on ok button
    
    
    
    #Then user click On Mat icon
    #And user click on remove icon
    #Then user click on confirm
    #Then succefully remove message display as "The signatory (sid103@mailinator.com) has been removed successfully."
    #Then click OK button 
    And user clicking on minus icon recorded details should get closed
    Then user click on Mat icon
    When user click on Download icon
    Then Document should get downloaded on local storage as "TimoManual" 
    
    

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
  
  @DrySign1
  Scenario: To verify functionality of draft documents
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
     And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    And user click on drafts tab
     Then user click on Mat icon
    And user click on Edit icon to view Self sign or Group sign
    Then user should get redirect to same screen
    And user Click on Dashboard
    And user click on My Files
    And user click on drafts tab
    Then user click on Mat icon
    When user click on Delete icon under Action column
    Then user should get displayed pop up as "Are you sure you wish to delete this document?"
    Then pop should contain confirm and cancel button
    When user click in confirm button
    Then user should be displayed message as deleted successfully

  #need account which contain 3-4 draft doc
  @DrySign1
  Scenario: To verify download functionality of rejected document of DrySign
    When enter the user name as "sid211@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    And user click on rejected tab
    Then user click on Mat icon
    And user click on View icon under Action column
    And user get display document rejected
    Then user click on Close icon
    Then user click on Mat icon
    When user click on Download icon
    Then Document should get downloaded on Local storage as "TimoManual"
    Then user click on plus icon
    Then details get Display 
    |Signatories:|
    |Message:|
    |Rejected Comment:|
     
    #When user Open downloaded document and check
    #Then Rejected details and document should display correctly
    #When user click on plus icon
    #Then the details of the rejected document should be displayed
    
      @MyFiles08
  Scenario: To Verify the generic Search functionality present on all the Tabs in the My Files 

  @DrySign
  Scenario: To Verify the generic Search functionality present on all the Tabs in the My Files
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    Then user get display pending tab
    And user search data from the generic search functionality as "grp"
    And user click on signed tab
    And user search data from the generic search functionality as "grp"
    And user click on completed documents tab
    And user search data from the generic search functionality as "sign"
    And user click on out for signature tab
    And user search data from the generic search functionality as "grp"
    And user click on drafts tab
    And user search data from the generic search functionality as "Timo"
    And user click on rejected tab
    And user search data from the generic search functionality as "grp"
    
  

  @DrySign
  Scenario: To Verify the column sorting functioanlity is working in MY Files
     When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    Then user get display pending tab
    Then user display requested by
   #Then user click on upward arrow 
    Then Display ascending order
    |Ds5050 Test|
    |Ds5050 Test|
    |Sid Ingole|
    |Sid Ingole|
    |Sid Ingole|
    |Sidd Ing|
    |Sidd Ing|
    And user click on signed tab
    Then user is able to click on pending tab 
    #Then user click on downward arrow
    Then Display descending order
    |Sidd Ing|
    |Sidd Ing|
    |Sid Ingole|
    |Sid Ingole|
    |Sid Ingole|
    |Ds5050 Test|
    |Ds5050 Test|
    
    

  @DrySign
  Scenario: To Verify the individual column filter search functionality in My Files
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    Then user get display pending tab
    And user search data from the generic search functionality as "grp"
    Then user search data into document name as "TimoManual.pdf (1) (2).pdf"
    Then user search data into assigned date as "08/29/2022 10:39:17 PM"
    Then user search data into requested by as "Ds5050 Test"
    
    
    
    #And user click on completed documents tab
    #And user enter subject in subject column filter as "sign"
    #And user enter sign type as "Group"
    #And user enter completed date as "08/09/2022"
    #And user should get display the correct searched data for every column
    
    
          @DrySign
  Scenario: To verify When we send document to same User which is logged in 
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    Then document should present in pending tab
    
    
    
    
      @DrySign
  Scenario: To Verify the generic Data should load immediatly in all tabs
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    Then user is able to click on pending tab 
    Then user is able to click on Signed tab 
    And user click on completed documents tab
    And user click on out for signature tab
    And user click on drafts tab
    And user click on rejected tab
    
    
       @DrySign1
  Scenario: To verify that all field are displaying proper or not.
   When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
     And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    Then user get display pending tab

    
    And user click on signed tab
    Then user display subject
    Then user display document name
    Then user display Assigned Date
    Then date Display in format as "09/26/2022 7:04:51 AM"
    Then user display requested by
    Then user display action
    Then user click on Mat icon
    And user click on View icon 
    Then Document should get display
    Then user click on close icon
    Then user click on Mat icon
    When user click on Download icon
    Then Document should get downloaded on local storage as "TimoManual"
    
     And user click on completed documents tab
      Then user display subject
      Then user display Sign Type
      Then user display Completed Date
      Then user display date in format as "09/26/2022 7:04:50 AM"
      Then user display action
      Then user click on Mat icon
      And user click on View icon 
      Then Document should get display
      Then user click on close icon
      Then user click on Mat icon
      When user click on Download icon
     Then Document should get downloaded on local storage as "TimoManual"
    Then user click on Mat icon
    And user click on Email icon for Completed Documents
    Then user click on close icon
      
      
       And user click on out for signature tab
       Then user display subject
       Then user display Document Name
       Then user display Assigned Date
       Then user Display date in format as "09/02/2022 7:18:28 AM"
       Then user display action
       Then user click on Mat icon
       When user click on Download icon
       Then Document should get downloaded on local storage as "TimoManual" 
       
      And user click on rejected tab
      Then user display subject
      Then user display Document Name
      Then user display Assigned Date
      Then user display Rejected Date
      Then user display Rejected By
      Then user display action
      Then user click on Mat icon
      When user click on Download icon
      Then Document should get downloaded on local storage as "TimoManual" 
      
      And user click on drafts tab
      Then user display title
      Then user display Sign Type
      Then user display Date&Time
      Then user Display date in format as "09/19/2022, 12:22:16 AM"
      Then user display action
      #Then user click on Mat icon
      #And user click on Edit icon to view Self sign or Group sign
      #Then user should get redirect to same screen
      #And user Click on Dashboard
      #And user click on My Files
      
     Then user click on forward arrow 
    And user click on pending tab
    Then user display subject
    Then user display document name
    Then user display assigned date
    Then user display requested by
    Then user display action
    Then user click on action link 
    And user click on check box
    And user click on accept button
    And user clcik on ok button present on pop up
    Then document should get display
      
  

      
    
      
      
       @DrySign
  Scenario: To verify generic Date display proper or not
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
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
    Then user Display Date in format as "09/1/2022, 4:46:43 AM"	
    
    And user click on rejected tab
    Then user display Assigned Date
    Then user Display Date in Format as "08/16/2022 11:06:55 AM"
    
         @DrySign
  Scenario: To Verify the Expand and Collapse (+/-) document record functioanlity in Signed , Completed Documents, Out for Signature and Rejected Tab
      When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
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
      
       @DrySign
  Scenario: To Verify the Pagination functionality in all the Tabs in My Files Section
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    Then Previous and next icon should get display
    Then page numeric value display next to the previous icon
    #Then page default value is one
    Then default page should be first as "1 - 8 of 8"
    Then on first page previous arrow icon should be disabled
    Then on last page next arror icon should be disabled
    Then user get display pending tab
    Then server time for assigned date
      |09/02/2022 7:18:28 AM|        
      |09/01/2022 3:37:46 AM|
      |08/29/2022 10:39:17 PM|
    
        @DrySign
  Scenario: To Verify it takes Server time by  on the Assigned Date and Signed Date column in all Tabs
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    Then user get display pending tab
    Then server time for assigned date
      |09/02/2022 7:18:28 AM|        
      |09/01/2022 3:37:46 AM|
      |08/29/2022 10:39:17 PM|
    And user click on signed tab
    Then server time for assigned date
      |08/17/2022 12:01:58 AM|        
      |08/17/2022 12:44:41 AM|
     Then server time for signed date
      |08/17/2022, 7:01:46 AM|        
      |08/17/2022, 7:44:29 AM|
      And user click on out for signature tab
      Then server time for assigned date
       |08/24/2022 2:55:23 AM|   
      And user click on rejected tab     
       Then server time for assigned date
       |09/01/2022 3:35:20 AM|        
       |08/16/2022 11:06:55 AM|
       
      
    
       @DrySign1
  Scenario: To Verify on re-assign in Out for Signature Tab, the record cannot be re-assigned to the same signatory who is already in the List.
    When enter the user name as "sid39@mailinator.com"
    When enter the password as"Malin@555"
   And user click on the Login button
    And user click on continue with free version
    And user click on My Files
    And user click on out for signature tab
    Then user click on plus icon
    Then user click on mat icon
    Then click in reassign 
    Then pop up get Display as "Are you sure you want to reassign eSign authority to another signatory?"
    Then user click on "YES" button
    Then another pop get display as "Reassign"
    Then enter name as "Sid"
    Then enter email Address as "sid101@mailinator.com"
    Then user click on "CONFIRM"Button
    Then validation message get display as "This email address already exists in your previously assigned list."
