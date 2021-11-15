package com.TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.BrokenLinks;
import com.Pages.StaleElementHandle;
import com.Utility.BrowserFactory;

public class TestCases_BrokenLinl {
	
	
	public static WebDriver driver ;
	
	
	@BeforeMethod
	public void browserIntialization() throws MalformedURLException {
	driver = BrowserFactory.startApplication(driver, "Chrome","https://www.olx.in");
	}
	
	
	
	@Test
	public void BrokenLink_TestCase() throws MalformedURLException, IOException {
	BrokenLinks BLL = 	PageFactory.initElements(driver, BrokenLinks.class);
	BLL.ValidateBrokenLink();
	}

	
	
	
	
	
}
