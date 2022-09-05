package stepDefinitions;


import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

import baseinit.Base;
import pageObjects.DeleteObject;
import pageObjects.MFAObject;
import pageObjects.USAMobileNoMandateObject;


public class MFA {
	
	String OTP;
	String currentID;

@When("user should display security tab")
public void user_should_display_security_tab() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.tabSecurity);
	Elements.isDisplayed(USAMobileNoMandateObject.tabSecurity);
	
  
}

@When("user click on security tab")
public void user_click_on_security_tab() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.tabSecurity);
	Elements.click(USAMobileNoMandateObject.tabSecurity);
  
}

@Then("user should display email OTP")
public void user_should_display_email_OTP() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.emailOtp);
	Elements.isDisplayed(USAMobileNoMandateObject.emailOtp);

}

@Then("user should display setup secure code")
public void user_should_display_setup_secure_code() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.setupSecureCode);
	Elements.isDisplayed(USAMobileNoMandateObject.setupSecureCode);

}

@Then("user select on checkbox for email OTP")
public void user_select_on_checkbox_for_email_OTP() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.emailOtp);
	Elements.click(USAMobileNoMandateObject.emailOtp);

}
////TS5


@Then("user click on ok button present on pop up")
public void user_click_on_ok_button_present_on_pop_up() throws InterruptedException {
	Thread.sleep(2000);
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.tabSecurityOk);
	Elements.click(USAMobileNoMandateObject.tabSecurityOk);
	
    
}

@Then("user select on checkbox for setup secure code")
public void user_select_on_checkbox_for_setup_secure_code() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.setupSecureCode);
	Elements.click(USAMobileNoMandateObject.setupSecureCode);

}

@When("user click on update button")
public void user_click_on_update_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.tabSecurityUpdate);
	Elements.click(USAMobileNoMandateObject.tabSecurityUpdate);
	
}
@When("user is on login page")
public void user_is_on_login_page() {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.onLogInpage);
	Elements.isDisplayed(USAMobileNoMandateObject.onLogInpage);
	
}
//TS6
@When("user click on send one time password button")
public void user_click_on_send_one_time_password_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.sendOneTimePassword);
	Elements.click(USAMobileNoMandateObject.sendOneTimePassword);
	 currentID = Base.driver.getWindowHandle();
}


//@When("OTP received on register mail id as {string}")
//public void otp_received_on_register_mail_id_as(String string) throws InterruptedException {
//	Base.driver.switchTo().newWindow(WindowType.TAB);
//	Base.driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
//	USAMobileNoMandateObject obM = new USAMobileNoMandateObject(Base.driver);
//
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
//	Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid11");
//
//	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickGo);
//	Elements.click(USAMobileNoMandateObject.clickGo);
//	
//	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnOTP );
//	Thread.sleep(2000);
//	Elements.click(USAMobileNoMandateObject.clickOnOTP );
//
//	Elements.switchToFrame(USAMobileNoMandateObject.bodyIframe);
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.otp);
//	
//	String actualOTP = Elements.getText(USAMobileNoMandateObject.otp);
//	int lastIndex = actualOTP.indexOf(".");
//	System.out.println(lastIndex - 4);
//
//	Set<String> ids = Base.driver.getWindowHandles();
//	ArrayList<String> ls = new ArrayList<String>(ids);
//	String pID = ls.get(0);
//	Base.driver.switchTo().window(pID);
//
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code1);
//	Elements.TypeText(USAMobileNoMandateObject.code1, String.valueOf(lastIndex - 4));
//
//	Thread.sleep(1000);
//
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code2);
//	Elements.TypeText(USAMobileNoMandateObject.code2, String.valueOf(lastIndex - 3));
//
//	Thread.sleep(1000);
//
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code3);
//	Elements.TypeText(USAMobileNoMandateObject.code3, String.valueOf(lastIndex - 2));
//
//	Thread.sleep(1000);
//
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code4);
//	Elements.TypeText(USAMobileNoMandateObject.code4, String.valueOf(lastIndex - 1));
//}
 

@Then("user Navigate to URL {string}")
public void user_Navigate_to_URL(String string) {
	Base.driver.switchTo().newWindow(WindowType.TAB);
	Base.driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
	USAMobileNoMandateObject obM = new USAMobileNoMandateObject(Base.driver);
}

