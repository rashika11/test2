package practice1.testCase;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import module10.objectRepo.FormPO;
import module10.utilities.BaseClass;

public class TC5 extends BaseClass{

	Workbook wb;
	Sheet sh;
	
	
	@Test(priority = 0)
	public void setup() {
		
		openBrowser("Chrome");
		openUrl("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
	}

	@Test(priority = 1, dataProvider = "supplyData")
	public void formFill(String fname, String lname, String address) {
		FormPO.formFill(fname, lname, address);
	}
	
	@DataProvider
	public Object[][] supplyData() throws Exception{
		
		//Define the file path and read the bites from the file
		FileInputStream fis = new FileInputStream("C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\workspace\\Edureka_12thJuly2021\\src\\module10\\dataSet\\testData.xlsx");
		
		//Open the WorkBook
		wb = WorkbookFactory.create(fis);
		
		//Select the sheet which you want to read
		sh = wb.getSheet("Sheet1");
		
		//Total no of rows
		int numrows = sh.getLastRowNum()+1;// 9+1=10 		
		
		//total no of Columns
		int numcols = sh.getRow(0).getLastCellNum(); //2+1=3
		
		Object[][] dataSet = new Object[numrows][numcols];
		
		for(int i=0; i<numrows; i++) 
		{
			for(int j=0; j<numcols; j++)
			{
				dataSet[i][j] = sh.getRow(i).getCell(j).toString();
			}
		}
		
		return dataSet;
	}
}
