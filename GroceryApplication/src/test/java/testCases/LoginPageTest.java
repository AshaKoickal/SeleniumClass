package testCases;
import java.io.IOException;
import constant.Constant;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPage;

public class LoginPageTest extends BaseClass {

	LoginPage lp;
	HomePage hp;

	@Test(enabled = true)
	public void verifyLoginWithValidCredentials() throws IOException {
		lp = new LoginPage(driver);
		//hp = new HomePage(driver);
		hp=lp.loginToGroceryApp("admin", "admin");
		lp.loginToGroceryApp(getCredentialFromExcel(0,0), getCredentialFromExcel(0,0));
		String actual = lp.readHeading();
		String expected = "7rmart supermarket";
		Assert.assertEquals(actual, expected, Constant.lp_verifyLoginWithValidCredentials);
	}

	@Test(enabled = false)
	public void verifyLoginWithInValidCredentials() throws IOException {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(0,1), getCredentialFromExcel(0,1));
		String expected = "Alert!, Heading is not as expected";
		Assert.assertEquals(lp.readInvalidCredentialsMessage(),expected,Constant.lp_verifyLoginWithInValidCredentials );
	}
}
