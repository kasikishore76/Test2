package com.mavenproj.pageobjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

//import com.beust.jcommander.Parameter;
import com.mavenproj.utilities.ReadConfig;


public class Baseclass {



	ReadConfig rc=new ReadConfig();

	public String baseurl=rc.getBaseURL();
	public String username=rc.getUserName();
	public String  passwrod=rc.getPassword();
	public static WebDriver driver;
	public static Logger logger;

	@BeforeTest
	@Parameters("br")
	public void setup(String br) {
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", rc.getChromePath());
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", rc.getFFPath());
			driver=new  FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", rc.getIEPath());
			driver=new  EdgeDriver();
		}




		logger=Logger.getLogger("mavenproj");
		PropertyConfigurator.configure("Log4j.properties");


	}
	@AfterTest
	public void teardown() {
		driver.close();

	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}

	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}

}
