package stepDefinitions;

import java.io.IOException;
import java.util.Map;

import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

import framework.Elements;
import framework.GenericActions;
import framework.Waits;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.FeedbackRatingObject;
import pageObjects.MyFilesObject;
import pageObjects.USAMobileNoMandateObject;
import util.Xls_Reader;

public class MyFiles {
	

@When("user click on My Files")
public void user_click_on_My_Files() throws InterruptedException {
	Thread.sleep(10000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnMyFiles);
	Elements.jclick(USAMobileNoMandateObject.clickOnMyFiles);
  
}

@When("user search data from the generic search functionality as {string}")
public void user_search_data_from_the_generic_search_functionality_as(String filename) {
	Waits.waitUntilElementLocated(30, MyFilesObject.Subject_Search);
	Elements.TypeText(MyFilesObject.Subject_Search, filename);
	
    
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
public void user_click_on_Download_icon() throws IOException, SAXException, TikaException {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.cloudDownload);
	Elements.click(USAMobileNoMandateObject.cloudDownload);
	
	  String content=Elements.readPDFInURL();
      if (content.contains("Sid")) {
    	 Assert.assertTrue(true); 
      } else {
    	  Assert.assertTrue(false); 
      }
	
 
}

@Then("Document should get downloaded on local storage as {string}")
public void document_should_get_downloaded_on_local_storage_as(String string) throws InterruptedException, IOException, SAXException, TikaException {
	  Thread.sleep(10000);
      Assert.assertTrue(Elements.isFileDownloaded(string));;
      
      
      String content=Elements.readPDFInURL();
      if (content.contains("Sid")) {
    	 Assert.assertTrue(true); 
      } else {
    	  Assert.assertTrue(false); 
      }
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
@Then("user Click on Dashboard")
public void user_Click_on_Dashboard() throws InterruptedException {
	Thread.sleep(5000);
	//Elements.switchToChild();
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.dashboard2);
	Elements.jclick(USAMobileNoMandateObject.dashboard2);
	
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

@Then("user should get displayed pop up as {string}")
public void user_should_get_displayed_pop_up_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.popUpDelete);
	Elements.isDisplayed(USAMobileNoMandateObject.popUpDelete);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.popUpDelete),string);
    
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
public void user_enter_recipient_email_address_as(String emailadd) throws InterruptedException {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.recipientEmailAddress);
	Elements.jTypeText(USAMobileNoMandateObject.recipientEmailAddress, emailadd);
	Thread.sleep(2000);
}
@Then("user enter CC email address as {string}")
public void user_enter_CC_email_address_as(String ccemail) throws InterruptedException {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.cCEmail);
	Elements.jTypeText(USAMobileNoMandateObject.cCEmail, ccemail);
	Thread.sleep(2000);
}
@When("user enter add subject as {string}")
public void user_enter_add_subject_as(String sign) throws InterruptedException {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.addSubject);
	Elements.jTypeText(USAMobileNoMandateObject.addSubject, sign);
	Thread.sleep(2000);
}
@When("user enter Message {string}")
public void user_enter_Message(String grpsign) throws InterruptedException {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.msgBox);
	Elements.jTypeText(USAMobileNoMandateObject.msgBox, grpsign);
	Thread.sleep(2000);
	
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
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.msgDeletedSuccessfully),"Successfully Mail Sent"); 
}
@Then("user Enter email as {string}")
public void user_Enter_email_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
	Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid103");
	
}
@Then("click on the download link")
public void click_on_the_download_link() throws InterruptedException {
	Thread.sleep(5000);
	Elements.switchToChild();
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.btnSend);
	Elements.jclick(USAMobileNoMandateObject.btnSend);
	
}
@Then("user is able to click on pending tab")
public void user_is_able_to_click_on_pending_tab() {
	Waits.waitUntilElementToClick(30, MyFilesObject.Pending);
	Elements.jclick(MyFilesObject.Pending);
  
}

