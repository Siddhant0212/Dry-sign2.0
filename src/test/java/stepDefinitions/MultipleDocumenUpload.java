package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseinit.Base;
import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MultipleDocumentUploadObject;
import pageObjects.USAMobileNoMandateObject;

public class MultipleDocumenUpload {
	@When("user click on the self sign")
	public void user_click_on_the_self_sign() {
		Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.selfSign);
		Elements.jclick(USAMobileNoMandateObject.selfSign);
	
	}


	
	

//	@Then("user verify that all type of file format should be uploaded")
//	public void user_verify_that_all_type_of_file_format_should_be_uploaded() {
//	   
//	}
//
//	@Then("user should get displayed message as file uploaded successfully")
//	public void user_should_get_displayed_message_as_file_uploaded_successfully() {
//
//}
}