package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	static FileInputStream file;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;

	public static String getLoginData(int i, int j,String path) throws IOException {
		file = new FileInputStream(path);
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet("Sheet1");
		XSSFRow r = sheet.getRow(i);
		XSSFCell c = r.getCell(j);
		return c.getStringCellValue();
	}

	public static String getIntegerData(int i, int j) throws IOException {
		file = new FileInputStream("/");
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet("Sheet1");
		XSSFRow r = sheet.getRow(i);
		XSSFCell c = r.getCell(j);
		int a = (int) c.getNumericCellValue();
		return String.valueOf(a);
	}
}