@Then("user is able to click on Signed tab")
public void user_is_able_to_click_on_Signed_tab() {
	Waits.waitUntilElementToClick(30, MyFilesObject.Signed);
	Elements.jclick(MyFilesObject.Signed);
	
}
@Then("user get display pending tab")
public void user_get_display_pending_tab() throws InterruptedException {
	Waits.waitUntilElementLocated(30, MyFilesObject.Pending);
	Elements.isDisplayed(MyFilesObject.Pending);
	Thread.sleep(5000);
    
}

@Then("user display subject")
public void user_display_subject() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Subject);
	Elements.isDisplayed(MyFilesObject.Subject);
    
}

@Then("user display document name")
public void user_display_document_name() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Document_Name);
	Elements.isDisplayed(MyFilesObject.Document_Name);
    
}

@Then("user display assigned date")
public void user_display_assigned_date() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Assigned_Date);
	Elements.isDisplayed(MyFilesObject.Assigned_Date);
    
	Waits.waitUntilElementLocated(30, MyFilesObject.TimingSign);
	Elements.isDisplayed(MyFilesObject.TimingSign);
}

@Then("user display requested by")
public void user_display_requested_by() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Requested_By);
	Elements.isDisplayed(MyFilesObject.Requested_By);
    
}

@Then("user display action")
public void user_display_action() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Action);
	Elements.isDisplayed(MyFilesObject.Action);
	
}
@Then("user click on action link")
public void user_click_on_action_link() throws InterruptedException {
	Thread.sleep(1000);
	Waits.waitUntilElementToClick(30, MyFilesObject.sign);
	Elements.click(MyFilesObject.sign);    
}

@Then("document should get display")
public void document_should_get_display() throws InterruptedException {
	Thread.sleep(2000);
	Elements.switchToFrame(MyFilesObject.iframe);
	Waits.waitUntilElementLocated(30, MyFilesObject.Doc_Display);
	Elements.isDisplayed(MyFilesObject.Doc_Display);
	
}
@Then("document should present in pending tab")
public void document_should_present_in_pending_tab() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Doc_Present);
	Elements.isDisplayed(MyFilesObject.Doc_Present);
	
}
@Then("user display Assigned Date")
public void user_display_Assigned_Date() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Assigned_Date);
	Elements.isDisplayed(MyFilesObject.Assigned_Date);
//	Elements.VerifyTextEquals(MyFilesObject.TimingSign," 08/17/2022 1:07:58 AM ");
//	Assert.assertEquals(Elements.getText(MyFilesObject.TimingSign)," 08/17/2022 1:07:58 AM"); 
}
@Then("date display in format as {string}")
public void date_display_in_format_as(String string) {
	
	Waits.waitUntilElementLocated(30, MyFilesObject.TimingSign);
	Elements.isDisplayed(MyFilesObject.TimingSign);
	Assert.assertEquals(Elements.getText(MyFilesObject.TimingSign),"08/17/2022 1:07:58 AM");
}
@Then("date Display in format as {string}")
public void date_Display_in_format_as(String string) {
	Waits.waitUntilElementLocated(30, MyFilesObject.TimingSign1);
	Elements.isDisplayed(MyFilesObject.TimingSign1);
	Assert.assertEquals(Elements.getText(MyFilesObject.TimingSign1),"08/17/2022 12:01:58 AM");
	
}

@Then("user display Completed Date")
public void user_display_Completed_Date() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Completed_Date);
	Elements.isDisplayed(MyFilesObject.Completed_Date);
   
}

@Then("user display date in format as {string}")
public void user_display_date_in_format_as(String string) {
	Waits.waitUntilElementLocated(30, MyFilesObject.TimingSign3);
	Elements.isDisplayed(MyFilesObject.TimingSign3);
	Assert.assertEquals(Elements.getText(MyFilesObject.TimingSign3),"08/09/2022 2:59:02 AM");
	
}
@Then("user click on out for signature tab")
public void user_click_on_out_for_signature_tab() throws InterruptedException {
	Thread.sleep(10000);
	
	Waits.waitUntilElementToClick(30, MyFilesObject.OutforSignature);
	Elements.jclick(MyFilesObject.OutforSignature);
   
}

