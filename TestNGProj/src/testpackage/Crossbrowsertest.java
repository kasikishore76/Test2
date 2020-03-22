package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

public class Crossbrowsertest {
	
	WebDriver driver= null;
	@Parameters("br")
	@Test(priority=1)
	public void launch(String br) {
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D://New folder//browser drivers//chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D://New folder//browser drivers//geckodriver.exe");
			 driver=new  FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D://New folder//browser drivers//IEDriverServer.exe");
			 driver=new  InternetExplorerDriver();
		}
		driver.get("https://www.facebook.com/");
		
		
	}
	@Test(priority=2)
public void verifytitle() {
		
	}
	@Test(priority=3)
public void registration() {
	
}
	@Test(priority=4)
public void closebrowser() {
	driver.close();
}

}
