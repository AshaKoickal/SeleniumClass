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
	sc.NavigateToPageandValidate();
	boolean tableEntyStatus=sc.validateTableEntry();
	Assert.assertEquals(tableEntyStatus, true);
	sc.deleteSubCategory();
	}
	
	//@Test
	  //public void deleteSubCategory() {
		//sc.deleteSubCategory();
	//}
	
	
 
}