@Then("user Display date in format as {string}")
public void user_Display_date_in_format_as(String string) {
	Waits.waitUntilElementLocated(30, MyFilesObject.TimingSign4);
	Elements.isDisplayed(MyFilesObject.TimingSign4);
	Assert.assertEquals(Elements.getText(MyFilesObject.TimingSign4),"08/24/2022 2:55:23 AM");
	
}
@Then("user display Date&Time")
public void user_display_Date_Time() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Date_Time);
	Elements.isDisplayed(MyFilesObject.Date_Time);
    
}

@Then("user Display Date in format as {string}")
public void user_Display_Date_in_format_as(String string) {
	Waits.waitUntilElementLocated(30, MyFilesObject.TimingSign5);
	Elements.isDisplayed(MyFilesObject.TimingSign5);
	Assert.assertEquals(Elements.getText(MyFilesObject.TimingSign5),"08/16/2022, 11:24:02 AM");
}
@Then("user Display Date in Format as {string}")
public void user_Display_Date_in_Format_as(String string) {
	Waits.waitUntilElementLocated(30, MyFilesObject.TimingSign6);
	Elements.isDisplayed(MyFilesObject.TimingSign6);
	Assert.assertEquals(Elements.getText(MyFilesObject.TimingSign6),"08/16/2022 11:06:55 AM");
}
@Then("details get display")
public void details_get_display(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
		Thread.sleep(5000);
		
		Waits.waitUntilElementLocated(30, MyFilesObject.DetailsField("Envelope Id:"));
		Elements.isDisplayed(MyFilesObject.DetailsField("Envelope Id:"));

		Waits.waitUntilElementLocated(30, MyFilesObject.DetailsField("Document Name:"));
		Elements.isDisplayed(MyFilesObject.DetailsField("Below Average"));

		Waits.waitUntilElementLocated(30, MyFilesObject.DetailsField("Requested By:"));
		Elements.isDisplayed(MyFilesObject.DetailsField("Requested By:"));

		Waits.waitUntilElementLocated(30, MyFilesObject.DetailsField("Signatories:"));
		Elements.isDisplayed(MyFilesObject.DetailsField("Signatories:"));
		
		Waits.waitUntilElementLocated(30, MyFilesObject.DetailsField("Subject:"));
		Elements.isDisplayed(MyFilesObject.DetailsField("Subject:"));
		
		Waits.waitUntilElementLocated(30, MyFilesObject.DetailsField("Message:"));
		Elements.isDisplayed(MyFilesObject.DetailsField("Message:"));
	}
	
}
@Then("user clicking on minus icon recorded details should get closed")
public void user_clicking_on_minus_icon_recorded_details_should_get_closed() throws InterruptedException {
	Waits.waitUntilElementToClick(30, MyFilesObject.minusicon);
	Elements.click(MyFilesObject.minusicon);
	Thread.sleep(2000);
}
@When("user click on another details plus icon")
public void user_click_on_another_details_plus_icon() {
	Waits.waitUntilElementToClick(30, MyFilesObject.plusIcon1);
	Elements.click(MyFilesObject.plusIcon1);
	
   
}

