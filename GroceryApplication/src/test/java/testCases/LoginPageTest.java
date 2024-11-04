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
		lp.loginToGroceryApp(getCredentialFromExcel(0, 0), getCredentialFromExcel(0, 0));
		String actual = lp.readHeading();
		Assert.assertEquals(actual, Constant.lp_expectedHeadingForValidCredentials,
				Constant.lp_verifyLoginWithValidCredentials);
	}

	@Test(enabled = true)
	public void verifyLoginWithInValidCredentials() throws IOException {
		lp = new LoginPage(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(1, 1), getCredentialFromExcel(1, 1));
		Assert.assertNotEquals(lp.readInvalidCredentialsMessage(), Constant.lp_expectedHeadingForValidCredentials,
				Constant.lp_verifyLoginWithInValidCredentials);
	}
}
