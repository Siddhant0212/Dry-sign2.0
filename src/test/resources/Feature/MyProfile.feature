Feature: To Verify My Profile Page

  @MyProfile1
  Scenario: To verify  if user is able to see and click profile on dashboard top right corner after login.
    Given navigate to URL "https://drysign-qa.exela.global/#/login"
    When enter the user name as "sid76@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on mat icon
    When user click on profile icon
    Then user click on upload button
    #Then user click on upload photo button as "img.jpg"
    
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
    Then user click on save button
    Then user confirmation message get display as "Successfully Updated."
    #Then user click on edit button
    #Then user leave the name field blank
    #Then error message get Display as "First name is required."