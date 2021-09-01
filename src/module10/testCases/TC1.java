package module10.testCases;

import module10.objectRepo.FormPO;
import module10.utilities.BaseClass;

public class TC1 extends BaseClass {

	public static void main(String[] args) {
		
		openBrowser("Chrome");
		
		openUrl("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		
		FormPO.formFill("Abhresh", "Sugandhi", "Pune, India");

	}

}
