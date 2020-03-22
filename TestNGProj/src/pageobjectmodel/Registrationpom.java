package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registrationpom {
	WebDriver ldriver;
	
	Registrationpom(WebDriver rdriver){

		

			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
	         
			
			
			
		}
	
	@FindBy(xpath="//input[@type='text' and @name='firstname']")
	WebElement txtFirstname;
	
	
	@FindBy(xpath="//input[@type='text' and @name='lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@type='text' and @name='reg_email__']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@type='text' and @name='reg_email_confirmation__']")
	WebElement txtconfirmEmail;
	
	
	@FindBy(xpath="//input[@type='password' and @name='reg_passwd__']")
	WebElement txtPassword;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	WebElement dropDownbdate;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	WebElement dropDownmonth;
	
	@FindBy(xpath="//select[@name='birthday_year']")
	WebElement dropDownyear;
		
	@FindBy(xpath="//input[@type='radio' and @value='1']")
	WebElement radBtnFemale;
	
	@FindBy(xpath="//input[@type='radio' and @value='2']")
	WebElement radBtnMale;
	
	
	@FindBy(xpath="//button[@type='submit' and @name='websubmit']")
	WebElement btnSubmit;
	
	public void setfirstName(String fname) {
		txtFirstname.sendKeys(fname);
		
	}
	public void setlastName(String lname) {
		txtLastname.sendKeys(lname);
		
	}
	
	public void setemail(String em) {
		txtEmail.sendKeys(em);
		
	}
	
	public void setConfrimemail(String cem) {
		txtconfirmEmail.sendKeys(cem);
	}
	
	public void setPassword(String pw) {
		txtPassword.sendKeys(pw);
	}
	
	public void setBdate(String bd) {
		Select bdate=new Select(dropDownbdate);
		bdate.selectByVisibleText(bd);
	}
	
	public void setBmonth(String bm) {
		Select bdate=new Select(dropDownmonth);
		bdate.selectByVisibleText(bm);
	}
	
	public void setByear(String by) {
		Select bdate=new Select(dropDownyear);
		bdate.selectByVisibleText(by);
	}

	public void setGender(String g) {
		if(g=="1")
			
			radBtnFemale.click();
		else
			radBtnMale.click();
	}
	
		
	public void clickOnsubmit() {
		btnSubmit.click();
	}

}
