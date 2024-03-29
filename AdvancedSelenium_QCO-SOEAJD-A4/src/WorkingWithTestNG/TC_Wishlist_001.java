package WorkingWithTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Wishlist_001 extends BaseClass
{
	@Test
	public void Verify_If_User_Is_Able_To_Click_Wishlist() throws InterruptedException
	{
		//driver.findElement(By.linkText("ico-wishlist")).click();
		
		//driver.findElement(By.xpath("span[text()='Wishlist']")).click();
	
		//driver.findElement(By.className('ico-wishlist')).click();
		driver.findElement(By.xpath("//span[contains(text(),'Wishlist')]")).click();
		Thread.sleep(2000);
		
	}
	
	
	
	
}
