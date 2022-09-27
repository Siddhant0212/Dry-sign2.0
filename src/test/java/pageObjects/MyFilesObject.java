package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseinit.Base;

public class MyFilesObject {
	public MyFilesObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[text()='Pending']")
    public static WebElement Pending;
	
	@FindBy(xpath="//div[text()='Signed']")
    public static WebElement Signed;
	
	@FindBy(xpath="//span[text()=' Subject ']")
    public static WebElement Subject;
	
	@FindBy(xpath="(//input[@placeholder='Filter'])[1]")
    public static WebElement Subject_Search;
	
	@FindBy(xpath="(//input[@placeholder='Filter'])[2]")
    public static WebElement Subject_Search2;
	
	@FindBy(xpath="(//input[@placeholder='Filter'])[3]")
    public static WebElement Subject_Search3;
	
	@FindBy(xpath="(//input[@placeholder='Filter'])[4]")
    public static WebElement Subject_Search4;
	
	
	
	@FindBy(xpath="//span[text()=' Document Name ']")
    public static WebElement Document_Name;
	
	@FindBy(xpath="//span[text()=' Assigned Date ']")
    public static WebElement Assigned_Date;
	
	@FindBy(xpath="//span[text()=' Requested By ']")
    public static WebElement Requested_By;
	
	@FindBy(xpath="//span[text()='Action']")
    public static WebElement Action;
	
	@FindBy(xpath="//a[text()=' Hello sign ']")
    public static WebElement helloSign;
	
	@FindBy(xpath="//span[text()=' 08/17/2022 1:07:58 AM ']")
    public static WebElement TimingSign;
	
	@FindBy(xpath="//i[@class='fs-32 exela-icon-action lineHeight']")
    public static WebElement sign;
	
	@FindBy(xpath="//a[text()=' Hello sign ']")
    public static WebElement Hello_sign;
	
	
	
	@FindBy(xpath="//div[@class='PSPDFKit-56n1nqnnrb1vp96tz5hfxdeh29']")
    public static WebElement Doc_Display;
	
	@FindBy(xpath="//iframe[@title='PSPDFKit']")
    public static WebElement iframe;
	
	@FindBy(xpath="//tr[@id='accordion0']")
    public static WebElement Doc_Present;
	
	@FindBy(xpath="//span[text()=' 08/17/2022 12:01:58 AM ']")
    public static WebElement TimingSign1;
	
	@FindBy(xpath="//span[text()=' Completed Date ']")
    public static WebElement Completed_Date;
	
	
	@FindBy(xpath="//span[text()=' 08/09/2022 2:59:02 AM ']")
    public static WebElement TimingSign3;
	
	@FindBy(xpath="//div[text()='Out for Sign']")
	public static  WebElement OutforSignature;
	
	@FindBy(xpath="//span[text()=' 08/24/2022 2:55:23 AM ']")
	public static  WebElement TimingSign4;
	
	@FindBy(xpath="//span[text()=' Date & Time ']")
	public static  WebElement Date_Time;
	
	
	@FindBy(xpath="(//span[@class='data-el ng-star-inserted'])[3]")
	public static  WebElement TimingSign5;
	
	@FindBy(xpath="(//span[@class='data-el ng-star-inserted'])[3]")
	public static  WebElement TimingSign6;
	
	
	@FindBy(xpath="//div[@class='in p-3 collapse show']")
	public static  WebElement Details1;
	
	@FindBy(xpath="(//div[text()=' Envelope Id: '])[1]")
	public static  WebElement Envelope_Id1;
	
	@FindBy(xpath="(//div[text()=' Document Name: '])[1]")
	public static  WebElement Document_Name1;
	
	@FindBy(xpath="(//div[text()=' Requested By: '])[1]")
	public static  WebElement Requested_By1;
	
	@FindBy(xpath="(//div[text()=' Signatories: '])[1]")
	public static  WebElement Signatories1;
	
	@FindBy(xpath="//(//div[text()=' Subject: '])[1]")
	public static  WebElement Subject1;
	
	@FindBy(xpath="(//div[text()=' Message: '])[1]")
	public static  WebElement Message1;
	
	public static WebElement DetailsField(String data)
	{
	String Xpath = "//div[@class='column-collapse-data ng-star-inserted']";
	WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
	return element;
	}
	
	
	public static WebElement DetailsField1(String data)
	{
	String Xpath = "//*[@class='ng-star-inserted']";
	WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
	return element;
	}
	
	public static WebElement Ascedingorder(String data)
	{
	String Xpath = "//span[@class='data-el ng-star-inserted']";
	WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
	return element;
	}
	
	public static WebElement Rejectedorder(String data)
	{
	String Xpath = "//div[@class='column-collapse-data ng-star-inserted']";
	WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
	return element;
	}
	
	
	public static WebElement Assigneddate(String data)
	{
	String Xpath = "//td[@class='assignedDate ng-star-inserted']";
	WebElement element = Base.driver.findElement(By.xpath(Xpath.replace("$", data)));
	return element;
	}
	
	
	@FindBy(xpath="(//mat-icon[text()='arrow_drop_up'])[4]")     
	public static  WebElement Arrow_drop_up;
	
	@FindBy(xpath="(//mat-icon[text()='arrow_drop_down'])[4]")     
	public static  WebElement Arrow_drop_down;
	
	
			
			@FindBy(xpath="(//a[@mattooltip='Info'])[1]")     
			public static  WebElement Info;
			
