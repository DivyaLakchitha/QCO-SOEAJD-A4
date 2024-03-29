package POM;

import java.io.IOException;

import org.testng.annotations.Test;

public class TC_DemoWebShopBasePage_002 extends BaseClass {
	
	@Test
	public void searchProduct() throws InterruptedException
	{
		BasePage bp = new BasePage(driver);
		bp.getSearchBar().sendKeys("Simple Computer");
		Thread.sleep(2000);
		bp.getSearchButton().click();
	}

	
	
	
	
}
