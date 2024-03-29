package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author divya
 */

public class UtilityMethods {
	
WebDriver driver;
	
	public String get_Title()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public String get_Current_Url() 
	{
		
		String currenturl = driver.getCurrentUrl();
		return currenturl;
		
	}
	public void click(WebElement element_click)
	{
		element_click.click();
	}
	
	public void selectDropDownByValue(WebElement dropdown, String value)
	{
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}
	public void selectByVisibleText(WebElement dropdown, String visibleText)
	{
		Select select = new Select(dropdown);
		select.selectByVisibleText(visibleText);
	}
	
	
	}
