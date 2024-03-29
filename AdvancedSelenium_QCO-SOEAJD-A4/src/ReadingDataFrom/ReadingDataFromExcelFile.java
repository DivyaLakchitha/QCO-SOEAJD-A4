package ReadingDataFrom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingDataFromExcelFile 
{
	public static void main(String [] args) throws IOException
	{
	File file=new File("./testData/TestData.xlsx");
	FileInputStream fis = new FileInputStream(file);
	
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	String sheet=workbook.getSheetName(0);
	System.out.println(sheet);
	
	String url = workbook.getSheet("data").getRow(0).getCell(0).getStringCellValue();
	System.out.println(url);
	String url1 =workbook.getSheet(sheet).getRow(1).getCell(0).getStringCellValue();
	System.out.println(url1);
	String username =workbook.getSheet(sheet).getRow(1).getCell(1).getStringCellValue();
	System.out.println(username);
	String password =workbook.getSheet(sheet).getRow(1).getCell(2).getStringCellValue();
	System.out.println(password);
	
	
	
	}
	
	
}
