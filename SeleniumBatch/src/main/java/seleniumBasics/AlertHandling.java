package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		 //button[text()='Click me!']
		 //button[@class='btn btn-success']
		/*WebElement clickMeAlert=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMeAlert.click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();*/
		//dismissing alert
		WebElement clickMeWarning=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		WebElement clickMeWarning=driver.findElement(By.
		//WebElement clickMeWarning=driver.findElement(By.);
		clickMeWarning.click();
		driver.switchTo().alert().dismiss();
		driver.quit();
		
	}

}
