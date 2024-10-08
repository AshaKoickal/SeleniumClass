package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckButton {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
WebElement gridCheckBox = driver.findElement(By.id("gridCheck"));
boolean selected1 = gridCheckBox.isSelected();
System.out.println(selected1);
gridCheckBox.click();
boolean selected = gridCheckBox.isSelected();

System.out.println(selected);
WebElement selectAllButton = driver.findElement(By.id("button-two"));
boolean isDisplayed= selectAllButton.isDisplayed();
System.out.println(isDisplayed);
boolean isEnabled=selectAllButton.isEnabled();
System.out.println(isEnabled);
driver.quit();



	}

}
