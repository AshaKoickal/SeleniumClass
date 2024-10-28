package excel_read;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
	static FileInputStream file;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	public static String getStringData(int i,int j) throws IOException
	{
		file =new FileInputStream("");
		wb= new XSSFWorkbook(file);
		sheet =wb.getSheet("Sheet1");
		XSSFRow r=sheet.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getStringCellValue();
	}
	public static String getIntegerData(int i, int j) throws IOException
	{
		
		file =new FileInputStream("/");
		wb= new XSSFWorkbook(file);
		sheet =wb.getSheet("Sheet1");
		XSSFRow r=sheet.getRow(i);
		XSSFCell c=r.getCell(j);
		int a= (int)c.getNumericCellValue();
		return String.valueOf(a);
}
}
