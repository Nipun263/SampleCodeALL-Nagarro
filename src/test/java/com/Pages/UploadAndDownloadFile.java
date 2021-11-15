package com.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class UploadAndDownloadFile {

	public WebDriver driver;

	public UploadAndDownloadFile(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id='uploadfile_0']")
	WebElement Uploadbtn;

	@FindBy(xpath = "//*[@id=\"uploadwindow\"]/span//preceding::div[@id='uploadmode1']")
	WebElement Uploadbtn1;

	@FindBy(xpath = "//*[@class='field_check']")
	WebElement CheckBox;

	@FindBy(id = "submitbutton")
	WebElement SubmitBtn;

	@FindBy(xpath = "//*[@id='res']/center/text()[2]")
	WebElement ConfirmationMsg;
	
	

	// Option 1 : Where Input type = file
	public void uploadFile_Option1() {
		String filePath = System.getProperty("user.dir");

		String PP = filePath + "\\Agile 2.PNG";

		Uploadbtn.sendKeys(filePath + "\\Agile 2.PNG");

		CheckBox.click();

		SubmitBtn.click();
	}

	
	
		// Option 2 : Using Robot Class
		public void uploadFile_Option2() throws AWTException {
	
			Uploadbtn1.click();
	
			StringSelection ss = new StringSelection("C:\\Users\\nipunverma\\Desktop\\Agile.PNG");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			
			 Robot robot = new Robot();
		     robot.delay(250);
		     robot.keyPress(KeyEvent.VK_ENTER);
		     robot.keyRelease(KeyEvent.VK_ENTER);
		     robot.keyPress(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_V);
		     robot.keyRelease(KeyEvent.VK_V);
		     robot.keyRelease(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_ENTER);
		     robot.delay(90);
		     robot.keyRelease(KeyEvent.VK_ENTER);
			
	
		     CheckBox.click();

			 SubmitBtn.click();
				
				
		}
}
