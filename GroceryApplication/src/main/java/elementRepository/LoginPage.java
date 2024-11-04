package elementRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ExcelUtilities;
import utilities.GeneralUtilities;

public class LoginPage {

	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	ExcelUtilities eu = new ExcelUtilities();
	int rowNumber;
	int columnNumber;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement userNameField;
	@FindBy(name = "password")
	WebElement passwordField;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement loginButton;

	@FindBy(xpath = "//h5[text()=' Alert!']")

	WebElement alert;

	@FindBy(xpath = "//span[text()='7rmart supermarket']")
	WebElement homePageHeading;

	public HomePage loginToGroceryApp(String firstParam, String secondParam) {
		userNameField.sendKeys(firstParam);
		passwordField.sendKeys(secondParam);
		loginButton.click();
		return new HomePage(driver);
	}

	public String readInvalidCredentialsMessage() {
		return alert.getText();
	}

	public String readHeading() {
		return homePageHeading.getText();
	}
}
