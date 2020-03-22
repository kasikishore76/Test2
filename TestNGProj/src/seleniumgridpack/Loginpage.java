package seleniumgridpack;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Loginpage {
	
	public WebDriver driver;
	
	@Test(priority=1)
	void setup() throws MalformedURLException {
		
		
		String nodeURL="http://192.168.43.16:31320/wd/hub";
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		System.setProperty("webdriver.chrome.driver", "D://New folder//browser drivers//chromedriver.exe");
	     driver=new  RemoteWebDriver(new URL(nodeURL),cap);

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
