package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseinit.Base;

public class XpathMyProfile {
	public XpathMyProfile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	public static  WebElement emailId;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	public static WebElement passwd;

	@FindBy(xpath="//span[text()='Sign In']")
	public static WebElement signInClick;
	
	@FindBy(xpath="//*[@id=\"sub-section-title\"]")
    public static WebElement popUp;

	
	@FindBy(xpath="//button[@class='mat-focus-indicator w-100 exela-primary-btn mat-button mat-button-base'][1]")
    public static WebElement contWithFreeVersion;

	@FindBy(xpath="//input[@class='uploadBtn-pointer']")
    public static WebElement Upload_Btn;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
    public static WebElement Name_field;
	
	@FindBy(xpath="//span[text()='First name is required.']")
    public static WebElement FirstNameisrequired;
	
	@FindBy(xpath="//div[text()='Payment Method']")
    public static WebElement Payment_Method;
	
	@FindBy(xpath="//button[text()=' Update payment method ']")
    public static WebElement Update_Payment_Method;
	

	@FindBy(xpath="//h2[text()='New Payment details has been updated']")
    public static WebElement New_Payment_details_has_been_updated;
	
	@FindBy(xpath="//a[text()='Go To Dashboard']")
    public static WebElement GoToDashboard;
	
	@FindBy(xpath="(//div[@role='group'])[6]")
    public static WebElement NewPaymentDetails;
	
	
	
	@FindBy(xpath="//input[@value='Cancel']")
    public static WebElement CancelBtn;
	
	@FindBy(xpath="//h1[text()='PAYMENT FAILED']")
    public static WebElement PAYMENT_FAILED;
	
	@FindBy(xpath="//a[text()='Go To Home']")
    public static WebElement Go_To_Home;
	
	@FindBy(xpath="//a[@mattooltip='View Profile']")
	public static WebElement Profile1;
	
	@FindBy(xpath="//div[text()='Personal Information']")
	public static WebElement Personal_Information;
	
	@FindBy(xpath="//h2[text()='Unable to authorise payment:Payment cancelled by the user']")
	public static WebElement Unabletoauthorisepayment;
	
	//h2[text()='Unable to authorise payment:Payment cancelled by the user']
	
	@FindBy(xpath="//button[text()=' Cancel ']")
	public static WebElement Cancel_Btn;
	
	@FindBy(xpath="//div[@id='exela-ds-profile']")
	public static WebElement Profile_Page;
	
	@FindBy(xpath="//i[@class='exela-icon-close']")
	public static WebElement Iconclose;
	
	@FindBy(xpath="//div[@class='rightSidecontent']")
	public static WebElement rightSideContent;
	
	@FindBy(xpath="//img[@class='rounded-circle profile-user']")
	public static WebElement AddProfileImage;
	
	//input[@title='Add Profile Image']
	
	
	
	public static WebElement basicInformation(String data)
	{
	String Xpath = "//mat-form-field[@appearance='outline']";
	WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
	return element;
	}
	
	
	@FindBy(xpath="//input[@placeholder='ZIP Code']")
	public static WebElement Zip_code;
	
	@FindBy(xpath="//span[text()='Email OTP ']")
	public static  WebElement emailOtp;
	
	@FindBy(xpath="//span[text()='Setup Secure Code ']")
	public static  WebElement setupSecureCode;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	public static  WebElement Last_Name;
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	public static  WebElement Email_Address;
	
	@FindBy(xpath="//span[text()='Last name is required']")
	public static  WebElement Lastnameisrequired;
	
	
	@FindBy(xpath="//input[@placeholder='Contact Number']")
	public static  WebElement Contact_Number;
	
	
	
	//input[@placeholder='Email Address']
	//span[text()='Last name is required.']
	//input[@placeholder='Email Address']
	//input[@placeholder='Last Name']
	//h1[text()='PAYMENT FAILED']
	//a[text()='Go To Home']
	//h2[text()='New Payment details has been updated']
	//a[text()='Go To Dashboard']
	//input[@value='Cancel']
}
