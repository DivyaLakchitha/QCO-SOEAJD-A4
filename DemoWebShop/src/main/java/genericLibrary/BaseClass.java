package genericLibrary;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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

String actualURL = "https://demowebshop.tricentis.com/";


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
public void browserSetUp() throws InterruptedException, IOException
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Reporter.log("User is able to open the empty browser", true);
	
	
	File file = new File("D:\\Eclipse_new_Version\\Eclipse_Projects\\DemoWebShop\\src\\test\\resources\\Profile\\data.properties");
	//File file = new File("./testData/data.properties");
	FileInputStream fis = new FileInputStream(file);
	Properties prop = new Properties();
	prop.load(fis);
	
	String appURL = prop.getProperty("url");
	driver.get(appURL);
	Reporter.log("User is able to open demo web shop", true);
	String url = driver.getCurrentUrl();
	if(url.equals(actualURL))
	{
		Reporter.log("User is able to land on demo web shop home page", true);
	}
	else {
		Reporter.log("User is not able to land on demo web shop home page");
	}
Thread.sleep(2000);

	
	
	
	
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
 //driver.quit();
 Reporter.log("User is able to close the demo web shop", true);
}



}
