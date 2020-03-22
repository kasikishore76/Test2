package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Loginpage {
	
	public WebDriver driver;
	
	@Test(priority=1)
	void setup() {
		System.setProperty("webdriver.gecko.driver", "D://New folder//browser drivers//geckodriver.exe");
	     driver=new  FirefoxDriver();

		 driver.get("https://www.facebook.com/");
		 
	}

	@Test(priority=2)
	void login() {
		
		Loginpom lp=new Loginpom(driver);
		lp.setUserName("9985860110");
		lp.setPassword("asfsa");
		lp.clickLogin();
		driver.quit();
	}
	 
	
	
}
