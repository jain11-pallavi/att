package com.att.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PickYourPhones {

	WebDriver driver;

	public PickYourPhones(WebDriver driver) {

		this.driver = driver;
	}
	
	 @FindBy(how=How.XPATH, using= "//*[@class='color-ui-black rel ProductCard__textContainer']")
	 List<WebElement> allphones;

	// @FindAll(@FindBy(how=How.XPATH, using ="//*[@class='_3U0vc']")) List<WebElement> allphones;

	public void SelectPhone() throws Exception {
		
		System.out.println(allphones.size());

	/*	for (int i=0; i<allphones.size(); i++) {
			String Name = allphones.get(i).getAttribute("title");

			if (Name.equals("Apple iPhone 11 Pro Max")) {
				allphones.get(i).click();
				Thread.sleep(3000);
				break;
			} */
		
		for(WebElement phones:allphones)
		{
			String name= phones.getText();
			
			if(name.equalsIgnoreCase("Apple iPhone 11"))
			{
				phones.click();
				Thread.sleep(3000);
				break;
			}			
		}
		}
	

}
