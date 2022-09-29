package stepDefinitions;

import java.io.File;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

import baseinit.Base;
import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DeleteObject;
import pageObjects.MyFilesObject;
import pageObjects.USAMobileNoMandateObject;
import pageObjects.XpasswrdProdoc;



public class PasswrdProtectedDoc {
	
	public WebDriver driver;
	
//
//	@Given("user navigate to URL {string}")
//	public void user_navigate_to_URL(String url) { 	Base.driver.navigate().to(url);
//		XpasswrdProdoc ob = new XpasswrdProdoc(Base.driver);
//	}
//	@When("user enter user id as {string}")
//	public void user_enter_user_id_as(String userid) {
//Waits.waitUntilElementLocated(30, XpasswrdProdoc.emailId);
//Elements.TypeText(XpasswrdProdoc.emailId, userid);
//}
//	
//	
//	
//	@When("user enter password as {string}")
//	public void user_enter_password_as(String password) {
//		Waits.waitUntilElementLocated(30, XpasswrdProdoc.passwd);
//		Elements.TypeText(XpasswrdProdoc.passwd, password);
//	

	
//}
//	@When("user click on Sign In")
//	public void user_click_on_Sign_In() throws InterruptedException {
//		Waits.waitUntilElementToClick(30, XpasswrdProdoc.signInClick);
//		Elements.click(XpasswrdProdoc.signInClick);
//		Thread.sleep(10000);
//}

//@Then("user navigate to dashboard")
//public void user_navigate_to_dashboard() throws InterruptedException {
//		Waits.waitUntilElementLocated(30, XpasswrdProdoc.dashboard);
//	    Assert.assertEquals(Elements.getText(XpasswrdProdoc.dashboard),"Dashboard");
//    Thread.sleep(15000);
//		
//	}	
@When("user click on group sign")
	public void user_click_on_group_sign() throws InterruptedException {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.grpSignBtn);
		Elements.click(USAMobileNoMandateObject.grpSignBtn);
		Thread.sleep(10000);
		
	}

//	@When("user click on browser and upload {string}")
//	public void user_click_on_browser_and_upload(String filename)throws InterruptedException {
//Waits.waitUntilElementToClick(30, XpasswrdProdoc.browseClick);
//Elements.click(XpasswrdProdoc.browseClick);
////driver.findElement(By.xpath("//*[text()='Browse']")).sendKeys("C:\\Users\\siddhant.ingole\\Downloads\\TimoManual.pdf");
////Elements.TypeText(XpasswrdProdoc.browseClick,"C:\\Users\\siddhant.ingole\\Downloads\\TimoManual.pdf");
//   Thread.sleep(5000);
//   
// Actions action = new Actions(Base.driver);
// 
// WebElement chooseFile = driver.findElement(By.xpath("//*[text()='Browse']"));
// 
// action.moveToElement(chooseFile).perform();
// chooseFile.sendKeys("C:\\Users\\siddhant.ingole\\Downloads\\TimoManual.pdf");
// 
// 		
//  
//}

@Then("user get display message as {string}")
public void user_get_display_message_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.fileUploadSuccessfully);
	Elements.isDisplayed(USAMobileNoMandateObject.fileUploadSuccessfully);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.fileUploadSuccessfully),string);
	
}
       
	
@When("user click on save and continue")
public void user_click_on_save_and_continue() throws InterruptedException {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.btnSaveAndCon);
	Elements.jclick(USAMobileNoMandateObject.btnSaveAndCon);
	Thread.sleep(5000);
}

@When("user navigate to add signatories")
public void user_navigate_to_add_signatories() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.addSignatory);
	Elements.isDisplayed(USAMobileNoMandateObject.addSignatory);

}


