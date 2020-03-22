package Day20;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://New folder//browser drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		String path="C:\\WORKSPACE\\Loginsheet.xlsx";
        int rows=XLUtils.getRowCount(path, "Sheet1");
        //System.out.println(rows);
        for(int i=1;i<=rows;i++) {
        	
        	driver.findElement(By.name("userName")).sendKeys(XLUtils.getCellData(path, "Sheet1", i, 0));
        
        	driver.findElement(By.name("password")).sendKeys(XLUtils.getCellData(path, "Sheet1", i, 1));
        	
        	driver.findElement(By.name("login")).click();
        	
        	if (driver.getTitle().equals("Find a Flight: Mercury Tours:"))
        	{
        		System.out.println("test passed");
        		XLUtils.setCellData(path, "Sheet1", i, 2, "passed");
        		
        	}
        		
        	else
        	{
        		System.out.println("test failed");
        		XLUtils.setCellData(path, "Sheet1", i, 2, "failed");
        	}
        			
        	driver.findElement(By.linkText("Home")).click();
        		Thread.sleep(3000);
        	
        	
        }
        driver.quit();
	}

}
