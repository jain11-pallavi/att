/**
 * 
 */
package com.att.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author pj558w
 *
 */
public class ATTLoginPage 

{  WebDriver driver;

       public ATTLoginPage( WebDriver driver)
            { 
    	       this.driver= driver;
            }
	
	@FindBy(id="userName") WebElement user;
	@FindBy(how=How.ID,using= "password") WebElement pass;
	@FindBy(how=How.XPATH, using="//button[@id='loginButton-lgwgLoginButton']") WebElement submit;
		
     public void wordpresslogin(String username, String password) throws Exception
     {
    	 
    	 user.sendKeys(username);
    	 pass.sendKeys(password);
    	 submit.click();
    	 
    	 // Thread.sleep(5000);
     }
}
