package log4jpack;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.*;


public class Loginpage {
	
	static Logger logger;
	
	@Test(priority=1)
	public void setup() {
		logger=Logger.getLogger("Loginpage");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("setup method is started");
	}

	@Test(priority=2)
	public void login() {
		logger.info("login method is started");
	}
	@Test(priority=3)
	public void logout() {
		
		logger.info("logout method is started");	}
	
	
}
