package framework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.SAXException;

import baseinit.Base;
import io.cucumber.java.en.Then;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
// Importing Apache POI classes
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;


public class Elements {
	

	public Logger log = Logger.getLogger(Elements.class);
	
	public static int count =4;

	public static void TypeText(WebElement element, String data) {
		element.clear();
		//Thread.sleep(5000);
		element.sendKeys(data);
	}
	
	public static void TypeTextWithOutText(WebElement element, String data) {
		//leep(5000);
		element.sendKeys(data);
	}

	public static void TypeTextIfElementPresent(WebElement element, String data) {
		if (element.isDisplayed()) {
			element.sendKeys(data);
		}
	}
	
	public static void redaction(WebElement element, int Xaxis,int Yaxis) {
		
		Actions action = new Actions(Base.driver);
		//383,85
		action.moveToElement(element).clickAndHold().moveByOffset(Xaxis, Yaxis).release().build().perform();	
	}
	
	public static void clearTxtBox(WebElement element) {
		element.clear();
	}

	public static void typeRandomNumber(WebElement element, int data) {
		Random random = new Random();
		int rn = random.nextInt(100);
		String randomNumber = Integer.toString(rn);
		element.sendKeys(randomNumber);
	}

	public static String getTextBoxValue(WebElement element) {
		return element.getAttribute("value");
	}
	
	public static String getAttributeValue(WebElement element,String attributeName) {
		return element.getAttribute(attributeName);
	}
	
	public static String getText(WebElement element){
		return element.getText();
	}
	
	public static boolean VerifyTextEquals(WebElement element,String expected){
		boolean flag=false;
		if(element.getText().equals(expected))
			return flag=true;
		return flag;
	}
	
	public static boolean VerifyTextnotEquals(WebElement element,String expected){
		boolean flag=false;
		if(!element.getText().equals(expected))
			return flag=true;
		return flag;
	}
	
	public static String getTitle(){
		return Base.driver.getTitle();
	}
	
	public String getCurrentUrl(){
		return Base.driver.getCurrentUrl();
	}

	public boolean isSelected(WebElement element) {
		if (element.isSelected()) 
			return true;
		return false;
	}

	public void selectCheckBox(WebElement element) {
		if (!isSelected(element))
			element.click();
	}

	public void deSelectCheckbox(WebElement element) {
		if (isSelected(element))
			element.click();
	}

	public void selectRadioButton(WebElement element) {
		if (!isSelected(element))
			element.click();
	}

	public void deSelectRadioButton(WebElement element) {
		if (isSelected(element))
			element.click();
	}
	
	public static boolean isEnabled(WebElement element){
		if(element.isEnabled())
			return true;
		return false;
	}
	
	public static boolean isDisplayed(WebElement element){
		if(element.isDisplayed())
			return true;
		return false;
	}
	
