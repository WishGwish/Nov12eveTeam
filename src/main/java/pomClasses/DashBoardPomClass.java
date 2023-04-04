package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pomUtility.WaitClass;

public class DashBoardPomClass 
{
   static WebDriver driver;
   
   @FindBy(xpath="//span[text()='Admin' ]")
	 private WebElement AdminTab;
   
   @FindBy(xpath="//span[text()='PIM' ]")
	 private WebElement PIMTab;
   
   @FindBy(xpath="//span[text()='Leave' ]")
	 private WebElement LeaveTab;
   
   @FindBy(xpath="//span[text()='Time' ]")
	 private WebElement TimeTab;
   
   @FindBy(xpath="//span[text()='Recruitment' ]")
	 private WebElement RecruitmentTab;
   
   @FindBy(xpath="//span[text()='My Info' ]")
	 private WebElement MyInfoTab;
   
   @FindBy(xpath="//span[text()='Performance' ]")
	 private WebElement PerformanceTab;
   
   @FindBy(xpath="//span[text()='Dashboard' ]")
	 private WebElement DashboardTab;
   
   @FindBy(xpath="//span[text()='Directory' ]")
	 private WebElement DirectoryTab;
   
   @FindBy(xpath="//span[text()='Maintenance' ]")
	 private WebElement MaintenanceTab;
   
   @FindBy(xpath="//span[text()='Buzz' ]")
	 private WebElement BuzzTab;
   
   
   public DashBoardPomClass(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
	   WaitClass.ImplicitWaitForElement(5, driver);
    }
   
   public boolean CheckVisibilityOfAdminTab()
   {
	   WaitClass.ExplicitWaitForElement("//span[text()='Admin' ]",2, driver);
	   return AdminTab.isDisplayed();	   
   }
 
   public boolean CheckVisibilityOfPIMTab()
   {
	   WaitClass.ExplicitWaitForElement("//span[text()='PIM' ]",2, driver);
	   return PIMTab.isDisplayed();	   
   }
 
   public boolean CheckVisibilityOfLeaveTab()
   {
	   WaitClass.ExplicitWaitForElement("//span[text()='Leave' ]",2, driver);
	   return LeaveTab.isDisplayed();		   
   }
   
   public boolean CheckVisibilityOfTimeTab()
   {
	   WaitClass.ExplicitWaitForElement("//span[text()='Time' ]",2, driver);
	   return TimeTab.isDisplayed();		   
   }
   
   public boolean CheckVisibilityOfRecruitmentTab()
   {
	   WaitClass.ExplicitWaitForElement("//span[text()='Recruitment' ]",2, driver);
	   return RecruitmentTab.isDisplayed();		
   }
   
   public boolean CheckVisibilityOfMyInfoTab()
   {
	   WaitClass.ExplicitWaitForElement("//span[text()='My Info' ]",2, driver);
	   return MyInfoTab.isDisplayed();	
   }  
	   
	   public boolean CheckVisibilityOfPerformanceTab()
	   {
		   WaitClass.ExplicitWaitForElement("//span[text()='Performance' ]",2, driver);
		   return PerformanceTab.isDisplayed();		   
	   }
	   
	   public boolean CheckVisibilityOfDashboardTab()
	   {
		   WaitClass.ExplicitWaitForElement("//span[text()='Dashboard' ]",2, driver);
		   return DashboardTab.isDisplayed();		   
	   }
	   
	   public boolean CheckVisibilityOfDirectoryTab()
	   {
		   WaitClass.ExplicitWaitForElement("//span[text()='Directory' ]",2, driver);
		   return DirectoryTab.isDisplayed();		   
	   }
	   
	   public boolean CheckVisibilityOfMaintenanceTab()
	   {
		   WaitClass.ExplicitWaitForElement("//span[text()='Maintenance' ]",2, driver);
		   return MaintenanceTab.isDisplayed();		   
	   }
	   
	   public boolean CheckVisibilityOfBuzzTab()
	   {
		   WaitClass.ExplicitWaitForElement("//span[text()='Buzz' ]",2, driver);
		   return BuzzTab.isDisplayed();		   
	   }
   }
	    
