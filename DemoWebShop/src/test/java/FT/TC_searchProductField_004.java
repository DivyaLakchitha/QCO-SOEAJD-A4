package FT;

import java.io.IOException;

import org.testng.annotations.Test;

import POM.BasePage;
import genericLibrary.BaseClass;

public class TC_searchProductField_004 extends BaseClass {
	
	@Test
	public void searchProduct() throws InterruptedException
	{
		BasePage bp = new BasePage(driver);
		bp.getSearchBar().sendKeys("Simple Computer");
		Thread.sleep(2000);
		bp.getSearchButton().click();
	}

	
	
	
	
}
