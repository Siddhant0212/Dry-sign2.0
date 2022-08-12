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
	
}
