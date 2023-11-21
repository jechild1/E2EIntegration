package testCases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_009 {
	
	@Test
	public void test9() {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		
		
		driver.quit();
		
		
		
		
		
	}

}
