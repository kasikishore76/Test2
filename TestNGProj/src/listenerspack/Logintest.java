package listenerspack;

import static org.testng.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class Logintest {
	WebDriver driver;
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D://New folder//browser drivers//chromedriver.exe");
	 driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	
	Assert.assertTrue(true);
	
		
	}
	@Test(priority=2, dependsOnMethods={"login"})
	public void search() {
		driver.findElement(By.name("q")).sendKeys("youtube");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Assert.assertTrue(true);
		
		
	}
	@Test(priority=3)
	public void close() {
		driver.quit();
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void captureScreen(ITestResult result) throws IOException
	{
		if (result.getStatus() == ITestResult.FAILURE) 
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE); // capture the screenshot file
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("screenshot catured");
		}
	}
	
		

}
