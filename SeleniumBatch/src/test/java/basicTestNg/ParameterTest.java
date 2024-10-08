package basicTestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
  @Test
  @Parameters({"parameter1", "parameter2"})
  public void parameterSampleTest(int a, String s ) {
	  System.out.println(a);
	  System.out.println(s);
	  
  }
}
