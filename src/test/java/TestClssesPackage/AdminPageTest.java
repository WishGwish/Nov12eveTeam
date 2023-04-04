package TestClssesPackage;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomClasses.AdminPagePomClass;
import pomUtility.WaitClass;


public class AdminPageTest extends BaseClass
{ 	
	AdminPagePomClass     admin;
	 SoftAssert s;	 
	@BeforeClass
	public void beforeClass()
	{
		s=new SoftAssert();
	}
	
   @Test
   public void VerifyAdminPage() throws InterruptedException, IOException
   {
	           logger=	report.createTest("Verify Admin Page"); 
               admin=new AdminPagePomClass(driver);      
               System.out.println("Verify Admin Page");
	                    
	                  admin.ClickOnAdminTab();  
	                  
	                  //  take screenshot of particular WebElement
	                  WebElement a1=driver.findElement(By.xpath("//span[text()='Admin']"));
	                  File Source=a1.getScreenshotAs(OutputType.FILE);	   
	            	  File dest=new File("C:\\Users\\Vishakha\\eclipse-workspace\\HRMThread\\test-output\\Screenshots\\temp.png");
	            	  FileHandler.copy(Source, dest);
	                     
	                  admin.ClickOnUserManagementOption();	    	                    
	                  admin.ClickOnJobOption();		                    
	                  admin.ClickOnOrganazationOption();	     	                        
	                  admin.ClickOnQualificationsOption();	  	                        
	                  admin.ClickOnNationalitiesOption();	                        
	               //admin.ClickOnCorporateBrandingOption();	                      
	                    admin.ClickOnConfigurationOption();	                  
  }
}
