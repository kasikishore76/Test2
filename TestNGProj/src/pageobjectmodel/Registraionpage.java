package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Registraionpage extends Loginpage{

	@Test(priority=4)
	void setup() {
		System.setProperty("webdriver.chrome.driver", "D://New folder//browser drivers//chromedriver.exe");
		 driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
		 
	}
	@Test(priority=5)
	void registrarionProcess() {
		Registrationpom rp= new Registrationpom(driver);
		rp.setfirstName("asdlfas");
		rp.setlastName("jvksdfgg");
		rp.setemail("asdfaskj@asdf.com");
        rp.setConfrimemail("asdfaskj@asdf.com");
		rp.setPassword("kvsdhfuff");
		rp.setBdate("23");
		rp.setBmonth("Apr");
		rp.setByear("1999");
		rp.setGender("1");
		rp.clickOnsubmit();
	}

	
	
	
}