			@FindBy(xpath="//h1[text()=' Recent Action ']")     
			public static  WebElement Recent_Action;
			
			@FindBy(xpath="(//tr[@class='ng-star-inserted'])[2]")     
			public static  WebElement Records;
			
			@FindBy(xpath="(//a[@mattooltip='Notify'])[1]")     
			public static  WebElement Notify;
			
			@FindBy(xpath="//i[@class='exela-icon-close']")     
			public static  WebElement Close;
			
			@FindBy(xpath="//p[@class='text strong ng-star-inserted']")     
			public static  WebElement Succesfull_Text;
			
			@FindBy(xpath="(//a[@mattooltip='Remove'])[1]")     
			public static  WebElement Remove;
			
			//p[@class='text strong ng-star-inserted']
			//p[@class='text strong ng-star-inserted']
			
			
	@FindBy(xpath="//td[@id='accordian0']")     
	public static  WebElement minusicon;
	
	@FindBy(xpath="//td[@id='accordian1']")     
	public static  WebElement plusIcon1;
	
	@FindBy(xpath="//a[@mattooltip='Reassign']")     
	public static  WebElement Reassign;
	
	@FindBy(xpath="//button[text()='Yes']")     
	public static  WebElement Yes;
	
	@FindBy(xpath="//h1[text()=' Reassign ']")     
	public static  WebElement Reassign1;
	
	@FindBy(xpath="//button[text()='Confirm']")     
	public static  WebElement Confirm;
	
	@FindBy(xpath="//input[@placeholder='Name']")     
	public static  WebElement Enter_Name;
	
	@FindBy(xpath="//input[@placeholder='Email ID']")     
	public static  WebElement Email_Address;
	
	@FindBy(xpath="//p[text()='Are you sure you want to reassign eSign authority to another signatory?']")     
	public static  WebElement Are_you_sure_you_want;
	
	@FindBy(xpath="//p[@class='text strong ng-star-inserted']")     
	public static  WebElement This_email_addressal_ready_exists;
	
	@FindBy(xpath="(//mat-icon[text()='remove_red_eye'])[1]")     
	public static  WebElement iconView;
	
	@FindBy(xpath="//*[@class='canvasWrapper']")     
	public static  WebElement Doc_Display1;
	
	@FindBy(xpath="//mat-icon[text()='close']")     
	public static  WebElement closeIcon;
	
	@FindBy(xpath="//span[text()=' Sign Type ']")     
	public static  WebElement Sign_Type;
	
	
	@FindBy(xpath="//mat-icon[text()='mail_outline']")     
	public static  WebElement mail_outline;
	
	@FindBy(xpath="//span[text()=' Title ']")     
	public static  WebElement Title;
	
	@FindBy(xpath="//span[text()=' Rejected Date ']")     
	public static  WebElement Rejected_Date;
	
	@FindBy(xpath="//span[text()=' Rejected By ']")     
	public static  WebElement Rejected_By;
	
	
	
	@FindBy(xpath="//span[text()='Prev']")     
	public static  WebElement Previous;
	
	@FindBy(xpath="//span[text()='Next']")     
	public static  WebElement Next;
	
	@FindBy(xpath="//span[text()='1']")     
	public static  WebElement Default_one;
	
	@FindBy(xpath="(//span[@class='fs-14'])[2]")     
	public static  WebElement Displaying_item ;
	
	@FindBy(xpath="//span[text()='Pending']")     
	public static  WebElement Pending_Status ;
	
	//span[text()='Pending']
	
	
	
	//div[text()=' Displaying item : 1 - 4 of 4 ']
	//span[text()='1']
	//span[text()='Next']
	//span[text()='Prev']
	//span[text()=' Rejected By ']
	//span[text()=' Rejected Date ']
	//span[text()=' Title ']
	//span[text()=' Document Name ']
	//mat-icon[text()='mail_outline']
	//span[text()=' Sign Type ']
	//mat-icon[text()='close']
	
	//*[@class='canvasWrapper']
	//span[text()='This email address already exists in your previously assigned list.']
	//p[text()='Are you sure you want to reassign eSign authority to another signatory?']
	//mat-label[text()='Email Address']
	//mat-label[text()='Enter Name']
	//span[text()='Confirm']
	//h1[text()=' Reassign ']
	//span[text()='Yes']
	//a[@mattooltip='Reassign']
	//td[@id='accordian1']
	//(//div[text()=' Message: '])[1]
	//(//div[text()=' Subject: '])[1]
	
	//(//div[text()=' Signatories: '])[1]
	//(//div[text()=' Requested By: '])[1]
	//(//div[text()=' Document Name: '])[1]
	//div[@class='in p-3 collapse show']
	//span[text()=' 08/16/2022 11:06:55 AM ']
	//span[text()=' 08/16/2022, 11:24:02 AM ']
	//span[text()=' Date & Time ']
	//span[text()=' 08/24/2022 2:55:23 AM ']
	
	//span[text()=' 08/09/2022 2:59:02 AM ']
	//span[text()=' Completed Date ']
	//tr[@id='accordion0']
	
	//span[text()=' 08/23/2022 11:05:06 PM ']
	//span[text()=' Subject ']
	//span[text()=' Document Name ']
	//span[text()=' Assigned Date ']
	//span[text()=' Requested By ']
	//span[text()='Action']
	//a[text()=' sign ']
	//div[@class='PSPDFKit-56n1nqnnrb1vp96tz5hfxdeh29']
	//iframe[@title='PSPDFKit']
}
