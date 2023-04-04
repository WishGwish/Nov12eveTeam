package testUtility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot
{
   public static String CapturePageScreenshot(WebDriver driver) throws IOException
   {  
	   //C:\\Users\\Vishakha\\eclipse-workspace\\HRMThread\\   --> current user directory
	   
	  // System.getProperty("user.dir");   -->get the current user directory path bcoz every user have different system 
	   
	  String path=System.getProperty("user.dir")+File.separator+"test-output"+File.separator+"Screenshots"+System.currentTimeMillis()+".png";
	  String path1="C:\\Users\\Vishakha\\eclipse-workspace\\HRMThread\\test-output\\Screenshots"+File.separator+System.currentTimeMillis()+".png";
	  File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	   
	  File dest=new File(path1);
	  FileHandler.copy(Source, dest);
	  return path;
   }
}
