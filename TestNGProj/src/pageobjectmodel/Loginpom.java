package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpom {
	
	
	
	WebDriver ldriver;
	Loginpom(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
         
		
		
		
	}
	/*@FindBy(name="email")
	WebElement txtusername;*/
	@FindBy(how=How.NAME, using="email")
	WebElement txtusername;
	
	@FindBy(name="pass")
	WebElement txtpassword;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")
	WebElement btnlogin;
	
	public void setUserName(String usr)
	{
		txtusername.sendKeys(usr);
		
	}
	public void setPassword(String pss)
	{
		txtpassword.sendKeys(pss);
	}
	 public void clickLogin()
	 {
		 btnlogin.click();
	 }
	
	

}
