package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import baseinit.Base;
import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import pageObjects.FeedbackRatingObject;
import pageObjects.USAMobileNoMandateObject;

public class FeedbackRating {


//TS1


		
		@Then("verify that Feedback rating UI should be present")
		public void verify_that_Feedback_rating_UI_should_be_present() {
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.shareYourFeedback);
			Elements.isDisplayed(FeedbackRatingObject.shareYourFeedback);
			Assert.assertEquals(Elements.getText(FeedbackRatingObject.shareYourFeedback),"Share your feedback");
}
		@Then("clickable Smiley icon should be present")
		public void clickable_Smiley_icon_should_be_present() {
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.clickfiveEmoji);
			Elements.isDisplayed(FeedbackRatingObject.clickfiveEmoji);
			
}

		//TS2
		
		@Then("relevant ratings for the smiley is display following fields")
		public void relevant_ratings_for_the_smiley_is_display_following_fields(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			
			for (Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
				Thread.sleep(5000);
				
				Waits.waitUntilElementLocated(30, FeedbackRatingObject.smileField("Needs improvement"));
				Elements.isDisplayed(FeedbackRatingObject.smileField("Needs improvement"));

				Waits.waitUntilElementLocated(30, FeedbackRatingObject.smileField("Below Average"));
				Elements.isDisplayed(FeedbackRatingObject.smileField("Below Average"));

				Waits.waitUntilElementLocated(30, FeedbackRatingObject.smileField("Average"));
				Elements.isDisplayed(FeedbackRatingObject.smileField("Average"));

				Waits.waitUntilElementLocated(30, FeedbackRatingObject.smileField("Good"));
				Elements.isDisplayed(FeedbackRatingObject.smileField("Good"));
				
				Waits.waitUntilElementLocated(30, FeedbackRatingObject.smileField("Very Good"));
				Elements.isDisplayed(FeedbackRatingObject.smileField("Very Good"));
			}
		
}
		@When("user click on the smiley")
		public void user_click_on_the_smiley() throws InterruptedException {
			Thread.sleep(2000);
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.clickfiveEmoji);
	    	Elements.click(FeedbackRatingObject.clickfiveEmoji);
			
			}
		@When("user enter message as {string}")
		public void user_enter_message_as(String message) throws InterruptedException {
			Thread.sleep(3000);
			Waits.waitUntilElementLocated(30, FeedbackRatingObject.entMessage);
			Elements.TypeText(FeedbackRatingObject.entMessage, message);
		}
		@When("user click on send button")
		public void user_click_on_send_button() {
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.clickOnSend);
	    	Elements.click(FeedbackRatingObject.clickOnSend);
		
		}
		@Then("user click on Submit button")
		public void user_click_on_Submit_button() throws InterruptedException {
			Elements.scrollIntoView(FeedbackRatingObject.Submit);
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.Submit);
	    	Elements.click(FeedbackRatingObject.Submit);
		}
		
		@Then("user click On Cancel button")
		public void user_click_On_Cancel_button() {
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.Cancel);
	    	Elements.click(FeedbackRatingObject.Cancel);
		}

		@Then("Pop Up should get closed")
		public void pop_Up_should_get_closed() {
			
			
			Waits.setImplicitWait(10);
			List<WebElement> tabs=FeedbackRatingObject.Pop_Up;

			if(tabs.size()>0) {
				Assert.assertTrue(false);
				
			}
			else {
				Assert.assertTrue(true);
			}
		}
			
		


//		@When("user get displayed message as feedback submitted successfully")
//		public void user_get_displayed_message_as_feedback_submitted_successfully() throws InterruptedException {
//			Waits.waitUntilElementToClick(30, FeedbackRatingObject.dispOnSuccessFeed);
//			Elements.isDisplayed(FeedbackRatingObject.dispOnSuccessFeed);
//			Thread.sleep(2000);
//			
//			
//		   		}
//		//TS3
	
	
		@Then("rating should be by default highlighted to Very Good")
		public void rating_should_be_by_default_highlighted_to_Very_Good() throws InterruptedException {
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.clickfiveEmoji);
			Elements.isDisplayed(FeedbackRatingObject.clickfiveEmoji);
			Thread.sleep(2000);
		}

//			//TS4
//
//@Then("Verify that Smiley icon should be clickable")
//public void verify_that_Smiley_icon_should_be_clickable() {
//	Waits.waitUntilElementToClick(30, FeedbackRatingObject.clickfiveEmoji);
//	Elements.click(FeedbackRatingObject.clickfiveEmoji);
//	 Elements.isDisplayed(FeedbackRatingObject.dispOnSuccessFeed);
//	
//   
//}

@Then("user should get display Smiley rating  Message box")
public void user_should_get_display_Smiley_rating_Message_box() throws InterruptedException {
	Waits.waitUntilElementToClick(30, FeedbackRatingObject.smileyRatingBox);
	Elements.isDisplayed(FeedbackRatingObject.smileyRatingBox);
	//Thread.sleep(2000);
	
    
}

