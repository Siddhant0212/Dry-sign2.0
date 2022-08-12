package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteObject {
	public DeleteObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//TS1
	@FindBy(xpath="//input[@formcontrolname='email']")
	public static  WebElement emailId;
	
	       
	@FindBy(xpath="//input[@formcontrolname='password']")
	public static WebElement passWd;

	@FindBy(xpath="//span[text()='Sign In']")
	public static WebElement sub;
	
	
	       
	
	@FindBy(xpath="//span[text()='Dashboard']")
	public static WebElement dashboard;


	@FindBy(xpath="//*[text()='more_vert']")
	public static WebElement icon;

	@FindBy(xpath="//*[@id=\"mat-menu-panel-0\"]/div/button[1]/span")
	public static WebElement profile;


	@FindBy(xpath="//*[text()='Manage Account']")
	public static WebElement mangeAcc;
	@FindBy(xpath="//button[@type='button'][2]")
	public static WebElement delAcc;

	//TS2
	@FindBy(xpath="//*[@id='cancel']")
	public static WebElement btnCancel;
	@FindBy(xpath="//*[text()='Delete Account']")
	public static WebElement btnDeleteAcc;
	
	//*[text()='Delete Account']
	
	@FindBy(xpath="//*[@class='mat-dialog-title d-flex popup-heading-align justify-content-between']")
	public static WebElement popUpSmall;
	
	@FindBy(xpath="//*[@id='mat-dialog-title-2']")
	public static WebElement popUpwithOk;
	
	@FindBy(xpath="	//*[text()='OK']")
	public static WebElement popUpOk;
	
	@FindBy(xpath="//*[@id='mat-radio-2-input']")
	public static WebElement clickOnCheckBox;
	
	@FindBy(xpath="//*[text()='Confirm']")
	public static WebElement btnConfirm;
	
	@FindBy(xpath="//td[text()='Verify']")
	public static WebElement verifyDelete;
	
	@FindBy(xpath="//td[@class='ng-binding']")     
	public static  WebElement grpSignMail;
	
	
	@FindBy(xpath="//iframe[@id='html_msg_body']")     
	public static  WebElement bodyIframe;
	
	@FindBy(xpath="//input[@id='inbox_field']")     
	public static  WebElement mailinatorInPut1;
	
	@FindBy(xpath="//button[@class='primary-btn']")     
	public static  WebElement clickGo;
	
	@FindBy(xpath="//a[text()='DELETE ACCOUNT']")     
	public static  WebElement Delete_Account;
	
	@FindBy(xpath="//div[text()=' Invalid username or password ']")     
	public static  WebElement InvalidUsernameOrPassword ;
	
	@FindBy(xpath="//div[@class='my-5 text-center']//p[text()='You have successfully deleted the account.']")     
	public static  WebElement Youhavesuccessfullydeletedaccount ;
	
	
	@FindBy(xpath="//img[@src='assets/images/icon-success-msg.png']")     
	public static  WebElement Ticklogo ;
	
	
	//img[@src='assets/images/icon-success-msg.png']
	//p[text()='You have successfully deleted the account.']
	
	//TS3
	@FindBy(xpath="//*[@id='toast-container']")
	public static WebElement invalidUserOrPass;
	//*[@id='toast-container']
	//TS4
	@FindBy(xpath="//*[text()='Forgot Password? ']")
	public static WebElement clickForgotPass;
	
	@FindBy(xpath="//*[@formcontrolname='email']")
	public static WebElement enterEmailAdd;
	
	@FindBy(xpath="//*[text()='Send Reset Email']")
	public static WebElement clickSendResetEmail;
	
	//*[text()='Send Reset Email']
	
	@FindBy(xpath="//div[text()=' Invalid email or user does not exist ']")
	public static WebElement InvalidEmailOrUserDoesNotExist;
	
	@FindBy(xpath="//img[@class='ng-star-inserted']")
	public static WebElement crossLogo;
	//img[@class='ng-star-inserted']
	
//TS5
	@FindBy(xpath="//*[text()='Sign Up']")
	public static WebElement clickOnSignUp;
	
	@FindBy(xpath="//*[@formcontrolname='firstName']")
	public static WebElement entFirstName;
	
	@FindBy(xpath="//*[@formcontrolname='lastName']")
	public static WebElement entLastName;
	
	@FindBy(xpath="//*[@formcontrolname='companyName']")
	public static WebElement entCompName;
	

	@FindBy(xpath="//*[@formcontrolname='phone']")
	public static WebElement entPhoneNo;
	
	@FindBy(xpath="//*[@formcontrolname='email']")
	public static WebElement entEmail;
	
	@FindBy(xpath="//*[@formcontrolname='password']")
	public static WebElement entPassword;
	
	@FindBy(xpath="//*[@formcontrolname='confirmPassword']")
	public static WebElement entConfirmPassword;
	
	@FindBy(xpath="//*[@class='mat-checkbox-inner-container']")
	public static WebElement clickCheckBox;
	
	@FindBy(xpath="//*[@class='mat-checkbox-inner-container']")
	public static WebElement successOnSignUp;
	
	
	@FindBy(xpath="//div[@class='toast-top-right toast-container']//div[@role='alertdialog']")
	public static WebElement yourAccountHasBeenCreated;
	
	
	
	
	//TS6
	//*[@class='col-12 col-sm-12 col-md-12 col-lg-12 col-xl-8 dashboard-align']
	
	@FindBy(xpath="//*[@class='col-12 col-sm-12 col-md-12 col-lg-12 col-xl-8 dashboard-align']")
	public static WebElement disFreeUser;
	
	@FindBy(xpath="//*[text()=' Continue With Free Version ']")
	public static WebElement clickContinueWithFreeVersion;
	
	
	
	//*[@id='Ellipse_142']
	
}
