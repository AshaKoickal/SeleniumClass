package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import utilities.ExcelUtilities;
import utilities.ScreenShotCapture;

public class BaseClass {
	WebDriver driver;
	public static Properties pro;

	public String getCredentialFromExcel(int rowNum, int columNum) throws IOException {
		String path = System.getProperty("user.dir") + "\\src\\main\\resources\\Excel\\LoginData.xlsx";
		return ExcelUtilities.getLoginData(rowNum, columNum , path);
	}

	public static void testBasic() throws IOException {
		pro = new Properties();
		FileInputStream fp = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
		pro.load(fp);
	}

	ScreenShotCapture sc;

	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void beforeMethod(String browserName) throws IOException {
		testBasic();
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		//driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.get(pro.getProperty("baseUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod(alwaysRun = true)

	public void afterMethode(ITestResult iTestResult) throws IOException {

		if (iTestResult.getStatus() == ITestResult.FAILURE) {

			sc = new ScreenShotCapture();

			sc.captureFailureScreenShot(driver, iTestResult.getName());

		}

		//driver.quit();

	}



	/*@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult iTestResult) throws IOException {

		if (iTestResult.getStatus() == ITestResult.FAILURE) {

			sc = new ScreenShotCapture();

			sc.captureFailureScreenShot(driver, iTestResult.getName());

		}

	//	driver.quit();

	}*/

}
