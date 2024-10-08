package basicTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BeforeAndAfterAnnotations {
	 @Test(groups="smoke")
	  public void testCase10() {
	  System.out.println("Test case 10");
	  }
	  @Test
	  public void testCase02() {
	  System.out.println("Test case 02");
	  }
	  @Test
	  public void testCase03() {
	  System.out.println("Test case 03");
	  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }
@BeforeClass
public void beforeClass()
{
	  System.out.println("Before Class");
}
@AfterClass
public void afterClass()
{
	  System.out.println("After Class");
}
}

