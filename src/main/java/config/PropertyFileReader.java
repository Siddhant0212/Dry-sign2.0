package config;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import util.PathHelper;



public class PropertyFileReader implements ConfigurationReader{
	
	public static Properties properties=null;
	
	public PropertyFileReader() {
		properties=new Properties();
		try {
			properties.load(PathHelper.getInputStreamResourcePath("/PropertiesFile/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	public String getUrl() {
		return properties.getProperty("url");
	}

	public String getBrowser() {
		return properties.getProperty("browser");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(properties.getProperty("PageLoadTimeOut"));
	}
	
	}
