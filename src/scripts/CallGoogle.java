package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WaitUtils;

public class CallGoogle {
	
	WaitUtils wu =new WaitUtils();
	
	public void callIt(WebDriver driver) throws Throwable{
		
		driver.get("https://google.com");
		
		WebElement Element = driver.findElement(By.xpath("//*[@title='Search']"));
		
		wu.visibilityWait(driver,Element);
		
		//type what to search
		Element.sendKeys("Something");
		
		//click on search button
		WebElement searchButton = driver.findElement(By.xpath("//*[@value='Google Search']"));
		
		wu.visibilityWait(driver, searchButton);
		
		searchButton.click();
		
	}

}
