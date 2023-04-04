package pomClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pomUtility.WaitClass;

public class LoginPagePomClass
{
	 static WebDriver driver;
	 WaitClass wait;
	// Locate all webElement and create separate method for all webElemeent 
	
		@FindBy(xpath="//input[@name='username']")    
		//FindBy is an annotation to locate the web element to avoid the stale exception	                                             
		private WebElement Username;     //Encapsulation concept is used for every web element 
		                                 //and declare as private
		
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement Password;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement LoginButton;
		
		public LoginPagePomClass(WebDriver driver)     //constructor 
		{    this.driver=driver;
			PageFactory.initElements(driver,this);       //PageFactory is a class of selenium.
	        //initElements is method to initialize the all web element which declare as private.
			//driver arg is used to define which webpage is launch and on that webpage we are performing actions
			// this arg is used to use variable which declared globally
			                                            
		}
		
		
		public void EnterUsername(String uName)   
		{
			Username.sendKeys(uName);      //WebElement_name.method_name()
		}
		
		public void EnterPassword(String pwd)
		{
			Password.sendKeys(pwd);
		}
		
		public void ClickOnLoginButton()
		{
			LoginButton.click();
			
			WaitClass.ImplicitWaitForElement(10, driver);
		}
		public void ClearBox()
		{
			for(int i=0;i<20;i++)
			{
				Username.sendKeys(Keys.BACK_SPACE);
				Password.sendKeys(Keys.BACK_SPACE);
				
			}
		}
}		
		
		
	
	

