package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards {

		public GiftCards(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		

		@FindBy(linkText ="Gift Cards")
		private WebElement giftcardlinkbutton;
		
		@FindBy(linkText="$5 Virtual Gift Card")
		private WebElement giftcardproduct;

		@FindBy(id="giftcard_1_RecipientName")
		private WebElement giftcardrecipientname;
		
		@FindBy(id="giftcard_1_RecipientEmail")
		private WebElement giftcardrecipientemail;
		
		

		//public WebElement getGiftcardemailfriendbutton() {
			//return giftcardemailfriendbutton;
		//}


		public WebElement getGiftcardrecipientname() {
			return giftcardrecipientname;
		}

		public WebElement getGiftcardrecipientemail() {
			return giftcardrecipientemail;
		}


		public WebElement getGiftcardproduct() {
			return giftcardproduct;
		}


		public WebElement getGiftcardlinkbutton() {
			return giftcardlinkbutton;
		}
		
		
	}


