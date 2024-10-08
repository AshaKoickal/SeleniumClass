package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);// with  page factory-Init element (Static elemet of page factory. 'This' parameter is current class instance
	}
	
	@FindBy(xpath="//span[text()='7rmart supermarket']")
	WebElement homePageHeading;
	public String readHeading()
	{
		return homePageHeading.getText();
	}

}
