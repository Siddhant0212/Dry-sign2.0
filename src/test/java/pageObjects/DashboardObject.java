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
	
	@FindBy(xpath="//h2[text()=' Documents Received ']")
	public static  WebElement Documents_Received;
	
			
			@FindBy(xpath="(//*[text()='Documents'])[2]")
			public static  WebElement Documents;
			
			@FindBy(xpath="//*[text()='8']")
			public static  WebElement Eight_Documents;
			
			
			@FindBy(xpath="//h2[text()=' Documents Sent ']")
			public static  WebElement Documents_Sent;
			
			@FindBy(xpath="//*[text()='4']")
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
			String Xpath = "//*[@class='ng-star-inserted']";
			WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
			return element;
			}
            
			@FindBy(xpath="//button[text()='Upgrade Plan']")
			public static  WebElement btnUpgradePlan;

			
			@FindBy(xpath="//mat-icon[text()='close']")     
			public static  WebElement closeIcon;
			
			@FindBy(xpath="(//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color'])[9]")     
			public static  WebElement Signature_Edit;
			
			@FindBy(xpath="//span[text()='Save']")     
			public static  WebElement Save_Btn;
			
			@FindBy(xpath="//div[text()=' Signature saved. ']")     
			public static  WebElement Signature_saved;
			
			@FindBy(xpath="(//div[@class='mat-tab-label-content'])[3]")     
			public static  WebElement Upload_Button;
			
			@FindBy(xpath="//img[@mattooltip='Upload']")     
			public static  WebElement Upload_Option;
			
			@FindBy(xpath="//iframe[@id='ssIFrame_google']")     
			public static  WebElement iFrame_Type;
			
			
			@FindBy(xpath="//div[text()=' File size exceeds the maximum limit of 50KB. ']")     
			public static  WebElement Filesizeexceedsthemaximum;
			
			
}        



