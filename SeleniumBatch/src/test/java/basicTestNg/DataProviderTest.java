package basicTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @Test(dataProvider="data-provider",groups="smoke")
  public void testCase01(int a, int b) {
	  System.out.println(a+b);
  }
  @Test(dataProvider="data-provider",dataProviderClass=BasicAnnotation.class)
  public void testCase02(int a, int b,String s) {
	  System.out.println(a+b+" "+s);
  }
  //executing one testcase with multiple data
  @DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
	return new Object[][] {{2, 3 }, {5, 7},{7,8}};
	}
}
