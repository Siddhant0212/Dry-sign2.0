package stepDefinitions;

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
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.buyNowNoActivePlan);
	Elements.isDisplayed(USAMobileNoMandateObject.buyNowNoActivePlan);
	
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
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.btnViewPlan);
	Elements.isDisplayed(USAMobileNoMandateObject.btnViewPlan);
	Assert.assertNotSame(Elements.getText(USAMobileNoMandateObject.btnViewPlan),string);
}
@Then("user should display the correct document received count")
public void user_should_display_the_correct_document_received_count() {
	Waits.waitUntilElementLocated(30, DashboardObject.Documents_Received);
	Elements.isDisplayed(DashboardObject.Eight_Documents);
	Elements.isDisplayed(DashboardObject.Documents);
	Assert.assertNotSame(Elements.getText(DashboardObject.Documents_Received)," Documents Received ");
	
}
@Then("user should display the correct document sent count")
public void user_should_display_the_correct_document_sent_count() {
	Waits.waitUntilElementLocated(30, DashboardObject.Documents_Sent);
	Elements.isDisplayed(DashboardObject.Documents_Sent);
	Assert.assertNotSame(Elements.getText(DashboardObject.Documents_Sent),"Documents Sent");
	
	Elements.isDisplayed(DashboardObject.Four_Documents);
	Assert.assertNotSame(Elements.getText(DashboardObject.Documents_Sent),"4");
	Elements.isDisplayed(DashboardObject.Documents);
	Assert.assertNotSame(Elements.getText(DashboardObject.Documents_Sent),"Documents");
	
	
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
}

