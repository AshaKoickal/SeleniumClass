package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.LoginPage;
import elementRepository.ManageNews;

public class ManageNewsTest extends BaseClass {
	LoginPage lp;
	ManageNews mn;

	@Test(enabled=true, groups="smoke")
	public void addNews() throws IOException {
		lp = new LoginPage(driver);
		mn = new ManageNews(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(0, 0), getCredentialFromExcel(0, 0));
		mn.navigateToNewsLink();
		mn.addNews("News1234");	
		Assert.assertEquals(mn.validateNewsEntry("NewsAsha"),true, Constant.mc_ContactDetailsUpdatedSuccessfullyMessage);
	}

	@Test(enabled=true)
	public void searchNews() throws IOException {
		lp = new LoginPage(driver);
		mn = new ManageNews(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(0, 0), getCredentialFromExcel(0, 0));
		mn.navigateToNewsLink();
		mn.searchNews("News1234");
		Assert.assertEquals(mn.validateNewsEntry("News"),true, Constant.mc_validSearch);
	}
	
	@Test(enabled=true)
	public void deleteNews() throws IOException {
		lp = new LoginPage(driver);
		mn = new ManageNews(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(0, 0), getCredentialFromExcel(0, 0));
		mn.navigateToNewsLink();
		mn.searchNews("News1234");
		mn.deleteNewsEntry("News1234");
		Assert.assertEquals(mn.validateNewsEntry("News1234"),false, Constant.mc_entryNotExists);
	}
}
