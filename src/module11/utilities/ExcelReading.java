package module11.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading {

	public static Workbook wb;
	public static Sheet sh;
	
	public static void setupExcel(String path, String sheetName) throws Exception {

		FileInputStream fis = new FileInputStream(path);
		
		wb = WorkbookFactory.create(fis);
		
		sh = wb.getSheet(sheetName);
				
	}
	
	public static String getData(int row, int col) {
		
		String data = sh.getRow(row).getCell(col).toString();
		
		return data;
		
	}
	
}