@Then("new details get display")
public void new_details_get_display(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
		Thread.sleep(5000);
		
		Waits.waitUntilElementLocated(30, MyFilesObject.DetailsField1("Envelope Id:"));
		Elements.isDisplayed(MyFilesObject.DetailsField1("Envelope Id:"));

		Waits.waitUntilElementLocated(30, MyFilesObject.DetailsField1("Document Name:"));
		Elements.isDisplayed(MyFilesObject.DetailsField1("Below Average"));

		Waits.waitUntilElementLocated(30, MyFilesObject.DetailsField1("Requested By:"));
		Elements.isDisplayed(MyFilesObject.DetailsField1("Requested By:"));

		Waits.waitUntilElementLocated(30, MyFilesObject.DetailsField1("Signatories:"));
		Elements.isDisplayed(MyFilesObject.DetailsField1("Signatories:"));
		
		Waits.waitUntilElementLocated(30, MyFilesObject.DetailsField1("Subject:"));
		Elements.isDisplayed(MyFilesObject.DetailsField1("Subject:"));
		
		Waits.waitUntilElementLocated(30, MyFilesObject.DetailsField1("Message:"));
		Elements.isDisplayed(MyFilesObject.DetailsField1("Message:"));
	
	
}
}
	@Then("click in reassign")
	public void click_in_reassign() {
		Waits.waitUntilElementToClick(30, MyFilesObject.Reassign);
		Elements.click(MyFilesObject.Reassign);
	}

	@Then("pop up get Display as {string}")
	public void pop_up_get_Display_as(String string) {
		Waits.waitUntilElementLocated(30, MyFilesObject.Are_you_sure_you_want);
		Elements.isDisplayed(MyFilesObject.Are_you_sure_you_want);
		Assert.assertEquals(Elements.getText(MyFilesObject.Are_you_sure_you_want),string);
	
	}

	@Then("user click on {string} button")
	public void user_click_on_button(String string) {
		Waits.waitUntilElementToClick(30, MyFilesObject.Yes);
		Elements.click(MyFilesObject.Yes);
	}

	@Then("another pop get display as {string}")
	public void another_pop_get_display_as(String string) {
		Waits.waitUntilElementLocated(30, MyFilesObject.Reassign1);
		Elements.isDisplayed(MyFilesObject.Reassign1);
		//Assert.assertEquals(Elements.getText(MyFilesObject.Reassign1),string);
		
	}
	@Then("enter name as {string}")
	public void enter_name_as(String name) {
		Waits.waitUntilElementLocated(30, MyFilesObject.Enter_Name);
		Elements.TypeText(MyFilesObject.Enter_Name, name);
	}

	@Then("enter email Address as {string}")
	public void enter_email_Address_as(String emailaddress) {
		Waits.waitUntilElementLocated(30, MyFilesObject.Email_Address);
		Elements.TypeText(MyFilesObject.Email_Address, emailaddress);
		
	}
	@Then("user click on {string}Button")
	public void user_click_on_Button(String string) {
		Waits.waitUntilElementToClick(30, MyFilesObject.Confirm);
		Elements.click(MyFilesObject.Confirm);
	}

	@Then("validation message get display as {string}")
	public void validation_message_get_display_as(String string) {
		Waits.waitUntilElementLocated(30, MyFilesObject.This_email_addressal_ready_exists);
		Elements.isDisplayed(MyFilesObject.This_email_addressal_ready_exists);
		Assert.assertEquals(Elements.getText(MyFilesObject.This_email_addressal_ready_exists),string);
}
	@Then("user click on View icon")
	public void user_click_on_View_icon() {
		Waits.waitUntilElementToClick(30, MyFilesObject.iconView);
		Elements.click(MyFilesObject.iconView);
		
	}
	
	@Then("Document should get display")
	public void Document_should_get_display() {
		Waits.waitUntilElementLocated(30, MyFilesObject.Doc_Display1);
		Elements.isDisplayed(MyFilesObject.Doc_Display1);
		

}
	@Then("user click on close icon")
	public void user_click_on_close_icon() {
		Waits.waitUntilElementToClick(30, MyFilesObject.closeIcon);
		Elements.jclick(MyFilesObject.closeIcon);
		
		
	}

@Then("user display Sign Type")
public void user_display_Sign_Type() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Sign_Type);
	Elements.isDisplayed(MyFilesObject.Sign_Type);
}
@Then("user click on mail icon")
public void user_click_on_mail_icon() {
	Waits.waitUntilElementToClick(30, MyFilesObject.mail_outline);
	Elements.isDisplayed(MyFilesObject.mail_outline);
	
}
@Then("user display Document Name")
public void user_display_Document_Name() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Document_Name);
	Elements.isDisplayed(MyFilesObject.Document_Name);
	
}
@Then("user display title")
public void user_display_title() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Title);
	Elements.isDisplayed(MyFilesObject.Title);
	
}
@Then("user display Rejected Date")
public void user_display_Rejected_Date() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Rejected_Date);
	Elements.isDisplayed(MyFilesObject.Rejected_Date);
}

