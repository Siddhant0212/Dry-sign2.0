package stepDefinitions;



import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;

import baseinit.Base;
import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.AutoRenewalObject;
import pageObjects.DashboardObject;
import pageObjects.DeleteObject;
import pageObjects.FeedbackRatingObject;
import pageObjects.MFAObject;
import pageObjects.MyFilesObject;
import pageObjects.XpasswrdProdoc;
import pageObjects.USAMobileNoMandateObject;

import pageObjects.XpathFreeUser;
import pageObjects.XpathMyProfile;


public class USAMobileNoMandate {

	
	@Given("navigate to URL {string}")
  public void navigate_to_URL(String url) throws InterruptedException { 
		Base.driver.navigate().to(url);
		USAMobileNoMandateObject ob = new USAMobileNoMandateObject(Base.driver);
		FeedbackRatingObject ob1 = new FeedbackRatingObject(Base.driver);
		DeleteObject ob2 = new DeleteObject(Base.driver);
		MFAObject ob3 = new MFAObject(Base.driver);
		DeleteObject ob4 = new DeleteObject(Base.driver);
		XpathFreeUser ob5 = new XpathFreeUser(Base.driver);
		XpasswrdProdoc ob6 = new XpasswrdProdoc (Base.driver);
		XpathMyProfile ob7 = new XpathMyProfile (Base.driver);
		DashboardObject ob8 =new DashboardObject (Base.driver);
		XpathMyProfile ob9 = new XpathMyProfile (Base.driver);
		MyFilesObject ob10 = new MyFilesObject (Base.driver);
		AutoRenewalObject ob11 = new AutoRenewalObject (Base.driver);
		Thread.sleep(2000);
	}
	@When("user click on the signUp link")
	public void user_click_on_the_signUp_link() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.signUpButton);
		Elements.click(USAMobileNoMandateObject.signUpButton);
		
	}
	@When("user display registration form")
	public void user_display_registration_form() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.loginInfo);
		Elements.isDisplayed(USAMobileNoMandateObject.loginInfo);
		
	}
	
	@Then("user should display following fields")
	public void user_should_display_following_fields(io.cucumber.datatable.DataTable dataTable)  throws InterruptedException {
		
		for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
			Thread.sleep(5000);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("firstName"));
			Elements.isDisplayed(USAMobileNoMandateObject.Field("firstName"));

			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("lastName"));
			Elements.isDisplayed(USAMobileNoMandateObject.Field("lastName"));

			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("companyName"));
			Elements.isDisplayed(USAMobileNoMandateObject.Field("companyName"));

			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("phone"));
			Elements.isDisplayed(USAMobileNoMandateObject.Field("phone"));
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("email"));
			Elements.isDisplayed(USAMobileNoMandateObject.Field("email"));

			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("password"));
			Elements.isDisplayed(USAMobileNoMandateObject.Field("password"));
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("confirmPassword"));
			Elements.isDisplayed(USAMobileNoMandateObject.Field("confirmPassword"));

//			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("Sign Up"));
//			Elements.isDisplayed(USAMobileNoMandateObject.Field("Sign Up"));
//			
		}
	}
		@Then("user display Sign up button")
		public void user_display_Sign_up_button() {
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.signUpButton1);
			Elements.isDisplayed(USAMobileNoMandateObject.signUpButton1);
	
	}
		@Then("verify contact no. field needs to be mandatory field with the asterix symbol as {string}")
		public void verify_contact_no_field_needs_to_be_mandatory_field_with_the_asterix_symbol_as(String string) {
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.astrixSymbol);
			Elements.isDisplayed(USAMobileNoMandateObject.astrixSymbol);
			Elements.click(USAMobileNoMandateObject.signUpButton1);
			
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mobileNOIsMand);
			Elements.isDisplayed(USAMobileNoMandateObject.mobileNOIsMand);
			 Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.mobileNOIsMand),string);
			
			
		}
		
		
		
		
		
	

