package stepDefinitions;

import baseinit.Base;
import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.USAMobileNoMandateObject;


public class Freeuser {
	
	//TS1
	@When("user click on delete account")
	public void user_click_on_delete_account() throws InterruptedException {
		Thread.sleep(2000);
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.deleteAccount);
		Elements.jclick(USAMobileNoMandateObject.deleteAccount);
		
		
	    
	}
	@Given("pop up get display as delete your account")
	public void pop_up_get_display_as_delete_your_account() {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.deleteYourAccount);
		Elements.isDisplayed(USAMobileNoMandateObject.deleteYourAccount);
	
	}

	@Then("user get displayed text on pop up that you can continue with our free version")
	public void user_get_displayed_text_on_pop_up_that_you_can_continue_with_our_free_version() {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.popContWithFreeVersion);
	Elements.isDisplayed(USAMobileNoMandateObject.popContWithFreeVersion);
	
	
		
	}
	
	@Then("Pop up get display")
	public void pop_up_get_display() {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.deleteYourAccountPopUp);
		Elements.isDisplayed(USAMobileNoMandateObject.deleteYourAccountPopUp);
		
		
		
		
	}
	@Then("On the Delete pop up the text on the button as {string}")
	public void on_the_Delete_pop_up_the_text_on_the_button_as(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.deleteYourAccountPopUp);
		Elements.isDisplayed(USAMobileNoMandateObject.deleteYourAccountPopUp);
		Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.deleteYourAccountPopUp),"Are you sure you want to delete your account? Deleting your account will also delete all your data. You can continue with our Free Version instead.");
	}
	@Then("user should get display pop up")
	public void user_should_get_display_pop_up() {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Plans_PopUp);
		Elements.isDisplayed(USAMobileNoMandateObject.Plans_PopUp);
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.FREE_VERSION);
		Elements.isDisplayed(USAMobileNoMandateObject.FREE_VERSION);
		Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.FREE_VERSION),"FREE VERSION");
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.INDIVIDUAL);
		Elements.isDisplayed(USAMobileNoMandateObject.INDIVIDUAL);
		Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.INDIVIDUAL),"INDIVIDUAL");
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.PROFESSIONAL);
		Elements.isDisplayed(USAMobileNoMandateObject.PROFESSIONAL);
		Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.PROFESSIONAL),"PROFESSIONAL");
	}
	@Then("under free version {string} button present")
	public void under_free_version_button_present(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.clickOnContWithfreeVersion);
		Elements.isDisplayed(USAMobileNoMandateObject.clickOnContWithfreeVersion);
	
	}

	@Then("under individual {string} button present")
	public void under_individual_button_present(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Upgrade1);
		Elements.isDisplayed(USAMobileNoMandateObject.Upgrade1);
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Upgrade2);
		Elements.isDisplayed(USAMobileNoMandateObject.Upgrade2);
	    
	}

	@Then("under professional {string} button present")
	public void under_professional_button_present(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Upgrade3);
		Elements.isDisplayed(USAMobileNoMandateObject.Upgrade3);
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Upgrade4);
		Elements.isDisplayed(USAMobileNoMandateObject.Upgrade4);
		
	}
	@Then("user display three pie chart")
	public void user_display_three_pie_chart() {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Pie_Chart1);
		Elements.isDisplayed(USAMobileNoMandateObject.Pie_Chart1);
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Pie_Chart2);
		Elements.isDisplayed(USAMobileNoMandateObject.Pie_Chart2);
		
	}
	@Then("display as {string} with upgrade button")
	public void display_as_with_upgrade_button(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.INDIVIDUAL_Plan);
		Elements.isDisplayed(USAMobileNoMandateObject.INDIVIDUAL_Plan);
		Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.INDIVIDUAL_Plan),string);
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Upgrade5);
		Elements.isDisplayed(USAMobileNoMandateObject.Upgrade5);
	 
	}

	@Then("display as {string} with Upgrade button")
	public void display_as_with_Upgrade_button(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.PROFESSIONAL_Plan);
		Elements.isDisplayed(USAMobileNoMandateObject.PROFESSIONAL_Plan);
		Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.PROFESSIONAL_Plan),string);
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Upgrade6);
		Elements.isDisplayed(USAMobileNoMandateObject.Upgrade6);

	}
	@Then("should display as {string}")
	public void should_display_as(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Five_Documents);
		Elements.isDisplayed(USAMobileNoMandateObject.Five_Documents);
	
	}
		@Then("user should not display as {string} option")
		public void user_should_not_display_as_option(String string) {
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.FREEVERSION);
			Elements.isDisplayed(USAMobileNoMandateObject.FREEVERSION);
			Assert.assertNotSame(Elements.getText(USAMobileNoMandateObject.FREEVERSION),string);
		}
		
	
	@Then("user should display document count zero")
	public void user_should_display_document_count_zero() {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Zero_Documents);
		Elements.isDisplayed(USAMobileNoMandateObject.Zero_Documents);
	}
	@Then("user click on Upgrade button")
	public void user_click_on_Upgrade_button() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Upgrade5);
		Elements.jclick(USAMobileNoMandateObject.Upgrade5);
	  
		
	}

	@Then("user click on buy now button")
	public void user_click_on_buy_now_button() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.btnBuyNow);
		Elements.jclick(USAMobileNoMandateObject.btnBuyNow);
		
	}
	@Then("Post login the Plan the pre dashboard pop up screen should not get displayed as {string}")
	public void post_login_the_Plan_the_pre_dashboard_pop_up_screen_should_not_get_displayed_as(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Individual_Plan);
		Elements.isDisplayed(USAMobileNoMandateObject.Individual_Plan);
		Assert.assertNotSame(Elements.getText(USAMobileNoMandateObject.Individual_Plan),string);
		
	}
	@When("user click on continue with free version and pop up should get closed")
	public void user_click_on_continue_with_free_version_and_pop_up_should_get_closed()  throws InterruptedException {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnContWithfreeVersion);
		Elements.jclick(USAMobileNoMandateObject.clickOnContWithfreeVersion);
		Thread.sleep(2000);
		
	}
	@Then("upgrade button should get display")
	public void upgrade_button_should_get_display() {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Upgrade5);
		Elements.isDisplayed(USAMobileNoMandateObject.Upgrade5);
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Upgrade6);
		Elements.isDisplayed(USAMobileNoMandateObject.Upgrade6);
	}
	@Then("under free version {string} Button present")
	public void under_free_version_Button_present(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Individual_Plan);
		Elements.isDisplayed(USAMobileNoMandateObject.Individual_Plan);
		Assert.assertNotSame(Elements.getText(USAMobileNoMandateObject.Individual_Plan),string);
		
		
		Elements.isDisplayed(USAMobileNoMandateObject.Self_sign_Text);
		Assert.assertNotSame(Elements.getText(USAMobileNoMandateObject.Self_sign_Text),string);
		
		Elements.isDisplayed(USAMobileNoMandateObject.Group_sign_Text);
		Assert.assertNotSame(Elements.getText(USAMobileNoMandateObject.Group_sign_Text),string);
		
		Elements.isDisplayed(USAMobileNoMandateObject.Sign_Type_Draw_upload);
		Assert.assertNotSame(Elements.getText(USAMobileNoMandateObject.Sign_Type_Draw_upload),string);
	}
	
}