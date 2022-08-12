package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleDocumentUploadObject {
	public MultipleDocumentUploadObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//label[text()='Self Sign']")
	public static WebElement selfSign;
	
	
	@FindBy(xpath="//a[text()='Browse']")
	public static WebElement browser;
}
