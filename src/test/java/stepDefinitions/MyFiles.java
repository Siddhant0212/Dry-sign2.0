package stepDefinitions;

import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.USAMobileNoMandateObject;

public class MyFiles {
	

@When("user click on My Files")
public void user_click_on_My_Files() {
	
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnMyFiles);
	Elements.click(USAMobileNoMandateObject.clickOnMyFiles);
  
}

@When("user search data from the generic search functionality as {string}")
public void user_search_data_from_the_generic_search_functionality_as(String filename) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.searchBox);
	Elements.TypeText(USAMobileNoMandateObject.searchBox, filename);
	
    
}

@Then("user should get displayed relevant data successfully through partial or fully searched")
public void user_should_get_displayed_relevant_data_successfully_through_partial_or_fully_searched() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.genricAction);
	Elements.isDisplayed(USAMobileNoMandateObject.genricAction);
}
@When("user enter subject in subject column filter as {string}")
public void user_enter_subject_in_subject_column_filter_as(String subject) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.subjectColumn);
	Elements.TypeText(USAMobileNoMandateObject.subjectColumn, subject);
 
}
@When("user enter sign type as  {string}")
public void user_enter_sign_type_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Sign_Type);
	Elements.TypeText(USAMobileNoMandateObject.Sign_Type, string);
    
}

@When("user enter completed date as {string}")
public void user_enter_completed_date_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Completed_Date);
	Elements.TypeText(USAMobileNoMandateObject.Completed_Date, string);
	
}

@When("user enter document name in document name column filter as {string}")
public void user_enter_document_name_in_document_name_column_filter_as(String documentname) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.documentName);
	Elements.TypeText(USAMobileNoMandateObject.documentName, documentname);
 
}

@When("user enter assigned date in assigned date column filter as {string}")
public void user_enter_assigned_date_in_assigned_date_column_filter_as(String assigneddate) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.assignedDate);
	Elements.TypeText(USAMobileNoMandateObject.assignedDate, assigneddate);
   
}

@When("user enter name in requested by column filter as {string}")
public void user_enter_name_in_requested_by_column_filter_as(String requestedby) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.requestedBy);
	Elements.TypeText(USAMobileNoMandateObject.requestedBy, requestedby);
  
}

@When("user should get display the correct searched data for every column")
public void user_should_get_display_the_correct_searched_data_for_every_column() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.totalColumnData);
	Elements.isDisplayed(USAMobileNoMandateObject.totalColumnData);
	
}

@When("user click on rejected tab")
public void user_click_on_rejected_tab() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.tabRejected);
	Elements.jclick(USAMobileNoMandateObject.tabRejected);
    
}

@When("user click on signed tab")
public void user_click_on_signed_tab() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.tabSigned);
	Elements.jclick(USAMobileNoMandateObject.tabSigned);
	
}

@When("user click on View icon under Action column")
public void user_click_on_View_icon_under_Action_column() {

	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.iconView);
	Elements.click(USAMobileNoMandateObject.iconView);
    
}

@Then("user get display document rejected")
public void user_get_display_document_rejected() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.viewRejectedDoc);
	Elements.isDisplayed(USAMobileNoMandateObject.viewRejectedDoc);
	
    
}

@Then("user click on Close icon")
public void user_click_on_Close_icon() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickCloseIcon);
	Elements.click(USAMobileNoMandateObject.clickCloseIcon);
}

@When("user click on Download icon")
public void user_click_on_Download_icon() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.cloudDownload);
	Elements.click(USAMobileNoMandateObject.cloudDownload);
 
}

@Then("Document should get downloaded on local storage")
public void document_should_get_downloaded_on_local_storage() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.downloadDocDisplay);
	Elements.isDisplayed(USAMobileNoMandateObject.downloadDocDisplay);
    
}

@When("user click on plus icon")
public void user_click_on_plus_icon() throws InterruptedException {
	Thread.sleep(2000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.iconPlus);
	Elements.jclick(USAMobileNoMandateObject.iconPlus);
}

