package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage{

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="ico-login")
	private WebElement loginbuttonlink;
	@FindBy(id="Email")
	private WebElement EmailTextBox;
	@FindBy(id="Password")
	private WebElement PasswordTextBox;
	@FindBy(css=".button-1.login-button")
	private WebElement loginbutton;
	
	public WebElement getLoginbuttonlink() {
		return loginbuttonlink;
	}
	public WebElement getEmailTextBox() {
		return EmailTextBox;
	}
	public WebElement getPasswordTextBox() {
		return PasswordTextBox;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	

}
