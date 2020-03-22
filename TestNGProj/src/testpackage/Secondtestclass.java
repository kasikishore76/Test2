package testpackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Secondtestclass {
	
	@AfterTest
	public void one() {
		
		System.out.println("thsis method one");
	}
	@AfterSuite
	public void two() {
		System.out.println("thsis method two");
		
	}
	
	@BeforeSuite
	public void three() {
		System.out.println("thsis method three");
		
	}
	
	

}
