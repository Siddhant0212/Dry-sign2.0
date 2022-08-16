package runner;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.text.ParseException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.JUnitCore;

import com.google.common.io.Files;
import com.microsoft.azure.storage.CloudStorageAccount;
import com.microsoft.azure.storage.StorageException;
import com.microsoft.azure.storage.blob.CloudBlobClient;
import com.microsoft.azure.storage.blob.CloudBlobContainer;

import baseinit.Base;
import config.PropertyFileReader;
import framework.GenericActions;
import util.PathHelper;





public class externalCucumberOptionsTest {

	public static final String storage_connection_string = "DefaultEndpointsProtocol=https;AccountName=dmringesterqa;AccountKey=2/aNkQZei/YeM5EChDWb+qBcPXAxCokJY4QQnPd0+G2Vq57Guanpg3SYuZx43+hJEPBD4l71wOD5X1F25n+r4w==;EndpointSuffix=core.windows.net;";
	static CloudBlobContainer container;
	
	public static void loadPropertiesFile() throws IOException{
		PropertyConfigurator.configure(PathHelper.getResourcePath("/src/main/resources/ConfigurationFile/log4j.properties"));
		PropertyFileReader prop = new PropertyFileReader();
	    }
	public static String createAndGetCucumberOption(){       
	     StringBuilder sb = new StringBuilder();
	     String featureFilesPath = 
	    PropertyFileReader.properties.getProperty("cucumber.options.feature");
	     Base.log.info(" featureFilesPath: " +featureFilesPath);
	     sb.append(featureFilesPath);
	     return sb.toString();
	    }

	 public static void setOptions(){
	   String value = createAndGetCucumberOption();
	   Base.log.info(" Value: " +value);
	   System.setProperty("cucumber.options", value);
	   }

	public static void main(String[] args) throws IOException, ParseException, InvalidKeyException, URISyntaxException, StorageException {
			
			System.out.println("Execution process Started....");
			GenericActions.hitoryReports();
			GenericActions.filesDeletion();
			JUnitCore junitRunner = new JUnitCore();
	        loadPropertiesFile();
	       
	        
	        junitRunner.run(runner.RunnerTest.class);
	         
            junitRunner.run(runner.failedScenariosRunner.class);
	        







			
			System.out.println("Execution process Completed");
	}

}
