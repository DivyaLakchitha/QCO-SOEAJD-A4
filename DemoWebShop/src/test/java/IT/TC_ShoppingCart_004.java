package IT;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_ShoppingCart_004 extends BaseClass
{
@Test
	public void Verify_If_User_Is_Able_To_Addproducts_Into_ShoppingCart_andremove_thirdproduct() throws InterruptedException
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
					
					driver.findElement(By.cssSelector("span[class='cart-label']")).click();
					WebElement shopping_Cart = driver.findElement(By.cssSelector("div[class='page-title']"));
					
					if(shopping_Cart.isDisplayed()) 
					{
						System.out.println("you are in Shopping cart page");
						List<WebElement> remove = driver.findElements(By.cssSelector("input[type='checkbox']"));
						remove.remove(3);
						for (WebElement CheckBox : remove) 
						{
							CheckBox.click();
							Thread.sleep(1000);
						}
						driver.findElement(By.cssSelector("input[name='updatecart']")).click();
						
					}
					else
						System.out.println("you are not in Shopping cart page ");
					
				}
			
			else
				System.out.println("you are not in demo web Shop");
			
		}
	}


	
