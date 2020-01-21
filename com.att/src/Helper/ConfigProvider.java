package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigProvider {
        
	 Properties pro;
	
	public ConfigProvider()
	{
		File src= new File("./Config/Config.properties");
		
		try {
			FileInputStream fs= new FileInputStream(src);	
			pro = new Properties();
			pro.load(fs);
			
		} catch (Exception e) {
			
			System.out.println("We found the exception" + e.getMessage());
		}
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");	
	}
	
	
	public String getURL()
	{
		return pro.getProperty("URL");
	}
}



