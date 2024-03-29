package FT;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.LoginPage;
import genericLibrary.BaseClass;

public class TC_Login_003 extends BaseClass {
	@Test
	public void login() throws InterruptedException
	{
		
		String given_loginurl="https://demowebshop.tricentis.com/login";
		LoginPage lp = new LoginPage(driver);
		lp.getLoginbuttonlink().click();
		
		

		String current_registerurl = driver.getCurrentUrl();	
		Reporter.log("User is able to open the demo web shop login page", true);
		Thread.sleep(3000);
		assertEquals(current_registerurl,given_loginurl );
		
		lp.getEmailTextBox().sendKeys("lakchu@gmail.com");
		lp.getPasswordTextBox().sendKeys("LK123456");
		lp.getLoginbutton().click();
	}
	

	
}
