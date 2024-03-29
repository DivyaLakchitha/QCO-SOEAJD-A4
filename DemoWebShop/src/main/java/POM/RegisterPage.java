package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Register")
	private WebElement registerLink;
	@FindBy(id="gender-male")
	private WebElement maleradiobutton;
	@FindBy(id="gender-female")
	private WebElement femaleradiobutton;
	@FindBy(id="FirstName")
	private WebElement FirstNameTextBox;
	@FindBy(id="LastName")
	private WebElement LastNameTextBox;
	@FindBy(id="Email")
	private WebElement EmailTextBox;
	@FindBy(id="Password")
	private WebElement PasswordTextBox;
	@FindBy(name="ConfirmPassword")
	private WebElement ConfirmPasswordTextBox;
	@FindBy(id="register-button")
	private WebElement registerbutton;
	
	
	
	public WebElement getPasswordTextBox() {
		return PasswordTextBox;
	}

	public WebElement getConfirmPasswordTextBox() {
		return ConfirmPasswordTextBox;
	}

	
	public WebElement getRegisterbutton() {
		return registerbutton;
	}

	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getMaleradiobutton() {
		return maleradiobutton;
	}

	public WebElement getFemaleradiobutton() {
		return femaleradiobutton;
	}
	
	public WebElement getFirstNameTextBox() {
		return FirstNameTextBox;
	}
	
	public WebElement getLastNameTextBox() {
		return LastNameTextBox;
	}
	
	public WebElement getEmailTextBox() {
		return EmailTextBox;
	}
	
	
}
