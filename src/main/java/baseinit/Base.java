package baseinit;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.commons.lang3.SystemUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.ConfigurationReader;
import config.PropertyFileReader;

import framework.Browser;
import framework.Waits;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;


public class Base {
	
	public static Logger log=Logger.getLogger(Base.class);
	public static String mainWindowHandle;
	public static WebDriver driver;
	public static ConfigurationReader reader;

	@Before
	public void BrowsersetUp(Scenario browser){
		log.info("Scenario Started: "+browser.getName());
		Base.reader=new PropertyFileReader();
		Browser.startBrowser();
		Browser.maximize();
		mainWindowHandle=driver.getWindowHandle();
		
	}
	
	@AfterStep
	public void waitToPageRender(Scenario scenario) throws InterruptedException
	{
		
		for(int i=1;i<=60;i++)
		{
			if(Waits.isPageLoaded())
			{
				break;
			}
			
			Thread.sleep(1000);
		}
		
		if(PropertyFileReader.properties.getProperty("ScreenShotforEachSteps").toLowerCase().equalsIgnoreCase("yes"))
		{
			scenario.embed(Browser.takeScreenshot(scenario), "image/png");
		}
	}
	
	
	@After
	
	public void closeBrowser(Scenario scenario) throws ParseException{
		if(scenario.isFailed()){
			
			scenario.embed(Browser.takeScreenshot(scenario), "image/png");
			
		}
		
		
		System.out.println("Scenario Status is: "+scenario.getStatus());
		System.out.println("Scenario Status is: "+scenario.getName());
		
		log.info("Scenario Completed: "+scenario.getName());
		log.info("Scenario Status is: "+scenario.getStatus());
		Base.driver.quit();
		try
		 {
			 if (SystemUtils.IS_OS_WINDOWS)
			    { 
				 	Runtime.getRuntime().exec("taskkill /F /PID "+Browser.chromeDriverProcessID);
				 	Runtime.getRuntime().exec("taskkill /F /PID "+Browser.chromeProcessID);
				 	
			    }else if(SystemUtils.IS_OS_LINUX)
			    {
			    	Runtime.getRuntime().exec("sudo kill "+Browser.chromeDriverProcessID);
			    	Runtime.getRuntime().exec("sudo kill "+Browser.chromeProcessID);
			    }
		 }catch(Exception e)
		 {
			 
		 }
		}
	 
	}


