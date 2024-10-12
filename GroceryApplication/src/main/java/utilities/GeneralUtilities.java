package utilities;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class GeneralUtilities {
	
	public String selectDropdownWithIndex(Select selectObj, int indexNumber) {
		selectObj.selectByIndex(indexNumber);
		WebElement selectedElement = selectObj.getFirstSelectedOption();
		return selectedElement.getText();
	}
	
	public String selectDropdownWithValue(Select selectObj, String select) {
		selectObj.selectByValue(select);
		WebElement selectedElement = selectObj.getFirstSelectedOption();
		return selectedElement.getText();
	}
	
	public String selectDropdownWithVisibleText(Select selectObj, String select) {
		selectObj.selectByVisibleText(select);
		WebElement selectedElement = selectObj.getFirstSelectedOption();
		return selectedElement.getText();
	}
	public void dismissAlert(WebElement alert, WebDriver driver)
	{
		
		alert.click();
	driver.switchTo().alert().dismiss();
	}
	
	public String generateCurrentDateByPattern(String pattern) {
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);	
		String formattedDate = currentDate.format(formatter);
		return formattedDate;
	}
	public void getElementAttributes(WebElement element)
	{
		String backgroundColor=element.getCssValue("background-color");
		System.out.println(backgroundColor);
		String attributeType=element.getAttribute("class");
		String attributeTagName =element.getTagName();
		System.out.println(attributeType);
		System.out.println(attributeTagName);
		String loginText=element.getText();
		System.out.println(loginText);
}
	public void dragAndDrop(WebElement sourceElement,WebElement targetElement,WebDriver driver)
	{
	Actions actionObj=new Actions(driver);
	actionObj.dragAndDrop(sourceElement, targetElement).perform();	
	
	}
	
	public int randon(int limit) {
		Random random = new Random();
		// int limit = 1000;
		int randomNumber = random.nextInt(limit);
		return randomNumber;
	}
public String generateCurrentDateAndTime() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyhhmmss");
		return formatter.format(date);
	}
	//table[@class='table table-bordered table-hover table-sm']//tbody//tr/td[1]
	public void clickButton(WebElement button)
	{
	button.click();
	}
	
	public void sendText(WebElement element, String textToBeSend) {
		element.sendKeys(textToBeSend);
	}
	public boolean verifyPage(String expectedPageHeading,String actualPageHeading)
	{
		
		 //Assert.assertEquals(actual, expected, "Heading is as expected");
		if(expectedPageHeading==actualPageHeading)
		{
		return true; 
	}
		else
		{
			return false;
		}
	
}
}
