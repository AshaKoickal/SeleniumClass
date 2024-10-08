package seleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumPracticeCommands {

	public static void main(String[] args) {
		
		WebDriver driver= new EdgeDriver();
		
		//div[@class='row']//div[2]//div[2]//div[@class='card']//div[2]//form//div[@class='form-group']//select[@class='form-control']
		
		//select[@class='form-control' or @id='single-input-field']
		
		//select[@class='form-control' and @id='single-input-field']
		
		//*[contains(@class,'control')]
		
		
		//div[@class='form-group']//select[@class='form-control']
		//driver.navigate().to(https://www.Amazon.com);
/*driver.get("https://www.Amazon.com");
driver.manage().window().minimize();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());
driver.close();*/
//driver.manage().wait();
//driver.switchTo().
//driver.navigate().to("https://www.Amazon.com");
//driver.navigate().back();
//driver.navigate().forward();
		//driver.findElement(By.id)
	}

}
