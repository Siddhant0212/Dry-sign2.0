package stepDefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.JavascriptExecutor;
import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;
import baseinit.Base;
import framework.Elements;
import framework.GenericActions;
import framework.Waits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.DrySignObjects;
import pageObjects.USAMobileNoMandateObject;
import pageObjects.XpathMyProfile;

public class DrySign {

	//@Given("navigate to URL {string}")
	//public void navigate_to_URL(String string) {
	//	Base.driver.navigate().to(string);
	///	DrySignObjects ob = new DrySignObjects(Base.driver);
	//}

//	@When("enter the user name as {string}")
	//public void enter_the_user_name_as(String string) {
		//Waits.waitUntilElementLocated(30, DrySignObjects.UserName);
	//	Elements.TypeText(DrySignObjects.UserName, string);
	//}

//	@When("enter the password as {string}")
	//public void enter_the_password_as(String string) {
	//	Waits.waitUntilElementLocated(30, DrySignObjects.Password);
	//	Elements.TypeText(DrySignObjects.Password, string);
//	}

	//@When("click on Sign in button")
	//public void click_on_Sign_in_button() {
	//	Waits.waitUntilElementToClick(30, DrySignObjects.SignIn);
		//Elements.click(DrySignObjects.SignIn);
	//}

	//@Then("click on group signin")
	//public void click_on_group_signin() {
	//	Waits.waitUntilElementToClick(30, DrySignObjects.GroupSign_btn);
		//Elements.click(DrySignObjects.GroupSign_btn);
	//}

