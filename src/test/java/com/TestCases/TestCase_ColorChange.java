package com.TestCases;

import static org.testng.Assert.assertThrows;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Pages.ColorChange;
import com.Utility.BrowserFactory;
import com.Utility.CustomListners;



public class TestCase_ColorChange {
	
	
	public WebDriver driver ;
	
	//@Parameters("BrowserName")
	@BeforeTest
	public void browserIntialization() throws IOException, InterruptedException {
	driver = BrowserFactory.startApplication(driver, "Chrome", "https://www.google.com/");
	
	}
	
	
	
	@Test(priority=1 , retryAnalyzer = com.Utility.RunFailedTestCases.class)
	public void TestCase_VerifyColorChange() {
		ColorChange CC = PageFactory.initElements(driver, ColorChange.class);
		CC.google();
		
	}
	
	

	
	
	
	@AfterTest
	public void browserSetUpClosure() {
		BrowserFactory.closeApplication(driver);
	}
	
	
	

}
 