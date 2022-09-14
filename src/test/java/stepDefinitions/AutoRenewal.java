package stepDefinitions;

import java.text.ParseException;
import java.util.Map;

import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AutoRenewalObject;
import pageObjects.FeedbackRatingObject;
import pageObjects.USAMobileNoMandateObject;

public class AutoRenewal {

	
	@When("user click on the Login button")
	public void user_click_on_the_Login_button() throws InterruptedException  {
		Waits.waitUntilElementToClick(30, AutoRenewalObject.Login_btn);
		Elements.click(AutoRenewalObject.Login_btn);
		
		Thread.sleep(5000);
		
		
	}
	
	@When("click on Upgrade Plan")
	public void click_on_Upgrade_Plan() throws InterruptedException {
		Thread.sleep(20000);
		Elements.scrollIntoView(AutoRenewalObject.Upgrade_Plan);
		Waits.waitUntilElementToClick(30, AutoRenewalObject.Upgrade_Plan);
		Elements.click(AutoRenewalObject.Upgrade_Plan);
	}
	@When("click on Upgrade")
	public void click_on_Upgrade() throws InterruptedException {
		Thread.sleep(2000);
		Waits.waitUntilElementToClick(30, AutoRenewalObject.Upgrade);
		Elements.click(AutoRenewalObject.Upgrade);
		
	}
	@Then("remaining document get display with validity of last day")
	public void remaining_document_get_display_with_validity_of_last_day() throws ParseException  {
		
		Waits.waitUntilElementLocated(30, AutoRenewalObject.Total_count);
		Elements.isDisplayed(AutoRenewalObject.Total_count);
		
		Elements.calculateDays1();
	}
	@Then("User get display previous used document")
	public void user_get_display_previous_used_document(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
			Thread.sleep(20000);
			
			Waits.waitUntilElementLocated(30, AutoRenewalObject.Field("Completed"));
			Elements.isDisplayed(AutoRenewalObject.Field("Completed"));
			
			Waits.waitUntilElementLocated(30, AutoRenewalObject.Field("Out for Signature"));
			Elements.isDisplayed(AutoRenewalObject.Field("Out for Signature"));
			
			Waits.waitUntilElementLocated(30, AutoRenewalObject.Field("Draft"));
			Elements.isDisplayed(AutoRenewalObject.Field("Draft"));
			
			Waits.waitUntilElementLocated(30, AutoRenewalObject.Field("Rejected"));
			Elements.isDisplayed(AutoRenewalObject.Field("Rejected"));
		}
		
		
	}
	@When("user click on the Login Button")
	public void user_click_on_the_Login_Button() throws InterruptedException {
		Thread.sleep(5000);
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Login);
		Elements.jclick(USAMobileNoMandateObject.Login);
		
	}
	@When("enter the user Name as {string}")
	public void enter_the_user_Name_as(String string) throws InterruptedException {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.emailId);
		Elements.TypeText(USAMobileNoMandateObject.emailId, string);
		Thread.sleep(500);
	}

	@When("enter the Password as{string}")
	public void enter_the_Password_as(String password) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.passWd);
		Elements.TypeText(USAMobileNoMandateObject.passWd, password);
	
	}
}
