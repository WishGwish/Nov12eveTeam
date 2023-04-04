package TestClssesPackage;

import static org.testng.Assert.fail;

import java.io.IOException;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import pomClasses.AdminPagePomClass;
import pomClasses.LoginPagePomClass;
import pomUtility.WaitClass;
import testUtility.ReadDataExcel;



public class LoginPageTest extends BaseClass
{
	LoginPagePomClass login;	 
	ReadDataExcel r;
	// AdminPagePomClass admin;
	@BeforeMethod
	public void beforeMethod()
	{
		
	}
	@Test(priority=1)
	public void VerifyLoginPageWithInvalidInput() throws IOException, InterruptedException
	{    
		 logger=report.createTest("Verify Login Page With Invalid Input Details");
	     login=new LoginPagePomClass(driver); 
	                   System.out.println("login page");
	                   
                   
                   try
                  {	     
                	    login.EnterUsername(r.FetchDataFromExcel(3 ,0));
	                    login.EnterPassword(r.FetchDataFromExcel(3, 1));
                  }
                 catch(Exception e)                   
	              {                	 
               	      System.out.println(e.getStackTrace());
               	      System.out.println(e.getMessage());
               	      System.out.println(e.toString());
               	      System.out.println("You can not keep password cell as Empty");
	               }
	                    	
	                   login.ClickOnLoginButton(); 
	                   
	                   WaitClass.ImplicitWaitForElement(10, driver);
	                    
	                   String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	                   String CurrentURL=driver.getCurrentUrl();
	                   Assert.assertEquals(CurrentURL, ExpectedURL,"pass");
	                   System.out.println("passed Invalid login page");	                                 
	}
	
	@Test(priority=2)

		public void VerifyLoginPageWithValidInput() throws IOException, InterruptedException
		{    
			 logger=report.createTest("Verify Login Page With Valid Input Details");
		     login=new LoginPagePomClass(driver); 
		                    System.out.println("login page");
		                    login.ClearBox();
		                    login.EnterUsername(r.FetchDataFromExcel(1 ,0));     		                    
		                    login.EnterPassword(r.FetchDataFromExcel(1, 1));		                  
		                    login.ClickOnLoginButton(); 
		                   
		                   WaitClass.ImplicitWaitForElement(7, driver);
		                    
		                   String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		                   String CurrentURL=driver.getCurrentUrl();
		                   Assert.assertEquals(CurrentURL, ExpectedURL,"pass");
		                   System.out.println("passed valid login page");		                          
		}
	}
	
	
	

	                 
	
	