package WorkingWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Register_002 {
	@Test
	public void register() throws InterruptedException
	{
	String given_url = "https://demowebshop.tricentis.com/";
	String given_title="Demo Web Shop. Register";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String current_url=driver.getCurrentUrl();

	if(given_url.equals(current_url))
	{
		System.out.println("the given and current url is Same");
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		String current_registerTitle = driver.getTitle();
		if(given_title.contains(current_registerTitle))
		{
			System.out.println("You are in the register page");
			driver.findElement(By.name("Gender")).click();
			driver.findElement(By.id("FirstName")).sendKeys("Divya");
			driver.findElement(By.id("LastName")).sendKeys("lakchu");
			driver.findElement(By.id("Email")).sendKeys("lakchitha@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("L@kch!th@16");
			driver.findElement(By.name("ConfirmPassword")).sendKeys("L@kch!th@16");
			driver.findElement(By.id("register-button")).click();
		}
		else
		{
			System.out.println("You are not in register title page");
		}
	}
	else
	{
		System.out.println("the given and current title is not same");
		
		//driver.close();
	}
	}
	
}
