package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseinit.Base;

public class DashboardObject {
	public DashboardObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()=' Cancel Subscription ']")
	public static  WebElement clickCancelSubscription;
	
	@FindBy(xpath="//span[text()='Confirm']")
	public static  WebElement clickConfirm;
	
	@FindBy(xpath="//span[text()='Buy Now']")
	public static  WebElement clickBuyNow;
	//span[text()=' exit_to_app ']
	
	@FindBy(xpath="//span[text()='Dashboard']")
	public static  WebElement clickDashboard;
	
	@FindBy(xpath="//span[text()=' exit_to_app ']")
	public static  WebElement clickLogOut;
	
	@FindBy(xpath="//button[@aria-label='Header menu dropdown']")
	public static WebElement matIcon;
	
	public static WebElement Field(String data)
	{
	String Xpath = "//li[text()=' $ ']";
	WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
	return element;
	}
	
	@FindBy(xpath="//div[@class='circle-count-length-2']")
	public static  WebElement Documents_Received1;
	
	@FindBy(xpath="//h2[text()=' Documents Received ']")
	public static  WebElement Documents_Received;
	
	
	
	public static WebElement documentReceivedSent(String data)
	{
	String Xpath = "//div[@class='ng-star-inserted']";
	WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
	return element;
	}
	
	

	public static WebElement Plans(String data)
	{
	String Xpath = "//div[@class='pricing-title']";
	WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
	return element;
	}
	
	
	
			
			@FindBy(xpath="(//*[text()='Documents'])[2]")
			public static  WebElement Documents;
			
			@FindBy(xpath="//*[text()='8']")
			public static  WebElement Eight_Documents;
			
			
			@FindBy(xpath="//h2[text()=' Documents Sent ']")
			public static  WebElement Documents_Sent;
			
			@FindBy(xpath="(//div[@class='circle-count-length-1'])[1]")
			public static  WebElement Four_Documents;

			@FindBy(xpath="//label[text()='Self Sign']")
			public static WebElement selfSign;
			
			@FindBy(xpath="//span[text()='signature']")
			public static WebElement signature;
			
					
		    @FindBy(xpath="(//span[@class='PSPDFKit-6y44nrshuzvz454nzf891rm7u5'])[1]")
		    public static WebElement Page;
					
			@FindBy(xpath="//label[text()='Group Sign']")
			public static WebElement grpSignBtn;

			@FindBy(xpath="(//span[text()='Upgrade'])[1]")
			public static  WebElement btnUpgrade;
			
			@FindBy(xpath="(//span[text()='Upgrade'])[1]")
			public static WebElement Upgrade5;

			public static WebElement textField(String data)
			{
			String Xpath = "//li[@class='ng-star-inserted']";
			WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
			return element;
			}
            
			@FindBy(xpath="//button[text()='Upgrade Plan']")
			public static  WebElement btnUpgradePlan;
			
			@FindBy(xpath="//button[text()=' Upgrade Plan ']")
			public static  WebElement UpgradePlan;
			
			public static WebElement newField(String data)
			{
			String Xpath = "//li[@class='ng-star-inserted']";
			WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
			return element;
			}
			
			

			
			@FindBy(xpath="//mat-icon[text()='close']")     
			public static  WebElement closeIcon;
			
			@FindBy(xpath="//label[text()='Signature']")     
			public static  WebElement Signature;
			
			@FindBy(xpath="//button[text()='Save']")     
			public static  WebElement Save_Btn;
			
			@FindBy(xpath="//p[text()='Signature saved.']")     
			public static  WebElement Signature_saved;
			
			@FindBy(xpath="(//div[@class='mat-tab-label-content'])[3]")     
			public static  WebElement Upload_Button;
			
			@FindBy(xpath="//img[@mattooltip='Upload']")     
			public static  WebElement Upload_Option;
			
			@FindBy(xpath="//iframe[@id='ssIFrame_google']")     
			public static  WebElement iFrame_Type;
			
			
			@FindBy(xpath="//div[text()=' File size exceeds the maximum limit of 50KB. ']")     
			public static  WebElement Filesizeexceedsthemaximum;
			
			@FindBy(xpath="//button[text()='View Details']")
			public static  WebElement View_Details;
			
			@FindBy(xpath="//button[text()=' Cancel ']")
			public static  WebElement Cancel;
			
			@FindBy(xpath="//input[@placeholder='First Name*']")
			public static WebElement entFirstName;
			
			@FindBy(xpath="//input[@placeholder='Last Name*']")
			public static WebElement entLastName;
			
			@FindBy(xpath="//*[@formcontrolname='companyName']")
			public static WebElement entCompName;
			

			@FindBy(xpath="//input[@placeholder='Phone Number*']")
			public static WebElement entPhoneNo;
			
			@FindBy(xpath="//input[@placeholder='Email ID*']")
			public static WebElement entEmail;
			
			@FindBy(xpath="//input[@placeholder='Password *']")
			public static WebElement entPassword;
			
			@FindBy(xpath="//input[@placeholder='Password Confirm *']")
			public static WebElement entConfirmPassword;
			
			@FindBy(xpath="//input[@data-webform-required-error='Please accept terms and conditions']")
			public static WebElement clickCheckBox;
			
			@FindBy(xpath="//button[text()='Sign Up']")
			public static WebElement successOnSignUp;
			
}        



