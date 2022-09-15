package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseinit.Base;

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

@FindBy(xpath="//p[text()='You have reached the document upload count, please subscribe to upload more documents.']")
public static WebElement You_have_reached_the_document_upload_count;

@FindBy(xpath="//img[@mattooltip='Upload']")
public static WebElement browser;

@FindBy(xpath="//span[text()='Template']")
public static WebElement Template;

@FindBy(xpath="//button[@class='exela-majento-icon-link']")
public static WebElement  Add_New_Template ;

//i[@class='exela-icon-add-new']
@FindBy(xpath="//span[text()=' Upload New Template ']")
public static WebElement Upload_New_Template;

@FindBy(xpath="//p[text()='You have reached the template upload count, please subscribe to upload more templates.']")
public static WebElement You_have_reached_the_template_upload_count;


public static WebElement textField(String data)
{
String Xpath = "//*[@class='ng-star-inserted']";
WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
return element;
}


}




