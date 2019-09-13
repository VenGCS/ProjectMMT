package runner;

import org.openqa.selenium.WebDriver;

import scripts.CallGoogle;
import utils.DriverUtils;

public class TestRunner {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Throwable{
		
		DriverUtils du = new DriverUtils();
		driver = du.getDriver();
		
		CallGoogle cg = new CallGoogle();
		cg.callIt(driver);
		
	}

}
