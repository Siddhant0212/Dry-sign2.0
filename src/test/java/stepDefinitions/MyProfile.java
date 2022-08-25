package stepDefinitions;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseinit.Base;
import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.MyFilesObject;
import pageObjects.USAMobileNoMandateObject;
import pageObjects.XpathMyProfile;

public class MyProfile {
	
	
	@Then("user click on upload button")
	public void user_click_on_upload_button() throws InterruptedException {
		//Thread.sleep(15000);
		Elements.switchToChild();
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Upload_Btn);
		Elements.jclick(USAMobileNoMandateObject.Upload_Btn);
	}
	
	@Then("user not get displayed profile picture")
	public void user_not_get_displayed_profile_picture() {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Profile_Picture);
		Elements.isDisplayed(USAMobileNoMandateObject.Profile_Picture);
	}
//	@Then("user upload invalid file as {string}")
//	public void user_upload_invalid_file_as(String string) {
//		
//		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entPhoneNo);
//		  Elements.TypeText(USAMobileNoMandateObject.entPhoneNo, mobilenumber);
////			/Elements.isEnabled(USAMobileNoMandateObject.entPhoneNo);
//			Thread.sleep(2000);
//			
//			String expectedNumber = mobilenumber;
//			String actualNumber = Elements.getText(USAMobileNoMandateObject.entPhoneNo);
//			Assert.assertNotSame(actualNumber, expectedNumber);
//		 }
//	}
		
	

	@Then("user leave the name field blank")
	public void user_leave_the_name_field_blank() throws InterruptedException {
		
		
//		WebElement namefield = Base.driver.findElement(By.xpath("//input[@placeholder='Name']"));
//		namefield.click();
//		namefield.clear();
		Thread.sleep(5000);
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Name_field);
		Elements.click(USAMobileNoMandateObject.Name_field);
		Elements.clearTxtBox(USAMobileNoMandateObject.Name_field);
	  
	}
	@When("enter the user FirstName as {string}")
	public void enter_the_user_FirstName_as(String Firstname) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Name_field);
		Elements.TypeText(USAMobileNoMandateObject.Name_field, Firstname);
	}

	@Then("error message get Display as {string}")
	public void error_message_get_Display_as(String string) throws InterruptedException {
		Thread.sleep(500);
    Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.FirstNameisrequired);
	Elements.isDisplayed(USAMobileNoMandateObject.FirstNameisrequired);
	 Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.FirstNameisrequired),string);
		
	}
	@Then("user confirmation message get display as {string}")
	public void user_confirmation_message_get_display_as(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Successfully_Updated);
		Elements.isDisplayed(USAMobileNoMandateObject.Successfully_Updated);
		 Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.Successfully_Updated),string);
		
	}
	@Then("user enter address as {string}")
	public void user_enter_address_as(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Stree_Address);
		Elements.TypeText(USAMobileNoMandateObject.Stree_Address, string);
		
	}
	@Then("user Click on edit button")
	public void user_Click_on_edit_button() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.btnEdit);
		Elements.jclick(USAMobileNoMandateObject.btnEdit);
		
	}
	@Then("user enter zip code as {string}")
	public void user_enter_zip_code_as(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Zip_code);
		Elements.TypeText(USAMobileNoMandateObject.Zip_code, string);
	   
	}

	@Then("error message should displayed as {string}")
	public void error_message_should_displayed_as(String string) throws InterruptedException {
		Thread.sleep(500);
//		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Zip_code_Min_Four_Digit);
//		Elements.isDisplayed(USAMobileNoMandateObject.Zip_code_Min_Four_Digit);
//		 Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.Zip_code_Min_Four_Digit),string);
	
		
	}

@Then("cancel option not present for free user as {string}")
public void cancel_option_not_present_for_free_user_as(String string) {
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Cancel_Subscription);
	Elements.isEnabled(USAMobileNoMandateObject.Cancel_Subscription);
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Cancel_Subscription_Is_Not_Available);
	Elements.isDisplayed(USAMobileNoMandateObject.Cancel_Subscription_Is_Not_Available);
	 Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.Cancel_Subscription_Is_Not_Available),string);
	
}
@Then("user click on security")
public void user_click_on_security() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.tabSecurity);
	Elements.jclick(USAMobileNoMandateObject.tabSecurity);
}
@Then("user click on personal information")
public void user_click_on_personal_information() {
	Waits.waitUntilElementToClick(30,USAMobileNoMandateObject.Personal_Information);
	Elements.click(USAMobileNoMandateObject.Personal_Information);
}
@Then("user click on payment method")
public void user_click_on_payment_method() {
	Waits.waitUntilElementToClick(30,XpathMyProfile.Payment_Method);
	Elements.click(XpathMyProfile.Payment_Method);
	
}
@Then("user click on update payment method")
public void user_click_on_update_payment_method() {
	Waits.waitUntilElementToClick(30,XpathMyProfile.Update_Payment_Method);
	Elements.click(XpathMyProfile.Update_Payment_Method);
	
}
@Then("user display as {string}")
public void user_display_as(String string) {
	Waits.waitUntilElementLocated(30, XpathMyProfile.New_Payment_details_has_been_updated);
	Elements.isDisplayed(XpathMyProfile.New_Payment_details_has_been_updated);
	 Assert.assertEquals(Elements.getText(XpathMyProfile.New_Payment_details_has_been_updated),string);
	
}

