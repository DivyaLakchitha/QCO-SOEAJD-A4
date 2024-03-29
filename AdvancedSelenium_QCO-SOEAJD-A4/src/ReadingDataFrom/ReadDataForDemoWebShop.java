package ReadingDataFrom;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadDataForDemoWebShop 
{
	public static void main(String [] args) throws IOException
		{
		File file=new File("./testData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		String sheet=workbook.getSheetName(0);
		System.out.println(sheet);
		
		String url = workbook.getSheet(sheet).getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		}
}
