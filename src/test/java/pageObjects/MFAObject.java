package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseinit.Base;

public class MFAObject {
	public MFAObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//TS1
	@FindBy(xpath="//input[@formcontrolname='email']")
	public static WebElement emailId;
	
	       
	@FindBy(xpath="//input[@formcontrolname='password']")
	public static WebElement passWd;

	@FindBy(xpath="//span[text()='Sign In']")
	public static WebElement sub;
	
	
	       
	
	@FindBy(xpath="//span[text()='Dashboard']")
	public static WebElement dashboard;


	@FindBy(xpath="//*[text()='more_vert']")
	public static WebElement icon;

	@FindBy(xpath="//*[@id=\"mat-menu-panel-0\"]/div/button[1]/span")
	public static WebElement profile;
	@FindBy(xpath="//*[text()='Security']")     
	public static  WebElement tabSecurity;
	
	@FindBy(xpath="//*[@for='mat-checkbox-1-input']")
	public static  WebElement emailOtp;
	@FindBy(xpath="//button[@class='mat-focus-indicator w-100 exela-primary-btn mat-button mat-button-base'][1]")
    public static WebElement contWithFreeVersion;
	@FindBy(xpath="//*[@for='mat-checkbox-2-input']")
	public static  WebElement setupSecureCode;
	
	
	
	
	public static WebElement enterSecurePassword(String string)
	{
	String xpath = "//i//ng-otp-input[1]//input[$]";
	WebElement element = Base.driver.findElement(By.xpath(xpath.replace("$", string)));
	return element;
	}
	
	
	
	
	public static WebElement confirmSecurePassword(String string)
	{
	String xpath = "//ng-otp-input[2]//input[$]";
	WebElement element = Base.driver.findElement(By.xpath(xpath.replace("$", string)));
	return element;
	}
	

	@FindBy(xpath="//span[text()='Send One Time Password']")
	public static  WebElement sendOTP;
	
	@FindBy(xpath="//*//*[text()='Two Step Verification']")
	public static  WebElement twoStepVerify;
	//*[@type='submit']
	
	@FindBy(xpath="//*[text()='Verify']")
	public static  WebElement btnVerify;
	
	@FindBy(xpath="//*[@class='wrapper ng-star-inserted']")
	public static  WebElement entOTP;
	
	//*[@class='wrapper ng-star-inserted']
	//a[text()=' Forgot Your Secure Code? ']
	
	@FindBy(xpath="//a[text()=' Forgot Your Secure Code? ']")
	public static  WebElement forgotYourSecureCode;
	
	@FindBy(xpath="//h4[text()='Forgot your secure code?']")
	public static  WebElement forgotYourSecureCodeText;
	
	
	//h4[text()='Forgot your secure code?']
	
	@FindBy(xpath="(//td[@class='ng-binding'])[1]")
	public static  WebElement forgotYourSecureCode_Email;
	 //a[text()='Reset Secure Code']
	
	@FindBy(xpath="	 //a[text()='Reset Secure Code']")
	public static  WebElement Resur_Secure_Code;
	
	@FindBy(xpath="//iframe[@id='html_msg_body']")     
	public static  WebElement bodyIframe;
	
	public static WebElement secureCode(String string)
	{
		WebElement element = Base.driver.findElement(By.xpath("//input[@autocomplete='$']".replace("$", string)));
				
		return element;
	}
	
	

	@FindBy(xpath="//p[@class='text strong ng-star-inserted']")     
	public static  WebElement Successfully_secure_code_updated;
	
	@FindBy(xpath="//button[text()='Submit']")     
	public static  WebElement Submit_Btn;
	
	@FindBy(xpath="//button[text()='OK']")     
	public static  WebElement OK;
	
	@FindBy(xpath="//button[text()='Logout']")     
	public static  WebElement LogoutPopUp;
	
	@FindBy(xpath="//p[text()='The Secure Code provided is incorrect. Please enter the correct code and try again.']")     
	public static  WebElement TheSecureCodeprovidedisincorrect;
	
	
	
	
	
}