@When("user enter signatory name as {string}")
public void user_enter_signatory_name_as(String name) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.signName);
	Elements.TypeText(USAMobileNoMandateObject.signName, name);
	
}
@When("user enter signatory email id as {string}")
public void user_enter_signatory_email_id_as(String emailid) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.signEmailId);
	Elements.TypeText(USAMobileNoMandateObject.signEmailId, emailid);
	
}
@When("user select checkbox as {string}")
public void user_select_checkbox_as(String string) {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.check_Box);
	Elements.jclick(USAMobileNoMandateObject.check_Box);
	
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Password_Field);
	Elements.isEnabled(USAMobileNoMandateObject.Password_Field);
	
}
@Then("Enter password as {string}")
public void enter_password_as(String password) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.astrix_ymbol);
	Elements.isDisplayed(USAMobileNoMandateObject.astrix_ymbol);
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Password_Field);
	Elements.isEnabled(USAMobileNoMandateObject.Password_Field);
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Password_Field);
	Elements.TypeText(USAMobileNoMandateObject.Password_Field, password);
	
}
	

	@Then("User should not be able to continue with blank password")
	public void user_should_not_be_able_to_continue_with_blank_password() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.btnSaveAndCon);
		Elements.isEnabled(USAMobileNoMandateObject.btnSaveAndCon);
		
	
		
	}
	
	
	
	
	@Given("user navigate to {string}")
	public void user_navigate_to(String string) {
		Base.driver.switchTo().newWindow(WindowType.TAB);
		Base.driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
		USAMobileNoMandateObject obM = new USAMobileNoMandateObject(Base.driver);
	}

	@Given("user enter email id as {string}")
	public void user_enter_email_id_as(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
		Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid218");
	   
	}

	@Then("user click on Go button")
	public void user_click_on_Go_button() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickGo);
		Elements.jclick(USAMobileNoMandateObject.clickGo);
		
	}

@Then("user click on drysign")
public void user_click_on_drysign() throws InterruptedException {
	Thread.sleep(2000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnDrySign);
	Elements.click(USAMobileNoMandateObject.clickOnDrySign);
 
}

@Then("user click on sign document")
public void user_click_on_sign_document() throws InterruptedException {
	Elements.switchToFrame(USAMobileNoMandateObject.bodyIframe);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Sign_Document);
	Elements.jclick(USAMobileNoMandateObject.Sign_Document);
	Thread.sleep(5000);
	
}
@Then("user get display pop up with message as {string}")
public void user_get_display_pop_up_with_message_as(String string) throws InterruptedException {
	//Elements.switchToChild();
	//Elements.switchToFrame(USAMobileNoMandateObject.IFrame1);
	Thread.sleep(2000);
	Waits.waitUntilElementLocated(30,USAMobileNoMandateObject.PleaseEnterThePassword);
	Elements.isDisplayed(USAMobileNoMandateObject.PleaseEnterThePassword);
	//Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.PleaseEnterThePassword),string);

	
}
@Then("user enter Password as {string}")
public void user_enter_Password_as(String string) {
	
	
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.EnterPassword);
	Elements.TypeText(USAMobileNoMandateObject.EnterPassword,string);
  
	
}
@Then("click On Submit button")
public void click_On_Submit_button() throws InterruptedException {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickSubmit1);
	Elements.click(USAMobileNoMandateObject.clickSubmit1);
//	Thread.sleep(2000);
}

@Then("click on submit button")
public void click_on_submit_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickSubmit);
	Elements.click(USAMobileNoMandateObject.clickSubmit);
	Elements.clearTxtBox(USAMobileNoMandateObject.EnterPassword);
	
   
}

@Then("user should get display error message as {string}")
public void user_should_get_display_error_message_as(String string) throws InterruptedException {
	Thread.sleep(2000);
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.YouHaveEnteredIncorrectPassword);
	Elements.isDisplayed(USAMobileNoMandateObject.YouHaveEnteredIncorrectPassword);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.YouHaveEnteredIncorrectPassword),string);
	
	
}
@Then("user correct password as {string}")
public void user_correct_password_as(String string) throws InterruptedException {
	//Elements.switchToFrame(USAMobileNoMandateObject.IFrame1);
	Elements.switchToChild();
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.EnterPassword);
	Elements.TypeText(USAMobileNoMandateObject.EnterPassword,string);
}

@Then("click on Submit button")
public void click_on_Submit_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Submit_Btn);
	Elements.click(USAMobileNoMandateObject.Submit_Btn);
	
}
@Then("user should display in asteric symbol or circular dots")
public void user_should_display_in_asteric_symbol_or_circular_dots() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Symbol_Astrix);
	Elements.isDisplayed(USAMobileNoMandateObject.Symbol_Astrix);
  
}