@Then("user should get display Message box")
public void user_should_get_display_Message_box() {
	Waits.waitUntilElementToClick(30, FeedbackRatingObject.boxMessage);
	Elements.isDisplayed(FeedbackRatingObject.boxMessage);
   
}

//
//@Then("user should get displayed message as feedback submitted successfully")
//public void user_should_get_displayed_message_as_feedback_submitted_successfully() {
//	Waits.waitUntilElementLocated(30, FeedbackRatingObject.dispOnSuccessFeed);
//	
//		}
//		//TS5
		@Then("user should get displayed smiley rating")
		public void user_should_get_displayed_smiley_rating() {
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.clickfiveEmoji);
			Elements.isDisplayed(FeedbackRatingObject.clickfiveEmoji);
			
		
	}
		@Then("user verify that rating should be successfully submitted along with the feedback")
		public void user_verify_that_rating_should_be_successfully_submitted_along_with_the_feedback() throws InterruptedException {
			Waits.waitUntilElementLocated(30, FeedbackRatingObject.dispOnSuccessFeed);
		  //  Assert.assertEquals(Elements.getText(FeedbackRatingObject.dispOnSuccessFeed),"Feedback submitted successfully. ");
		    Elements.isDisplayed(FeedbackRatingObject.dispOnSuccessFeed);
		    
		}
////		@When("user click on mat icon")
////		public void user_click_on_mat_icon() throws InterruptedException {
////			//Waits.waitUntilElementLocated(50, DeleteObject.icon);
////	     	Waits.waitUntilElementToClick(30, FeedbackRatingObject.icon);
////	        Elements.jclick(FeedbackRatingObject.icon);
////		}
//		@Then("user click on logout")
//		public void user_click_on_logout() {
//			Waits.waitUntilElementToClick(30, FeedbackRatingObject.clickLogOut);
//	    	Elements.click(FeedbackRatingObject.clickLogOut);
//		}
		@Then("again Login with same user name {string}")
		public void again_Login_with_same_user_name(String username) {
			Waits.waitUntilElementLocated(30, FeedbackRatingObject.emailId);
			Elements.TypeText(FeedbackRatingObject.emailId, username);
		}
		@Then("should display the previous rating and relevant smiley icon should be highlighted by default")
		public void should_display_the_previous_rating_and_relevant_smiley_icon_should_be_highlighted_by_default() throws InterruptedException {
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.clickfiveEmoji);
			Elements.isDisplayed(FeedbackRatingObject.clickfiveEmoji);
			Thread.sleep(2000);
	
		}
		//TS6
		@When("user get display pop up")
		public void user_get_display_pop_up() {
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.Pop_Up_Smile);
			Elements.isDisplayed(FeedbackRatingObject.Pop_Up_Smile);
		    
		}

		@Then("send button present on the pop up is by default disabled")
		public void send_button_present_on_the_pop_up_is_by_default_disabled() {
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.Send_Btn_smile);
			Elements.isEnabled(FeedbackRatingObject.Send_Btn_smile);
		
		
		}
		//TS7
		@When("user click on send button without entering text")
		public void user_click_on_send_button_without_entering_text() {
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.Text_Msg_PopUp);
			Elements.click(FeedbackRatingObject.Text_Msg_PopUp);
			Elements.click(FeedbackRatingObject.Send_Btn_smile);
			
		    
		}

		@Then("error message get display as {string}")
		public void error_message_get_display_as(String string) {
			Waits.waitUntilElementToClick(30, FeedbackRatingObject.Pop_Up_Smile);
			Elements.isDisplayed(FeedbackRatingObject.Pop_Up_Smile);
			Assert.assertEquals(Elements.getText(FeedbackRatingObject.Please_EnterMsg),"Please enter a message.");
		
		}
		@Then("user should get displayed message as feedback submitted successfully")
		public void user_should_get_displayed_message_as_feedback_submitted_successfully() throws InterruptedException {
			Thread.sleep(1000);
			Waits.waitUntilElementLocated(30, FeedbackRatingObject.dispOnSuccessFeed);
			Elements.isDisplayed(FeedbackRatingObject.dispOnSuccessFeed);
			Assert.assertEquals(Elements.getText(FeedbackRatingObject.dispOnSuccessFeed),"Feedback submitted successfully.");
			
		}

		@Then("data along with the rating should be successfully saved in the Dashboard")
		public void data_along_with_the_rating_should_be_successfully_saved_in_the_Dashboard() throws InterruptedException {
			Waits.waitUntilElementLocated(30, FeedbackRatingObject.Emoji4);
			Elements.isDisplayed(FeedbackRatingObject.Emoji4);
			Thread.sleep(1000);
		}
		@Then("user click on Logout")
		public void user_click_on_Logout() throws InterruptedException {
			Thread.sleep(10000);
			Waits.waitUntilElementToClick(30, USAMobileNoMandateObject.clickLogOut);
			Elements.jclick(USAMobileNoMandateObject.clickLogOut);
		}
}
