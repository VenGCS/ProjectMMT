package utils;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	
	public WebDriver getDriver() throws Throwable{
		
		FileReader reader=new FileReader("misc/config.properties");  
	    
	    Properties p=new Properties();  
	    p.load(reader);
	    
	    String DriverKey = p.getProperty("ChromeDriverKey");
	    String DriverPath = p.getProperty("ChromeDriverPath");
		
		System.setProperty(DriverKey, DriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		return driver;
	}

}
