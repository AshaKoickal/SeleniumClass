package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize();
		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='todrag']//span[]"));
		WebElement targetElement = driver.findElement(By.id("mydropzone"));
		Actions actionObj=new Actions(driver);//action class->for key board-mouse interactions
		actionObj.dragAndDrop(sourceElement, targetElement).perform();
		//mydropzone
	}

}
