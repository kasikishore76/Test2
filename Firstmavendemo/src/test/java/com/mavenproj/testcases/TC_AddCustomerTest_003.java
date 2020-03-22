package com.mavenproj.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mavenproj.pageobjects.AddcustomerPage;
import com.mavenproj.pageobjects.Baseclass;
import com.mavenproj.pageobjects.Loginpagepom;


public class TC_AddCustomerTest_003 extends Baseclass
{

	@Test
	public void addNewCustomer() throws IOException, InterruptedException
	{
		driver.get(baseurl);
		
		Loginpagepom lp=new Loginpagepom(driver);
		lp.setUsername(username);
		logger.info("User name is provided");
		
		lp.setPassword(passwrod);
		logger.info("password is provided");
		
		lp.clickSubit();
		
		logger.info("providing customer details....");
		
		AddcustomerPage addcust=new AddcustomerPage(driver);
		
		addcust.clickOnCustomersMenu();
		addcust.clickOnCustomersMenuItem();
		
		addcust.clickOnAddnew();
		
		String email = randomestring() + "@gmail.com";
		addcust.setEmail(email);
				
		addcust.setPassword("test123");
		
		//Registered - default
		//The customer cannot be in both 'Guests' and 'Registered' customer roles
		//Add the customer to 'Guests' or 'Registered' customer role
		addcust.setCustomerRoles("Guest");
		
		addcust.setManagerOfVendor("Vendor 2");
		
		addcust.setGender("Male");
		
		addcust.setFirstName("Pavan");
		addcust.setLastName("Kumar");
		
		addcust.setDob("7/05/1985"); // Format: D/MM/YYY
		
		addcust.setCompanyName("busyQA");
		addcust.setAdminContent("This is for testing.........");
	
		addcust.clickOnSave();
		
		logger.info("validation started....");
				
		//String msg=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']")).getText();
		
		String msg = driver.findElement(By.tagName("body")).getText();
			
		
		if(msg.contains("The new customer has been added successfully"))
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
		}
		else
		{
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
				
	}
	
	
	
}
