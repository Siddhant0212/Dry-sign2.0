package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	

public class XpasswrdProdoc {
	public XpasswrdProdoc (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	public static  WebElement emailId;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	public static WebElement passwd;

	@FindBy(xpath="//span[text()='Sign In']")
	public static WebElement signInClick;


    @FindBy(xpath="//*[text()='Group Sign']")
    public static WebElement grpSignBtn;
    
    @FindBy(xpath="//span[text()='Dashboard']")
    public static WebElement dashboard;
    
    @FindBy(xpath="//*[text()='Browse']")
    public static WebElement browseClick;


    @FindBy(xpath="//*[text()=' Save and Continue ']")
    public static WebElement btnSaveAndCon;
    @FindBy(xpath=" //*[@id=\"mat-tab-label-2-1\"]/div/div/label/img")
    public static WebElement addSignatory;
    

    @FindBy(xpath="//input[@formcontrolname='signerName']")
    public static WebElement signName;
    @FindBy(xpath="//input[@placeholder='Signatory Email ID']")
    public static WebElement signEmailId;
    

    
  

    @FindBy(xpath="//input[@formcontrolname='phone']")
    public static WebElement mobNum;

    @FindBy(xpath="//*[text()='OK']")
    public static WebElement okButton;



    @FindBy(xpath="//button[@class='mat-focus-indicator w-100 exela-primary-btn mat-button mat-button-base'][1]")
    public static WebElement contWithFreeVersion;
    
    //Ts2
  
    
    @FindBy(xpath="//*[@autocomplete='username']")
    public static WebElement userName;

    @FindBy(xpath="//*[@type='password']")
    public static WebElement passWd;
    
    @FindBy(xpath=" //*[text()='Next']")
    public static WebElement btnNext;
    
  //*[@type='password']
     @FindBy(xpath="//*[text()='Sign Document']")
    public static WebElement signDocu;

}
