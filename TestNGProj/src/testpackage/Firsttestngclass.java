package testpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class Firsttestngclass {
	@Test
	public void demo() {
		System.out.println("demo method");
		
	}
	
	@AfterTest
   public void c() {
	   System.out.println("c method");
	   
   }
	//@Parameters("a")
	@Parameters({"a","b"})
	@Test
	public void d(String s , String y) {
		   System.out.println(s);
		   System.out.println(y);
		   
	   }
		

}
