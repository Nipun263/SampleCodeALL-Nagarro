package com.TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.ExcelReading;
import com.Pages.FrameHandling;
import com.Utility.BrowserFactory;

public class TestCase_ExcelReading {
	
	
public static WebDriver driver ;
	
	@BeforeSuite
	public void browserIntialise() throws MalformedURLException {
	driver = BrowserFactory.startApplication(driver, "Chrome", "http://google.com/");
		
	}
	
	
	@Test
	public void TestCase_ReadExcel() throws InterruptedException, IOException {
		ExcelReading ER =	PageFactory.initElements(driver, ExcelReading.class);
		ER.readExcelSheet();
	}
	
	

	@AfterSuite
	public void tearDown() {
	driver = BrowserFactory.closeApplication(driver);
		
	}
	
	
}


	