package IT;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.LoginPage;
import genericLibrary.BaseClass;

public class TC_Wishlist_001 extends BaseClass
{
	@Test
	public void Verify_If_User_Is_Able_To_Click_Wishlist() throws InterruptedException
	{
		//login
				String givenURL = "https://demowebshop.tricentis.com/digital-downloads";
				String givencarturl = "https://demowebshop.tricentis.com/cart";
				
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
		
		//clicking wishlist module
				driver.findElement(By.xpath("//span[contains(text(),'Wishlist')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("updatecart")).click();
				Thread.sleep(2000);
		
	}

}