	public boolean uploadFile(String uploadfileName, String browser) {
		String jacobDllVersionToUse;
		if (jvmBitVersion().contains("32")) {
			jacobDllVersionToUse = "jacob-1.14.3-x86.dll";
		} else {
			jacobDllVersionToUse = "jacob-1.14.3-x64.dll";
		}
		File file = new File(System.getProperty("user.dir") + "\\AutoItLib\\", jacobDllVersionToUse);
		// test.log(LogStatus.INFO, "Path AutoLib: " + file);
		// System.out.println("Path AutoLib: " + file);
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

		// System.out.println("Absolute Path: " + file);
		try {
			AutoItX x = new AutoItX();
			Thread.sleep(1000);
			if (browser.trim().equalsIgnoreCase("chrome")) {
				x.winWait("[Title:Open]", "", 15);
				x.controlFocus("[Title:Open]", "", "Edit1");
				File url = null;
				url = new File(System.getProperty("user.dir") + "\\Uploadfiles\\" + uploadfileName);
				String name = FilenameUtils.getExtension(uploadfileName);
				if (url.exists() && (name.equalsIgnoreCase("png") || name.equals("pdf") || name.equals("tiff"))) {
					x.ControlSetText("[TITLE:Open]", "", "Edit1", url.toString());
					Thread.sleep(1000);
					x.controlClick("[Title:Open]", "", "Button1");
					Thread.sleep(1000);
					return true;
				} else {
					x.controlClick("[Title:Open]", "", "Button2");
					Thread.sleep(1000);

					return false;
				}
			} else if (browser.trim().equalsIgnoreCase("firefox")) {
				x.winWait("[Title:File Upload]", "", 15);
				x.controlFocus("[Title:File Upload]", "", "Edit1");
				x.ControlSetText("[TITLE:File Upload]", "", "Edit1",
						System.getProperty("user.dir") + "\\Uploadfiles\\" + uploadfileName);
				Thread.sleep(1000);
				x.controlClick("[Title:File Upload]", "", "Button1");
				Thread.sleep(1000);
				return true;
			} else if (browser.trim().equalsIgnoreCase("ie")) {
				x.winWait("[Title:Choose File to Upload]", "", 20);
				x.controlFocus("[Title:Choose File to Upload]", "", "Edit1");
				x.ControlSetText("[TITLE:Choose File to Upload]", "", "Edit1",
						System.getProperty("user.dir") + "\\Uploadfiles\\" + uploadfileName);
				x.controlClick("[Title:Choose File to Upload]", "", "Button1");
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error in Uploading file");
		}
		return false;
	}

	private String jvmBitVersion() {
		return System.getProperty("sun.arch.data.model");
	}
	
	

//	@Then("click on browse button and upload {string}")
	//public void click_on_browse_button_and_upload(String string) throws InterruptedException {
		//Waits.waitUntilElementToClick(30, DrySignObjects.Browse);
	//	Elements.click(DrySignObjects.Browse);

		//Thread.sleep(5000);

		//uploadFile("sample.pdf", "chrome");

		// upload
	//}

	//@Then("click on save and continue")
//	public void click_on_save_and_continue() {
	//	Waits.waitUntilElementToClick(30, DrySignObjects.SaveandContinue);
	//	Elements.click(DrySignObjects.SaveandContinue);
	//}

	@Then("enter below signatory name and signatory email")
	public void enter_below_signatory_name_and_signatory_email(io.cucumber.datatable.DataTable dataTable) {
		for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {

			Waits.waitUntilElementToClick(30, DrySignObjects.Full_Name_drp);
			Elements.click(DrySignObjects.Full_Name_drp);

			Waits.waitUntilElementToClick(30,
					DrySignObjects.fullname_drpOption(String.valueOf(data.get("SignatoryName"))));
			Elements.isDisplayed(DrySignObjects.fullname_drpOption((String.valueOf(data.get("SignatoryName")))));

			Waits.waitUntilElementToClick(30, DrySignObjects.Signature_drp);
			Elements.click(DrySignObjects.Signature_drp);

			Waits.waitUntilElementToClick(30,
					DrySignObjects.fullname_drpOption(String.valueOf(data.get("SignatoryEmail"))));
			Elements.isDisplayed(DrySignObjects.fullname_drpOption((String.valueOf(data.get("SignatoryEmail")))));

		}
	}

	@When("check the Set priority for signatories option")
	public void check_the_Set_priority_for_signatories_option() {
		Waits.waitUntilElementToClick(30, DrySignObjects.Setpriorityforsignatories);
		Elements.click(DrySignObjects.Setpriorityforsignatories);
	}

	@SuppressWarnings("deprecation")
	@Then("Test{int} should have priority as {string} , Test{int} as {string} and Test{int} as {string}")
	public void test_should_have_priority_as_Test_as_and_Test_as(Integer int1, String string, Integer int2,
			String string2, Integer int3, String string3) {
		Waits.waitUntilElementLocated(30, DrySignObjects.priority_num(string));
		Assert.assertEquals(string, Elements.getText(DrySignObjects.priority_num(string)));

		Waits.waitUntilElementLocated(30, DrySignObjects.priority_num(string2));
		Assert.assertEquals(string, Elements.getText(DrySignObjects.priority_num(string2)));

		Waits.waitUntilElementLocated(30, DrySignObjects.priority_num(string3));
		Assert.assertEquals(string, Elements.getText(DrySignObjects.priority_num(string3)));
	}

	@When("drag the test{int} signatory to test{int} signatory place")
	public void drag_the_test_signatory_to_test_signatory_place(Integer int1, Integer int2) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("delete the {string} record")
	public void delete_the_record(String string) {
		Waits.waitUntilElementToClick(30, DrySignObjects.signature_delete(string));
		Elements.click(DrySignObjects.signature_delete(string));
	}

	@Then("Then Test{int} should have priority as {string} and Test{int} as {string}")
	public void then_Test_should_have_priority_as_and_Test_as(Integer int1, String string, Integer int2,
			String string2) {
		Waits.waitUntilElementLocated(30, DrySignObjects.priority_num(string));
		Assert.assertEquals(string, Elements.getText(DrySignObjects.priority_num(string)));

		Waits.waitUntilElementLocated(30, DrySignObjects.priority_num(string2));
		Assert.assertEquals(string, Elements.getText(DrySignObjects.priority_num(string2)));
	}

	@Then("Test{int} should have priority as {string} , Test{int} as {string} , Test{int} as {string} ,Test{int} as {string} and Test{int} as {string}")
	public void test_should_have_priority_as_Test_as_Test_as_Test_as_and_Test_as(Integer int1, String string,
			Integer int2, String string2, Integer int3, String string3, Integer int4, String string4, Integer int5,
			String string5) {
		Waits.waitUntilElementLocated(30, DrySignObjects.priority_num(string));
		Assert.assertEquals(string, Elements.getText(DrySignObjects.priority_num(string)));

		Waits.waitUntilElementLocated(30, DrySignObjects.priority_num(string2));
		Assert.assertEquals(string, Elements.getText(DrySignObjects.priority_num(string2)));

		Waits.waitUntilElementLocated(30, DrySignObjects.priority_num(string3));
		Assert.assertEquals(string, Elements.getText(DrySignObjects.priority_num(string3)));

		Waits.waitUntilElementLocated(30, DrySignObjects.priority_num(string4));
		Assert.assertEquals(string, Elements.getText(DrySignObjects.priority_num(string4)));

		Waits.waitUntilElementLocated(30, DrySignObjects.priority_num(string5));
		Assert.assertEquals(string, Elements.getText(DrySignObjects.priority_num(string5)));

	}

	@Then("drag and drop full name and select below names")
	public void drag_and_drop_full_name_and_select_below_names(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		throw new cucumber.api.PendingException();
	}

	@Then("enter CC mail as {string}")
	public void enter_CC_mail_as(String string) {
		Waits.waitUntilElementLocated(30, DrySignObjects.ccEmailID);
		Elements.TypeText(DrySignObjects.ccEmailID, string);
	}

	@Then("enter subject as {string}")
	public void enter_subject_as(String string) {
		Waits.waitUntilElementLocated(30, DrySignObjects.subject);
		Elements.TypeText(DrySignObjects.subject, string);
	}

	@Then("enter message as {string}")
	public void enter_message_as(String string) {
		Waits.waitUntilElementLocated(30, DrySignObjects.Message);
		Elements.TypeText(DrySignObjects.Message, string);
	}

	@When("click on send button")
	public void click_on_send_button() {
		Waits.waitUntilElementToClick(30, DrySignObjects.Send_btn);
		Elements.click(DrySignObjects.Send_btn);
	}

	@Then("system should throw success message as {string}")
	public void system_should_throw_success_message_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("click on out for signature")
	public void click_on_out_for_signature() {
		Waits.waitUntilElementToClick(30, DrySignObjects.OutforSignature);
		Elements.click(DrySignObjects.OutforSignature);
	}

	@Then("click remove Signatories of {string}")
	public void click_remove_Signatories_of(String string) {
		Waits.waitUntilElementToClick(30, DrySignObjects.Remove_Signature(string));
		Elements.click(DrySignObjects.Remove_Signature(string));
	}

	@Then("click on confirm button")
	public void click_on_confirm_button() {
		Waits.waitUntilElementToClick(30, DrySignObjects.Confirm);
		Elements.click(DrySignObjects.Confirm);
	}

	@Then("system should throw the message as {string}")
	public void system_should_throw_the_message_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("navigate to given URL {string}")
	public void navigate_to_given_URL(String string) {
		Base.driver.navigate().to(string);
	}

	@Then("enter yopmail id as {string}")
	public void enter_yopmail_id_as(String string) {
		Waits.waitUntilElementLocated(30, DrySignObjects.YOPMail_Emailtxt_box);
		Elements.TypeText(DrySignObjects.YOPMail_Emailtxt_box, string);
	}

	@When("click on check inbox")
	public void click_on_check_inbox() {
		Waits.waitUntilElementToClick(30, DrySignObjects.YOPMail_CheckInbox);
		Elements.click(DrySignObjects.YOPMail_CheckInbox);
	}

	@Then("refresh the page")
	public void refresh_the_page() throws InterruptedException {
		Thread.sleep(2000);
		Base.driver.navigate().refresh();
	}

	@Then("system should display {string} email")
	public void system_should_display_email(String string) throws InterruptedException {
		Elements.switchToFrame(DrySignObjects.YopMailFrame);
		Assert.assertTrue(Elements.VerifyTextEquals(DrySignObjects.MailVerification, string));
		Elements.switchTodefaultContent();
	}

	@Then("save and continue button should be enabled")
	public void save_and_continue_button_should_be_enabled() {
		Waits.waitUntilElementLocated(30, DrySignObjects.SaveandContinue);
		Elements.isEnabled(DrySignObjects.SaveandContinue);
	}

	@Then("click on left pane menu {string}")
	public void click_on_left_pane_menu(String string) {
		Waits.waitUntilElementToClick(30, DrySignObjects.Template);
		Elements.click(DrySignObjects.Template);
	}

	@Then("click upload new template button")
	public void click_upload_new_template_button() {
		Waits.waitUntilElementToClick(30, DrySignObjects.UploadNewTemplate);
		Elements.click(DrySignObjects.UploadNewTemplate);
	}

	@Then("system should display slider window options {string}, {string} , {string}, {string} , {string} , {string} , {string}")
	public void system_should_display_slider_window_options(String string, String string2, String string3,
			String string4, String string5, String string6, String string7) {
		Waits.waitUntilElementLocated(30, DrySignObjects.FullName);
		Assert.assertEquals(string, Elements.getText(DrySignObjects.FullName));

		Waits.waitUntilElementLocated(30, DrySignObjects.Date);
		Assert.assertEquals(string2, Elements.getText(DrySignObjects.Date));

		Waits.waitUntilElementLocated(30, DrySignObjects.TextBox);
		Assert.assertEquals(string3, Elements.getText(DrySignObjects.TextBox));

		Waits.waitUntilElementLocated(30, DrySignObjects.Initials);
		Assert.assertEquals(string4, Elements.getText(DrySignObjects.Initials));

		Waits.waitUntilElementLocated(30, DrySignObjects.Seal);
		Assert.assertEquals(string5, Elements.getText(DrySignObjects.Seal));

		Waits.waitUntilElementLocated(30, DrySignObjects.signature);
		Assert.assertEquals(string6, Elements.getText(DrySignObjects.signature));

		Waits.waitUntilElementLocated(30, DrySignObjects.signatureStamp);
		Assert.assertEquals(string7, Elements.getText(DrySignObjects.signatureStamp));
	}

	@When("drag and drop the full name")
	public void drag_and_drop_the_full_name() throws InterruptedException {
		Waits.waitUntilElementLocated(30, DrySignObjects.FullName);
		//Actions action = new Actions(Base.driver);
		// 383,85
		// Elements.jclick(DrySignObjects.FullName);
		// action.moveToElement(DrySignObjects.FullName).click().build().perform();

		//action.clickAndHold(DrySignObjects.FullName).perform();
		// action.

		// final WebElement element = DrySignObjects.FullName;

		

		// final WebElement element2 = DrySignObjects.SimplePDF;

		// Elements.switchTodefaultContent();
		
		  JavascriptExecutor js = (JavascriptExecutor)Base.driver;
		  
		  
		  
		  
			/*
			 * js.executeScript( "function simulateHTML5DragAndDrop() {\r\n" + "\r\n" +
			 * "document.getElementsByTagName(\"iframe\")[0].contentWindow;\r\n" + "\r\n" +
			 * "}\r\n" + "\r\n" + "var source = arguments[0];\r\n" +
			 * "var destination = arguments[1];\r\n" + "simulateHTML5DragAndDrop();");
			 * 
			 * 
			 * System.out.println(Elements.getText(DrySignObjects.SimplePDF));
			 */
		  
		  
		js.executeScript(" function createEvent(typeOfEvent) {\r\n"
		  		+ "var event =document.createEvent(\"CustomEvent\");\r\n"
		  		+ "event.initCustomEvent(typeOfEvent,true, true, null);\r\n"
		  		+ "event.dataTransfer = {\r\n"
		  		+ "data: {},\r\n"
		  		+ "setData: function (key, value) {\r\n"
		  		+ "this.data[key] = value;\r\n"
		  		+ "},\r\n"
		  		+ "getData: function (key) {\r\n"
		  		+ "return this.data[key];\r\n"
		  		+ "}\r\n"
		  		+ "};\r\n"
		  		+ "return event;\r\n"
		  		+ "}\r\n"
		  		+ "\r\n"
		  		+ "function dispatchEvent(element, event,transferData) {\r\n"
		  		+ "if (transferData !== undefined) {\r\n"
		  		+ "event.dataTransfer = transferData;\r\n"
		  		+ "}\r\n"
		  		+ "if (element.dispatchEvent) {\r\n"
		  		+ "element.dispatchEvent(event);\r\n"
		  		+ "} else if (element.fireEvent) {\r\n"
		  		+ "element.fireEvent(\"on\" + event.type, event);\r\n"
		  		+ "}\r\n"
		  		+ "}\r\n"
		  		+ "\r\n"
		  		+ "function simulateHTML5DragAndDrop(element) {\r\n"
		  		+ "var dragStartEvent =createEvent('dragstart');\r\n"
		  		+ "dispatchEvent(element, dragStartEvent);"
		  		+ "}var source = arguments[0];\r\n"
		  		+ "var destination = arguments[1];\r\n"
		  		+ "simulateHTML5DragAndDrop(source);",DrySignObjects.FullName);
		  
		  Waits.waitUntilElementLocated(30, DrySignObjects.iFrame);
			Elements.switchToFrame(DrySignObjects.iFrame);
		 
		 
			js.executeScript("function createEvent(typeOfEvent) {\r\n"
		  		+ "var event =document.createEvent(\"CustomEvent\");\r\n"
		  		+ "event.initCustomEvent(typeOfEvent,true, true, null);\r\n"
		  		+ "event.dataTransfer = {\r\n"
		  		+ "data: {},\r\n"
		  		+ "setData: function (key, value) {\r\n"
		  		+ "this.data[key] = value;\r\n"
		  		+ "},\r\n"
		  		+ "getData: function (key) {\r\n"
		  		+ "return this.data[key];\r\n"
		  		+ "}\r\n"
		  		+ "};\r\n"
		  		+ "return event;\r\n"
		  		+ "}\r\n"
		  		+ "\r\n"
		  		+ "function dispatchEvent(element, event,transferData) {\r\n"
		  		+ "if (transferData !== undefined) {\r\n"
		  		+ "event.dataTransfer = transferData;\r\n"
		  		+ "}\r\n"
		  		+ "if (element.dispatchEvent) {\r\n"
		  		+ "element.dispatchEvent(event);\r\n"
		  		+ "} else if (element.fireEvent) {\r\n"
		  		+ "element.fireEvent(\"on\" + event.type, event);\r\n"
		  		+ "}\r\n"
		  		+ "}\r\n"
		  		+ "\r\n"
		  		+ "function simulateHTML5DragAndDrop(destination) {var dropEvent = createEvent('drop');\r\n"
		  		+ "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);}var source = arguments[0];\r\n"
		  		+ "var destination = arguments[1];\r\n"
		  		+ "simulateHTML5DragAndDrop(destination);",DrySignObjects.SimplePDF);
		 
		 
		  
		  Elements.switchTodefaultContent();
		  
		  js.executeScript("function createEvent(typeOfEvent) {\r\n"
		  		+ "var event =document.createEvent(\"CustomEvent\");\r\n"
		  		+ "event.initCustomEvent(typeOfEvent,true, true, null);\r\n"
		  		+ "event.dataTransfer = {\r\n"
		  		+ "data: {},\r\n"
		  		+ "setData: function (key, value) {\r\n"
		  		+ "this.data[key] = value;\r\n"
		  		+ "},\r\n"
		  		+ "getData: function (key) {\r\n"
		  		+ "return this.data[key];\r\n"
		  		+ "}\r\n"
		  		+ "};\r\n"
		  		+ "return event;\r\n"
		  		+ "}\r\n"
		  		+ "\r\n"
		  		+ "function dispatchEvent(element, event,transferData) {\r\n"
		  		+ "if (transferData !== undefined) {\r\n"
		  		+ "event.dataTransfer = transferData;\r\n"
		  		+ "}\r\n"
		  		+ "if (element.dispatchEvent) {\r\n"
		  		+ "element.dispatchEvent(event);\r\n"
		  		+ "} else if (element.fireEvent) {\r\n"
		  		+ "element.fireEvent(\"on\" + event.type, event);\r\n"
		  		+ "}\r\n"
		  		+ "}\r\n"
		  		+ "\r\n"
		  		+ "function simulateHTML5DragAndDrop(element) {var dragEndEvent = createEvent('dragend');\r\n"
		  		+ "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);}var source = arguments[0];\r\n"
		  		+ "var destination = arguments[1];\r\n"
		  		+ "simulateHTML5DragAndDrop(source);",DrySignObjects.FullName);

		// String xto=Integer.toString(DrySignObjects.FullName.getLocation().x);

		// Base.driver.findElement(By.xpath(null))

		/*
		 * Waits.waitUntilElementLocated(30,DrySignObjects.iFrame);
		 * Elements.switchToFrame(DrySignObjects.iFrame);
		 */

//		  String yto=Integer.toString(DrySignObjects.SimplePDF.getLocation().y);
		
		/*
		 * action.moveByOffset(314, 105).release().perform();
		 * 
		 * ((JavascriptExecutor) Base.driver).executeScript(
		 * "function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\"HTMLEvents\"?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\"on\"+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; "
		 * +
		 * "simulate(arguments[0],\"mousedown\",0,0); simulate(arguments[0],\"mousemove\",arguments[1],arguments[2]); simulate(arguments[0],\"mouseup\",arguments[1],arguments[2]); "
		 * , DrySignObjects.FullName, 314, 105);
		 */

		 

	}

	@Then("click the full name drop down and should display {string}")
	public void click_the_full_name_drop_down_and_should_display(String string) {

		Waits.waitUntilElementToClick(30, DrySignObjects.Full_Name_drp);
		Elements.click(DrySignObjects.Full_Name_drp);

		List<String> data = new ArrayList<String>();
		String[] exceldata = string.split(",");
		for (int i = 0; i <= exceldata.length - 1; i++) {
			data.add(exceldata[i].trim());
		}
		Collections.sort(data);
		Assert.assertEquals(data, GenericActions.verifyTextExistence(DrySignObjects.FullNameDrpList));

	}

	@When("drag and drop the date")
	public void drag_and_drop_the_date() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("date option should display {string}")
	public void date_option_should_display(String string) {
		Waits.waitUntilElementToClick(30, DrySignObjects.Date_drp);
		Elements.click(DrySignObjects.Date_drp);

		List<String> data = new ArrayList<String>();
		String[] exceldata = string.split(",");
		for (int i = 0; i <= exceldata.length - 1; i++) {
			data.add(exceldata[i].trim());
		}
		Collections.sort(data);
		Assert.assertEquals(data, GenericActions.verifyTextExistence(DrySignObjects.DateDrpList));

	}

	@When("drag and drop Signature")
	public void drag_and_drop_Signature() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("click the Signature drop down and should display {string}")
	public void click_the_Signature_drop_down_and_should_display(String string) {
		Waits.waitUntilElementToClick(30, DrySignObjects.Signature_drp);
		Elements.click(DrySignObjects.Signature_drp);

		List<String> data = new ArrayList<String>();
		String[] exceldata = string.split(",");
		for (int i = 0; i <= exceldata.length - 1; i++) {
			data.add(exceldata[i].trim());
		}
		Collections.sort(data);
		Assert.assertEquals(data, GenericActions.verifyTextExistence(DrySignObjects.SignatureDrpList));
	}

	@When("click on save button")
	public void click_on_save_button() {
		Waits.waitUntilElementToClick(30, DrySignObjects.Save);
		Elements.click(DrySignObjects.Save);
	}

	@When("click on OK button")
	public void click_on_OK_button() {
		Waits.waitUntilElementToClick(30, DrySignObjects.OK);
		Elements.click(DrySignObjects.OK);
	}

	@Then("system should display dasboard")
	public void system_should_display_dasboard() {
		Waits.waitUntilElementLocated(30, DrySignObjects.Dashboard);
		Assert.assertEquals("Dashboard | DrySign", Elements.getTitle());
	}

	@Then("click on Upload navigator")
	public void click_on_Upload_navigator() {
		Waits.waitUntilElementToClick(30, DrySignObjects.Upload);
		Elements.click(DrySignObjects.Upload);
	}

	@Then("click on browse button and upload {string} new pdf file")
	public void click_on_browse_button_and_upload_new_pdf_file(String string) throws InterruptedException {
		Waits.waitUntilElementToClick(30, DrySignObjects.Browse);
		Elements.click(DrySignObjects.Browse);

		Thread.sleep(5000);

		// upload
	}

	@Then("System should display the newly uploaded pdf")
	public void system_should_display_the_newly_uploaded_pdf() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("click Bulk Upload and upload an empty CSV file {string}")
	public void click_Bulk_Upload_and_upload_an_empty_CSV_file(String string) throws InterruptedException {
		Waits.waitUntilElementToClick(30, DrySignObjects.Browse);
		Elements.click(DrySignObjects.Browse);

		Thread.sleep(5000);

		// upload
	}

	@Then("system should throw a message as {string}")
	public void system_should_throw_a_message_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("click Bulk Upload and upload CSV file {string}")
	public void click_Bulk_Upload_and_upload_CSV_file(String string) throws InterruptedException {
		Waits.waitUntilElementToClick(30, DrySignObjects.Browse);
		Elements.click(DrySignObjects.Browse);

		Thread.sleep(5000);

		// upload
	}
	
	
	@When("user click on browser and upload {string}")
    public void user_click_on_browser_and_upload(String filename) throws InterruptedException {
		

		
			Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.browser);
			Elements.click(USAMobileNoMandateObject.browser);
			Thread.sleep(5000);
			uploadFile(filename, "chrome");
			Thread.sleep(5000);
			}

	@Then("user click on upload photo button as {string}")
	public void user_click_on_upload_photo_button_as(String filename) throws InterruptedException {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.Upload_Btn);
		Elements.jclick(USAMobileNoMandateObject.Upload_Btn);
		Thread.sleep(5000);
	    uploadFile(filename, "chrome");
		Thread.sleep(5000);
}
}