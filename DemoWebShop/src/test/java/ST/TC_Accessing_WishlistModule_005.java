package ST;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.LoginPage;
import genericLibrary.BaseClass;

public class TC_Accessing_WishlistModule_005 extends BaseClass{
@Test

	public void Verify_If_User_Able_to_Add_Product_To_Wishlist() throws InterruptedException
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
		
		//click digital download
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		String digiurl=driver.getCurrentUrl();
		Thread.sleep(3000);
		assertEquals(givenURL,digiurl);
		Reporter.log("User is able to open the digital download page", true);
		
		//add to cart click one by one
		List<WebElement> digitel_download = driver.findElements(By.cssSelector("input[value='Add to cart']"));
			
			for (WebElement web : digitel_download) 
			{
				web.click();
				Thread.sleep(1000);
			}
			//click shoppingcart link button
			driver.findElement(By.xpath("//span[contains(text(),'Shopping')]")).click();
			String currentcarturl=driver.getCurrentUrl();
			Thread.sleep(3000);
			assertEquals(givencarturl,currentcarturl);
			Reporter.log("User is able to open the shopping cart page", true);
			
			//mouse over action on product name and click the product
			WebElement productname = driver.findElement(By.xpath("//a[@class='product-name']"));
			Actions action = new Actions(driver);
			action.moveToElement(productname).perform();
			driver.findElement(By.xpath("//a[@class='product-name']")).click();
			driver.findElement(By.cssSelector("input[value='Add to wishlist']")).click();
			Thread.sleep(1000);
		
			
				
	}

}
