package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.SubCategory;
import utilities.ExcelUtilities;
import utilities.GeneralUtilities;

public class SubCategoryTest extends BaseClass {
	HomePage hp;
	LoginPage lp;
	SubCategory sc;
	GeneralUtilities gu = new GeneralUtilities();
	ExcelUtilities eu = new ExcelUtilities();

	@Test
	public void addSubCategory() throws IOException {
		lp = new LoginPage(driver);
		//sc = new SubCategory(driver);
		hp=lp.loginToGroceryApp(getCredentialFromExcel(0,0), getCredentialFromExcel(0,0));
		sc=hp.NavigateToPageandValidate();
		//Try chaining of methods
		//sc.NavigateToPageandValidate();
		sc.addSubCategory();
		sc.readAlert();
		Assert.assertEquals(sc.readAlert().trim(), "�\n" + "Alert!\n" + "Sub Category Created Successfully");
		sc.NavigateToPageandValidate();
		String LatesttableEnty = sc.readTableElement(1, 1);
		Assert.assertEquals(LatesttableEnty, sc.subCategoryName);
	}

	@Test(enabled = false)
	public void deleteSubCategory() throws IOException {
		lp = new LoginPage(driver);
		//sc = new SubCategory(driver);
		hp=lp.loginToGroceryApp(getCredentialFromExcel(0,0), getCredentialFromExcel(0,0));
		sc=hp.NavigateToPageandValidate();
		//lp.loginToGroceryApp(getCredentialFromExcel(0,0), getCredentialFromExcel(0,0));
		//sc.NavigateToPageandValidate();
		String subCategory = sc.readTableElement(1, 1);
		String category = sc.readTableElement(1, 2);
		sc.deleteTableElement(category, subCategory);
	}

	@Test(enabled = false)
	public void searchSubCategory() throws IOException {
		lp = new LoginPage(driver);
		//sc = new SubCategory(driver);
		hp=lp.loginToGroceryApp(getCredentialFromExcel(0,0), getCredentialFromExcel(0,0));
		sc=hp.NavigateToPageandValidate();
		sc.searchSubCategory("test dlt", "Apple");
		Assert.assertEquals(sc.checkSubCategoryExist("test dlt"), true);
	}
}
