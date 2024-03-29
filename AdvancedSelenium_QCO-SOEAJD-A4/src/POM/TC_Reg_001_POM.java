package POM;

import org.testng.annotations.Test;

public class TC_Reg_001_POM  extends BaseClass{
	@Test
	public void register()
	{
		RegisterPage rp = new RegisterPage(driver);
		rp.getRegisterLink().click();
		rp.getFemaleradiobutton().click();
		rp.getFirstNameTextBox().sendKeys("lakchu");
		rp.getLastNameTextBox().sendKeys("divya");
		rp.getEmailTextBox().sendKeys("lakchu@gmail.com");
		rp.getPasswordTextBox().sendKeys("LK123456");
		rp.getConfirmPasswordTextBox().sendKeys("LK123456");
		rp.getRegisterbutton().click();
		
		
		
	}

}
