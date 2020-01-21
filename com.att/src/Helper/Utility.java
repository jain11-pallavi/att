package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static String captureScreenshot(WebDriver driver)
	{
       TakesScreenshot ts = (TakesScreenshot)driver;
       File src = ts.getScreenshotAs(OutputType.FILE);
       String Screenpath = System.getProperty("user.dir")+"./ScreenShots/Loginpage_"+ getCurrentDateTime() +".png";
       File Dest = new File(Screenpath);
       try {
		FileHandler.copy(src, Dest);
		System.out.println("ScreenShot Captured");
		
	} catch (Exception e) {
		System.out.println("Not able to capture Screenshot" + e.getMessage());
	}	
       return Screenpath;
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat df = new SimpleDateFormat("MM_dd_yy_HH_mm_ss");
		Date currentdate = new Date();
        return df.format(currentdate);
	}	
	
}



