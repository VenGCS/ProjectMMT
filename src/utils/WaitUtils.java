package utils;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	
	static WebDriverWait wdWait;
	static Properties p;
	
	public void getProperties() throws Throwable {
		
		FileReader reader=new FileReader("misc/config.properties");  
	    
	    p=new Properties();  
	    p.load(reader);
	    
	    //return p;
	}
	
	public void visibilityWait(WebDriver driver, WebElement element) throws Throwable{
		
		int waitTime = Integer.valueOf(p.getProperty("visibilityWaitTimeinSeconds"));
		
		wdWait = new WebDriverWait(driver, waitTime);
		wdWait.until(ExpectedConditions.visibilityOf(element));
		
	}

}