@Then("user enter email as {string}")
public void user_enter_email_as(String string) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
	Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid11");
}

@Then("user click on OTP message")
public void user_click_on_OTP_message() throws InterruptedException {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnOTP );
	Thread.sleep(2000);
	Elements.click(USAMobileNoMandateObject.clickOnOTP );
}

@Then("user copy the OTP")
public void user_copy_the_OTP() throws InterruptedException {
	Elements.switchToFrame(USAMobileNoMandateObject.bodyIframe);
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.otp);
	
	String actualOTP = Elements.getText(USAMobileNoMandateObject.otp);
	String[] words = actualOTP.split(" ");

	String lastWord = words[words.length-1];
	StringBuilder sb = new StringBuilder(lastWord);
	sb.deleteCharAt(lastWord.length()-1);
	OTP = sb.toString();
	
	Base.driver.switchTo().window(currentID);
	
	char[] enterOTP = OTP.toCharArray();
	for(int i=0;i<=enterOTP.length-1;i++)
	{
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.enterOTP(String.valueOf(i+1)));
	Elements.TypeText(USAMobileNoMandateObject.enterOTP(String.valueOf(i+1)),String.valueOf( enterOTP[i]));
	Thread.sleep(1000);
	
	}
	
//	int lastIndex = actualOTP.indexOf(".");
//	System.out.println(lastIndex - 4);

//	Set<String> ids = Base.driver.getWindowHandles();
//	ArrayList<String> ls = new ArrayList<String>(ids);
//	String pID = ls.get(0);
//	Base.driver.switchTo().window(pID);
//
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code1);
//	Elements.TypeText(USAMobileNoMandateObject.code1, String.valueOf(lastIndex - 4));
//
//	Thread.sleep(1000);
//
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code2);
//	Elements.TypeText(USAMobileNoMandateObject.code2, String.valueOf(lastIndex - 3));
//
//	Thread.sleep(1000);
//
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code3);
//	Elements.TypeText(USAMobileNoMandateObject.code3, String.valueOf(lastIndex - 2));
//
//	Thread.sleep(1000);
//
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code4);
//	Elements.TypeText(USAMobileNoMandateObject.code4, String.valueOf(lastIndex - 1));
}


	
@Then("user should get received Otp on email")
public void user_should_get_received_Otp_on_email() {
   
}

@Then("user should able to enter {int} digit OTP")
public void user_should_able_to_enter_digit_OTP(Integer int1) {
	
}
@When("enter the mailinator user name as {string}")
public void enter_the_mailinator_user_name_as(String mail) {
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInput);
	Elements.TypeText(USAMobileNoMandateObject.mailinatorInput, mail);
	
}
//TS6
@When("user click on go button")
public void user_click_on_go_button() {
	
	Elements.click(USAMobileNoMandateObject.clickGo);
	
}
@When("user click on mail")
public void user_click_on_mail() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnOTP);
	Elements.click(USAMobileNoMandateObject.clickOnOTP);
	
}
@When("user copy the text")
public void user_copy_the_text() throws InterruptedException {
	
	Elements.switchToFrame(USAMobileNoMandateObject.bodyIframe);
	
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.copyText);
	//Elements.click(USAMobileNoMandateObject.clickOnOTP);
	
	String otp = Elements.getText(USAMobileNoMandateObject.copyText);
	
	
	Elements.switchTodefaultContent();
	
	//String string =Base.driver.findElement(By.xpath("//p[text()='Your One Time Password (OTP) to login to your DrySign account is 9411.']")).getText();
//     Base.driver.findElement(By.xpath("//input[@autocomplete='one-time-code'][1]")).sendKeys(string);
//     Base.driver.findElement(By.xpath("//input[@autocomplete='one-time-code'][2]")).sendKeys(string);
//     Base.driver.findElement(By.xpath("//input[@autocomplete='one-time-code'][3]")).sendKeys(string);
//     Base.driver.findElement(By.xpath("//input[@autocomplete='one-time-code'][4]")).sendKeys(string);
}


