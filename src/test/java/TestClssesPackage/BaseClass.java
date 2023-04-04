package TestClssesPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pomUtility.WaitClass;
import testUtility.Screenshot;
import testUtility.Static_Browser;


public class BaseClass
{
   static WebDriver driver;
   
   public static ExtentReports report;
   public static ExtentHtmlReporter extent;
   public static ExtentTest logger;   

   @Parameters({"browser"})
   
   @BeforeTest
   public void beforeTest(String browser) throws InterruptedException
   {
	   // to launch browser which we are send in parameter annotation
	   WebDriver driver=Static_Browser.openBrowser(browser,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	   this.driver=driver;	
	   WaitClass.ImplicitWaitForElement(5, driver);	 
	   
	   
	   //create Extent Report 
	   
	   extent=new ExtentHtmlReporter("test-output"+File.separator+"Reports"+File.separator+System.currentTimeMillis()+".html");
	   report=new ExtentReports();
	   report.attachReporter(extent);
   
   }
   
   @AfterMethod
   public void afterMethod(ITestResult result) throws IOException, InterruptedException
   {   Thread.sleep(1000);
   
     //Create Extent Report and take Screenshot where test case is going to failed
     // ITestResult class describe the result of the test
     // getStatus() is getting the status of the test
   
	   if(result.getStatus()==ITestResult.FAILURE)
	   {
		  String path= Screenshot.CapturePageScreenshot(driver);
		  logger.fail("Test case is Failed",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
	   }
	   
		   logger.pass("Test case is passed");  //it is trigger only when test case will be passed
	   
	     // logger.skip("Test case is skipped");
	   report.flush();
   }   
   
   @AfterTest
   public void afterTest()
   {
	   driver.quit();
   }
   
   
   
   
   
}
