package com.att.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ATTAppleIphone11 {

	WebDriver driver;
	
	public ATTAppleIphone11(WebDriver driver)
	{
		this.driver= driver;
	}
	
	@FindBy(how=How.XPATH, using = "//div/label/span[@class='hidden-spoken']") List<WebElement> colourname;
//	 @FindBy(how=How.NAME, using = "Capacity") List<WebElement> Cap ;
	@FindBy(how=How.XPATH, using = "//div/label/span[@class='_3I3ME ']") List<WebElement> Cap ;
	
	
	public void getColourCapacity() throws Exception
	{
		/* colourname.getAttribute(colour);
		radio.click();
		capacity.getAttribute(Capacitysize);
		capacity.click(); */
        System.out.println(colourname.size());
	    System.out.println(Cap.size());
		
	 for(WebElement colourbuttons:colourname)
	 { 
		 String name = colourbuttons.getText();
		 System.out.println("Different colors are  "+name);
			
			if(name.equalsIgnoreCase("Color Red "))
			{			
				colourbuttons.click();				
				Assert.assertTrue("Given color selected successfully",true);
				break;
			} 

	   for(WebElement capacity:Cap)
		  {	
			  String GB =capacity.getText();
			  System.out.println("Capacity is  "+GB);
			  
				if(GB.equals("128 GB"))
				{
					capacity.click();
					Assert.assertTrue("Given capacity selected successfully",true);
					break;
				}
				} 
	 }					
          
	}}
