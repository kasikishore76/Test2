package testpackage1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Firsttestngclass {
	@Test
	public void demo() {
		System.out.println("-----------demo method");
		
	}
	
	@AfterTest
   public void c() {
	   System.out.println("----------c method");
	   
   }
	
	

}
