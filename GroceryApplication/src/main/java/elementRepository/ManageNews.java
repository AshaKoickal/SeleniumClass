package elementRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageNews {
	WebDriver driver;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newButton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchButton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	WebElement resetButton;
	@FindBy(id = "news")
	WebElement newsTextArea;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement saveButton;
	@FindBy(xpath = "//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-news')]")
	WebElement newsLink;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successAlert;
	@FindBy(xpath = "//input[@name='un']")
	WebElement newsSearch;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement newsSearchButton;
	int counter = 0;

	public ManageNews(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateToNewsLink() {
		newsLink.click();
	}

	public boolean addNews(String news) {
		newButton.click();
		newsTextArea.sendKeys(news);
		saveButton.click();
		if (successAlert.getText().contains("success1")) {
			return true;
		} else
			return false;
	}

	public void searchNews(String news) {
		searchButton.click();
		newsSearch.sendKeys(news);
		newsSearchButton.click();
	}

	public boolean validateNewsEntry(String newsToBeSearched) {
		List<WebElement> NewsTableRows = driver.findElements(
				By.xpath("//table[@class='table table-bordered table-hover table-sm']//tbody//tr//td[1]"));
		for (int i = 0; i < NewsTableRows.size(); i++) {
			if (counter == 0) {
				if (NewsTableRows.get(i).getText().equals(newsToBeSearched)) {
					counter = 1;
					break;
				} else {
					counter = 0;
				}
			}
		}
		boolean counterVal = counter == 0 ? true : false;
		return counterVal;
	}

	public boolean deleteNewsEntry(String newsToBeDeleted) {
		List<WebElement> NewsTableRows = driver.findElements(
				By.xpath("//table[@class='table table-bordered table-hover table-sm']//tbody//tr//td[1]"));
		for (int i = 0; i < NewsTableRows.size(); i++) {
			if (counter == 0) {
				if (NewsTableRows.get(i).getText().equals(newsToBeDeleted)) {
					List<WebElement> deletetionbuttons = driver.findElements(By.xpath(
							"//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/news/delete?del')]"));
					deletetionbuttons.get(i).click();
					driver.switchTo().alert().dismiss();
					break;
				}
			}
		}
		boolean counterVal = counter == 0 ? true : false;
		return counterVal;
	}

}