package testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.LoginPage;
import elementRepository.ManageContact;

public class ManageContactTest extends BaseClass {
	LoginPage lp;
	ManageContact mc;

	@Test(enabled=true)
	public void updateWithoutMandatoryFields() throws IOException {
		lp = new LoginPage(driver);
		mc = new ManageContact(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(0,0), getCredentialFromExcel(0,0));
		mc.navigateToManageContactLink();
		mc.editContact();
		mc.clearDetails();
		mc.editDetails("","","","","");
		mc.updateDetails();
		Assert.assertEquals(mc.validateDetails(), true, Constant.mc_MandatoryFieldsNeedtobeFilledMessage);
	}
	
	@Test(enabled=false)
	public void updateContact() throws IOException {
		lp = new LoginPage(driver);
		mc = new ManageContact(driver);
		lp.loginToGroceryApp(getCredentialFromExcel(0,0), getCredentialFromExcel(0,0));
		mc.navigateToManageContactLink();
		mc.editContact();
		mc.clearDetails();
		mc.editDetails("9446367570","test@testing.com","Kendra","Two hrs","211024080003");
		mc.updateDetails();
		Assert.assertEquals(mc.validateDetails(), false, Constant.mc_ContactDetailsUpdatedSuccessfullyMessage);	
	}
}
