package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {
	
	@Test
	public void test2() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("example email");
		driver.findElement(By.id("pass")).sendKeys("test");
		
		driver.quit();
		
	}

}
