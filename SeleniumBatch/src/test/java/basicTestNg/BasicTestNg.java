package basicTestNg;

import org.testng.annotations.Test;

public class BasicTestNg {
  @Test
  public void testCase10() {
  System.out.println("Test case 10");
  }
  @Test(enabled=true)
  public void testCase02() {
  System.out.println("Test case 02");
  }
  @Test(priority=1,groups="smoke")
  public void testCase03() {
  System.out.println("Test case 03");
  }
  @Test(priority=-1,enabled=false)
  public void testCase04() {
  System.out.println("Test case 04");
  }
  @Test(enabled=false)
  public void testCase05() {
  System.out.println("Test case 05");
  }
  
  
  
}