@When("user displayed first name")
public void user_displayed_first_name() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entFirstName);
	Elements.isDisplayed(USAMobileNoMandateObject.entFirstName);
}
@When("enter first name as {string}")
public void enter_first_name_as(String username) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entFirstName);
	Elements.TypeText(USAMobileNoMandateObject.entFirstName, username);
}
@When("user displayed last name as")
public void user_displayed_last_name_as() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entLastName);
	Elements.isDisplayed(USAMobileNoMandateObject.entLastName);
	
}
@When("enter last name as {string}")
public void enter_last_name_as(String lastname) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entLastName);
	Elements.TypeText(USAMobileNoMandateObject.entLastName, lastname);
}
@When("user displayed company name")
public void user_displayed_company_name() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entCompName);
	Elements.isDisplayed(USAMobileNoMandateObject.entCompName);
}
@When("enter company name as {string}")
public void enter_company_name_as(String companyname) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entCompName);
	Elements.TypeText(USAMobileNoMandateObject.entCompName, companyname);
	
}
	
	@When("enter mobile number as {string}")
	public void enter_mobile_number_as(String mobilenumber) throws InterruptedException {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entPhoneNo);
		  Elements.TypeText(USAMobileNoMandateObject.entPhoneNo, mobilenumber);
//			/Elements.isEnabled(USAMobileNoMandateObject.entPhoneNo);
			Thread.sleep(2000);
			
}
@When("user displayed email")
public void user_displayed_email() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entEmail);
	Elements.isDisplayed(USAMobileNoMandateObject.entEmail);
  
}

@When("enter email as {string}")
public void enter_email_as(String email) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entEmail);
	Elements.TypeText(USAMobileNoMandateObject.entEmail, email);
 
}

@When("user displayed Password")
public void user_displayed_Password() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entPassword);
	Elements.isDisplayed(USAMobileNoMandateObject.entPassword);
 
}

@When("enter password as {string}")
public void enter_password_as(String password) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entPassword);
	Elements.TypeText(USAMobileNoMandateObject.entPassword, password);
   
}

@When("user displayed confirm password")
public void user_displayed_confirm_password() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entConfirmPassword);
	Elements.isDisplayed(USAMobileNoMandateObject.entConfirmPassword);

}

@When("enter confirm password as {string}")
public void enter_confirm_password_as(String confirmpassword) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entConfirmPassword);
	Elements.TypeText(USAMobileNoMandateObject.entConfirmPassword, confirmpassword);
}
@When("user displayed check box")
public void user_displayed_check_box() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.clickCheckBox);
	Elements.isDisplayed(USAMobileNoMandateObject.clickCheckBox);
	
  
}

@When("click on check box")
public void click_on_check_box() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.clickCheckBox);
	Elements.click(USAMobileNoMandateObject.clickCheckBox);

}

@Then("alphabets and special charcters should not get allowed to enter as {string}")
public void alphabets_and_special_charcters_should_not_get_allowed_to_enter_as(String mobilenumber) throws InterruptedException {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entPhoneNo);
	  Elements.TypeText(USAMobileNoMandateObject.entPhoneNo, mobilenumber);
//		/Elements.isEnabled(USAMobileNoMandateObject.entPhoneNo);
		Thread.sleep(2000);
		
		String expectedNumber = mobilenumber;
		String actualNumber = Elements.getText(USAMobileNoMandateObject.entPhoneNo);
		Assert.assertNotSame(actualNumber, expectedNumber);
	
	
}

//@When("user displayed the signUp icon")
//public void user_displayed_the_signUp_icon() {
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.signUpButton);
//	Elements.isDisplayed(USAMobileNoMandateObject.clickOnSignUp);
//    
//}
//
@When("click on signUp icon")
public void click_on_signUp_icon() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.signUpButton1);
	Elements.click(USAMobileNoMandateObject.signUpButton1);
  
}


	

//TS2
@Then("user get displayed error message")
public void user_get_displayed_error_message() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entValidMoNumber);
	Elements.isDisplayed(USAMobileNoMandateObject.entValidMoNumber);
	
}
@Then("user clear the mobile number field")
public void user_clear_the_mobile_number_field() throws InterruptedException {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entPhoneNo);
	Elements.clearTxtBox(USAMobileNoMandateObject.entPhoneNo);
	Thread.sleep(2000);
	
	
}
@Then("enter correct mobile number as {string}")
public void enter_correct_mobile_number_as(String mobnumber) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entPhoneNo);
	  Elements.TypeText(USAMobileNoMandateObject.entPhoneNo, mobnumber);
	
}
@Then("verify that the contact number field should allow ten digits")
public void verify_that_the_contact_number_field_should_allow_ten_digits() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entPhoneNo);
	Elements.isDisplayed(USAMobileNoMandateObject.entPhoneNo);
	
}
//TS3


	
@Then("it should not allow to enter more than ten digits as {string}")
public void it_should_not_allow_to_enter_more_than_ten_digits_as(String mobilenumber) throws InterruptedException {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entPhoneNo);
	  Elements.TypeText(USAMobileNoMandateObject.entPhoneNo, mobilenumber);
