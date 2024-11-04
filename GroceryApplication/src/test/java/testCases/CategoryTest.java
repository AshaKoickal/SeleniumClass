package testCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constant.Constant;
import elementRepository.Category;
import elementRepository.HomePage;
import elementRepository.LoginPage;
import utilities.ExcelUtilities;
import utilities.GeneralUtilities;

public class CategoryTest extends BaseClass {
	HomePage hp;
	LoginPage lp;
	Category cg;
	GeneralUtilities gu = new GeneralUtilities();
	ExcelUtilities eu = new ExcelUtilities();

	@Test(enabled=false)
	public void addCategory() throws IOException {
		lp = new LoginPage(driver);
		cg = new Category(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(0, 0), getCredentialFromExcel(0, 0));
		cg.NavigateToCategoryPage();
		cg.addCategory();
		Assert.assertEquals(cg.validateCategoryDetails(), Constant.cg_expectedcategoryAddedMessage, Constant.cg_categoryAddedSuccessfulMessage);
	}
}
