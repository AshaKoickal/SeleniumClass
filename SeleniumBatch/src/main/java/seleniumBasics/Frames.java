package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		// https://www.tutorialspoint.com/selenium/practice/frames.php
		// Switch by Web element
		//WebElement frameElement = driver.findElement(By.id("frame1"));
		//Step 1- switch to frame 
		//driver.switchTo().frame(frameElement);

		// Switch by name or ID
		driver.switchTo().frame("frame1");
//step 2:- action inside frame
		WebElement frameText = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameText.getText());
//step 3:-switch to main page
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		driver.quit();

	}

}
