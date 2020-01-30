/**
 * 
 */
package com.attTestcases;


import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import com.att.pages.BaseClass1;
import com.att.pages.PickYourPhones;
import com.att.pages.ATTAppleIphone11;
import com.att.pages.ATTHomePage;


import Helper.Utility;


/**
 * @author pj558w
 *
 */
public class HomePageTestCase extends BaseClass1

{  
	@Test(priority=1)
	public void SelectOptionFromHome()
	{  
	   Tester = report.createTest("SelectOptionFromHome");
	   
       ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
       
       home.SelectFromHomePage();
       
       Tester.info("Executed succefully");
       
       Utility.captureScreenshot(driver);
	}	
	
	@Test(priority=2)
	public void getphone() throws Exception
	{
		PickYourPhones pickphone = PageFactory.initElements(driver, PickYourPhones.class);
		pickphone.SelectPhone();
		Tester.info("Phone Selected Successfully");
		Utility.captureScreenshot(driver);
		
	}
	
	@Test(priority=3)
	public void getcolourcapacity() throws Exception
	{
		ATTAppleIphone11 Device =PageFactory.initElements(driver, ATTAppleIphone11.class);
		System.out.println("Sandhya Entered");
	    Device.getColourCapacity();
		Utility.captureScreenshot(driver);
		
	}
    
     }
	
