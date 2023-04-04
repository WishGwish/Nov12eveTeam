package testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//to launch Browser we want

public class Static_Browser 
{
  static WebDriver driver;
  
  public static WebDriver openBrowser(String browser,String URL)
  {
	 if(browser.equalsIgnoreCase("chrome"))
	  {
		  WebDriverManager.chromedriver().setup();  //replace set.property command
	      
	      ChromeOptions options = new ChromeOptions(); 
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
	  }
	  
	  
	  else if(browser.equalsIgnoreCase("Firefox"))
	  {
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
	  }
	  
	  else 
	   if(browser.equalsIgnoreCase("edge"))
	  {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
	  }
	  
	  driver.manage().window().maximize();
	  driver.get(URL);
	  return driver;
  }
}
