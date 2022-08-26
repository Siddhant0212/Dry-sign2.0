package stepDefinitions;

import org.openqa.selenium.WindowType;

import baseinit.Base;
import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.DeleteObject;
import pageObjects.USAMobileNoMandateObject;


public class DeleteUser {

//	
//	
//	@When("enter the user name as {string}")
//	public void enter_the_user_name_as(String username) {
//		Waits.waitUntilElementLocated(30, DeleteObject.emailId);
//		Elements.TypeText(DeleteObject.emailId, username);
//	      
//	        //Thread.sleep(2500);
//	
//	}
//
//	@When("enter the password as{string}")
//	public void enter_the_password_as(String password) {
//		Waits.waitUntilElementLocated(30, DeleteObject.passWd);
//		Elements.TypeText(DeleteObject.passWd, password);
//	  
//	}
//
//	@When("user click on the sign in button")
//	public void user_click_on_the_sign_in_button() throws InterruptedException {
//		Waits.waitUntilElementToClick(30, DeleteObject.sub);
//    	Elements.click(DeleteObject.sub);
//    	Thread.sleep(2000);
//	 
//	}

//	@When("dashboard window get display")
//	public void dashboard_window_get_display() {
//		Waits.waitUntilElementLocated(30, DeleteObject.dashboard);
//	    Assert.assertEquals(Elements.getText(DeleteObject.dashboard),"Dashboard");
//
//	}
//
//	@When("user click on mat icon")
//	public void user_click_on_mat_icon() throws InterruptedException {
//		Waits.waitUntilElementLocated(50, DeleteObject.icon);
//     	Waits.waitUntilElementToClick(30, DeleteObject.icon);
//     	Thread.sleep(20000);
//        Elements.jclick(DeleteObject.icon);
//	}
//     	
     	//WebDriverWait wait = new WebDriverWait(driver, 10);
     	//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@formcontrolname='reportingDealPermission']")));
     	//((JavascriptExecutor)Base.driver).executeScript("arguments[0].click();", XpathUserFre.icon);
    		
	 
	
//	@When("user click on profile icon")
//    public void user_click_on_profile_icon() throws InterruptedException {
//    	Thread.sleep(5000);
//    	Waits.waitUntilElementToClick(30, DeleteObject.profile);
//    	DeleteObject.profile.click();
//		//Elements.click(XpathUserFre.profile);
//	}
//
//    @When("user click on manage account")
//    public void user_click_on_manage_account() throws InterruptedException {
//    	Waits.waitUntilElementToClick(30, DeleteObject.mangeAcc);
//    	Thread.sleep(3000);
//		Elements.click(DeleteObject.mangeAcc);
   //TS2     
//}

	@Then("Delete Account button should be present")
	public void delete_Account_button_should_be_present() {
		Waits.waitUntilElementToClick(30, DeleteObject.delAcc);
		Elements.isDisplayed(DeleteObject.delAcc);
		

}
//	@Then("user click on delete account")
//	public void user_click_on_delete_account() {
//		Waits.waitUntilElementToClick(30, DeleteObject.delAcc);
//		Elements.click(DeleteObject.delAcc);
//		
//	}
	@Then("user should get displayed Cancel button")
	public void user_should_get_displayed_Cancel_button() {
		Waits.waitUntilElementToClick(30, DeleteObject.btnCancel);
		Elements.isDisplayed(DeleteObject.btnCancel);
	}
	@Then("user should get displayed Delete Account button")
	public void user_should_get_displayed_Delete_Account_button() {
		Waits.waitUntilElementToClick(30, DeleteObject.btnDeleteAcc);
		Elements.isDisplayed(DeleteObject.btnDeleteAcc);
		
		
	   
	}

