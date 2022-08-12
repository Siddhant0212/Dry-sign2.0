
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XpathUserFre {

	public XpathUserFre(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


//TS1
@FindBy(xpath="//input[@formcontrolname='email']")
public static  WebElement emailId;
       
@FindBy(xpath="//input[@formcontrolname='password']")
public static WebElement pass;

@FindBy(xpath="//span[text()='Sign In']")
public static WebElement sub;

@FindBy(xpath="//span[text()='Dashboard']")
public static WebElement dashboard;


@FindBy(xpath="//mat-icon[normalize-space()='more_vert']/ancestor::button")
public static WebElement icon;

@FindBy(xpath="//*[@id=\"mat-menu-panel-0\"]/div/button[1]/span")
public static WebElement profile;


@FindBy(xpath="//*[text()='Manage Account']")
public static WebElement mangeAcc;
	
@FindBy(xpath="//button[@type='button'][2]")
public static WebElement delAcc;

}