package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Utility.BrowserFactory;

public class TestCase_ParallelTest {

	public static WebDriver driver;
	
	

	@Parameters("BrowserName")
	@BeforeTest
	public void browserIntialise(String BrowserName) throws MalformedURLException {
		String browserNameExtracted = BrowserName;
		
		driver = BrowserFactory.startApplication(driver, BrowserName, "http://www.google.com");

		System.out.println("Test Case Executed with Browser = " + " " + BrowserName);

	}

	@AfterSuite
	public void tearDown() throws MalformedURLException {

		BrowserFactory.closeApplication(driver);
	}

}
