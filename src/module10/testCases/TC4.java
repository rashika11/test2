package module10.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import module10.objectRepo.FormPO;
import module10.utilities.BaseClass;

public class TC4 extends BaseClass{

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
	public Object[][] supplyData(){
		
		Object[][] dataSet = new Object[3][3];
		
		dataSet[0][0] = "Amit";
		dataSet[0][1] = "Jain";
		dataSet[0][2] = "Gujrat";
		
		dataSet[1][0] = "Sam";
		dataSet[1][1] = "Pandit";
		dataSet[1][2] = "Goa";
		
		dataSet[2][0] = "Rohit";
		dataSet[2][1] = "Joshi";
		dataSet[2][2] = "Pune";
		
		return dataSet;
		
	}
}
