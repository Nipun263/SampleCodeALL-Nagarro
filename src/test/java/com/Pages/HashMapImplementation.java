package com.Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HashMapImplementation {
	
	public static WebDriver driver ;
	
	public HashMapImplementation(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public HashMap<Object, Object>  hashMapUtilization() {
		
		HashMap<Object,Object> HSS = new HashMap<Object,Object>();
		
		HSS.put("FirstUser", "Nipun:Password1");
		HSS.put("SecondUser", "Nidhi:Password2");
		HSS.put("ThirdUser", "Sanjeev:Password3");
		HSS.put("ForthUser", "Sunita:Password4");
		
		return HSS;
		
	}
	
	
	public void passUserDetails(String Key) {
		
		WebElement userName = driver.findElement(By.name("username"));
		WebElement password  = driver.findElement(By.name("password"));
		
		userName.sendKeys(passFirstName(Key));
		password.sendKeys(passLastName(Key));
		
		
	}
	
	
	public String passFirstName(String Key) {
	
		String firstNameToPass = hashMapUtilization().get(Key).toString().split(":")[0];
		
		return firstNameToPass;
	}
	
	
	public String passLastName(String Key) {
		
		String lastNameToPass = hashMapUtilization().get(Key).toString().split(":")[1];

		return lastNameToPass;
		
	}
	
	
}
