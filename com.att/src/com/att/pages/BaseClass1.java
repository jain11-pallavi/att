package com.att.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Helper.BrowserFactory;
import Helper.ConfigProvider;
import Helper.ExcelDataProvider;
import Helper.Utility;

public class BaseClass1 {
    
	public WebDriver driver;
	public ConfigProvider config;
	public ExcelDataProvider excel;
	public ExtentHtmlReporter extent;
	public ExtentReports report;
	public ExtentTest Tester;
	
	// New comment
	// Added comment from GIT repository
	@BeforeSuite
	public void setup()
	{
		config= new ConfigProvider();	
		excel = new ExcelDataProvider();
		extent =new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/Reports/ExecutionReport" + Utility.getCurrentDateTime()+".html"));
		report = new ExtentReports();
		report.attachReporter(extent);
	}
	
	@BeforeClass
	public void startup()
	{
	    driver = BrowserFactory.startbrowser(config.getBrowser(),config.getURL());
    }
	
	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitApplication(driver);
	}
	
	@AfterMethod
	public void getScreenReport(ITestResult result) throws Exception
	{
		if(result.getStatus() == ITestResult.FAILURE)
			
		{  String Screenpath= Utility.captureScreenshot(driver);
			Tester.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Screenpath).build());
		}
		
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			String Screenpath= Utility.captureScreenshot(driver);
			Tester.pass("Test Success", MediaEntityBuilder.createScreenCaptureFromPath(Screenpath).build());
		}
		
		report.flush();
		}
			
}
