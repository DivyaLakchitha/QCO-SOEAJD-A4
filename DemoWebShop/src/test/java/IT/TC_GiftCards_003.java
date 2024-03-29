package IT;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.GiftCards;
import POM.RegisterPage;
import genericLibrary.BaseClass;

public class TC_GiftCards_003 extends BaseClass{
	
	@Test
	public void giftCards() throws InterruptedException
	{
		
	
String given_gcurl="https://demowebshop.tricentis.com/gift-cards";
GiftCards gc = new GiftCards(driver);
gc.getGiftcardlinkbutton().click();

String current_giftcardurl = driver.getCurrentUrl();	
Thread.sleep(3000);

assertEquals(current_giftcardurl,given_gcurl );
Reporter.log("User is able to open the giftcards page", true);

gc.getGiftcardproduct().click();

String given_giftproducturl="https://demowebshop.tricentis.com/5-virtual-gift-card";

String current_giftproducturl = driver.getCurrentUrl();
Thread.sleep(3000);
assertEquals(current_giftproducturl,given_giftproducturl );
Reporter.log("User is able to open the giftcards page", true);


gc.getGiftcardrecipientname().sendKeys("satya");
Thread.sleep(1000);
gc.getGiftcardrecipientemail().sendKeys("rithudivya28@gmail.com");
Thread.sleep(1000);
//gc.getGiftcardemailfriendbutton().click();

}
}