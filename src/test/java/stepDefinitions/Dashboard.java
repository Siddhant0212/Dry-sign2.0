package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseinit.Base;
import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.DashboardObject;
import pageObjects.FeedbackRatingObject;
import pageObjects.MyFilesObject;
import pageObjects.USAMobileNoMandateObject;


public class Dashboard {
	
	

	@When("user click on terms and conditions")
	public void user_click_on_terms_and_conditions() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.termsAndConditions);
		Elements.jclick(USAMobileNoMandateObject.termsAndConditions);
	    
	}

	@When("user click on here link")
	public void user_click_on_here_link() throws InterruptedException {
		Elements.switchToChild();
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnHerelink);
		Elements.jclick(USAMobileNoMandateObject.clickOnHerelink);
		 
		
		
		
	
	}
	@Then("user should get display refund page")
	public void user_should_get_display_refund_page() {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.refundPage);
		Elements.isDisplayed(USAMobileNoMandateObject.refundPage);
		
	}
	@Then("user enter name as {string}")
	public void user_enter_name_as(String name) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entName);
		Elements.TypeText(USAMobileNoMandateObject.entName, name);
		
	  
	}

	@Then("user enter emai id as {string}")
	public void user_enter_emai_id_as(String emailid) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entEmailId);
		Elements.TypeText(USAMobileNoMandateObject.entEmailId, emailid);
	   
	}

	@Then("user enter subscription plan as {string}")
	public void user_enter_subscription_plan_as(String plan) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entSubscriptionPlan);
		Elements.TypeText(USAMobileNoMandateObject.entSubscriptionPlan, plan);
	    
	}

	@Then("user enter subscription id as {string}")
	public void user_enter_subscription_id_as(String id) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entSubscriptionId);
		Elements.TypeText(USAMobileNoMandateObject.entSubscriptionId, id);
		
	}
	@Then("user click on confirm button")
	public void user_click_on_confirm_button() throws InterruptedException {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.confirmBtnOnRefund);
		Elements.jclick(USAMobileNoMandateObject.confirmBtnOnRefund);
		Thread.sleep(2000);
		
//		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Yoursubscriptioniscancelledsuccessfully);
//		Elements.isDisplayed(USAMobileNoMandateObject.Yoursubscriptioniscancelledsuccessfully);
//		Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.Yoursubscriptioniscancelledsuccessfully),"Your subscription is cancelled successfully. You can enjoy free version.");
		
	}

@Then("refund pop up get display")
public void refund_pop_up_get_display() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.refundPopUp);
	Elements.isDisplayed(USAMobileNoMandateObject.refundPopUp);
	
}



@Then("user click on confirm button which present on pop up")
public void user_click_on_confirm_button_which_present_on_pop_up() throws InterruptedException {
	Thread.sleep(2000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.confirmBtnOnPopUp);
	Elements.jclick(USAMobileNoMandateObject.confirmBtnOnPopUp);
}

@Then("user should get display message as your refund has been successful")
public void user_should_get_display_message_as_your_refund_has_been_successful() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.yourRefundHasBeenSuccessful);
	Elements.isDisplayed(USAMobileNoMandateObject.yourRefundHasBeenSuccessful);
    
}

@Then("click on ok button")
public void click_on_ok_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Ok_Btn);
	Elements.jclick(USAMobileNoMandateObject.Ok_Btn);
	
}

@Then("user click on drysign logo")
public void user_click_on_drysign_logo() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.drySignLogo);
	Elements.jclick(USAMobileNoMandateObject.drySignLogo);
	
 
}

@When("click on cancel subscription button")
public void click_on_cancel_subscription_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Cancel_Subscription);
	Elements.jclick(USAMobileNoMandateObject.Cancel_Subscription);
	
}




@Then("user get display Buy Now button")
public void user_get_display_Buy_Now_button() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Upgrade5);
	Elements.isDisplayed(USAMobileNoMandateObject.Upgrade5);
	
	}
@Then("user click on the Buy Now button")
public void user_click_on_the_Buy_Now_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.buyNowNoActivePlan);
	Elements.click(USAMobileNoMandateObject.buyNowNoActivePlan);
	
}
@Then("all the available plans should get displayed to purchase for the user")
public void all_the_available_plans_should_get_displayed_to_purchase_for_the_user() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.generalPlans);
	Elements.isDisplayed(USAMobileNoMandateObject.generalPlans);
	
}

