package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseinit.Base;
import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.USAMobileNoMandateObject;
import pageObjects.XpathMyProfile;

public class MyProfile {
	
	
	@Then("user click on upload button")
	public void user_click_on_upload_button() throws InterruptedException {
		Thread.sleep(4000);
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Upload_Btn);
		Elements.jclick(USAMobileNoMandateObject.Upload_Btn);
	}

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
	public void error_message_get_Display_as(String string) {
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
	
		
	}
	