@Then("user display Rejected By")
public void user_display_Rejected_By() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Rejected_By);
	Elements.isDisplayed(MyFilesObject.Rejected_By);
	
}
@Then("Previous and next icon should get display")
public void previous_and_next_icon_should_get_display() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Previous);
	Elements.isDisplayed(MyFilesObject.Previous);
}

@Then("page numeric value display next to the previous icon")
public void page_numeric_value_display_next_to_the_previous_icon() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Next);
	Elements.isDisplayed(MyFilesObject.Next);
}

@Then("page default value is one")
public void page_default_value_is_one() {
	Waits.waitUntilElementLocated(30, MyFilesObject.Default_one);
	Elements.isDisplayed(MyFilesObject.Default_one);
	Assert.assertEquals(Elements.getText(MyFilesObject.Default_one),"1");
}
@Then("default page should be first as {string}")
public void default_page_should_be_first_as(String string) {
	Waits.waitUntilElementLocated(30, MyFilesObject.Displaying_item);
	Elements.isDisplayed(MyFilesObject.Displaying_item);
	Assert.assertEquals(Elements.getText(MyFilesObject.Displaying_item),string);
    
}

@Then("on first page previous arrow icon should be disabled")
public void on_first_page_previous_arrow_icon_should_be_disabled() {
	Waits.waitUntilElementToClick(30, MyFilesObject.Previous);
	Elements.isEnabled(MyFilesObject.Previous);
  
}