@Then("Upgrade button should not display on dashboard to paid user as {string}")
public void upgrade_button_should_not_display_on_dashboard_to_paid_user_as(String string) {
	
	Waits.setImplicitWait(10);
	List<WebElement> tabs=USAMobileNoMandateObject.btnViewPlan1;

	if(tabs.size()>0) {
		Assert.assertTrue(false);
		
	}
	else {
		Assert.assertTrue(true);
	}
}
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.btnViewPlan);
//	Elements.isDisplayed(USAMobileNoMandateObject.btnViewPlan);
//	Assert.assertNotSame(Elements.getText(USAMobileNoMandateObject.btnViewPlan),string);


@Then("Upgrade button should be display on dashboard to paid user as {string}")
public void upgrade_button_should_be_display_on_dashboard_to_paid_user_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Upgrade5);
	Elements.isDisplayed(USAMobileNoMandateObject.Upgrade5);
	Assert.assertNotSame(Elements.getText(USAMobileNoMandateObject.Upgrade5),string);
}

@Then("user should display the correct document received count")
public void user_should_display_the_correct_document_received_count() {
	Waits.waitUntilElementLocated(30, DashboardObject.Documents_Received1);
	//Elements.isDisplayed(DashboardObject.Eight_Documents);
	Elements.isDisplayed(DashboardObject.Documents_Received);
	Assert.assertNotSame(Elements.getText(DashboardObject.Documents_Received)," Documents Received ");
}
@Then("following get Elements display")
public void following_get_Elements_display(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	
	for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
		Thread.sleep(5000);
		
		Waits.waitUntilElementLocated(30, DashboardObject.documentReceivedSent("Signed"));
		Elements.isDisplayed(DashboardObject.documentReceivedSent("Signed"));

		Waits.waitUntilElementLocated(30, DashboardObject.documentReceivedSent("Pending"));
		Elements.isDisplayed(DashboardObject.documentReceivedSent("Pending"));

		Waits.waitUntilElementLocated(30, DashboardObject.documentReceivedSent("Rejected"));
		Elements.isDisplayed(DashboardObject.documentReceivedSent("Rejected"));
	}
}
@Then("user should display the correct document sent count")
public void user_should_display_the_correct_document_sent_count() {
	Waits.waitUntilElementLocated(30, DashboardObject.Documents_Sent);
	Elements.isDisplayed(DashboardObject.Documents_Sent);
	Assert.assertNotSame(Elements.getText(DashboardObject.Documents_Sent),"Documents Sent");
	
//	Elements.isDisplayed(DashboardObject.Four_Documents);
//	Assert.assertNotSame(Elements.getText(DashboardObject.Documents_Sent),"4");

	
	
}
@Then("user click on self sign")
public void user_click_on_self_sign() throws InterruptedException {
	Thread.sleep(15000);
	Waits.waitUntilElementToClick(30,USAMobileNoMandateObject.selfSign);
	Elements.jclick(USAMobileNoMandateObject.selfSign);
	
}
@Then("User drag and drop the signature")
public void user_drag_and_drop_the_signature() throws InterruptedException {
	Waits.waitUntilElementLocated(30,DashboardObject.signature);
	Elements.dragAndDrop(DashboardObject.signature,DashboardObject.Page);
}
@Then("user display self sign and group sign and it should be clickable")
public void user_display_self_sign_and_group_sign_and_it_should_be_clickable() {
	//Waits.waitUntilElementLocated(30, DashboardObject.selfSign);
	Waits.waitUntilElementToClick(30,DashboardObject.selfSign );
	Elements.isDisplayed(DashboardObject.selfSign);
	
	
	//Waits.waitUntilElementLocated(30, DashboardObject.grpSignBtn);
	Waits.waitUntilElementToClick(30,DashboardObject.grpSignBtn );
	Elements.isDisplayed(DashboardObject.grpSignBtn);

}
@Then("Pop Up get displayed with Elements")
public void pop_Up_get_isplayed_with_Elements(io.cucumber.datatable.DataTable dataTable) {
	
	Waits.waitUntilElementLocated(30, DashboardObject.textField("Self Sign"));
	Elements.isDisplayed(DashboardObject.textField("Self Sign"));

	Waits.waitUntilElementLocated(30, DashboardObject.textField("Group Sign"));
	Elements.isDisplayed(DashboardObject.textField("Group Sign"));

	Waits.waitUntilElementLocated(30, DashboardObject.textField("Signature: Type,Draw and upload"));
	Elements.isDisplayed(DashboardObject.textField("Signature: Type,Draw and upload"));

	Waits.waitUntilElementLocated(30, DashboardObject.textField("Upload Pdf using Google Drive"));
	Elements.isDisplayed(DashboardObject.textField("Upload Pdf using Google Drive"));
	
	Waits.waitUntilElementLocated(30, DashboardObject.textField("Upload PDF using Dropbox"));
	Elements.isDisplayed(DashboardObject.textField("Upload PDF using Dropbox"));
	
	Waits.waitUntilElementLocated(30, DashboardObject.textField("Upload PDF using OneDrive"));
	Elements.isDisplayed(DashboardObject.textField("Upload PDF using OneDrive"));
	
	
}
@Then("user get display upgrade plan button")
public void user_get_display_upgrade_plan_button() {
	Waits.waitUntilElementLocated(30,DashboardObject.UpgradePlan );
	Elements.isDisplayed(DashboardObject.UpgradePlan);
}
@Then("user click on Signature edit")
public void user_click_on_Signature_edit() {
	Waits.waitUntilElementToClick(30,DashboardObject.Signature);
	Elements.click(DashboardObject.Signature);
}
@Then("user click Save button")
public void user_click_Save_button() {
	Waits.waitUntilElementToClick(30,DashboardObject.Save_Btn);
	Elements.click(DashboardObject.Save_Btn);
}
@Then("message get display as {string}")
public void message_get_display_as(String string) {
	Waits.waitUntilElementLocated(30,DashboardObject.Signature_saved);
	Elements.click(DashboardObject.Signature_saved);
	Assert.assertEquals(Elements.getText(DashboardObject.Signature_saved),string);
}
@Then("user click on upload")
public void user_click_on_upload() throws InterruptedException {
	
	Waits.waitUntilElementToClick(30,DashboardObject.Upload_Button);
	Elements.jclick(DashboardObject.Upload_Button);
}
@Then("Error message get display as {string}")
public void error_message_get_display_as(String string) throws InterruptedException {
	//Thread.sleep(10000);
	Waits.waitUntilElementLocated(30,DashboardObject.Filesizeexceedsthemaximum);
	Elements.isDisplayed(DashboardObject.Filesizeexceedsthemaximum);
	Assert.assertEquals(Elements.getText(DashboardObject.Filesizeexceedsthemaximum),string);
}

