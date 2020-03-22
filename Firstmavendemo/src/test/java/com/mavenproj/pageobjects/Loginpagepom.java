package com.mavenproj.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagepom {

	public WebDriver ldriver;
	public Loginpagepom(WebDriver rdriver){

		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//input[@class='email']")
	@CacheLookup
	WebElement textusername;

	@FindBy(xpath="//input[@class='password']")
	@CacheLookup
	WebElement textpassword;
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	WebElement btnsubmit;

	@FindBy(linkText="Logout")
	@CacheLookup

	WebElement linklogout;




	public void setUsername(String usr) {

		textusername.sendKeys(usr);
	}

	public void setPassword(String pwd) {
		textpassword.sendKeys(pwd);
	}

	public void clickSubit()
	{
		btnsubmit.click();
	}

	public void clickLogout() {
		linklogout.click();
	}

}