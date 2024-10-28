package testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import elementRepository.LoginPage;
import elementRepository.ManageNews;

public class ManageNewsTest extends BaseClass {
	LoginPage lp;
	ManageNews mt;

	@Test(enabled=false)
	public void addNews() throws IOException {
		lp = new LoginPage(driver);
		mt = new ManageNews(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(0, 0), getCredentialFromExcel(0, 0));
		mt.addNews("NewsAsha");
	}

	@Test(enabled=false)
	public void searchNews() throws IOException {
		lp = new LoginPage(driver);
		mt = new ManageNews(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(0, 0), getCredentialFromExcel(0, 0));
		mt.searchNews("NewsAsha");
	}
	
	@Test
	public void deleteNews() throws IOException {
		lp = new LoginPage(driver);
		mt = new ManageNews(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(0, 0), getCredentialFromExcel(0, 0));
		mt.searchNews("NewsAsha");
		mt.deleteNewsEntry("NewsAsha");
	}
}
