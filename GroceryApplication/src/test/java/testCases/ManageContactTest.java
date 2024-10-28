package testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import elementRepository.LoginPage;
import elementRepository.ManageContact;

public class ManageContactTest extends BaseClass {
	LoginPage lp;
	ManageContact mc;

	@Test
	public void updateWithoutMandatoryFields() throws IOException {
		lp = new LoginPage(driver);
		mc = new ManageContact(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(0,0), getCredentialFromExcel(0,0));
		mc.navigateToManageContactLink();
		mc.editContact();
		mc.clearDetails();
		mc.updateDetails();
		Assert.assertEquals(mc.validateDetails(),true);		
	}
	
	@Test(enabled=false)
	public void updateContact() throws IOException {
		lp = new LoginPage(driver);
		mc = new ManageContact(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(0,0), getCredentialFromExcel(0,0));
		mc.navigateToManageContactLink();
		mc.editContact();
		mc.clearDetails();
		mc.editDetails("94463675701","test@testing.com1","Kendra1","Two hrs1","2110240800031");
		mc.updateDetails();
		Assert.assertEquals(mc.validateDetails(),false);	
		
	}
}
