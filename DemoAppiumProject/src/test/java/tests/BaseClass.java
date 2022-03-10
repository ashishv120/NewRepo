package tests;



import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static AppiumDriver<WebElement> driver;
	
	@BeforeTest
	public void setup() {
		
		try {
			
		DesiredCapabilities caps = new DesiredCapabilities();
		
//		caps.setCapability("platformName", "ANDROID");
//		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
//		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
//		//For IOS Platforms
//		caps.setCapability(IOSMobileCapabilityType.PLATFORM_NAME, "IOS");
//		caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "ANDROID");
		
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.1");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy F41");
		caps.setCapability(MobileCapabilityType.UDID, "RZ8N926CVGL");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<WebElement>(url, caps);
		
		} catch (Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is : "+exp.getMessage());
		}
	}
	
	@Test
	public void sampleTest() {
		System.out.println("This is the sampleTest");
	}
	
	@AfterTest
	public void teardown() {
		
	}
}