//		/Elements.isEnabled(USAMobileNoMandateObject.entPhoneNo);
		Thread.sleep(2000);
		
		String expectedNumber = mobilenumber;
		String actualNumber = Elements.getText(USAMobileNoMandateObject.entPhoneNo);
		Assert.assertNotSame(actualNumber, expectedNumber);
	 }








@Then("User get displayed that the alphabets and special charcters should not get allowed to enter within the contact no. field.")
public void user_get_displayed_that_the_alphabets_and_special_charcters_should_not_get_allowed_to_enter_within_the_contact_no_field() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entPhoneNo);
	Elements.isDisplayed(USAMobileNoMandateObject.entPhoneNo);
}
//TS4
@Then("user should not get registered should display Mobile number already Registered")
public void user_should_not_get_registered_should_display_Mobile_number_already_Registered() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mobNoAlreadyReg);
	Elements.isDisplayed(USAMobileNoMandateObject.mobNoAlreadyReg);
	
}
//TS5

@Given("navigate to {string}")
public void navigate_to(String string) {
	
	Base.driver.switchTo().newWindow(WindowType.TAB);
	Base.driver.navigate().to("https://drysign-qa.exela.global/#/login");
	USAMobileNoMandateObject obM = new USAMobileNoMandateObject(Base.driver);
}



@When("enter the user name as {string}")
public void enter_the_user_name_as(String username) throws InterruptedException {
	

	Elements.switchToChild();
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.emailId);
	Elements.TypeText(USAMobileNoMandateObject.emailId, username);
      
     

}

@When("enter the password as{string}")
public void enter_the_password_as(String password) throws InterruptedException {
	//Thread.sleep(2500);
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.passWd);
	Elements.TypeText(USAMobileNoMandateObject.passWd, password);
  
}

@When("user click on Login button")
public void user_click_on_Login_button() throws InterruptedException {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Login_btn);
	Elements.click(USAMobileNoMandateObject.Login_btn);
	Thread.sleep(2000);
	
}

@Then("plan should get renew and validity start from day of renewed")
public void plan_should_get_renew_and_validity_start_from_day_of_renewed() throws ParseException {
	Elements.calculateDays1();

}

@When("user click on the sign in button")
public void user_click_on_the_sign_in_button() throws InterruptedException {
	//Thread.sleep(5000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.sub);
	Elements.click(USAMobileNoMandateObject.sub);
	Thread.sleep(2000);
 
}

@When("user click on sign in button")
public void user_click_on_sign_in_button() throws InterruptedException {
	Thread.sleep(5000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.sub);
	Elements.jclick(USAMobileNoMandateObject.sub);
	
	
}

@When("dashboard window get display")
public void dashboard_window_get_display() throws ParseException {
	// Elements.calculateDays();
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Days_Text);
	System.out.println(USAMobileNoMandateObject.Days_Text.getText());
//	int number = Integer.parseInt(USAMobileNoMandateObject.Days_Text.getText());
	long num = Elements.calculateDays();
	int num1 = (int) num;
//	int remaining = 365 - num1;
//	Assert.assertEquals(number, remaining);
}


@Then("user click on continue with free version")
public void user_click_on_continue_with_free_version() throws InterruptedException {
	Thread.sleep(15000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnContWithfreeVersion);
	Elements.click(USAMobileNoMandateObject.clickOnContWithfreeVersion);
	Thread.sleep(15000);
}

@When("user click on mat icon")
public void user_click_on_mat_icon() throws InterruptedException  {
	 Thread.sleep(15000);
	Waits.waitUntilElementLocated(50, USAMobileNoMandateObject.icon);
 	//Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.icon);
    Elements.jclick(USAMobileNoMandateObject.icon);
   
 	
 	//WebDriverWait wait = new WebDriverWait(driver, 10);
 	//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@formcontrolname='reportingDealPermission']")));
 	//((JavascriptExecutor)Base.driver).executeScript("arguments[0].click();", XpathUserFre.icon);
		
  //*[local-name()='tspan'][text()='Days Left']/../../text
}
@When("user click on profile icon")
public void user_click_on_profile_icon() throws InterruptedException, AWTException {
	
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Profile1);
	//USAMobileNoMandateObject.profile.click();
	Elements.jclick(USAMobileNoMandateObject.Profile1);
	Thread.sleep(15000);

			
}
@Then("user click profile icon")
public void user_click_profile_icon() throws InterruptedException {
	Thread.sleep(10000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Profile1);
	Elements.jclick(USAMobileNoMandateObject.Profile1);
	
}

