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
}
