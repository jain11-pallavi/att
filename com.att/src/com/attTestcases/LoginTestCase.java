/**
 * 
 */
package com.attTestcases;


import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.att.pages.BaseClass1;
import com.att.pages.WordPressLoginPage;

import Helper.Utility;


/**
 * @author pj558w
 *
 */
public class LoginTestCase extends BaseClass1

{  
     @Test
     public void validateLoginUser() throws Exception
     
     {   
    	Tester= report.createTest("validateLoginUser");
    	
    	WordPressLoginPage loginpage= PageFactory.initElements(driver, WordPressLoginPage.class);
    	
    	Tester.info("Test case started"); 
    	  	
    	// loginpage.wordpresslogin("olamtest01-5169", "Demo39812qq");
    	loginpage.wordpresslogin(excel.getStringData(0,1,0), excel.getStringData(0,1,1));
    	
    	Tester.info("Application loaded");
    	
    	Tester.pass("Test Case Completed");
    	
    	Utility.captureScreenshot(driver);
     }
	
}
