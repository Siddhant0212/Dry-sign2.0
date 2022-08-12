Feature: To Verify Various File Formats for SS,GS,Template

  @Multiple
  Scenario: To Verify Free user, Paid user, enterprise user is able to upload the multiple file formats to Group Sign, Self Sign, and template within Drysign application
    Given navigate to URL "https://drysign-qa.exela.global/#/"
    When enter the user name as "sid25@mailinator.com"
    When enter the password as"Malin@555"
    And user click on the sign in button
    And user click on continue with free version
    And user click on the self sign
    When user click on browser and upload "small.pdf"
    #Then user verify that all type of file format should be uploaded
    #Then user should get displayed message as file uploaded successfully