@Then("user click on dashboard button")
public void user_click_on_dashboard_button() {
	Waits.waitUntilElementToClick(30,XpathMyProfile.GoToDashboard);
	Elements.click(XpathMyProfile.GoToDashboard);
}
@Then("click on cancel button")
public void click_on_cancel_button() {
	Waits.waitUntilElementToClick(30,XpathMyProfile.CancelBtn);
	Elements.click(XpathMyProfile.CancelBtn);
	
}
@Then("payment get fail as {string}")
public void payment_get_fail_as(String string) {
	Waits.waitUntilElementLocated(30, XpathMyProfile.PAYMENT_FAILED);
	Elements.isDisplayed(XpathMyProfile.PAYMENT_FAILED);
	 Assert.assertEquals(Elements.getText(XpathMyProfile.PAYMENT_FAILED),string);
 
}

@Then("user click on go to home")
public void user_click_on_go_to_home() {
	Waits.waitUntilElementToClick(30,XpathMyProfile.Go_To_Home);
	Elements.click(XpathMyProfile.Go_To_Home);
	
}
@Then("user Should display profile icon")
public void user_Should_display_profile_icon() {
	Waits.waitUntilElementLocated(30, XpathMyProfile.Profile1);
	Elements.isDisplayed(XpathMyProfile.Profile1);
}
@Then("user should display personal information tab by default as {string}")
public void user_should_display_personal_information_tab_by_default_as(String string) {
	Waits.waitUntilElementLocated(30, XpathMyProfile.Personal_Information);
	Elements.isDisplayed(XpathMyProfile.Personal_Information);
	Assert.assertEquals(Elements.getText(XpathMyProfile.Personal_Information),string);
}
@Then("user should display personal information")
public void user_should_display_personal_information() {
	Waits.waitUntilElementLocated(30, XpathMyProfile.Personal_Information);
	Elements.isDisplayed(XpathMyProfile.Personal_Information);
}

@Then("following details get display")
public void following_details_get_display(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
		Thread.sleep(5000);
		
		Waits.waitUntilElementLocated(30, XpathMyProfile.basicInformation("First Name"));
		Elements.isDisplayed(XpathMyProfile.basicInformation("First Name"));

		Waits.waitUntilElementLocated(30, XpathMyProfile.basicInformation("Last Name"));
		Elements.isDisplayed(XpathMyProfile.basicInformation("Last Name"));

		Waits.waitUntilElementLocated(30, XpathMyProfile.basicInformation("Email"));
		Elements.isDisplayed(XpathMyProfile.basicInformation("Email"));
		
		Waits.waitUntilElementLocated(30, XpathMyProfile.basicInformation("Country Code"));
		Elements.isDisplayed(XpathMyProfile.basicInformation("Country Code"));

		Waits.waitUntilElementLocated(30, XpathMyProfile.basicInformation("Contact Number"));
		Elements.isDisplayed(XpathMyProfile.basicInformation("Contact Number"));
		
		Waits.waitUntilElementLocated(30, XpathMyProfile.basicInformation("Street Address"));
		Elements.isDisplayed(XpathMyProfile.basicInformation("Street Address"));

		Waits.waitUntilElementLocated(30, XpathMyProfile.basicInformation("United States"));
		Elements.isDisplayed(XpathMyProfile.basicInformation("United States"));

		Waits.waitUntilElementLocated(30, XpathMyProfile.basicInformation("State"));
		Elements.isDisplayed(XpathMyProfile.basicInformation("State"));
		
		Waits.waitUntilElementLocated(30, XpathMyProfile.basicInformation("City"));
		Elements.isDisplayed(XpathMyProfile.basicInformation("City"));

		Waits.waitUntilElementLocated(30, XpathMyProfile.basicInformation("ZIP Code"));
		Elements.isDisplayed(XpathMyProfile.basicInformation("ZIP Code"));
}
}
@Then("user click on zip")
public void user_click_on_zip() {
	Waits.waitUntilElementToClick(30,XpathMyProfile.Zip_code);
	Elements.click(XpathMyProfile.Zip_code);
}
@Then("user able to click on checkbox for email OTP")
public void user_able_to_click_on_checkbox_for_email_OTP() {
	Waits.waitUntilElementToClick(30,XpathMyProfile.emailOtp);
}

@Then("user able to click on checkbox for setup secure code")
public void user_able_to_click_on_checkbox_for_setup_secure_code() {
	Waits.waitUntilElementToClick(30,XpathMyProfile.setupSecureCode);
}
}