//TS7
@When("user enter secure code as {string}")
public void user_enter_secure_code_as(String securecode) throws InterruptedException, AWTException {
	char[] enterSecureCode =securecode.toCharArray();
	for(int i=0;i<=enterSecureCode.length-1;i++)
	{
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.SecurePassword(String.valueOf(i+1)));
	Elements.TypeText(USAMobileNoMandateObject.SecurePassword(String.valueOf(i+1)),String.valueOf( enterSecureCode[i]));
	Thread.sleep(1000);
	

	}
	
}
@Then("enter secure code as {string}")
public void enter_secure_code_as(String securecode) throws InterruptedException {
	char[] enterSecureCode =securecode.toCharArray();
	for(int i=0;i<=enterSecureCode.length-1;i++)
	{
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Securecode(String.valueOf(i+1)));
	Elements.TypeText(USAMobileNoMandateObject.Securecode(String.valueOf(i+1)),String.valueOf( enterSecureCode[i]));
	Thread.sleep(1000);
	

	}
 
}

@Then("enter confirm secure code as {string}")
public void enter_confirm_secure_code_as(String confirmsecurecode) throws InterruptedException {
	char[] confirmSecureCode =confirmsecurecode.toCharArray();
	for(int i=0;i<=confirmSecureCode.length-1;i++)
	{
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.confirmSecureCode(String.valueOf(i+1)));
	Elements.TypeText(USAMobileNoMandateObject.confirmSecureCode(String.valueOf(i+1)),String.valueOf( confirmSecureCode[i]));
	Thread.sleep(1000);
	}
	
}
	
	
//	
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code1);
 //Elements.TypeText(USAMobileNoMandateObject.code1, string1);
//	
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code2);
//	Elements.TypeText(USAMobileNoMandateObject.code2, string1);
//	
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code3);
//	Elements.TypeText(USAMobileNoMandateObject.code3, string1);
//	
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code4);
//	Elements.TypeText(USAMobileNoMandateObject.code4, string1);
//	
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code5);
//	Elements.TypeText(USAMobileNoMandateObject.code5, string1);
//	
//	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code6);
//	Elements.TypeText(USAMobileNoMandateObject.code6, string1);
//	
//	Thread.sleep(2000);
//}
@Then("user get displayed confirm secure code text")
public void user_get_displayed_confirm_secure_code_text() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.textConfirmSecureCode);
	Elements.isDisplayed(USAMobileNoMandateObject.textConfirmSecureCode);
	
}


@When("user click on verify button")
public void user_click_on_verify_button() {
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnVerify);
	Elements.click(USAMobileNoMandateObject.clickOnVerify);

}

