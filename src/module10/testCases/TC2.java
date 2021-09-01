package module10.testCases;

import org.testng.annotations.Test;

import module10.objectRepo.FormPO;
import module10.utilities.BaseClass;

public class TC2 extends BaseClass {

	@Test(priority = 0)
	public void setup() {
		
		openBrowser("Chrome");
		openUrl("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
	}

	@Test(priority = 1)
	public void formFill() {
		FormPO.formFill("Abhresh", "Sugandhi", "Pune, India");
	}
}
