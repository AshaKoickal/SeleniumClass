package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPage;

public class LoginPageTest extends BaseClass {
	
	LoginPage lp;
	HomePage hp;
  @Test(enabled=false)
  public void verifyLoginWithValidCredentials() {
	  lp=new LoginPage(driver);
	  hp=new HomePage(driver);
	  lp.loginWithValidCredentials("admin","admin");
	  String actual=lp.readHeading();
	  String expected ="7rmart supermarket";
	  Assert.assertEquals(actual, expected, "Heading is as expected");
  }
  @Test(enabled=false)
  public void verifyLoginWithInValidCredentials() {
	  lp=new LoginPage(driver);
	  hp=new HomePage(driver);
	  lp.loginWithInValidCredentials("hi","hi");
	  
	  Assert.assertEquals(lp.readInvalidCredentialsMessage(), "Alert!", "Heading is not as expected");
	  			  
	//  lp.readInvalidCredentialsMessage();
  }
}
