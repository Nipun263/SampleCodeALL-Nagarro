package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.CloseSpecificWindow;
import com.Utility.BrowserFactory;

public class TestCase_CloseDesiredWindow {
	
	public static WebDriver driver ;
	
	
	@BeforeTest
	public void intialiseBrowser() throws MalformedURLException {
	driver = 	BrowserFactory.startApplication(driver, "Chrome", "https://secure.indeed.com/account/login");	
	}
	
	
	@Test
	public void TestCase_CloseDesiredWindow() {
	 CloseSpecificWindow CW =	PageFactory.initElements(driver, CloseSpecificWindow.class);
	 CW.closeDesiredWindow();
	}
	
	
	@AfterTest
	public void closeApplication() {
		BrowserFactory.closeApplication(driver);
	}
	

}
