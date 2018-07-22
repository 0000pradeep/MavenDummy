package MavenDummy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
class test4 {
	
	@BeforeMethod
	public void beforetest4(){
		System.out.println("before method of 4th  parent class");
		
	}	
}
class test3 extends test4 {
	
	@BeforeMethod
	public void beforetest3(){
		System.out.println("before method of 3rd  parent class");
		
	}	
}

class test2 extends test3{
	
	@BeforeMethod
	public void beforetest2(){
		System.out.println("before method of top parent class");
	}	
}

class test extends test2{
	
	@BeforeMethod
	public void beforetest1(){
		System.out.println("before method of parent class");
	}	
}


public class test1 extends test {
 
	@BeforeMethod
	  public void beforetest() {
			System.out.println("Before method of sub class");
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
