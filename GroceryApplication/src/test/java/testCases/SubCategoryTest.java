package testCases;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.SubCategory;
import utilities.ExcelUtilities;
import utilities.GeneralUtilities;
import constant.Constant;
public class SubCategoryTest extends BaseClass {
	HomePage hp;
	LoginPage lp;
	SubCategory sc;
	GeneralUtilities gu = new GeneralUtilities();
	ExcelUtilities eu = new ExcelUtilities();

	@Test(enabled = false)
	public void addSubCategory() throws IOException {
		lp = new LoginPage(driver);
		hp=lp.loginToGroceryApp(getCredentialFromExcel(0,0), getCredentialFromExcel(0,0));
		sc=hp.NavigateToPageandValidate();
		sc.addSubCategory();
		sc.readAlert();
		Assert.assertEquals(sc.readAlert().trim(), Constant.sc_expectedSubCategoryAddedMessage);
		sc.NavigateToPageandValidate();
		String LatesttableEnty = sc.readTableElement(1, 1);
		Assert.assertEquals(LatesttableEnty, sc.subCategoryName);
	}

	@Test(enabled = false)
	public void deleteSubCategory() throws IOException {
		lp = new LoginPage(driver);
		hp=lp.loginToGroceryApp(getCredentialFromExcel(0,0), getCredentialFromExcel(0,0));
		sc=hp.NavigateToPageandValidate();
		String subCategory = sc.readTableElement(1, 1);
		String category = sc.readTableElement(1, 2);
		sc.deleteTableElement(category, subCategory);
	}

	@Test(enabled = false)
	public void searchSubCategory() throws IOException {
		lp = new LoginPage(driver);
		hp=lp.loginToGroceryApp(getCredentialFromExcel(0,0), getCredentialFromExcel(0,0));
		sc=hp.NavigateToPageandValidate();
		sc.searchSubCategory("test dlt", "Apple");
		Assert.assertEquals(sc.checkSubCategoryExist("test dlt"), true);
	}
}
