package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ExampleCalculatorRealDevice {
	
	static AppiumDriver<WebElement> driver;

	@BeforeTest
	public void set()  {

		try {
			
			DesiredCapabilities dcaps = new DesiredCapabilities();
			dcaps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			dcaps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy F41");
			dcaps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dcaps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
			dcaps.setCapability(MobileCapabilityType.UDID, "RZ8N926CVGL");
			dcaps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			dcaps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			//dcaps.setCapability("appPackage", "com.wt.apkinfo");
			//dcaps.setCapability("appActivity", "com.wt.apkinfo.activities.StartActivity");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			 driver = new AppiumDriver<WebElement>(url, dcaps);
			 
		} catch (Exception e) {
			System.out.println("Cause is "+e.getCause());
			System.out.println("Message is "+e.getMessage());
			e.printStackTrace();
			
			
		}
	
	}
	
	@Test
	public void runTest() {
		System.out.println("Here runTest is executed");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
