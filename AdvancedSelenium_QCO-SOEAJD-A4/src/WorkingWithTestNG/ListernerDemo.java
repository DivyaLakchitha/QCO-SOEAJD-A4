package WorkingWithTestNG;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import org.testng.ITestListener;

public abstract class ListernerDemo implements ITestListener
{


		@Override
		public void onTestFailure(ITestResult result) 
		{
			System.out.println(result.getName()+"Test case is fail");
			LocalDateTime SystemTime = LocalDateTime.now();
			System.out.println(SystemTime);
			String screenshotname=SystemTime.toString().replace(":", "-");
			
			TakesScreenshot tks = (TakesScreenshot)ScreenShootListener.driver;
			File src = tks.getScreenshotAs(OutputType.FILE);
			File dst = new File("./ErrorShot/"+ screenshotname + ".png");
			try {
				FileHandler.copy(src, dst);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

		@Override
		public void onTestStart(ITestResult result) 
		{
			System.out.println("Test is start");
		}

		@Override
		public void onTestSuccess(ITestResult result) 
		{	System.out.println("Test is success");
			
		}

		

		


		
	}
