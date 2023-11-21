package testCases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_008 {
	
	@Test
	public void test8() {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		
		
		driver.quit();
		
		
		
		
		
	}

}
