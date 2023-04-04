package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pomUtility.WaitClass;

public class AdminPagePomClass 
{
	 WebDriver driver;
	 WaitClass wait;
	
	 @FindBy(xpath="//span[text()='Admin']")
	 private WebElement AdminTab;
	
    @FindBy(xpath="//*[text()='User Management'] ")
    private WebElement UserManagementOption;
    
    @FindBy(xpath="//*[text()='Job '] ")
    private WebElement JobOption;
    
    @FindBy(xpath="//*[text()='Organization '] ")
    private WebElement OrganazationOption;
    
    @FindBy(xpath="//*[text()='Qualifications '] ")
    private WebElement QualificationsOption;
    
    @FindBy(xpath="//*[text()='Nationalities'] ")
    private WebElement NationalitiesOption;     
    
    @FindBy(xpath="//*[text()='Corporate Branding '] ")
    private WebElement CorporateBrandingOption;     
    
    @FindBy(xpath="//*[text()='Configuration '] ")
    private WebElement ConfigurationOption;
    
    public AdminPagePomClass(WebDriver driver)
    {
    	this.driver=driver;
   	    PageFactory.initElements(driver,this);  
    }  
    
    public void ClickOnAdminTab()
    {
    	WaitClass.ExplicitWaitForElement("//span[text()='Admin']", 10, driver);    	
            AdminTab.click();      	
    }
    public void ClickOnUserManagementOption() throws InterruptedException
    {
    	 WaitClass.ExplicitWaitForElement("//*[text()='User Management'] ", 5, driver); 
    	 UserManagementOption.click();   	
    }  	
    public void ClickOnJobOption() throws InterruptedException
    {
    	 WaitClass.ExplicitWaitForElement("//*[text()='Job '] ", 5, driver); 
   	     JobOption.click();      
    }
    public void ClickOnOrganazationOption()
    {
    	  WaitClass.ExplicitWaitForElement("//*[text()='Organization '] ", 5, driver);
   	      OrganazationOption.click();
    }
    public void ClickOnQualificationsOption()
    {
    	   WaitClass.ExplicitWaitForElement("//*[text()='Qualifications '] ", 5, driver);
   	       QualificationsOption.click();
    }
    public void ClickOnNationalitiesOption()
    {
    	  WaitClass.ExplicitWaitForElement("//*[text()='Nationalities'] ", 5, driver);
   	      NationalitiesOption.click();
    }   
    public void ClickOnCorporateBrandingOption()
    {
     	 CorporateBrandingOption.click();
    }
    public void ClickOnConfigurationOption()
    {
    	  WaitClass.ExplicitWaitForElement("//*[text()='Configuration '] ", 5, driver);
       	 ConfigurationOption.click();
    }
    
}
