package elementRepository;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.GeneralUtilities;

public class SubCategory {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	public String subCategoryName;
	int counter = 0;
boolean count=false;
	public SubCategory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newButton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchButton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	WebElement resetButton;
	@FindBy(tagName = "li")
	List<WebElement> elements;
	@FindBy(id = "cat_id")
	WebElement CategoryDropDown;
	@FindBy(id = "subcategory")
	WebElement subCategoryText;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement submitButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successAlert;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement subCategorySearchButton;
	@FindBy(xpath = "//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-sub-category')]")
	WebElement subCategoryLink;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr//td[1]")
	List<WebElement> SubCategoryColumn;
	@FindBy(xpath = "//a[contains(@href,'javascript:void(0)')]")
	WebElement search;
	@FindBy(xpath="//input[@name='ut']")
	WebElement subCategorySearch;
	@FindBy(xpath="//select[@name='un']")
	WebElement CategorySearch;

	public void NavigateToPageandValidate() {
		subCategoryLink.click();
	}

	public void addSubCategory() {
		// String subCategoryName="Test"+gu.generateCurrentDateAndTime();
		// this.subCategoryName=subCategoryName;
		newButton.click();
		Select selectObj = new Select(CategoryDropDown);
		gu.selectDropdownWithIndex(selectObj, 1);
		this.subCategoryName = getRandomlyCreatedSubCategoryName();
		gu.sendText(subCategoryText, subCategoryName);
		submitButton.click();
	}

	public boolean validateTableEntry() {
		List<WebElement> subCategoryTableRows = driver.findElements(
				By.xpath("//table[@class='table table-bordered table-hover table-sm']//tbody//tr//td[1]"));
		for (int i = 0; i < subCategoryTableRows.size(); i++) {
			if (counter == 0) {
				if (subCategoryTableRows.get(i).getText().equals(subCategoryName)) {
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

	public String getRandomlyCreatedSubCategoryName() {
		subCategoryName = "Test" + gu.generateCurrentDateAndTime();
		return subCategoryName;
	}

	public String readAlert() {
		return successAlert.getText();
	}

	public void subCategoryTableRowDeletion() {
		List<WebElement> subCategoryTableRows = driver.findElements(
				By.xpath("//table[@class='table table-bordered table-hover table-sm']//tbody//tr//td[1]"));
		for (int i = 0; i < subCategoryTableRows.size(); i++) {
			if (subCategoryTableRows.get(i).getText().equals(subCategoryName)) {
				List<WebElement> deletetionbuttons = driver.findElements(By.xpath(
						"//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/Subcategory/delete?del')]"));
				deletetionbuttons.get(i).click();
				break;
			}
		}
	}
	
	public String readTableElement(int row,int column)
	{  

	String path="//table[@class='table table-bordered table-hover table-sm']//tbody//tr["+row+"]//td["+column+"]";
	WebElement element=driver.findElement(By.xpath(path));
	return element.getText();
	}

	public void deleteTableElement(String Category, String subcategory) {
		for (int i = 0; i < SubCategoryColumn.size(); i++) {
			if (SubCategoryColumn.get(i).getText().equals(subcategory)) {
				
				String CategoryValuepath = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr[" +(i+1)+ "]//td[2]";
				WebElement CategoryColumn=driver.findElement(By.xpath(CategoryValuepath));
				if(Category==CategoryColumn.getText())
				{
				String path = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr[" + (i + 1)
						+ "]//td[5]//a[2]";
				WebElement element = driver.findElement(By.xpath(path));
				element.click();
				driver.switchTo().alert().accept();
				break;
				}
			}
		}
	}
	
	
	
	public boolean checkSubCategoryExist(String subcategory) {
		for (int i = 0; i < SubCategoryColumn.size(); i++) {
			if (SubCategoryColumn.get(i).getText().equals(subcategory)) {
				count=true;
			}			
		}
		return count;
	}
	
	public void searchSubCategory(String subCategoryToSearch,String CategoryToSearch)
	{
	search.click();
	Select categorySearchObj = new Select(CategorySearch);
	gu.selectDropdownWithVisibleText(categorySearchObj, CategoryToSearch);
	subCategorySearch.sendKeys(subCategoryToSearch);
	subCategorySearchButton.click();
	
	}
}
