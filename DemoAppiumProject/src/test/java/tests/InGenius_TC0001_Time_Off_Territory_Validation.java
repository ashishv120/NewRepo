//package tests;
//
//
//import java.io.IOException;
//import java.net.URL;
//
//import org.apache.commons.exec.ExecuteException;
//import org.openqa.selenium.ScreenOrientation;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import com.Otsuka.driverInstance.DTAFDriverInstance;
//import com.Otsuka.extent.ExtentReporter;
//import com.Otsuka.extent.ExtentTestManager;
//import com.Otsuka.propertyfilereader.PropertyFileReader;
//import com.aventstack.extentreports.Status;
//
//import inGeniusiOSPages.HomePage;
//import inGeniusiOSPages.LoginPage;
//import inGeniusiOSPages.LogoutPage;
//import inGeniusiOSPages.MySchedulePage;
//import inGeniusiOSPages.StaffCallPage;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.ios.IOSDriver;
//import jxl.read.biff.BiffException;
//
//@Listeners(ExtentReporter.class)
//public class InGenius_TC0001_Time_Off_Territory_Validation  {
//	
//
//	public com.Otsuka.driverInstance.DTAFCommandBase_iOS _caller;
//	public ExtentReporter _extentReport;
//	DesiredCapabilities caps = new DesiredCapabilities();
//	public IOSDriver<MobileElement> iosDrive;
//	public LoginPage _loginPage;
//	public HomePage _homePage;
//	public MySchedulePage _myShedulePage;
//	public LogoutPage _logOutPage;
//	
//	PropertyFileReader handler = new PropertyFileReader("properties/UserCredentials.properties");
//	PropertyFileReader handler2 = new PropertyFileReader("properties/Execution.properties");
//	String pCloudy_url=handler.getproperty("device_url_pcloudy");
//	String headspin_url=handler.getproperty("device_url_headspin");
//		
//	@BeforeClass
//	public void startAppiumServer() throws IOException {
//		try {
//			
//			
//			// pCloudy Driver details
//			//iosDrive = new IOSDriver<MobileElement>(new URL(pCloudy_url),DTAFDriverInstance.generateiOSCapabilities_PCloudy("Otsuka"));
//			//Headspin Driver details
//			iosDrive = new IOSDriver<MobileElement>(new URL(headspin_url),DTAFDriverInstance.generateiOSCapabilities_Headspin("Otsuka"));
//			iosDrive.rotate(ScreenOrientation.LANDSCAPE);
//			_caller = new com.Otsuka.driverInstance.DTAFCommandBase_iOS(iosDrive, "iOS");
//		} catch (InterruptedException e) {
//
//			
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test(description = "InGenius Application", priority =1)
//	public synchronized void InGenius_TC003_Time_off_Territory_Verification() throws ExecuteException, IOException, InterruptedException, BiffException {
//		try {
//		 _extentReport = new ExtentReporter();
//		String DEVICE_NAME=handler2.getproperty("DEVICE_NAME");
//		ExtentTestManager.getTest().log(Status.INFO, "Device Name : "+DEVICE_NAME);
//		//ExtentTestManager.getTest().log(Status.INFO, "Testcase Name :End to End Regression test case");
//		 _caller.Wait(30);
//				
//		String team_name=handler.getproperty("team_name");
//		//String Username =handler.getproperty("Username_"+team_name);
//		String Username_ =handler.getproperty("Username_"+team_name); 
//		 
//		  String Password = handler.getproperty("Password"); 
//		  _loginPage = new LoginPage(iosDrive,"iOS");
//		  _loginPage.login(Username_,Password);
//		   
//		  _homePage = new HomePage(iosDrive,"iOS");
//		  _homePage.homescreenValidation();
//		  
//		  
//		  _myShedulePage=new MySchedulePage(iosDrive,"iOS");
//		 // _myShedulePage.myScheduleClick();
//		  
//		  
//		  _logOutPage = new LogoutPage(iosDrive,"iOS");
//		  _logOutPage.logout();
//		  
//		  
//			 
//			  
//			  
//			  
//			 
//		  
//		  
//		   ExtentTestManager.getTest().log(Status.PASS, "Completed the Execution for iOS");
//	}
//	catch(Exception e) {
//		
//		
//		}
//	}
//	
//	
//	
//	@AfterMethod
//	public void stopAppiumServer(ITestResult result) throws ExecuteException, IOException, InterruptedException {
//		if (result.getStatus() == ITestResult.FAILURE)
//			
//			//_extentReport.screencapture_iOS(result.getTestName(),iosDrive);
//		
//		_caller.tearDown();
//	}
//
//}