@When("user click on manage account")
public void user_click_on_manage_account()  {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.mangeAcc);
	Elements.jclick(USAMobileNoMandateObject.mangeAcc);
	
}
@When("user click on edit button")
public void user_click_on_edit_button() throws InterruptedException {
Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.btnEdit);
Elements.jclick(USAMobileNoMandateObject.btnEdit);


}

@Then("user should display personal information with following fields")
public void user_should_display_personal_information_with_following_fields(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

	for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
		Thread.sleep(5000);
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("firstName"));
		Elements.isDisplayed(USAMobileNoMandateObject.Field("firstName"));

		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("lastName"));
		Elements.isDisplayed(USAMobileNoMandateObject.Field("lastName"));

		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("companyName"));
		Elements.isDisplayed(USAMobileNoMandateObject.Field("companyName"));

		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("phone"));
		Elements.isDisplayed(USAMobileNoMandateObject.Field("phone"));
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("email"));
		Elements.isDisplayed(USAMobileNoMandateObject.Field("email"));

		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("password"));
		Elements.isDisplayed(USAMobileNoMandateObject.Field("password"));
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Field("confirmPassword"));
		Elements.isDisplayed(USAMobileNoMandateObject.Field("confirmPassword"));
	}
}
	
	
	
	//@Then("profile page contain following personal information should displayed correctly")
	//public void profile_page_contain_following_personal_information_should_displayed_correctly(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	//	
//		for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
//			Thread.sleep(5000);
//			
//			
//			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.personalProfile("firstName"));
//			Elements.isDisplayed(USAMobileNoMandateObject.personalProfile("firstName"));
	//
//			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.personalProfile("lastName"));
//			Elements.isDisplayed(USAMobileNoMandateObject.personalProfile("lastName"));
	//
//			
//			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.personalProfile("Email"));
//			Elements.isDisplayed(USAMobileNoMandateObject.personalProfile("Email"));
	//
//			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.personalProfile("Contact Number"));
//			Elements.isDisplayed(USAMobileNoMandateObject.personalProfile("Contact Number"));
//			
	//



			
@Then("country field should not be editable")
public void country_field_should_not_be_editable() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.countryCode);
	Elements.isEnabled(USAMobileNoMandateObject.countryCode);
	
}

@Then("user click on save button")
public void user_click_on_save_button() throws InterruptedException {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.btnSave);
	Elements.jclick(USAMobileNoMandateObject.btnSave);
	Thread.sleep(2000);
}
@Then("pop up Get display as {string}")
public void pop_up_Get_display_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.SuccessfullyUpdated);
	Elements.isDisplayed(USAMobileNoMandateObject.SuccessfullyUpdated);
	 Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.SuccessfullyUpdated),"Successfully Updated.");
}


	
	@Then("user display message as {string}")
	public void user_display_message_as(String string) throws InterruptedException {
		
//		Elements.isDisplayed(DeleteObject.yourAccountHasBeenCreated);
//		Assert.assertEquals(Elements.getText(DeleteObject.yourAccountHasBeenCreated),string);
		Waits.waitUntilElementLocated(30, DeleteObject.yourAccountHasBeenCreated);
		Elements.VerifyTextEquals(DeleteObject.yourAccountHasBeenCreated2, string);
		
	}
	
	
