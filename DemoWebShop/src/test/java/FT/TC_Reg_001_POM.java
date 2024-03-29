package FT;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.RegisterPage;
import genericLibrary.BaseClass;

public class TC_Reg_001_POM  extends BaseClass{
	@Test
	public void register() throws InterruptedException
	{
		String given_registerurl="https://demowebshop.tricentis.com/register";
		RegisterPage rp = new RegisterPage(driver);
			
		rp.getRegisterLink().click();
		
		String current_registerurl = driver.getCurrentUrl();	
		
		Thread.sleep(3000);
		assertEquals(current_registerurl,given_registerurl );
		Reporter.log("User is able to open the demo web shop register page", true);
		
		rp.getFemaleradiobutton().click();
		rp.getFirstNameTextBox().sendKeys("lakchu");
		rp.getLastNameTextBox().sendKeys("divya");
		rp.getEmailTextBox().sendKeys("lakchu@gmail.com");
		rp.getPasswordTextBox().sendKeys("LK123456");
		rp.getConfirmPasswordTextBox().sendKeys("LK123456");
		rp.getRegisterbutton().click();
		
}
}
