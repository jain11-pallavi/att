/**
 * 
 */
package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author pj558w
 *
 */
public class BrowserFactory 

{      static WebDriver driver;

      public static WebDriver startbrowser( String browsername, String url)
      
      {
    	  if(browsername.equalsIgnoreCase("Chrome"))
    			  {  System.setProperty("webdriver.chrome.driver","C:\\Users\\pj558w\\Pallavi\\Softwares\\chromedriver_win32\\chromedriver.exe");
    		          driver= new ChromeDriver();
    			  }
    	  else if (browsername.equalsIgnoreCase("fireforx"))
    			  {
    		         driver= new FirefoxDriver();
    			  }
    	  else if( browsername.equalsIgnoreCase("IE"))
    			  {
    		         driver= new InternetExplorerDriver();
    		      }
    	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    	  driver.manage().window().maximize();
    	  driver.get(url);
    	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	  return driver;
    	  
      }
      
      public static void quitApplication(WebDriver driver)
      {
    	  driver.quit();
      }
      
	
	
}