@When("user enter confirm secure code as {string}")
public void user_enter_confirm_secure_code_as(String confirmsecurecode) throws InterruptedException {
	char[] confirmSecureCode =confirmsecurecode.toCharArray();
	for(int i=0;i<=confirmSecureCode.length-1;i++)
	{
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.confirmSecurePassword(String.valueOf(i+1)));
	Elements.TypeText(USAMobileNoMandateObject.confirmSecurePassword(String.valueOf(i+1)),String.valueOf( confirmSecureCode[i]));
	Thread.sleep(1000);
	}
}

	
	@Then("pop should get displayed")
	public void pop_should_get_displayed() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.secureCodeSuccessfullyOnPop);
		Elements.isDisplayed(USAMobileNoMandateObject.secureCodeSuccessfullyOnPop);
	  
	}

	@Then("user click on ok button")
	public void user_click_on_ok_button() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.ok);
		Elements.click(USAMobileNoMandateObject.ok);
	   
	}

	@Then("user should get logout from application and redirect to login page")
	public void user_should_get_logout_from_application_and_redirect_to_login_page() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.onLogInpage);
		Elements.isDisplayed(USAMobileNoMandateObject.onLogInpage);
}
	
	@When("user login via secure code as {string}")
	public void user_login_via_secure_code_as(String string) throws InterruptedException {
		
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code1);
		 Elements.TypeText(USAMobileNoMandateObject.code1, string);
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code2);
			Elements.TypeText(USAMobileNoMandateObject.code2, string);
			
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code3);
			Elements.TypeText(USAMobileNoMandateObject.code3, string);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code4);
			Elements.TypeText(USAMobileNoMandateObject.code4, string);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code5);
			Elements.TypeText(USAMobileNoMandateObject.code5, string);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code6);
			Elements.TypeText(USAMobileNoMandateObject.code6, string);
			
			Thread.sleep(2000);
		
	}
	
	@When("user enter different secure code in confirm secure code field as {string}")
	public void user_enter_different_secure_code_in_confirm_secure_code_field_as(String validsecurecode) throws InterruptedException {
		char[] confirmSecureCode =validsecurecode.toCharArray();
		for(int i=0;i<=confirmSecureCode.length-1;i++)
		{
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.confirmSecurePassword(String.valueOf(i+1)));
		Elements.TypeText(USAMobileNoMandateObject.confirmSecurePassword(String.valueOf(i+1)),String.valueOf( confirmSecureCode[i]));
		Thread.sleep(1000);
		}
	    
	}

	@Then("user Should get display error message as {string}")
	public void user_Should_get_display_error_message_as(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.Pls_Enter_Valid_Secure_Code);
		Elements.isDisplayed(USAMobileNoMandateObject.Pls_Enter_Valid_Secure_Code);
		
		
		 Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.Pls_Enter_Valid_Secure_Code),"Please enter the Valid Secure Code");
		
	}
	@Then("user click on cancel button")
	public void user_click_on_cancel_button() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Cancel_Button);
		Elements.click(USAMobileNoMandateObject.Cancel_Button);
		
	}
	
	@Then("user enter five digit secure code as {string}")
	public void user_enter_five_digit_secure_code_as(String fivedigitsecurecode) throws InterruptedException {
		char[] SecureCode =fivedigitsecurecode.toCharArray();
		for(int i=0;i<=SecureCode.length-1;i++)
		{
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.SecurePassword(String.valueOf(i+1)));
		Elements.TypeText(USAMobileNoMandateObject.SecurePassword(String.valueOf(i+1)),String.valueOf( SecureCode[i]));
		Thread.sleep(1000);
		}
		
	}

	@Then("user enter five digit confirm secure code as {string}")
	public void user_enter_five_digit_confirm_secure_code_as(String fivedigitconfirmsecurecode) throws InterruptedException {
		char[] enterSecureCode =fivedigitconfirmsecurecode.toCharArray();
		for(int i=0;i<=enterSecureCode.length-1;i++)
		{
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.confirmSecurePassword(String.valueOf(i+1)));
		Elements.TypeText(USAMobileNoMandateObject.confirmSecurePassword(String.valueOf(i+1)),String.valueOf( enterSecureCode[i]));
		Thread.sleep(1000);
		}
	}
		@When("user enter characters or special characters as {string}")
		public void user_enter_characters_or_special_characters_as(String string) throws InterruptedException {				
					

			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code1);
			  Elements.TypeText(USAMobileNoMandateObject.code1, string);
				Thread.sleep(2000);
				
				String expectedNumber = string;
				String actualNumber = Elements.getText(USAMobileNoMandateObject.code1);
				Assert.assertNotSame(actualNumber, expectedNumber);
				
				

				Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code2);
				  Elements.TypeText(USAMobileNoMandateObject.code2, string);
					Thread.sleep(2000);
					
					String expectedNumber1 = string;
					String actualNumber1 = Elements.getText(USAMobileNoMandateObject.code2);
					Assert.assertNotSame(actualNumber1, expectedNumber1);
					

					Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code3);
					  Elements.TypeText(USAMobileNoMandateObject.code3, string);
						Thread.sleep(2000);
						
						String expectedNumber2 = string;
						String actualNumber2= Elements.getText(USAMobileNoMandateObject.code3);
						Assert.assertNotSame(actualNumber2, expectedNumber2);
						
						

						Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code4);
						  Elements.TypeText(USAMobileNoMandateObject.code4, string);
							Thread.sleep(2000);
							
							String expectedNumber3 = string;
							String actualNumber3 = Elements.getText(USAMobileNoMandateObject.code4);
							Assert.assertNotSame(actualNumber3, expectedNumber3);
							

							Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code5);
							  Elements.TypeText(USAMobileNoMandateObject.code5, string);
								Thread.sleep(2000);
								
								String expectedNumber4 = string;
								String actualNumber4= Elements.getText(USAMobileNoMandateObject.code5);
								Assert.assertNotSame(actualNumber4, expectedNumber4);
								
								

								Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code6);
								  Elements.TypeText(USAMobileNoMandateObject.code6, string);
									Thread.sleep(2000);
									
									String expectedNumber5 = string;
									String actualNumber5 = Elements.getText(USAMobileNoMandateObject.code6);
									Assert.assertNotSame(actualNumber5, expectedNumber5);
		}
		
		@Then("email received on register mail id as {string}")
		public void email_received_on_register_mail_id_as(String string) {	
			Base.driver.switchTo().newWindow(WindowType.TAB);
		Base.driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
		USAMobileNoMandateObject obM = new USAMobileNoMandateObject(Base.driver);
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
		Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid32");
		
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickGo);
		Elements.click(USAMobileNoMandateObject.clickGo);
		
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Reset_Secure_code_Malin);
		Elements.click(USAMobileNoMandateObject.Reset_Secure_code_Malin);
		
		Elements.switchToFrame(USAMobileNoMandateObject.bodyIframe);
		Elements.click(USAMobileNoMandateObject.Reset_Secure_Code_Link);
		
	
			
			
		}
		
	

		@When("user Enter secure code as {string}")
		public void user_Enter_secure_code_as(String string) throws InterruptedException {
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code1);
			 Elements.TypeText(USAMobileNoMandateObject.code1, string);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code2);
				Elements.TypeText(USAMobileNoMandateObject.code2, string);
				
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code3);
				Elements.TypeText(USAMobileNoMandateObject.code3, string);
				
				Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code4);
				Elements.TypeText(USAMobileNoMandateObject.code4, string);
				
				Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code5);
				Elements.TypeText(USAMobileNoMandateObject.code5, string);
				
				Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code6);
				Elements.TypeText(USAMobileNoMandateObject.code6, string);
				
				Thread.sleep(2000);
		   
		}

		@When("user Enter confirm secure code as {string}")
		public void user_Enter_confirm_secure_code_as(String string) {
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code7);
			 Elements.TypeText(USAMobileNoMandateObject.code7, string);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code8);
				Elements.TypeText(USAMobileNoMandateObject.code8, string);
				
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code9);
				Elements.TypeText(USAMobileNoMandateObject.code9, string);
				
				Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code10);
				Elements.TypeText(USAMobileNoMandateObject.code10, string);
				
				Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code11);
				Elements.TypeText(USAMobileNoMandateObject.code11, string);
				
				Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code12);
				Elements.TypeText(USAMobileNoMandateObject.code12, string);
			
		}
		
		@Then("user display error message as {string}")
		public void user_display_error_message_as(String string) {
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.SecureCodeDoestNotMatch);
			Elements.isDisplayed(USAMobileNoMandateObject.SecureCodeDoestNotMatch);
			 Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.SecureCodeDoestNotMatch),"Secure Code doest not match");
			
			
			
			
		}
		@Then("user display pop up as {string}")
		public void user_display_pop_up_as(String string) {
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.SecureCodeProvidedIsIncorrect);
			Elements.isDisplayed(USAMobileNoMandateObject.SecureCodeProvidedIsIncorrect);
			Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.SecureCodeProvidedIsIncorrect),"The Secure Code provided is incorrect. Please enter the correct code and try again.");	
			
			
			
			
		}
		
		@Then("User navigate to URL {string}")
		public void user_navigate_to_URL(String string) {
			Base.driver.navigate().to("https://drysign-qa.exela.global/#/login");
			USAMobileNoMandateObject obM = new USAMobileNoMandateObject(Base.driver);
			
			
		}
		