@Then("on last page next arror icon should be disabled")
public void on_last_page_next_arror_icon_should_be_disabled() {
	Waits.waitUntilElementToClick(30, MyFilesObject.Next);
	Elements.isEnabled(MyFilesObject.Next);
	
}
@Then("user click on upward arrow")
public void user_click_on_upward_arrow() throws InterruptedException {
	Thread.sleep(2000);
	Waits.waitUntilElementToClick(30, MyFilesObject.Arrow_drop_up);
	Elements.jclick(MyFilesObject.Arrow_drop_up);
}

		
		@Then("Display ascending order")
		public void display_ascending_order(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
				Thread.sleep(5000);
				
				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Ds5050 Test"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Ds5050 Test"));

				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Ds5050 Test"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Ds5050 Test"));

				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Sid Ingole"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Sid Ingole"));

				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Sid Ingole"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Sid Ingole"));
				
				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Sid Ingole"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Sid Ingole"));
				

				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Sidd Ing"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Sidd Ing"));
				
				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Sidd Ing"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Sidd Ing"));
			
		}
}
		@Then("user click on downward arrow")
		public void user_click_on_downward_arrow() {
			Waits.waitUntilElementToClick(30, MyFilesObject.Arrow_drop_down);
			Elements.jclick(MyFilesObject.Arrow_drop_down);
			
		}
		
		@Then("Display descending order")
		public void display_descending_order(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
				Thread.sleep(5000);
				
				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Sidd Ing"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Sidd Ing"));
				
				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Sidd Ing"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Sidd Ing"));
				
				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Sid Ingole"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Sid Ingole"));

				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Sid Ingole"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Sid Ingole"));
				
				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Sid Ingole"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Sid Ingole"));
				
				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Ds5050 Test"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Ds5050 Test"));

				Waits.waitUntilElementLocated(30, MyFilesObject.Ascedingorder("Ds5050 Test"));
				Elements.isDisplayed(MyFilesObject.Ascedingorder("Ds5050 Test"));
				
		}
		
			
		}
		@Then("user search data into document name as {string}")
		public void user_search_data_into_document_name_as(String string) throws InterruptedException {
			Thread.sleep(2000);
			Waits.waitUntilElementLocated(30, MyFilesObject.Subject_Search2);
			Elements.TypeText(MyFilesObject.Subject_Search2, string);
		}
		
		@Then("user search data into assigned date as {string}")
		public void user_search_data_into_assigned_date_as(String string) throws InterruptedException {
			Thread.sleep(2000);
			Waits.waitUntilElementLocated(30, MyFilesObject.Subject_Search3);
			Elements.TypeText(MyFilesObject.Subject_Search3, string);
			
		}
		@Then("user search data into requested by as {string}")
		public void user_search_data_into_requested_by_as(String string) throws InterruptedException {
			Thread.sleep(2000);
			Waits.waitUntilElementLocated(30, MyFilesObject.Subject_Search4);
			Elements.TypeText(MyFilesObject.Subject_Search4, string);
			
		}
		@Then("user get display status as {string}")
		public void user_get_display_status_as(String string) {
			Waits.waitUntilElementLocated(30, MyFilesObject.Pending_Status);
			Elements.isDisplayed(MyFilesObject.Pending_Status);
			Assert.assertEquals(Elements.getText(MyFilesObject.Pending_Status),string);
			
		}
		@Then("user click on info icon")
		public void user_click_on_info_icon() throws InterruptedException {
			Thread.sleep(2000);
			Waits.waitUntilElementToClick(30, MyFilesObject.Info);
			Elements.click(MyFilesObject.Info);
		}

		@Then("Pop up get display as {string} and recent added get display")
		public void pop_up_get_display_as_and_recent_added_get_display(String string) throws InterruptedException {
			Thread.sleep(5000);
			Waits.waitUntilElementLocated(30, MyFilesObject.Recent_Action);
			Elements.isDisplayed(MyFilesObject.Recent_Action);
			//Assert.assertEquals(Elements.getText(MyFilesObject.Recent_Action),string);
			
			Waits.waitUntilElementLocated(30, MyFilesObject.Records);
			Elements.isDisplayed(MyFilesObject.Records);
			
			Waits.waitUntilElementToClick(30, MyFilesObject.Close);
			Elements.click(MyFilesObject.Close);
			
			
			
		}
		@Then("user click on notify icon")
		public void user_click_on_notify_icon() {
			Waits.waitUntilElementToClick(30, MyFilesObject.Notify);
			Elements.click(MyFilesObject.Notify);
			
		}
		@Then("success message get display as {string}")
		public void success_message_get_display_as(String string) {
			Waits.waitUntilElementLocated(30, MyFilesObject.Succesfull_Text);
			Elements.isDisplayed(MyFilesObject.Succesfull_Text);
			//Assert.assertEquals(Elements.getText(MyFilesObject.Succesfull_Text),string);
		}
		@Then("user click on remove icon")
		public void user_click_on_remove_icon() {
			Waits.waitUntilElementToClick(30, MyFilesObject.Remove);
			Elements.click(MyFilesObject.Remove);
		 
		}

		@Then("user click on confirm")
		public void user_click_on_confirm() {
			Waits.waitUntilElementToClick(30, MyFilesObject.Confirm);
			Elements.click(MyFilesObject.Confirm);
			
		}
		@Then("succefully remove message display as {string}")
		public void succefully_remove_message_display_as(String string) {
			Waits.waitUntilElementLocated(30, MyFilesObject.Succesfull_Text);
			Elements.isDisplayed(MyFilesObject.Succesfull_Text);
		}

		@Then("click OK button")
		public void click_OK_button() {
			Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.tabSecurityOk);
			Elements.click(USAMobileNoMandateObject.tabSecurityOk);
			
		}
		@Then("Document should get downloaded on Local storage as {string}")
		public void document_should_get_downloaded_on_Local_storage_as(String string) throws InterruptedException {
			Thread.sleep(10000);
		      Assert.assertTrue(Elements.isFileDownloaded(string));;
		}
		@Then("details get Display")
		public void details_get_Display(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
				Thread.sleep(5000);
				
				Waits.waitUntilElementLocated(30, MyFilesObject.Rejectedorder("Signatories:"));
				Elements.isDisplayed(MyFilesObject.Rejectedorder("Signatories:"));

				Waits.waitUntilElementLocated(30, MyFilesObject.Rejectedorder("Message:"));
				Elements.isDisplayed(MyFilesObject.Rejectedorder("Message:"));

				Waits.waitUntilElementLocated(30, MyFilesObject.Rejectedorder("Rejected Comment:"));
				Elements.isDisplayed(MyFilesObject.Rejectedorder("Rejected Comment:"));
		}
			
		}
}


