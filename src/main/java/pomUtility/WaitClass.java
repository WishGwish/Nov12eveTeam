package pomUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass
{
  public static void ExplicitWaitForElement(String LocateWebelement,int WaitingTime,WebDriver driver)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(WaitingTime));
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocateWebelement)));
	
}
  
  public static void ImplicitWaitForElement(int waitingTime,WebDriver driver)
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitingTime));
  }
}
