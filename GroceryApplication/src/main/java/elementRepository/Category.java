package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;
import utilities.WaitUtilities;

public class Category {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	WaitUtilities wu = new WaitUtilities();
	public String categoryName;

	public Category(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-category')]")
	WebElement categoryLink;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newButton;
	@FindBy(id = "category")
	WebElement categoryText;

	@FindBy(xpath = "//input[@value='no']")
	WebElement radiobutton;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement categorySaveButton;
	String path = System.getProperty("user.dir") + "\\src\\test\\resources\\images\\orange.png";
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successAlert;

	public void NavigateToCategoryPage() {
		categoryLink.click();
	}

	public void addCategory() {
		newButton.click();
		gu.sendText(categoryText, "Fruits");
		gu.scrollPage(driver, 1000, 1000);
		WebElement fileUpload = driver.findElement(By.id("main_img"));
		wu.explicitWaitForWebElementVisible(driver, categorySaveButton, "hidden", "false");
		fileUpload.sendKeys(path);
		categorySaveButton.click();
	}
	
	public String validateCategoryDetails()
	{
		return successAlert.getText();
	}
}