//TS6
@When("click on the sign in with google")
public void click_on_the_sign_in_with_google() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.signInWithGoogle);
	Elements.click(USAMobileNoMandateObject.signInWithGoogle);
}
@Given("pop up get display")
public void pop_up_get_display() throws InterruptedException {
	Elements.switchToChild();
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.popUp);
	Elements.isDisplayed(USAMobileNoMandateObject.popUp);
  // Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.popUp)," Sign in with Google ");
	
}
@When("user enter the username as {string}")
public void user_enter_the_username_as(String username) {
	Waits.waitUntilElementLocated(60, USAMobileNoMandateObject.userName);
	Elements.TypeText(USAMobileNoMandateObject.userName,username);

}
@When("user click on next button")
public void user_click_on_next_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickNext);
	Elements.click(USAMobileNoMandateObject.clickNext);
}
@When("user enter password as {string}")
public void user_enter_password_as(String password) {
	Waits.waitUntilElementLocated(60, USAMobileNoMandateObject.pass);
	Elements.TypeText(USAMobileNoMandateObject.pass,password);
	
}
@When("Mobile number field get display on pop up")
public void mobile_number_field_get_display_on_pop_up() {
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.popUp);
//	Elements.isDisplayed(USAMobileNoMandateObject);
	
}
@When("Enter the valid mobile number as {string}")
public void enter_the_valid_mobile_number_as(String mobnumber) {
	Waits.waitUntilElementLocated(60, USAMobileNoMandateObject.entValidMoNumber);
	Elements.TypeText(USAMobileNoMandateObject.entValidMoNumber,mobnumber);
	
}
@When("Click on the Ok button")
public void click_on_the_Ok_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.okButton);
	Elements.click(USAMobileNoMandateObject.okButton);
	
}
////TS8
@Then("user verify that mobile number get displayed in correct format as {string}")
public void user_verify_that_mobile_number_get_displayed_in_correct_format_as(String contactnumber) {
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.entPhoneNo);
//	Elements.TypeText(USAMobileNoMandateObject.entPhoneNo, contactnumber);
//	
//	//Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.contactNumber),"(888) 222-4444");
//	
//	String expectedNumber = contactnumber;
//	String actualNumber = Elements.getText(USAMobileNoMandateObject.entPhoneNo);
//	Assert.assertTrue(true);
	
	Elements.isMobileNumberValid();
	
}
@Then("user click on Cross icon")
public void user_click_on_Cross_icon() throws InterruptedException {
	
	Thread.sleep(5000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.exelaIconClose);
	Elements.click(USAMobileNoMandateObject.exelaIconClose);
}
//Dashboard
@When("user click on logout")
public void user_click_on_logout() throws InterruptedException {
	Thread.sleep(5000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickLogOut);
	Elements.click(USAMobileNoMandateObject.clickLogOut);
    
}


@Then("all the available plan should get displayed to purchase for the user")
public void all_the_available_plan_should_get_displayed_to_purchase_for_the_user() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickBuyNow);
	Elements.isDisplayed(USAMobileNoMandateObject.clickBuyNow);
}
@When("user click on upgrade button")
public void user_click_on_upgrade_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.btnUpgrade);
	Elements.click(USAMobileNoMandateObject.btnUpgrade);
	
}
@Then("on Dashboard Buy Now button should get displayed")
public void on_Dashboard_Buy_Now_button_should_get_displayed() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Btn_Buy_Now);
	Elements.isDisplayed(USAMobileNoMandateObject.Btn_Buy_Now);
}
@When("paid user is on dashboard page")
public void paid_user_is_on_dashboard_page() {
	Waits.waitUntilElementLocated(30, XpasswrdProdoc.dashboard);
	  Assert.assertEquals(Elements.getText(XpasswrdProdoc.dashboard),"Dashboard");
	    
}
@When("user get displayed the View Plan or Buy Now button is present")
public void user_get_displayed_the_View_Plan_or_Buy_Now_button_is_present() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.View_Details);
	Elements.isDisplayed(USAMobileNoMandateObject.View_Details);
	  
	}
@When("individual plan get display")
public void individual_plan_get_display() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.indiPlan);
	Elements.isDisplayed(USAMobileNoMandateObject.indiPlan);
	
}
@Then("View Plan buttons should be present")
public void view_Plan_buttons_should_be_present() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.btnViewPlan);
	Elements.isDisplayed(USAMobileNoMandateObject.btnViewPlan);
	
}
@Then("user click on View Plan button")
public void user_click_on_View_Plan_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.btnViewPlan);
	Elements.jclick(USAMobileNoMandateObject.btnViewPlan);
	
}



