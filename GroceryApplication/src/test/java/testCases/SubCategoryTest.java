package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.SubCategory;
import utilities.GeneralUtilities;

public class SubCategoryTest extends BaseClass {
	HomePage hp;
	LoginPage lp;
	SubCategory sc;
	GeneralUtilities gu=new GeneralUtilities();
	
	@Test
	public void addSubCategory()
	{
	lp= new LoginPage(driver);
	sc=new SubCategory(driver);
	lp.loginWithValidCredentials("admin","admin");
	sc.NavigateToPageandValidate();
	sc.addSubCategory();
	sc.readAlert();	
	Assert.assertEquals(sc.readAlert().trim(),"�\n"
			+ "Alert!\n"
			+ "Sub Category Created Successfully");
	sc.NavigateToPageandValidate();
	String LatesttableEnty=sc.readTableElement(1,1);
	Assert.assertEquals(LatesttableEnty,sc.subCategoryName);
	}
	
	
	@Test
	public void deleteSubCategory()
	{
	lp= new LoginPage(driver);
	sc=new SubCategory(driver);
	lp.loginWithValidCredentials("admin","admin");
	sc.NavigateToPageandValidate();
	String subCategory=sc.readTableElement(1,1);
	String category=sc.readTableElement(1,2);
	sc.deleteTableElement(category,subCategory);
	
	}

	@Test
	public void searchSubCategory()
	{
	lp= new LoginPage(driver);
	sc=new SubCategory(driver);
	lp.loginWithValidCredentials("admin","admin");
	sc.NavigateToPageandValidate();
	sc.searchSubCategory("Test", "Apple");
	Assert.assertEquals(sc.checkSubCategoryExist("Test"), true);
	
	}
}