@Then("the details of the rejected document should be displayed")
public void the_details_of_the_rejected_document_should_be_displayed() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.detailsRejected);
	Elements.isDisplayed(USAMobileNoMandateObject.detailsRejected);
	
}
@When("user click on drafts tab")
public void user_click_on_drafts_tab() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.tabDrafts);
	Elements.jclick(USAMobileNoMandateObject.tabDrafts);

}

@When("user click on Delete icon under Action column")
public void user_click_on_Delete_icon_under_Action_column() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.iconDelete);
	Elements.jclick(USAMobileNoMandateObject.iconDelete);
    
}

@Then("user should get displayed pop up")
public void user_should_get_displayed_pop_up() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.popUpDelete);
	Elements.isDisplayed(USAMobileNoMandateObject.popUpDelete);
    
}

@Then("pop should contain confirm and cancel button")
public void pop_should_contain_confirm_and_cancel_button() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.popUpDeleteConfirm);
	Elements.isDisplayed(USAMobileNoMandateObject.popUpDeleteConfirm);
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.popUpDeleteCancel);
	Elements.isDisplayed(USAMobileNoMandateObject.popUpDeleteCancel);
    
}

@When("user click in confirm button")
public void user_click_in_confirm_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.popUpDeleteConfirm);
	Elements.jclick(USAMobileNoMandateObject.popUpDeleteConfirm);
	
   
}



@Then("user should be displayed message as deleted successfully")
public void user_should_be_displayed_message_as_deleted_successfully() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.msgDeletedSuccessfully);
	Elements.isDisplayed(USAMobileNoMandateObject.msgDeletedSuccessfully);
	 Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.msgDeletedSuccessfully),"Successfully deleted");  
   
}

@Then("user click on Edit icon to view Self sign or Group sign")
public void user_click_on_Edit_icon_to_view_Self_sign_Group_sign() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.iconEdit);
	Elements.click(USAMobileNoMandateObject.iconEdit);
    
}

@Then("user should get redirect to same screen")
public void user_should_get_redirect_to_same_screen() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.redirectScreen);
	Elements.isDisplayed(USAMobileNoMandateObject.redirectScreen);
	
}
@When("user click on completed documents tab")
public void user_click_on_completed_documents_tab() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.tabCompletedDocument);
	Elements.jclick(USAMobileNoMandateObject.tabCompletedDocument);
	
}
@When("user should get display document")
public void user_should_get_display_document() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.docCompleted);
	Elements.isDisplayed(USAMobileNoMandateObject.docCompleted);
}
@When("user click on Email icon for Completed Documents")
public void user_click_on_Email_icon_for_Completed_Documents() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailOutline);
	Elements.click(USAMobileNoMandateObject.mailOutline);
}
@Then("pop up get displayed")
public void pop_up_get_displayed() throws InterruptedException {
	Elements.switchToChild();
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.sendEmailPopUp);
	Elements.isDisplayed(USAMobileNoMandateObject.sendEmailPopUp);
}
@When("user enter recipient email address as {string}")
public void user_enter_recipient_email_address_as(String emailadd) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.recipientEmailAddress);
	Elements.jTypeText(USAMobileNoMandateObject.recipientEmailAddress, emailadd);
}
@Then("user enter CC email address as {string}")
public void user_enter_CC_email_address_as(String ccemail) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.cCEmail);
	Elements.jTypeText(USAMobileNoMandateObject.cCEmail, ccemail);
	
}
@When("user enter add subject as {string}")
public void user_enter_add_subject_as(String sign) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.addSubject);
	Elements.jTypeText(USAMobileNoMandateObject.addSubject, sign);
}
@When("user enter Message {string}")
public void user_enter_Message(String grpsign) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.msgBox);
	Elements.jTypeText(USAMobileNoMandateObject.msgBox, grpsign);
	
}
@When("user click on Send button")
public void user_click_on_Send_button() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.btnSend);
	Elements.click(USAMobileNoMandateObject.btnSend);
}
@Then("user should get success message as Email successfully sent")
public void user_should_get_success_message_as_Email_successfully_sent() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.successfullyMailSent);
	Elements.isDisplayed(USAMobileNoMandateObject.successfullyMailSent);
}
@When("user check received email on user side whose email id is entered")
public void user_check_received_email_on_user_side_whose_email_id_is_entered() {
	
}
}
