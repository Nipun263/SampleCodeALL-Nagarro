package com.TestCases;

import java.net.MalformedURLException;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.ColorChange;
import com.Pages.HighLight_Element;
import com.Utility.BrowserFactory;

public class TestCase_HighlightElement {

public WebDriver driver ;
	
	@BeforeSuite
	public void browserIntialization() throws MalformedURLException {
	driver = 	BrowserFactory.startApplication(driver, "Chrome", "https://www.amazon.in/");
	}
	
	
	@Test
	public void TestCase_Verify_Element_Highlighted() {
		HighLight_Element HE =	PageFactory.initElements(driver, HighLight_Element.class);
		HE.Verify_HighLight_Element();
	}
	
	
	
	  @AfterMethod 
	  public void browserSetUpClosure() {
	  BrowserFactory.closeApplication(driver); }
	 
	
	
	

}

