package WorkingWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
public WebDriver driver;

String emailid = "rithudivya28@gmail.com";
String password="L@kch!th@16";
String actualUrl = "https://demowebshop.tricentis.com/";

@BeforeSuite
public void beforeSuite()
{
	System.out.println("Hi am from before suite");
	Reporter.log("Database connection startes from here", true);
}
@AfterSuite
public void afterSuite()
{
	System.out.println("Hi am from after suite");
	Reporter.log("Database connection stops here", true);
}
@BeforeClass
public void browserSetUp() throws InterruptedException
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Reporter.log("User is able to open the empty browser", true);
	
	//driver.get(actualUrl);
	//Reporter.log("User is able to open the demo web shop", true);
	//String url= driver.getCurrentUrl();
	//Assert.assertEquals(url, actualUrl);
	
	
	//if(url.equals(actualUrl))
	//{
		//Reporter.log("User is able to land on the demo web shop home page", true);
	//}
	//else
	//{
		//Reporter.log("User is notable to land on the demo web shop home page", true);
		
	//}
	//Thread.sleep(2000);
}
@AfterClass
public void browserQuit()
{
 driver.quit();
 Reporter.log("User is able to close the demo web shop", true);
}
@BeforeMethod
public void login() throws InterruptedException
{
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys(emailid);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.cssSelector(".button-1.login-button")).click();
	Thread.sleep(2000);
}


}
