package com.Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowHandler {

	public static WebDriver driver;

	public WindowHandler(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "windowButton")
	WebElement newWindow;

	@FindBy(id = "sampleHeading")
	WebElement NewWindowText;

	public void HandleWindow() {

		String handle = driver.getWindowHandle();

		newWindow.click();

		Set<String> handles = driver.getWindowHandles();

		for (String SS : handles) {
			if (!SS.equals(handle)) {
				driver.switchTo().window(SS);
				System.out.println("Window Switched");

				String CC = NewWindowText.getText();
				System.out.println(CC);
			}

			driver.switchTo().window(handle);
		}

	}

}
