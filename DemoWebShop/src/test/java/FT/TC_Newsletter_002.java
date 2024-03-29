package FT;

import org.openqa.selenium.By;

import genericLibrary.BaseClass;

public class TC_Newsletter_002 extends BaseClass{

	public void Verify_If_User_Is_Able_To_Use_Newsletter_TextField()
	{
		driver.findElement(By.name("NewsletterEmail")).sendKeys("rithudivya28@gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
	}
	
	
	
}
