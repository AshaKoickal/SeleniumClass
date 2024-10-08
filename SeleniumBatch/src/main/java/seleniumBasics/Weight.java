package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); 
 		driver.get("https://www.qabible.in/payrollapp/site/login"); 
 		driver.manage().window().maximize(); 
 		WebElement button = driver.findElement(By.xpath("//button[@name='login-button']"));
 		
 		//implicit wait->applicable throughout program(till driver.quit is being called
 		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
 		
 		//Explicit wait->applicable throughout program(till driver.quit is being called
 		WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(5));
 		//expWait.until(ExpectedConditions.alertIsPresent());
 		//expWait.until(ExpectedConditions.attributeContains(button, "name", "login-button"));
 		expWait.until(ExpectedConditions.textToBePresentInElement(button, "Login"));
 		
 		//fluent Wait
 		
 		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(10))
	            .pollingEvery(Duration.ofSeconds(2))
	            .ignoring(NoSuchElementException.class);
 		
 		fluentWait.until(ExpectedConditions.alertIsPresent());
 		
 		 //driver.quit();
 		
 		//components of selenium:- selenium grid, web driver(to interact with web browser), IDE(earlier version. used to record and play back
 		//gid:-for parallel execution, RC- 
	}

}
