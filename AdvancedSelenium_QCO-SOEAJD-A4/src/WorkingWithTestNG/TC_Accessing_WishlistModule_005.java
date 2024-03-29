package WorkingWithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_Accessing_WishlistModule_005 extends BaseClass{
@Test

	public void Verify_If_User_Able_to_Add_Product_To_Wishlist() throws InterruptedException
	{
	String url=driver.getCurrentUrl();
	if(actualUrl.equals(url)) 
	{
		System.out.println("you are in Demo Web Shop");
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		List<WebElement> digitel_download = driver.findElements(By.cssSelector("input[value='Add to cart']"));
			
			for (WebElement web : digitel_download) 
			{
				web.click();
				Thread.sleep(1000);
			}
			driver.findElement(By.xpath("//span[contains(text(),'Wishlist')]")).click();
			
			List<WebElement> addtocart = driver.findElements(By.cssSelector("input[name='addtocart']"));
			
			for (WebElement web1 : addtocart) 
			{
				web1.click();
				WebElement	 addtowishlist=driver.findElement(By.id("add-to-wishlist-button-53"));
				Thread.sleep(1000);
				if(addtowishlist.isDisplayed())
				{
					System.out.println("Add to wishlist button is displayed");
					addtowishlist.click();
				}
				else
				{
					System.out.println("Add to wishlist button is displayed");
				}
			}
			

			//driver.findElement(By.cssSelector("input[name='addtocartbutton']")).click();
			Thread.sleep(1000);	
			
	}
	else
		System.out.println("you are not in demo web Shop");
	
}

}
