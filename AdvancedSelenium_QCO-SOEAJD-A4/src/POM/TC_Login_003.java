package POM;

import org.testng.annotations.Test;

public class TC_Login_003 extends BaseClass {
	@Test
	public void login()
	{
		LoginPage lp = new LoginPage(driver);
		lp.getLoginbuttonlink().click();
		lp.getEmailTextBox().sendKeys("lakchu@gmail.com");
		lp.getPasswordTextBox().sendKeys("LK123456");
		lp.getLoginbutton().click();
	}
	

	
}
