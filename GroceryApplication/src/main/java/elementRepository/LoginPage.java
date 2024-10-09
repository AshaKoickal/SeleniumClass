package elementRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class LoginPage {

WebDriver driver;
GeneralUtilities gu=new GeneralUtilities();

public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);// with  page factory-Init element (Static elemet of page factory. 'This' parameter is current class instance
}
//Without page factory
//By UserNameField=By.name("UserName");
//WebElement element =driver.findElement("UserNameField").click

@FindBy(name="username")
WebElement userNameField;
@FindBy(name="password")
WebElement passwordField;
@FindBy(xpath="//button[text()='Sign In']")
WebElement loginButton;
//@FindBy(xpath="//div[@class=\"alert alert-danger alert-dismissible\"]")

@FindBy(xpath="//h5[text()=' Alert!']")

WebElement alert;

@FindBy(xpath="//span[text()='7rmart supermarket']")
WebElement homePageHeading;

public void loginWithValidCredentials(String firstParam,String secondParam)
{
	userNameField.sendKeys("admin");
	passwordField.sendKeys("admin");
	loginButton.click();
	
}
public void loginWithInValidCredentials(String firstParam,String secondParam)
{
	userNameField.sendKeys("hi");
	passwordField.sendKeys("hi");
	loginButton.click();
	
}
public String readInvalidCredentialsMessage()
{
	return alert.getText();
	
}

public String readHeading()
{
	return homePageHeading.getText();
}
//if we parameterize, the 2 methods, LoginwithvalidCredentials and LoginWithInValidCredentials can be handled in one method

	//public void login
}
