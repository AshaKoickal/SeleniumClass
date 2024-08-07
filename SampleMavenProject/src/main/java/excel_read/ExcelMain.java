package excel_read;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String data1= ExcelCode.getStringData(1, 1);
String data2= ExcelCode.getIntegerData(1, 1);
System.out.println(data1);
System.out.println(data2);

	}

}
