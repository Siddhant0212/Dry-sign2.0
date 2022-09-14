package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseinit.Base;

public class AutoRenewalObject {
	public AutoRenewalObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Login']")
	public static WebElement Login_btn;
	
	@FindBy(xpath="//button[text()='Upgrade Plan']")
	public static WebElement Upgrade_Plan;
	
	@FindBy(xpath="//app-dashboard[@class='ng-star-inserted']")
	public static WebElement Dashboard_Page;
	
	
	@FindBy(xpath="//button[text()=' Upgrade ']")
	public static WebElement Upgrade;
	

	@FindBy(xpath="(//div[@class='total-count'])[3]")
	public static WebElement Total_count;
	
	

	public static WebElement Field(String data)
	{
	String Xpath = "//div[@class='ng-star-inserted']";
	WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
	return element;
	}
	
	
	//button[text()='Upgrade Plan']

}
