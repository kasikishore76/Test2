package testpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Thirdtestclass {
	@BeforeMethod
	public void one() {
		
		System.out.println("thsis method one3");
	}
	@BeforeTest
	public void two() {
		System.out.println("thsis method two3");
		
	}
	
	@BeforeClass
	public void three() {
		System.out.println("thsis method three3");
		
	}

}
