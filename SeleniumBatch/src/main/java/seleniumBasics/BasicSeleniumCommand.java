package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4.24.0- selenium verion
		//4.5
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().
		//driver.get->this will wait until page gets loaded. 
		//driver.get("https://www.Google.co.in/");
		//driver.navigate->this will not wait until page gets loaded, will keep history
		driver.navigate().to("https://www.Google.co.in/");
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		//driver.manage().
		String title =driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		//String src=driver.getPageSource();
		//System.out.println(src);
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		//driver.close->close only current tab
		//driver.close();
		//quit->close browser
		driver.quit();
		
	}

}
