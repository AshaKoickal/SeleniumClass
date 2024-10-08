package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		//Xpath->//tagname[@attribute='value']
		//example=//input[@id='loginform-username']
		WebElement userNameField=driver.findElement(By.xpath("//input[@id='loginform-username']"));
		userNameField.sendKeys("Admin");
		userNameField.clear();
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("Admin");
		WebElement loginButton =driver.findElement(By.xpath("//button[text()='Login']"));
		loginButton.click();
		String fontSize=loginButton.getCssValue("font-size");
		System.out.println(fontSize);
		String backgroundColor=loginButton.getCssValue("background-color");
		System.out.println(backgroundColor);
		String attributeType=loginButton.getAttribute("class");
		String attributeTagName =loginButton.getTagName();
		System.out.println(attributeType);
		System.out.println(attributeTagName);
		String loginText=loginButton.getText();
		System.out.println(loginText);
		//firefox browser
		
		
		//tagname[text()='text']
		
		
		//WebElement submitButton = driver.findElement(By.xpath("//button[@id='loginform-password']"));
	}

}