	public static void selectByText(WebElement element,String text){
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectByIndex(WebElement element,int index){
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectByValue(WebElement element,String value){
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
	public static String getFirstSelectedOption(WebElement element){
		Select select=new Select(element);
		return select.getFirstSelectedOption().getText();
	}
	
	public List<WebElement> getAllSelectedOptions(WebElement element){
		Select select=new Select(element);
		return select.getAllSelectedOptions();
		}
	
	public static List<WebElement> getAllOptions(WebElement element){
		Select select=new Select(element);
		return select.getOptions();
	}
	
	public void deSelectByText(WebElement element,String text){
		Select select=new Select(element);
		select.deselectByVisibleText(text);
	}
	
	public void deSelectByIndex(WebElement element,int index){
		Select select=new Select(element);
		select.deselectByIndex(index);
	}
	
	public void deSelectByValue(WebElement element,String value){
		Select select=new Select(element);
		select.deselectByValue(value);
	}
	
	public static void click(final WebElement element){
		//div[@class='loading-wrap']//div[@class='sk-fading-circle loading-icon']
		Waits.waitUntil(() ->isDisplayed(element));
		element.click();
		
		for(int i=0;i<=120;i++)
		{
		List<WebElement> spinner =Base.driver.findElements(By.xpath("//div[@class='loading-wrap']//div"));
		try
		{
		if(spinner.size()==0)
		{
			break;
		}else
		{
			Thread.sleep(1000);
			//System.out.println(spinner.size());
		}
		}catch(Exception e)
		{
			
		}
		}
		
		for(int i=0;i<=60;i++)
		{
		List<WebElement> spinner =Base.driver.findElements(By.xpath("//div[@class='loading-wrap']//div"));
		
		try
		{
		if(spinner.size()==0)
		{
			break;
		}else
		{
			Thread.sleep(1000);
			//System.out.println(spinner.size());
		}
		}catch(Exception e)
		{
			
		}
		}
	}
	
	public static void jclick(final WebElement element){
		JavascriptExecutor executor = (JavascriptExecutor) Base.driver;
        executor.executeScript("arguments[0].click();", element);
        
        for(int i=0;i<=120;i++)
		{
		List<WebElement> spinner =Base.driver.findElements(By.xpath("//div[@class='loading-wrap']//div"));
		try
		{
		if(spinner.size()==0)
		{
			break;
		}else
		{
			Thread.sleep(1000);
			//System.out.println(spinner.size());
		}
		}catch(Exception e)
		{
			
		}
		}
		
		for(int i=0;i<=60;i++)
		{
		List<WebElement> spinner =Base.driver.findElements(By.xpath("//div[@class='loading-wrap']//div"));
		
		try
		{
		if(spinner.size()==0)
		{
			break;
		}else
		{
			Thread.sleep(1000);
			//System.out.println(spinner.size());
		}
		}catch(Exception e)
		{
			
		}
		}
	}
	
	public static void jTypeText(final WebElement element,String tData){
		JavascriptExecutor jse = (JavascriptExecutor)Base.driver;
		jse.executeScript("arguments[0].value='"+tData+"';", element);
	}
	
	public static void Mouseclick(final WebElement element){
		//Waits.waitUntil(() ->isDisplayed(element));
		Actions action = new Actions(Base.driver);
		action.moveToElement(element).click().build().perform();
		
		for(int i=0;i<=120;i++)
		{
		List<WebElement> spinner =Base.driver.findElements(By.xpath("//div[@class='loading-wrap']//div"));
		try
		{
		if(spinner.size()==0)
		{
			break;
		}else
		{
			Thread.sleep(1000);
			//System.out.println(spinner.size());
		}
		}catch(Exception e)
		{
			
		}
		}
		
		for(int i=0;i<=60;i++)
		{
		List<WebElement> spinner =Base.driver.findElements(By.xpath("//div[@class='loading-wrap']//div"));
		
		try
		{
		if(spinner.size()==0)
		{
			break;
		}else
		{
			Thread.sleep(1000);
			//System.out.println(spinner.size());
		}
		}catch(Exception e)
		{
			
		}
		}
	}
	
	public static void mouseDoubleclick(final WebElement element){
		Waits.waitUntil(() ->isDisplayed(element));
		Actions action = new Actions(Base.driver);
		action.moveToElement(element).doubleClick().build().perform();
		
	}
	
	
	public void clickOnlyIfElementPresent(WebElement element){
		if(isDisplayed(element))
			element.click();
	}
	
	public Alert getAlert() {
		return Base.driver.switchTo().alert();
	}
	
	public void AcceptAlert() {
		getAlert().accept();
	}
	
	public void DismissAlert() {
		getAlert().dismiss();
	}

	public String getAlertText() {
		String text = getAlert().getText();
		return text;
	}

	public boolean isAlertPresent() {
		try {
			Base.driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public void AcceptAlertIfPresent() {
		if (!isAlertPresent())
			return;
		AcceptAlert();
	}

	public void DismissAlertIfPresent() {

		if (!isAlertPresent())
			return;
		DismissAlert();
	}
	
	public void AcceptPrompt(String text) {
		
		if (!isAlertPresent())
			return;
		
		Alert alert = getAlert();
		alert.sendKeys(text);
		alert.accept();
	}

	public static void scrollToElemet(WebElement element) {
		Waits.tryJavascript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x, element.getLocation().y);
	}
	
	public void scrollToElemetAndClick(WebElement element) {
		scrollToElemet(element);
		element.click();
	}

	public static void scrollIntoView(WebElement element) {
		Waits.tryJavascript("arguments[0].scrollIntoView()", element);
	}

	public static void scrollIntoViewAndClick(WebElement element) {
		scrollIntoView(element);
		element.click();
	}
	
	public void scrollDownVertically() {
		Waits.tryJavascript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollUpVertically() {
		Waits.tryJavascript("window.scrollTo(0, -document.body.scrollHeight)");
	}

	public static void scrollDownByPixel() {
		Waits.tryJavascript("window.scrollBy(0,1500)");
	}

	public void scrollUpByPixel() {
		Waits.tryJavascript("window.scrollBy(0,-1500)");
	}

	public void ZoomInBypercentage() {
		Waits.tryJavascript("document.body.style.zoom='40%'");
	}

	public void ZoomBy100percentage() {
		Waits.tryJavascript("document.body.style.zoom='100%'");
	}
	
	public static void switchToParentWindow()
	{
		Set<String> window = Base.driver.getWindowHandles();
		//System.out.println(window.size());
		if(window.size() > 0)
        {
            Iterator<String> iterator= window.iterator();
            while(iterator.hasNext())
            {
                String popupHandle=iterator.next().toString();
                if(!popupHandle.contains(Base.mainWindowHandle))
                {
                		Base.driver.close();
                }
     
                }
            Base.driver.switchTo().window(Base.mainWindowHandle);
            }
		}
	
	public static void switchToChild() throws InterruptedException
	{
		Thread.sleep(5000);
		Set<String> window = Base.driver.getWindowHandles();
		//System.out.println(window.size());
		if(window.size() > 0)
        {
            Iterator<String> iterator= window.iterator();
            while(iterator.hasNext())
            {
                String popupHandle=iterator.next().toString();
                if(!popupHandle.contains(Base.mainWindowHandle))
                {
                	Base.driver.switchTo().window(popupHandle);
                	Base.driver.manage().window().maximize();
                }
      
                }
            }
		}
	public static void switchToFrame(WebElement element)  
	{
		WebDriverWait wait=new WebDriverWait(Base.driver,30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
					
	}
	
	public static void switchTodefaultContent() throws InterruptedException  
	{
		Thread.sleep(5000);
		Base.driver.switchTo().defaultContent();
					
	}
	
	public static  void dragAndDrop(WebElement source,WebElement destination) throws InterruptedException
	{		
		/*
		 * Actions action = new Actions(Base.driver);
		 * 
		 * action.dragAndDrop(source, destination).build().perform();
		 */
		
		int x = destination.getLocation().x;
        int y = destination.getLocation().y;

        Actions actions = new Actions(Base.driver);
        actions.moveToElement(source)
                .pause(Duration.ofSeconds(1))
                .clickAndHold(source)
                .pause(Duration.ofSeconds(1))
                .moveByOffset(x, y)
                .moveToElement(destination)
                .moveByOffset(x,y)
                .pause(Duration.ofSeconds(1))
                .release().build().perform();
	
	}
	

	
	public static void authentication(String username, String password) throws AWTException, InterruptedException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_X);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_G);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_X);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_3);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_G);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_0);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_1);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		}
	public static void secureCodeClear () throws AWTException, InterruptedException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_B);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_X);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_G);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_X);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_3);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_G);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_0);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_1);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);

}
	public static void pressEnter(WebElement element){
		element.sendKeys(Keys.ENTER);
		}
	
	
		public static long calculateDays() throws ParseException {
			
			Date dNow = new Date();
	        DateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
	        Date registrationDate=ft.parse("2022-08-26");
	        Date currentDate=ft.parse(ft.format(dNow));
	        long diff = currentDate.getTime() - registrationDate.getTime();
	        long differenceDates = diff / (24 * 60 * 60 * 1000);
	        System.out.println(differenceDates);
	        
	        return differenceDates;
		}
		

		public static String localDateToString(LocalDate date) {
			DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd MM yyyy");
			return date.format(myFormat).toString();
		}
		public static void pressDelete(WebElement element){
			element.sendKeys(Keys.BACK_SPACE);
			}
		
		public static void pressTab1(WebElement element){
			element.sendKeys(Keys.ENTER);
			}
		
		public static boolean isFileDownloaded(String fileName) {
			boolean flag = false;
			File dir = new File(System.getProperty("user.dir") + "\\DownloadedFiles\\");
			File[] dir_contents = dir.listFiles();
			for (int i = 0; i < dir_contents.length; i++) {
			if (dir_contents[i].getName().contains(fileName))
			return flag = true;
			}
			return flag;
			}

		 public static String readPDFInURL() throws IOException, SAXException, TikaException  {

					
					BodyContentHandler contenthandler
						= new BodyContentHandler();

					
					File f = new File("C:\\Users\\Siddhant.Ingole.IN\\eclipse-workspace\\DS-2.0\\DownloadedFiles\\Holidays List 2022 Updated.pdf");

					
					FileInputStream fstream = new FileInputStream(f);

				
					Metadata data = new Metadata();

					
					ParseContext context = new ParseContext();

					
					PDFParser pdfparser = new PDFParser();

					
					pdfparser.parse(fstream, contenthandler, data,
									context);

				
					System.out.println("Extracting contents :"
									+ contenthandler.toString());
					
					String content = contenthandler.toString();
					return content ;
				}
		 
		 
		 public static Date validateDateFormat(String dateToValdate) {

			    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HHmmss");
			    //To make strict date format validation
			    formatter.setLenient(false);
			    Date parsedDate = null;
			    try {
			        parsedDate = formatter.parse(dateToValdate);
			        System.out.println("++validated DATE TIME ++"+formatter.format(parsedDate));

			    } catch (ParseException e) {
			        //Handle exception
			    }
			    return parsedDate;
			}
			
}
		 
	
	
