package utilities;
import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilities {

	public void explicitWaitForWebElementClick(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void explicitWaitForWebElementVisible(WebDriver driver,WebElement element,String attribute, String attributeValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeToBe(element, attribute, attributeValue));
	}

	public void fluentWaitForWebElement(WebDriver driver, WebElement element, String attribute, String attributeValue) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.attributeToBe(element, attribute, attributeValue));
	}

	public void implicitWaitForWebElementAlert(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
	}

	public void explicitWaitForWebElementAlertLongDuration(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void fluentWaitForWebElementForLongDuration(WebDriver driver, WebElement element, String attribute,
			String attributeValue) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.attributeToBe(element, attribute, attributeValue));
	}

}
