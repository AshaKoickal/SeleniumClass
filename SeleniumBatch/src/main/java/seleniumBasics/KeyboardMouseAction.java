package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions actionObj=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		actionObj.doubleClick(element).perform();
		driver.switchTo().alert().accept();
		WebElement rightClickElement=driver.findElement(By.xpath("//span[text()='right click me']"));
		actionObj.contextClick(rightClickElement).perform();
		
		actionObj.moveToElement(element).perform();//mouse hovering
		actionObj.sendKeys(Keys.ARROW_DOWN).perform();
		actionObj.sendKeys(Keys.ARROW_UP).perform();

	}

}
