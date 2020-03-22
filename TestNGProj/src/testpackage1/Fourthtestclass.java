package testpackage1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fourthtestclass {
	@Test
	public void one() {
		
		System.out.println("------------thsis method one4");
	}
	@Test
	public void two() {
		System.out.println("------------thsis method two4");
		
	}
	
	@BeforeClass
	public void three() {
		System.out.println("----------thsis method three4");
		
	}
	@BeforeMethod
	public void four() {
		System.out.println("------------thsis method four4");
		
	}
	

}
