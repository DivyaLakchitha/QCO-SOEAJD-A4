package WorkingWithTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Newsletter_003 extends BaseClass{
	
	@Test
	public void Verify_If_User_Is_Able_To_Use_Newsletter_TextField()
	{
		driver.findElement(By.name("NewsletterEmail")).sendKeys("rithudivya28@gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
	}
	

}
