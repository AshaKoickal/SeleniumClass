package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement dropDown = driver.findElement(By.id("single-input-field"));
		Select selectObj = new Select(dropDown);
//select by using index 
		selectObj.selectByIndex(1);
//selectObj.selectByIndex(2);
//select by using value 
		selectObj.selectByValue("Green");

//select by using visible text
		selectObj.selectByVisibleText("Yellow");

		WebElement selectedElement = selectObj.getFirstSelectedOption();// current selected option

		String selectString = selectedElement.getText();
//System.out.println(selectString);

		WebElement multiDropDown = driver.findElement(By.id("multi-select-field"));
		Select multiSelectObj = new Select(multiDropDown);
		for (int i = 0; i < 3; i++) {
			multiSelectObj.selectByIndex(i);
		}
		List<WebElement> list1 = multiSelectObj.getAllSelectedOptions();
		for (int i = 0; i < list1.size(); i++) {
			String selectedText = list1.get(i).getText();
			System.out.println(selectedText);
		}

	}
}
