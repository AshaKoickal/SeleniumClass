package seleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
		radioButton.click();
		WebElement selectButton = driver.findElement(By.id("button-one"));
		System.out.println(selectButton.isDisplayed());
		System.out.println(selectButton.isEnabled());
		System.out.println(selectButton.isSelected());
		selectButton.click();
		System.out.println(selectButton.isSelected());
		WebElement title = driver.findElement(By.id("message-one"));
		
		System.out.println(title.getText());
		WebElement radioButton1 = driver.findElement(By.id("inlineRadio2"));
		radioButton1.click();
		selectButton.click();
		System.out.println(title.getText());
		//div[@class='form-check form-check-inline']//button[@id='button-one']
	}

}