@When("user click on send one time password")
public void user_click_on_send_one_time_password() throws InterruptedException {
	
	
	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.sendOneTimePassword);
	Elements.click(USAMobileNoMandateObject.sendOneTimePassword);
}
	
	@When("OTP received on mail id as {string}")
	public void otp_received_on_mail_id_as(String string) throws InterruptedException {
	
	Base.driver.switchTo().newWindow(WindowType.TAB);
	Base.driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
	USAMobileNoMandateObject obM = new USAMobileNoMandateObject(Base.driver);

	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
	Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid11");

	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickGo);
	Elements.click(USAMobileNoMandateObject.clickGo);

	Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnOTP );
	Elements.jclick(USAMobileNoMandateObject.clickOnOTP );

	Elements.switchToFrame(USAMobileNoMandateObject.bodyIframe);
	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.otp);
	String actualOTP = Elements.getText(USAMobileNoMandateObject.otp);

	int lastIndex = actualOTP.indexOf(".");
	System.out.println(lastIndex - 4);

	Set<String> ids = Base.driver.getWindowHandles();
	ArrayList<String> ls = new ArrayList<String>(ids);
	String pID = ls.get(0);
	Base.driver.switchTo().window(pID);

	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code1);
	Elements.TypeText(USAMobileNoMandateObject.code1, String.valueOf(lastIndex - 4));

	Thread.sleep(1000);

	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code2);
	Elements.TypeText(USAMobileNoMandateObject.code2, String.valueOf(lastIndex - 3));

	Thread.sleep(1000);

	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code3);
	Elements.TypeText(USAMobileNoMandateObject.code3, String.valueOf(lastIndex - 2));

	Thread.sleep(1000);

	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code4);
	Elements.TypeText(USAMobileNoMandateObject.code4, String.valueOf(lastIndex - 1));
	
	

	
	
	
	
}
	@Then("user should display error message after entering old OTP as {string}")
	public void user_should_display_error_message_after_entering_old_OTP_as(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.oneTimePasswdIsIncorrect);
		Elements.isDisplayed(USAMobileNoMandateObject.oneTimePasswdIsIncorrect);
		 Assert.assertEquals(Elements.getText(USAMobileNoMandateObject.oneTimePasswdIsIncorrect),"The One Time Password provided is incorrect, please try again.");
		

	}

	
	@Then("user click on resend one time password link")
	public void user_click_on_resend_one_time_password_link() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.resendOneTimePasswdLink);
		Elements.click(USAMobileNoMandateObject.resendOneTimePasswdLink);
		
	}
	@When("User enter name as {string}")
	public void user_enter_name_as(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.emailId);
		Elements.TypeText(USAMobileNoMandateObject.emailId, string);
	  
	}

	@When("user enter the password as{string}")
	public void user_enter_the_password_as(String string) {
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.passWd);
		Elements.TypeText(USAMobileNoMandateObject.passWd, string);
		
	}
	

