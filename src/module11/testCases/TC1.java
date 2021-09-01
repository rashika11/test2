package module11.testCases;

import module11.actions.ActionKeywords;
import module11.utilities.ExcelReading;

public class TC1 {

	public static void main(String[] args) throws Exception {
	
		String path = "R:\\Learning Journey\\EDUREKA\\Test Analyst\\Selenium\\workspace\\Edureka_12thJuly2021\\src\\module11\\dataSet\\MyDataEngine.xlsx";
		

		ExcelReading.setupExcel(path, "Sheet1");
		
		for(int i=0; i<5; i++)
		{
			String kw = (ExcelReading.getData(i, 1));
			
			if(kw.equalsIgnoreCase("OpenBrowser"))
			{
				ActionKeywords.openbrowser();
			}
			else if(kw.equalsIgnoreCase("Navigate"))
			{
				ActionKeywords.navigation();
			}
			else if(kw.equalsIgnoreCase("ClickGmail"))
			{
				ActionKeywords.ClickGmail();
			}
			else if(kw.equalsIgnoreCase("QuitBrowser"))
			{
				ActionKeywords.Quit();
			}
		}
		
	}

}
