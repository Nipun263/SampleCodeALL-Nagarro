package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.WindowHandler;
import com.Utility.BrowserFactory;

public class TestCase_WindowHandler {
	
	public static WebDriver driver ;
	
	@BeforeSuite
	public void browserIntialise() throws MalformedURLException {
	driver = 	BrowserFactory.startApplication(driver, "Chrome", "https://demoqa.com/browser-windows");
		
	}
	
	
	@Test
	public void TestCase_WindowHandle() {
		WindowHandler WW =	PageFactory.initElements(driver, WindowHandler.class);
		WW.HandleWindow();
	}
	

}
