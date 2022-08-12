
@Feedback
Feature: To Verify Feedback Works

  @Feedback1
  Scenario: To Verify new feedback rating UI is present or not on the Drysign Dashboard with smiley icon
    Given navigate to URL "https://drysign-qa.exela.global/#/"
    When enter the user name as "sid25@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And dashboard window get display
    Then verify that Feedback rating UI should be present
    Then clickable Smiley icon should be present
    
 @Feedback2
  Scenario: To Verify the relevant ratings for the smiley is present on the Drysign Dashboard
    Given navigate to URL "https://drysign-qa.exela.global/#/"
    When enter the user name as "sid25@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And dashboard window get display
    Then relevant ratings for the smiley is display following fields
      |Needs improvement|        
      |Below Average|
      |Average|
      |Good|
      |Very Good|
    
    #And user click on the smiley
    #And user enter message as "good"
    #And user click on send button
    #Then user should get displayed message as feedback submitted successfully
  
  @Feedback3
  Scenario: To Verify the rating (Smiley) is highlighted to (5 - Very Good)  on DrySign Dashboard at first time login
    Given navigate to URL "https://drysign-qa.exela.global/#/"
    When enter the user name as "sid25@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    # When user login for the first time
    Then rating should be by default highlighted to Very Good

  @Feedback4
  Scenario: To Verify user is able to successfully send feedback along with rating from Drysign Dashboard
    Given navigate to URL "https://drysign-qa.exela.global/#/"
    When enter the user name as "sid25@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on the smiley
    Then user should get display Smiley rating  Message box
    Then user should get display Message box
    And user enter message as "good"
    And user click on send button
    #Then user should get displayed message as feedback submitted successfully
  
  @Feedback5
  Scenario: To Verify on re-login it displays the previous rating given by the user and relevant smiley icon is highlighted on the Dashboard by default
    Given navigate to URL "https://drysign-qa.exela.global/#/"
    When enter the user name as "sid25@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And dashboard window get display
    Then user should get displayed smiley rating
    And user click on the smiley
    And user enter message as "good"
    And user click on send button
    Then user verify that rating should be successfully submitted along with the feedback
    And user click on mat icon
    And user click on logout
    And again Login with same user name "sid25@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And dashboard window get display
    Then should display the previous rating and relevant smiley icon should be highlighted by default
    
    @Feedback6
    Scenario: To Verify the Send button present on the Share your feedback pop-up is disabled by default
      Given navigate to URL "https://drysign-qa.exela.global/#/"
    When enter the user name as "sid25@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on the smiley
    And user get display pop up 
    Then send button present on the pop up is by default disabled
    
    @Feedback7
    Scenario: To verify send button functionality when comment is not entered.
      Given navigate to URL "https://drysign-qa.exela.global/#/"
    When enter the user name as "sid25@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on the smiley
    And user get display pop up 
    And user click on send button without entering text
    Then error message get display as "Please enter a message."
    
    
    
