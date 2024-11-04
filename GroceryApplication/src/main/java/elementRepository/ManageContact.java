package elementRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;
import utilities.WaitUtilities;


public class ManageContact {
	WebDriver driver;
	JavascriptExecutor js;
	GeneralUtilities gu = new GeneralUtilities();
	WaitUtilities wu = new WaitUtilities();
	@FindBy(xpath = "//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-contact')]")
	WebElement manageContactLink;
	@FindBy(xpath = "//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1')]")
	WebElement editButton;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailId;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement addr;
	@FindBy(xpath = "//textarea[@name='del_time']")
	WebElement delTime;
	@FindBy(xpath = "//input[@id='del_limit']")
	WebElement deliveryLimit;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info']")
	WebElement updateButton;

	public ManageContact(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	//this.js = (JavascriptExecutor) driver;
	}

	public void navigateToManageContactLink() {
		manageContactLink.click();
	}

	public void editContact() {
		editButton.click();
	}

	public void updateDetails() {
		gu.scrollPage(driver, 300, 10000);
		updateButton.click();
	}

	public boolean validateDetails() {
		if (driver.getCurrentUrl().equals("https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1"))
			return true;
		else
			return false;
	}

	public void clearDetails() {
		gu.clearText(phone);
		gu.clearText(emailId);
		gu.clearText(addr);
		gu.clearText(delTime);
		gu.clearText(deliveryLimit);
		gu.scrollPage(driver, 0, 10000);
	}

	public void editDetails(String phoneNum, String email, String address, String deliveryTime,
			String deliveryChargeLimit) {
		gu.sendText(phone, phoneNum);
		gu.sendText(emailId, email);
		gu.sendText(addr, address);
		gu.sendText(delTime, deliveryTime);
		gu.sendText(deliveryLimit, deliveryChargeLimit);
	}

}