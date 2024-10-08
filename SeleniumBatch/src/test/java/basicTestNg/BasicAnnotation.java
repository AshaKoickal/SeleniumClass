package basicTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BasicAnnotation {
  @Test(groups="smoke")
  public void testCase01() {
	  System.out.println("testcase01");
  }
  @Test
  public void testCase02() {
	  System.out.println("testcase02");
  }
  @Test
  public void testCase03() {
	  System.out.println("testcase03");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suit");
  }
  
  @DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
	return new Object[][] {{2, 3,"A" }, {5, 7,"B"},{7,8,"C"}};

}
}
