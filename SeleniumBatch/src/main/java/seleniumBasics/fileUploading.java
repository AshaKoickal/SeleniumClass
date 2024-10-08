package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileUploading {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver(); 
 		driver.manage().window().maximize(); 
 		driver.get("https://demo.guru99.com/selenium/upload/"); 
 		WebElement fileUpload = driver.findElement(By.id("uploadfile_0")); 
 		fileUpload.sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\cat.png"); 
 	/*	Actions obj = new Actions(driver); 
 		obj.moveToElement(fileUpload).click().perform(); 
  
 		// Use the Robot class to interact with the file dialog 
 		Robot robot = new Robot(); 
 		//"C:\Users\DELL\OneDrive\Desktop\cat.png"
 		StringSelection filePath = new StringSelection("C:\\Users\\DELL\\OneDrive\\Desktop\\cat.png"); 
 		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null); 
  
 		// Use the keyboard shortcuts to paste the file path into the file dialog 
 		robot.keyPress(KeyEvent.VK_CONTROL); // same like ctrl+v press and release
 		robot.delay(2000);
 		robot.keyPress(KeyEvent.VK_V); 
 		robot.delay(2000);
 		robot.keyRelease(KeyEvent.VK_V); 
 		robot.delay(2000);
 		robot.keyRelease(KeyEvent.VK_CONTROL); 
 		robot.delay(2000);
  
 		// Press Enter to confirm the file upload 
 		robot.keyPress(KeyEvent.VK_ENTER); 
 		robot.delay(2000);
 		robot.keyRelease(KeyEvent.VK_ENTER); 
 		robot.delay(2000);
  
 		// Wait for a moment to ensure the file is uploaded 
 	//	Thread.sleep(2000); 
  
 		WebElement check = driver.findElement(By.id("terms")); 
 		check.click(); 
 		WebElement submit = driver.findElement(By.id("submitbutton")); 
 		submit.click();*/
	}

}
