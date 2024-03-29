package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

		public CartPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
		
		@FindBy(xpath="//a[@class='product-name']")
		private WebElement productname;
		
		@FindBy(xpath="//span[contains(text(),'Shopping')]")
		private WebElement shoppingcartlinkbutton;
	
		public WebElement getShoppingcartlinkbutton() {
			return shoppingcartlinkbutton;
		}
		
		public WebElement getProductname() {
			return productname;
		}


	}

