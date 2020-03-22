package testpackage2;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class Dependencymethods {
	 WebDriver driver;
	@Test(priority=1)
	void openURL() {
		Map <String, Object> prefs= new HashMap<String ,Object>();
		prefs.put("profile.default_content_setting_values.notifications",1);
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D://New folder//browser drivers//chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Facebook – log in or sign up"))
			
		Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
			
		
	}

	@Test(priority=2,dependsOnMethods={"openURL"})
	void login() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("9985860110");
		driver.findElement(By.id("pass")).sendKeys("Kepler51");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.getTitle());
		Assert.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods={"login"})
	
	
	void search() {
		System.out.println("search");
		Assert.assertTrue(true);
	}
	@Test(priority=4,dependsOnMethods={"search"})
	void advsearch() {
		
		System.out.println("advsearch");
		Assert.assertTrue(true);
	}
	@Test(priority=5)
	void recharge() {
		System.out.println("recharge");
		Assert.assertTrue(true);
	}
	@Test(priority=6)
	void logout() {
		System.out.println("logout");
		Assert.assertTrue(true);
	}
	
}
