package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XpathFreeUser {
	public XpathFreeUser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[@type='button']")
    public static WebElement signInWithGoogle;


    @FindBy(xpath="//input[@formcontrolname='email']")
    public static WebElement emailId;
         

    @FindBy(xpath="//span[text()='Next']")
    public static WebElement btnNext;


    @FindBy(xpath="//input[@formcontrolname='password']")
    public static WebElement pass;

    @FindBy(xpath="//input[@formcontrolname='phone']")
    public static WebElement mobNum;

    @FindBy(xpath="//*[text()='OK']")
    public static WebElement okButton;



    @FindBy(xpath="//button[@class='mat-focus-indicator w-100 exela-primary-btn mat-button mat-button-base'][1]")
    public static WebElement contWithFreeVersion;


//TS1
@FindBy(xpath="//h1[text()=' Deleting Your Account ']")
public static WebElement deleteYourAccount;

@FindBy(xpath="//span[text()=' Delete Account ']")
public static WebElement deleteAccount;

@FindBy(xpath="//p[@class='text strong ng-star-inserted']")
public static WebElement popContWithFreeVersion;

//p[@class='text strong ng-star-inserted']
}