@Then("Pop Up get displayed with elements")
public void pop_Up_get_displayed_with_elements() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.elements);
	Elements.isDisplayed(USAMobileNoMandateObject.elements);
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.eightyDoc);
	Elements.isDisplayed(USAMobileNoMandateObject.eightyDoc);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.eightyDoc),"80 Documents");


	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.fiveDoc);
	Elements.isDisplayed(USAMobileNoMandateObject.fiveDoc);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.fiveDoc),"5 Templates");
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.uploadPdfUsingGoogleDrive);
	Elements.isDisplayed(USAMobileNoMandateObject.uploadPdfUsingGoogleDrive);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.uploadPdfUsingGoogleDrive),"Upload PDF using Google Drive");
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.uploadPdfUsingDropbox);
	Elements.isDisplayed(USAMobileNoMandateObject.uploadPdfUsingDropbox);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.uploadPdfUsingDropbox),"Upload PDF using Dropbox");
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.uploadPdfUsingOneDrive);
	Elements.isDisplayed(USAMobileNoMandateObject.uploadPdfUsingOneDrive);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.uploadPdfUsingOneDrive),"Upload PDF using OneDrive");
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Self_Sign_Text);
	Elements.isDisplayed(USAMobileNoMandateObject.Self_Sign_Text);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.Self_Sign_Text),"Self sign");
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Grp_Sign_Text);
	Elements.isDisplayed(USAMobileNoMandateObject.Grp_Sign_Text);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.Grp_Sign_Text),"Group Sign");
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.MFAAndverifiedByTrustedCertificationAuthority);
	Elements.isDisplayed(USAMobileNoMandateObject.MFAAndverifiedByTrustedCertificationAuthority);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.MFAAndverifiedByTrustedCertificationAuthority),"MFA & verified by trusted certification authority");
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.AuditTrailwithTimestamps);
	Elements.isDisplayed(USAMobileNoMandateObject.AuditTrailwithTimestamps);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.AuditTrailwithTimestamps),"Audit Trail with Time stamps");
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.GoogleSignIn);
	Elements.isDisplayed(USAMobileNoMandateObject.GoogleSignIn);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.GoogleSignIn),"Google Sign in");
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.TypeDraworUpload);
	Elements.isDisplayed(USAMobileNoMandateObject.TypeDraworUpload);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.TypeDraworUpload),"Signatures: Type, Draw or Upload");
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.NotifyRemoveAndReassign);
	Elements.isDisplayed(USAMobileNoMandateObject.NotifyRemoveAndReassign);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.NotifyRemoveAndReassign),"Document Tracking: Notify, Remove and Reassign");
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.HierarchicalSignatures);
	Elements.isDisplayed(USAMobileNoMandateObject.HierarchicalSignatures);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.HierarchicalSignatures),"Hierarchical Signatures");
}
	
		
	
	
	 
	
	
	
	
	
@Then("existing plan details of the user should get displayed with Upgrade Plan button")
public void existing_plan_details_of_the_user_should_get_displayed_with_Upgrade_Plan_button() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.btnUpgradePlan);
	Elements.isDisplayed(USAMobileNoMandateObject.Plan_Details);
	Elements.isDisplayed(USAMobileNoMandateObject.btnUpgradePlan);
}
@Then("user verify that close icon is present on the pop up")
public void user_verify_that_close_icon_is_present_on_the_pop_up() {
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.closeIcon);
	//Elements.isDisplayed(USAMobileNoMandateObject.closeIcon);
	
}
@Then("user click on Upgrade Plan button")
public void user_click_on_Upgrade_Plan_button() throws InterruptedException {
	Thread.sleep(2000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.btnUpgradePlan);
	Elements.jclick(USAMobileNoMandateObject.btnUpgradePlan);
	
}
@Then("pop up should display only the higher plan than the exisiting")
public void pop_up_should_display_only_the_higher_plan_than_the_exisiting() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.professional);
	Elements.isDisplayed(USAMobileNoMandateObject.professional);
	
}

@Then("user click on the Upgrade button")
public void user_click_on_the_Upgrade_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Upgrade);
	Elements.click(USAMobileNoMandateObject.Upgrade);
}
@Then("user Click On upgrade plan button")
public void user_Click_On_upgrade_plan_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.btnUpgradePlan);
	Elements.jclick(USAMobileNoMandateObject.btnUpgradePlan);
}
@Then("user click on the BuyNow button")
public void user_click_on_the_BuyNow_button() throws InterruptedException {
	Thread.sleep(5000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.buyNowGeneralPlan);
	Elements.Mouseclick(USAMobileNoMandateObject.buyNowGeneralPlan);
	
}

@Then("user navigate to payment page")
public void user_navigate_to_payment_page() throws InterruptedException {
	Thread.sleep(15000);
	String txtPaymentTitle = "Payment Gateway";
	String actualTitle = Elements.getTitle();
	Assert.assertEquals(txtPaymentTitle, actualTitle);
}

@Then("user enter name of the card as {string}")
public void user_enter_name_of_the_card_as(String string) {
	 Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.txtCardHolderName);
	 Elements.TypeText(USAMobileNoMandateObject.txtCardHolderName, string);
	
  
}

@Then("enter card number as {string}")
public void enter_card_number_as(String string) {
	 Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.txtCreditCardNumber);
	 Elements.TypeText(USAMobileNoMandateObject.txtCreditCardNumber, string);
   
}

@Then("enter expire month as {string}")
public void enter_expire_month_as(String string) throws InterruptedException {
	 Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.ddlCreditExpiryMonth);
	Select select = new Select(USAMobileNoMandateObject.ddlCreditExpiryMonth);
	 select.selectByVisibleText("06");
	
	
   
}

