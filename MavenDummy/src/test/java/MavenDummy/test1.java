package MavenDummy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class test1 {
 
	@BeforeTest
	  public void beforetest() {
			System.out.println("Before Test called");
	  }
	@Test
  public void test() {
		System.out.println("Test called");
  }

	@AfterTest
	  public void Aftertest() {
			System.out.println("After Test called");
	  }
}
