package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Tests extends ExampleCalculatorRealDevice{
	
	@Test
	public void firstTestCase() {
		
		driver.get("https://amazon.com");
		driver.findElement(By.name("field-keywords")).sendKeys("Books");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		System.out.println("Completed the firstTestCase....");
	}
}