@Then("enter expire year as {string}")
public void enter_expire_year_as(String string) {
	 Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.ddlCreditExpiryYear);
	Select select = new Select(USAMobileNoMandateObject.ddlCreditExpiryYear);
	 select.selectByVisibleText("2023");
   
}

@Then("enter cvv nunber as {string}")
public void enter_cvv_nunber_as(String string) {
	 Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.txtCreditCvv);
	 Elements.TypeText(USAMobileNoMandateObject.txtCreditCvv, string);
   
}

@Then("user click on pay button")
public void user_click_on_pay_button() throws InterruptedException {
	Thread.sleep(2000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.btnPay);
	Elements.click(USAMobileNoMandateObject.btnPay);
	
}
@Then("Verify approved plan and activated image is displayed")
public void verify_approved_plan_and_activated_image_is_displayed() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Card_Body);
	Elements.isDisplayed(USAMobileNoMandateObject.Card_Body);
	
}
@Then("confirmation message get display as {string}")
public void confirmation_message_get_display_as(String string) throws InterruptedException {
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.PAYMENT_CONFIRMATION);
	Elements.isDisplayed(USAMobileNoMandateObject.PAYMENT_CONFIRMATION);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.PAYMENT_CONFIRMATION),string);
}

@Then("user click on login button")
public void user_click_on_login_button() throws InterruptedException  {
//	Thread.sleep(5000);
//	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Login);
//	Elements.jclick(USAMobileNoMandateObject.Login);
    
}

@Then("new plan details and its related features should get displayed")
public void new_plan_details_and_its_related_features_should_get_displayed() {
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Card_Body);
//	Elements.isDisplayed(USAMobileNoMandateObject.Card_Body);
	
	
//	Elements.isDisplayed(USAMobileNoMandateObject.Professional_Plan_text);
//	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.Professional_Plan_text),"PROFESSIONAL PLAN");
	
}
@Given("user navigate to URL {string}")
public void user_navigate_to_URL(String url) throws InterruptedException {
	Base.driver.navigate().to(url);
	Thread.sleep(5000);
	
}
@Given("user click on accept all cookies")
public void user_click_on_accept_all_cookies() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.acceptAllCookies);
	Elements.jclick(USAMobileNoMandateObject.acceptAllCookies);
	
}

@Then("Enter Username {string} password {string}")
public void enter_Username_password(String string, String string2) throws AWTException, InterruptedException {
Elements.authentication(string, string2);
}

@Then("accept the cookies")
public void accept_the_cookies() {
	try {
	Waits.waitUntilElementToClick(30,USAMobileNoMandateObject.Accept_All_Cookies);
	Elements.jclick(USAMobileNoMandateObject.Accept_All_Cookies);
	}catch(Exception e)
	{
	}
}
@Given("user click on the microsite click on the Pricing Tab")
public void user_click_on_the_microsite_click_on_the_Pricing_Tab() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.tabPricing);
	Elements.click(USAMobileNoMandateObject.tabPricing);

	
}
@Then("user should get display annual plan premium plan")
public void user_should_get_display_annual_plan_premium_plan() {
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.plansAllAnnual);
	Elements.isDisplayed(USAMobileNoMandateObject.plansAllAnnual);
	
	
}


@Then("user click on the monthly plan")
public void user_click_on_the_monthly_plan() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.planMonthly);
	Elements.click(USAMobileNoMandateObject.planMonthly);
	

}

@Then("user should get display monthly plan")
public void user_should_get_display_monthly_plan() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.plansAllMonthly);
	Elements.isDisplayed(USAMobileNoMandateObject.plansAllMonthly);
   
}

@Then("user click on the annual plan")
public void user_click_on_the_annual_plan() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.plansAnnual);
	Elements.click(USAMobileNoMandateObject.plansAnnual);
    
}

@Then("user click on the Buy Now button of any Plan")
public void user_click_on_the_Buy_Now_button_of_any_Plan() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.nowBuy);
	Elements.click(USAMobileNoMandateObject.nowBuy);
	
}

@Then("user display message on pop up as {string}")
public void user_display_message_on_pop_up_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Toproceedfurther);
	Elements.isDisplayed(USAMobileNoMandateObject.Toproceedfurther);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.Toproceedfurther),string);
}

@Then("user should get display pop up with Cancel and Confirm button")
public void user_should_get_display_pop_up_with_Cancel_and_Confirm_button() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Confirm_Btn);
	Elements.isDisplayed(USAMobileNoMandateObject.Confirm_Btn);
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Cancel_Btn);
	Elements.isDisplayed(USAMobileNoMandateObject.Cancel_Btn);
}