@Then("Pop up get display as {string}")
public void pop_up_get_display_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.ConsentToProceedElectronically);
	Elements.isDisplayed(USAMobileNoMandateObject.ConsentToProceedElectronically);
	//Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.ConsentToProceedElectronically),string);
	
}
@Then("user click on out for signature")
public void user_click_on_out_for_signature() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.OutforSignature);
	Elements.jclick(USAMobileNoMandateObject.OutforSignature);
    
}

@Then("user click on plus icon as {string}")
public void user_click_on_plus_icon_as(String string) {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.plus_Icon);
	Elements.jclick(USAMobileNoMandateObject.plus_Icon);
	
 
}

@Then("user click on reassign field")
public void user_click_on_reassign_field() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Reassign);
	Elements.jclick(USAMobileNoMandateObject.Reassign);
  
}


@Then("click yes button present on pop up")
public void click_yes_button_present_on_pop_up() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Yes_Btn);
	Elements.jclick(USAMobileNoMandateObject.Yes_Btn);
	
}
@Then("user the enter name as {string}")
public void user_the_enter_name_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.New_Name);
	Elements.TypeText(USAMobileNoMandateObject.New_Name,string);
}
    


@Then("user enter email address as {string}")
public void user_enter_email_address_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Email_Address);
	Elements.TypeText(USAMobileNoMandateObject.Email_Address,string);
	
	
}
@Then("Blank page should get display")
public void blank_page_should_get_display() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Blank_Page);
	Elements.isDisplayed(USAMobileNoMandateObject.Blank_Page);
	
}
@Then("user email id as {string}")
public void user_email_id_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
	Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid12");
	
}

//Ts2
//@When("signatory open the sign document")
//public void signatory_open_the_sign_document() {
//	Waits.waitUntilElementToClick(30, XpasswrdProdoc.btnSaveAndCon);
//	Elements.click(XpasswrdProdoc.btnSaveAndCon);
//}
//@When("user enter username as {string}")
//public void user_enter_username_as(String username) throws InterruptedException {
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.userName);
//	Elements.jTypeText(USAMobileNoMandateObject.userName,username );
//}
//@When("user click on next button")
//public void user_click_on_next_button() {
//	Waits.waitUntilElementLocated(30, XpasswrdProdoc.userName);
//	Elements.click(XpasswrdProdoc.btnNext);


@Given("user Enter email id as {string}")
public void user_Enter_email_id_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
	Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid231");
	
}
@Then("user get display Error Message as {string}")
public void user_get_display_Error_Message_as(String string) throws InterruptedException {

	Elements.switchToChild();
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Document_is_not_completely);
	Elements.isDisplayed(USAMobileNoMandateObject.Document_is_not_completely);
	Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.Document_is_not_completely),string);
	//Assert.assertEquals(Elements.getText(MyFilesObject.TimingSign6),"08/16/2022 11:06:55 AM");
}
@Given("User Enter email id as {string}")
public void User_Enter_email_id_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
	Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid202");
	
}
@Then("user click on remove")
public void user_click_on_remove() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Remove3);
	Elements.jclick(USAMobileNoMandateObject.Remove3);
}

@Then("user click on Confirm Btn")
public void user_click_on_Confirm_Btn() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.popUpDeleteConfirm);
	Elements.jclick(USAMobileNoMandateObject.popUpDeleteConfirm);
	
}
@Then("click on Ok button")
public void click_on_Ok_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.tabSecurityOk);
	Elements.jclick(USAMobileNoMandateObject.tabSecurityOk);
}
@Given("user Enter email Id as {string}")
public void user_Enter_email_Id_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
	Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid204");
}
@Then("mail is not present")
public void mail_is_not_present() {
	Waits.setImplicitWait(10);

	List<WebElement> tabs=USAMobileNoMandateObject.malinatorMail;
	if(tabs.size()>0) {
		Assert.assertTrue(false);
		
	}
	else {
		Assert.assertTrue(true);
	}
}
@When("user click on Out for signature tab")
public void user_click_on_Out_for_signature_tab() throws InterruptedException {
	
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.OutforSignature);
	Elements.jclick(USAMobileNoMandateObject.OutforSignature);
}
}

