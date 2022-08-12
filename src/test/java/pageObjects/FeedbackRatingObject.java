package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseinit.Base;

public class FeedbackRatingObject {
	public FeedbackRatingObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//TS1
	@FindBy(xpath="//input[@formcontrolname='email']")
	public static  WebElement emailId;
	
	       
	@FindBy(xpath="//input[@formcontrolname='password']")
	public static WebElement passWd;

	@FindBy(xpath="//span[text()='Sign In']")
	public static WebElement sub;
	
	
	@FindBy(xpath="//span[text()='Dashboard']")
	public static WebElement dashboard;
 
	@FindBy(xpath="//*[text()=' Continue With Free Version ']")
	public static WebElement clickContinueWithFreeVersion;
	

	@FindBy(xpath="//h2[text()=' Share your feedback ']")
	public static WebElement shareYourFeedback;
	
	//*[text()=' Share your feedback ']
	
	@FindBy(xpath="//*[@id='Ellipse_114']")
	public static WebElement clickfiveEmoji;
	
	
	
	
	
	public static WebElement smileField(String data)
	{
	String Xpath = "//*[@xmlns='http://www.w3.org/2000/svg']";
	WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
	return element;
	}
	
	//TS2
	@FindBy(xpath="//*[@placeholder='Message']")
	public static WebElement entMessage;
	
	@FindBy(xpath="//*[text()='Send']")
	public static WebElement clickOnSend;
	
	@FindBy(xpath="//div[text()=' Feedback submitted successfully. ']")
	public static WebElement dispOnSuccessFeed;
	
	
	//TS4 //*[@placeholder='Message']
	@FindBy(xpath="(//div[@id='emoji'])[2]")
	public static WebElement smileyRatingBox;
	
	@FindBy(xpath="//*[@placeholder='Message']")
	public static WebElement boxMessage;
	
	
//TS5
	@FindBy(xpath="//*[@id='emoji']")
	public static WebElement disEmojis;
	
	@FindBy(xpath="//*[text()=' exit_to_app ']")
	public static WebElement clickLogOut;
	
	@FindBy(xpath="//*[@id='Ellipse_142']")
	public static WebElement clickThirdEmoji;
	
	@FindBy(xpath="//*[text()='more_vert']")
	public static WebElement icon;
	
	//TS6
	@FindBy(xpath="//div[@class='cdk-overlay-pane']")
	public static WebElement Pop_Up_Smile;
	
	@FindBy(xpath="//span[text()='Send']")
	public static WebElement Send_Btn_smile;
	
	//TS7
	@FindBy(xpath="//textarea[@placeholder='Message']")
	public static WebElement Text_Msg_PopUp;
	
	@FindBy(xpath="//span[text()='Please enter a message.']")
	public static WebElement Please_EnterMsg;
	
	//span[text()='Please enter a message.']
}