	@When("user click on the cancel button")
	public void user_click_on_the_cancel_button() {
	 	Waits.waitUntilElementToClick(30, DeleteObject.btnCancel);
		Elements.click(DeleteObject.btnCancel);
		
	}
	@When("user click on the delete account")
	public void user_click_on_the_delete_account() {
		Waits.waitUntilElementToClick(30, DeleteObject.btnDeleteAcc);
		Elements.click(DeleteObject.btnDeleteAcc);
		
	}
//	@When("pop up get displayed")
//	public void pop_up_get_displayed() {
//		Waits.waitUntilElementToClick(30, DeleteObject.popUpSmall);
//    //Assert.assertEquals(Elements.getText(DeleteObject.popUpSmall)," Deleting Your Account ");
//		Elements.isDisplayed(DeleteObject.popUpSmall);
//	}
	@When("user again click on the delete account")
	public void user_again_click_on_the_delete_account() throws InterruptedException {
		Waits.waitUntilElementToClick(30, DeleteObject.btnDeleteAcc);
		Elements.click(DeleteObject.btnDeleteAcc);
		Thread.sleep(2000);
		
	}
	@When("user select the check box")
	public void user_select_the_check_box() {
		Waits.waitUntilElementToClick(30, DeleteObject.clickOnCheckBox);
		Elements.jclick(DeleteObject.clickOnCheckBox);
		
	}
//	@When("user click on confirm button")
//	public void user_click_on_confirm_button() {
//		Waits.waitUntilElementToClick(30, DeleteObject.btnConfirm);
//		Elements.click(DeleteObject.btnConfirm);
//		
//	}
	@Then("user should get display another pop up")
	public void user_should_get_display_another_pop_up() {
		Waits.waitUntilElementToClick(30, DeleteObject.popUpwithOk);
		Elements.isDisplayed(DeleteObject.popUpwithOk);
		
	}
	

@When("user Click on Ok button present on the pop up")
public void user_Click_on_Ok_button_present_on_the_pop_up() {
	Waits.waitUntilElementToClick(30, DeleteObject.popUpOk);
	Elements.click(DeleteObject.popUpOk);
}
@When("user recevied verify email as {string}")
public void user_recevied_verify_email_as(String email) {
	Base.driver.switchTo().newWindow(WindowType.TAB);
	Base.driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
	DeleteObject obM = new DeleteObject(Base.driver);
	
	Waits.waitUntilElementLocated(30, DeleteObject.mailinatorInPut1);
	Elements.TypeText(DeleteObject.mailinatorInPut1,"sid94");
	
	Waits.waitUntilElementToClick(30, DeleteObject.clickGo);
	Elements.click(DeleteObject.clickGo);
	
	Waits.waitUntilElementToClick(30,DeleteObject.grpSignMail);
	Elements.click(DeleteObject.grpSignMail);
	
	Elements.switchToFrame(DeleteObject.bodyIframe);
	Elements.click(DeleteObject.Delete_Account);
	

	
}
@Then("An Confirmation screen should get displayed as {string}.")
public void an_Confirmation_screen_should_get_displayed_as(String string) throws InterruptedException  {

	Thread.sleep(5000);
	//Waits.waitUntilElementLocated(30, DeleteObject.Youhavesuccessfullydeletedaccount);
	//Elements.isDisplayed(DeleteObject.Youhavesuccessfullydeletedaccount);
	//Assert.assertEquals(Elements.getText(DeleteObject.Youhavesuccessfullydeletedaccount),string);
	
	
	
	
}
//TS3
@Then("user should get display the validation message as {string}")
public void user_should_get_display_the_validation_message_as(String errormessage) {
	Waits.waitUntilElementToClick(30, DeleteObject.InvalidUsernameOrPassword);
	Elements.isDisplayed(DeleteObject.InvalidUsernameOrPassword);
	Assert.assertEquals(Elements.getText(DeleteObject.InvalidUsernameOrPassword),"Invalid username or password");
	

	
	
	
	
}
//TS4
@Given("user click on forgot password")
public void user_click_on_forgot_password() {
	Waits.waitUntilElementToClick(30, DeleteObject.clickForgotPass);
	Elements.click(DeleteObject.clickForgotPass);
	}
@Given("user enter deleted email address as {string}")
public void user_enter_deleted_email_address_as(String forgotpassword) {
	Waits.waitUntilElementLocated(30, DeleteObject.enterEmailAdd);
	Elements.TypeText(DeleteObject.enterEmailAdd, forgotpassword);
	}
@Given("user click on the send reset email")
public void user_click_on_the_send_reset_email() {
	Waits.waitUntilElementToClick(30, DeleteObject.clickSendResetEmail);
	Elements.click(DeleteObject.clickSendResetEmail);
	
}


@Then("user should get displayed message as {string}")
public void user_should_get_displayed_message_as(String string) {
	Waits.waitUntilElementToClick(30, DeleteObject.InvalidEmailOrUserDoesNotExist);
	Elements.isDisplayed(DeleteObject.InvalidEmailOrUserDoesNotExist);
	Assert.assertEquals(Elements.getText(DeleteObject.InvalidEmailOrUserDoesNotExist),"Invalid email or user does not exist");

	
	
	
}
//TS5
//@When("click on sign up")
//public void click_on_sign_up() {
//	Waits.waitUntilElementToClick(30, DeleteObject.clickOnSignUp);
//	Elements.click(DeleteObject.clickOnSignUp);
//	}
//@When("enter first name as {string}")
//public void enter_first_name_as(String firstname) {
//	Waits.waitUntilElementLocated(30, DeleteObject.entFirstName);
//	Elements.TypeText(DeleteObject.entFirstName, firstname);
//	}
//@When("enter last name as {string}")
//public void enter_last_name_as(String lastname) {
//	Waits.waitUntilElementLocated(30, DeleteObject.entLastName);
//	Elements.TypeText(DeleteObject.entLastName, lastname);
//}
//@When("enter company name as {string}")
//public void enter_company_name_as(String companyname) {
//	Waits.waitUntilElementLocated(30, DeleteObject.entCompName);
//	Elements.TypeText(DeleteObject.entCompName, companyname);
//}
//@When("enter the deleted email as {string}")
//public void enter_the_deleted_email_as(String deleteemail) {
//	Waits.waitUntilElementLocated(30, DeleteObject.entEmail);
//	Elements.TypeText(DeleteObject.entEmail, deleteemail);
//}
//@When("enter mobile number as {string}")
//public void enter_mobile_number_as(String mobilenumber) {
//	Waits.waitUntilElementLocated(30, DeleteObject.entPhoneNo);
//	Elements.TypeText(DeleteObject.entPhoneNo,mobilenumber);
//	
//}
//@When("enter password as {string}")
//public void enter_password_as(String password) {
//	Waits.waitUntilElementLocated(30, DeleteObject.entPassword);
//	Elements.TypeText(DeleteObject.entPassword,password);
//}
//@When("enter confirm password as {string}")
//public void enter_confirm_password_as(String confirmpassword) {
//	Waits.waitUntilElementLocated(30, DeleteObject.entConfirmPassword);
//	Elements.TypeText(DeleteObject.entConfirmPassword,confirmpassword);
//}
//@When("click on check box")
//public void click_on_check_box() {
//	Waits.waitUntilElementLocated(30, DeleteObject.clickCheckBox);
//	Elements.click(DeleteObject.clickCheckBox);
//	
//}
//@Given("user click on sign up button")
//public void user_click_on_sign_up_button() {
//	Waits.waitUntilElementLocated(30, DeleteObject.clickOnSignUp);
//	Elements.click(DeleteObject.clickOnSignUp);
//	
//}
//@Then("already deleted user should get re-register successfully on Signup")
//public void already_deleted_user_should_get_re_register_successfully_on_Signup() {
//	Waits.waitUntilElementToClick(30, DeleteObject.successOnSignUp);
//	Elements.isDisplayed(DeleteObject.successOnSignUp);
//	
//	
//}
	//TS6
@When("already deleted user enter the user name as {string}")
public void already_deleted_user_enter_the_user_name_as(String username) {
	Waits.waitUntilElementLocated(30, DeleteObject.emailId);
	Elements.TypeText(DeleteObject.emailId,username);
	}


@Then("display all the details related to Free user on the Dashboard")
public void display_all_the_details_related_to_Free_user_on_the_Dashboard() throws InterruptedException {
	Thread.sleep(2000);
	Waits.waitUntilElementToClick(30, DeleteObject.disFreeUser);
	Elements.isDisplayed(DeleteObject.disFreeUser);
	
}
}

