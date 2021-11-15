package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.Pages.GroupingConceptTestNG;
import com.Utility.BrowserFactory;

public class TestCase_GroupingConcept {
	

	public static WebDriver driver ;
	
	
	public void intialiseBrowser() throws MalformedURLException {
		driver = BrowserFactory.startApplication(driver, "", "");
	}
	

	 @Test
	public void groupingMethod_TC1() {
		GroupingConceptTestNG GT = 	PageFactory.initElements(driver,GroupingConceptTestNG.class );
		GT.TestCase1();
		
		
	}

	 //Or Group
	 @Test(groups= "1 , 2")
		public void groupingMethod_TC2() {
			GroupingConceptTestNG GT = 	PageFactory.initElements(driver,GroupingConceptTestNG.class );
			GT.TestCase2();
			
			
		}
	 
	 
	
	 @Test
		public void groupingMethod_TC3() {
			GroupingConceptTestNG GT = 	PageFactory.initElements(driver,GroupingConceptTestNG.class );
			GT.TestCase3();
			
			
		}
	 
	 
	 //And Group
	 @Test (groups={"1" , "2"})
		public void groupingMethod_TC4() {
			GroupingConceptTestNG GT = 	PageFactory.initElements(driver,GroupingConceptTestNG.class );
			GT.TestCase4();
			
			
		}
	 
	 
	 @Test 
		public void groupingMethod_TC5() {
			GroupingConceptTestNG GT = 	PageFactory.initElements(driver,GroupingConceptTestNG.class );
			GT.TestCase5();
			
			
		}

	 
	 @Test
		public void groupingMethod_TC6() {
			GroupingConceptTestNG GT = 	PageFactory.initElements(driver,GroupingConceptTestNG.class );
			GT.TestCase6();
			
			
		}

	 
	 @Test(groups= {"SmokeTest"}) 
		public void groupingMethod_TC7() {
			GroupingConceptTestNG GT = 	PageFactory.initElements(driver,GroupingConceptTestNG.class );
			GT.TestCase7();
			
			
		}

	 
	 @Test 
		public void groupingMethod_TC8() {
			GroupingConceptTestNG GT = 	PageFactory.initElements(driver,GroupingConceptTestNG.class );
			GT.TestCase8();
			
			
		}

	 
	 @Test
		public void groupingMethod_TC9() {
			GroupingConceptTestNG GT = 	PageFactory.initElements(driver,GroupingConceptTestNG.class );
			GT.TestCase9();
			
			
		}

	 
	 @Test(groups= {"SmokeTest"}) 
		public void groupingMethod_TC10() {
			GroupingConceptTestNG GT = 	PageFactory.initElements(driver,GroupingConceptTestNG.class );
			GT.TestCase10();
			
			
		}


}
