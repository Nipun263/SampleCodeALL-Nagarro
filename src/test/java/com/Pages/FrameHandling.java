package com.Pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;

public class FrameHandling {
	
public WebDriver driver ;
	
	
	public FrameHandling(WebDriver driver) {
		this.driver = driver ;
	}
	
	
	
	public void handle_Frame() throws InterruptedException {
	
		Thread.sleep(3000);
		
		List<WebElement> framz = driver.findElements(By.xpath("//iframe"));
		
		int frame_Size = framz.size();
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,2200)", "");
		
		driver.switchTo().frame("a077aa5e");
		
	WebElement pic = driver.findElement(By.xpath("/html/body/a/img"));
		pic.click();
		

}
}