//TS2
//@Then("user navigate to next page")
//public void user_navigate_to_next_page() throws InterruptedException {
//	Waits.waitUntilElementLocated(30, MFAObject.twoStepVerify);
//    //Assert.assertEquals(Elements.getText(MFAObject.twoStepVerify),"Two Step Verification");
//    Elements.isDisplayed(MFAObject.twoStepVerify);
//	Thread.sleep(2000);
//	
//}
//@When("user click on send one time password")
//public void user_click_on_send_one_time_password() {
//	Waits.waitUntilElementToClick(30, MFAObject.sendOTP);
//	Elements.click(MFAObject.sendOTP);
//	
//
//}
//
//@Then("user should able to enter four digit OTP")
//public void user_should_able_to_enter_four_digit_OTP() {
//	Waits.waitUntilElementToClick(30, MFAObject.entOTP);
//    Elements.isDisplayed(MFAObject.entOTP);
//	
//}
	
	//TS12
	@When("user click link on {string}")
	public void user_click_link_on(String forgotyoursecurecode) {
		Waits.waitUntilElementToClick(30, MFAObject.forgotYourSecureCode);
		Elements.click(MFAObject.forgotYourSecureCode);
	   
	}

	@When("user received email as {string}")
	public void user_received_email_as(String email) {
		Base.driver.switchTo().newWindow(WindowType.TAB);
		Base.driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
		USAMobileNoMandateObject obM = new USAMobileNoMandateObject(Base.driver);
		
		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
		Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid28");
		
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickGo);
		Elements.click(USAMobileNoMandateObject.clickGo);
		
		Waits.waitUntilElementToClick(30, MFAObject.forgotYourSecureCode_Email);
		Elements.click(MFAObject.forgotYourSecureCode_Email);
		
		Elements.switchToFrame(MFAObject.bodyIframe);
		Elements.click(MFAObject.Resur_Secure_Code);
		
		
	}
	@When("OTP received mail as {string}")
	public void otp_received_mail_as(String string) {
		Base.driver.switchTo().newWindow(WindowType.TAB);
		Base.driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
		USAMobileNoMandateObject obM = new USAMobileNoMandateObject(Base.driver);

		Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.mailinatorInPut1);
		Elements.TypeText(USAMobileNoMandateObject.mailinatorInPut1,"sid11");

		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickGo);
		Elements.click(USAMobileNoMandateObject.clickGo);

		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickOnOTP );
		Elements.isDisplayed(USAMobileNoMandateObject.clickOnOTP );
	}
	@Then("user click on resend one time password")
	public void user_click_on_resend_one_time_password() {
//		Base.driver.navigate().to("https://drysign-qa.exela.global/#/two-step-verification");
//		USAMobileNoMandateObject obM = new USAMobileNoMandateObject(Base.driver);
		
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.ResendOneTimePassword);
		Elements.click(USAMobileNoMandateObject.ResendOneTimePassword);
		
		
	}
	@Then("user press delete button as {string}")
	public void user_press_delete_button_as(String securecode) throws InterruptedException, AWTException {
		
//		char[] enterSecureCode =securecode.toCharArray();
//		for(int i=0;i<=enterSecureCode.length-1;i++)
//		{
//		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.SecurePassword(String.valueOf(i+1)));
//		Elements.TypeText(USAMobileNoMandateObject.SecurePassword(String.valueOf(i+1)),String.valueOf( enterSecureCode[i]));
//		
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code1);
			Elements.TypeText(USAMobileNoMandateObject.code1, securecode);
			
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code2);
			Elements.TypeText(USAMobileNoMandateObject.code2, securecode);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code3);
			Elements.TypeText(USAMobileNoMandateObject.code3, securecode);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code4);
			Elements.TypeText(USAMobileNoMandateObject.code4, securecode);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code5);
			Elements.TypeText(USAMobileNoMandateObject.code5, securecode);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code6);
			Elements.TypeText(USAMobileNoMandateObject.code6, securecode);
			
			Thread.sleep(1000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DELETE);
		Thread.sleep(500);
		
		robot.keyPress(KeyEvent.VK_DELETE);
		Thread.sleep(500);
		
		robot.keyPress(KeyEvent.VK_DELETE);
		Thread.sleep(500);
		
		Thread.sleep(1000);
		}
	@Then("user should get display pop up as {string}")
	public void user_should_get_display_pop_up_as(String string) {
		Waits.waitUntilElementToClick(30, MFAObject.Successfully_secure_code_updated );
		Elements.isDisplayed(MFAObject.Successfully_secure_code_updated );
		
	}
	@Then("user click on submit button")
	public void user_click_on_submit_button() {
		Waits.waitUntilElementToClick(30, MFAObject.Submit_Btn);
		Elements.click(MFAObject.Submit_Btn);
	}
	@Then("user delete that secure code")
	public void user_delete_that_secure_code() throws InterruptedException {
		//char[] enterSecureCode =securecode.toCharArray();
		for(int i=5;i>=0;i--)
		{
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.SecurePassword(String.valueOf(i+1)));
		Elements.pressDelete(USAMobileNoMandateObject.SecurePassword(String.valueOf(i+1)));
		Thread.sleep(1000);
		

		}
	
	}
	@When("user login via secure code As {string}")
	public void user_login_via_secure_code_As(String enterSecureCode) throws InterruptedException {
	
		
//		for(int i=5;i<=5;i++)
//		{
//		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.SecurePassword(String.valueOf(i+1)));
//		Elements.pressTab1(USAMobileNoMandateObject.SecurePassword(String.valueOf(i+1)));
//		Thread.sleep(1000);
		
	        Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code1);
	 	    Elements.pressTab1(USAMobileNoMandateObject.code1);
		
		    Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code2);
			Elements.pressTab1(USAMobileNoMandateObject.code2);
			
	     	Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code3);
			Elements.pressTab1(USAMobileNoMandateObject.code3);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code4);
			Elements.pressTab1(USAMobileNoMandateObject.code4);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code5);
			Elements.pressTab1(USAMobileNoMandateObject.code5);
			
			Waits.waitUntilElementLocated(30, USAMobileNoMandateObject.code6);
			Elements.pressTab1(USAMobileNoMandateObject.code6);
			
			Thread.sleep(2000);
		
	}
	}
	