@Then("user click on View Details button")
public void user_click_on_View_Details_button() throws InterruptedException {
	Thread.sleep(5000);
	Elements.scrollIntoView(DashboardObject.View_Details);
	Waits.waitUntilElementToClick(30, DashboardObject.View_Details);
	Elements.jclick(DashboardObject.View_Details);
}

@Then("user click on Cancel Button")
public void user_click_on_Cancel_Button() throws InterruptedException {
	Thread.sleep(2000);
	Waits.waitUntilElementToClick(30, DashboardObject.Cancel);
	Elements.jclick(DashboardObject.Cancel);
}
@Then("new plan details and its related features should get Displayed")
public void new_plan_details_and_its_related_features_should_get_Displayed(io.cucumber.datatable.DataTable dataTable) {
//	Waits.waitUntilElementLocated(30, DashboardObject.newField("600"));
//	Elements.isDisplayed(DashboardObject.newField("600"));

	
}
@Then("user should get display plans")
public void user_should_get_display_plans(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
		Thread.sleep(5000);
		
		Waits.waitUntilElementLocated(30, DashboardObject.Plans("Individual"));
		Elements.isDisplayed(DashboardObject.Plans("Individual"));

		Waits.waitUntilElementLocated(30, DashboardObject.Plans("Professional"));
		Elements.isDisplayed(DashboardObject.Plans("Professional"));

		Waits.waitUntilElementLocated(30, DashboardObject.Plans("Premium"));
		Elements.isDisplayed(DashboardObject.Plans("Premium"));
	}
	
}
@When("user Enter First Name as {string}")
public void user_Enter_First_Name_as(String string) {
	Elements.scrollIntoView(DashboardObject.entFirstName);
	Waits.waitUntilElementLocated(30, DashboardObject.entFirstName);
	Elements.TypeText(DashboardObject.entFirstName, string);
}

@When("user Enter Last Name as {string}")
public void user_Enter_Last_Name_as(String string) {
	Waits.waitUntilElementLocated(30, DashboardObject.entLastName);
	Elements.TypeText(DashboardObject.entLastName, string);
}

@When("user Enter Phone Number as {string}")
public void user_Enter_Phone_Number_as(String string) {
	Waits.waitUntilElementLocated(30, DashboardObject.entPhoneNo);
	Elements.TypeText(DashboardObject.entPhoneNo, string);
}

@When("user Enter Email Id as {string}")
public void user_Enter_Email_Id_as(String string) {
   
}

@When("user Enter Password as {string}")
public void user_Enter_Password_as(String string) {
  
}

@When("user Enter Confirm Password as {string}")
public void user_Enter_Confirm_Password_as(String string) {
    
}

@Then("click on CheckBox")
public void click_on_CheckBox() {
 
}

@Then("click On Sign UP")
public void click_On_Sign_UP() {
  
}

@Then("popUp Display as {string}")
public void popup_Display_as(String string) {
	
}

}