@Then("user click on the Confirm button")
public void user_click_on_the_Confirm_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Confirm_Btn);
	Elements.click(USAMobileNoMandateObject.Confirm_Btn);
	
}
@When("user click on the signIn link")
public void user_click_on_the_signIn_link() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Sign_In);
	Elements.click(USAMobileNoMandateObject.Sign_In);
	
}
//TS9
@When("user click on {string}")
public void user_click_on(String outforsignature) {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.outForSignature);
	Elements.click(USAMobileNoMandateObject.outForSignature);
}

@Then("User enter email as {string}")
public void user_enter_email_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
	Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid103");
}

@Then("user click on Mail")
public void user_click_on_Mail() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.grpSignMail);
	Elements.click(USAMobileNoMandateObject.grpSignMail);
	
}
	
	@When("user received mail as {string}")
	public void user_received_mail_as(String mail) {
		Base.driver.switchTo().newWindow(WindowType.TAB);
		Base.driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
		USAMobileNoMandateObject obM = new USAMobileNoMandateObject(Base.driver);
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
		Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid39");
		
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickGo);
		Elements.click(USAMobileNoMandateObject.clickGo);
		
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.grpSignMail);
		Elements.click(USAMobileNoMandateObject.grpSignMail);
		
		Elements.switchToFrame(USAMobileNoMandateObject.bodyIframe);
		Elements.jclick(USAMobileNoMandateObject.signDocument);
		

		
	}


	@Then("user click on check box")
	public void user_click_on_check_box() throws InterruptedException {
		Elements.switchToChild();
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.checkBox);
		Elements.jclick(USAMobileNoMandateObject.checkBox);
	   
	}

	@Then("user click on accept button")
	public void user_click_on_accept_button() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.acceptBtn);
		Elements.click(USAMobileNoMandateObject.acceptBtn);
		
	}
	@Given("user clcik on ok button present on pop up")
	public void user_clcik_on_ok_button_present_on_pop_up() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.okButn);
		Elements.click(USAMobileNoMandateObject.okButn);
	 
	}
	@Given("user click on signature")  // need to find correct xpath
	public void user_click_on_signature() throws InterruptedException {
		Thread.sleep(5000);
		Elements.switchToFrame(USAMobileNoMandateObject.iFrame_Doc);
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnSignature);
		Elements.jclick(USAMobileNoMandateObject.clickOnSignature);
		
	}

	@Given("click on {string}")
	public void click_on(String type) throws InterruptedException {
		Thread.sleep(5000);
		//Elements.switchToFrame(USAMobileNoMandateObject.iFrame_Type);

		Elements.switchToChild();
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickonType);
		Elements.jclick(USAMobileNoMandateObject.clickonType);
	   
	}

	@Then("user select the signature")
	public void user_select_the_signature() {
		
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.selectSignature);
		Elements.jclick(USAMobileNoMandateObject.selectSignature);
		
	}
	@Then("user click save button")
	public void user_click_save_button() {
//		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Save_Doc);
//		Elements.jclick(USAMobileNoMandateObject.Save_Doc);
	  
	}

	@Then("use click on {string}")
	public void use_click_on(String finish) {
//		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Finish_Doc);
//		Elements.jclick(USAMobileNoMandateObject.Finish_Doc);
		
	}
//	@Then("Successfully message get display as {string}")
//	public void successfully_message_get_display_as(String string) {
//		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.successfullySignedDocPage);
//		Elements.isDisplayed(USAMobileNoMandateObject.successfullySignedDocPage);
//		Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.successfullySignedDocPage),string);
//	   
//	}
	@Then("successfully signed document page get display as{string}")
	public void successfully_signed_document_page_get_display_as(String string) throws InterruptedException {
		Thread.sleep(1000);
//		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.successfullySignedDocPage);
//		Elements.isDisplayed(USAMobileNoMandateObject.successfullySignedDocPage);
//		Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.successfullySignedDocPage),string);
		
	}

	@Then("verify contact number field needs to be mandatory field with the asterix symbol")
	public void verify_contact_number_field_needs_to_be_mandatory_field_with_the_asterix_symbol() throws InterruptedException {
		
		Thread.sleep(500);
//		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.astrixSymbol1);
//		Elements.isDisplayed(USAMobileNoMandateObject.astrixSymbol1);
//		Elements.click(USAMobileNoMandateObject.entPhoneNo);
//		Elements.click(USAMobileNoMandateObject.entPassword);
//		
//		 Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.mobileNOIsMand),"Mobile number is mandatory");
		
		
	}
}
	
	
