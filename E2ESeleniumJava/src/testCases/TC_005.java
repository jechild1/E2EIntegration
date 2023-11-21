package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TC_005 {
	
	@Test
	public void test4() {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://www.yahoo.com");
		
		driver.findElement(By.id("ybar-sbq")).sendKeys("Testing this");
		
		driver.quit();
		
		
		
		
		
	}

}
