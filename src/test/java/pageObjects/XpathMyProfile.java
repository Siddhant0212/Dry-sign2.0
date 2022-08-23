package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath="//input[@placeholder='Name']")
    public static WebElement Name_field;
	
	@FindBy(xpath="//span[text()='First name is required.']")
    public static WebElement FirstNameisrequired;
	
	@FindBy(xpath="//div[text()='Payment Method']")
    public static WebElement Payment_Method;
	
	@FindBy(xpath="//span[text()=' Update payment method ']")
    public static WebElement Update_Payment_Method;
	

	@FindBy(xpath="//h2[text()='New Payment details has been updated']")
    public static WebElement New_Payment_details_has_been_updated;
	
	@FindBy(xpath="//a[text()='Go To Dashboard']")
    public static WebElement GoToDashboard;
	
	@FindBy(xpath="//input[@value='Cancel']")
    public static WebElement CancelBtn;
	
	@FindBy(xpath="//h1[text()='PAYMENT FAILED']")
    public static WebElement PAYMENT_FAILED;
	
	@FindBy(xpath="//a[text()='Go To Home']")
    public static WebElement Go_To_Home;
	
	
	//h1[text()='PAYMENT FAILED']
	//a[text()='Go To Home']
	//h2[text()='New Payment details has been updated']
	//a[text()='Go To Dashboard']
	//input[@value='Cancel']
}
