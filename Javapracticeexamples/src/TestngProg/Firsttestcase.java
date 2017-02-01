package TestngProg;

import org.testng.annotations.Test;

public class Firsttestcase {
  @Test (priority =2)
  public void First() {
	  System.out.println("First test case executed");
  }
  @Test (priority =0)
  public void Second() {
	  System.out.println("Second test case executed");
}
  @Test (priority =1)
  public void Third() {
	  System.out.println("Third test case executed");
}
}
