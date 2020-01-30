/**
 * 
 */
package com.att.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author pj558w
 *
 */
public class ATTHomePage {

	WebDriver driver;
	
	public ATTHomePage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	@FindBy(how=How.XPATH,using ="//a[@href='/buy/phones/']") WebElement Phones;
	@FindBy(how=How.XPATH,using="//a[@href='/wireless/']") WebElement Wireless;
	@FindBy(how=How.LINK_TEXT,using="https://www.att.com/internet/") WebElement Internet;
	
	public void SelectFromHomePage()
	{
		
		Phones.click();
		// Wireless.click();
	}
}
