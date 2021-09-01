package module10.testCases;

import org.testng.annotations.Test;

import module10.objectRepo.FormORwithPF;
import module10.utilities.BaseClass_PageFactory;

public class TC3 extends BaseClass_PageFactory {

	@Test(priority = 0)
	public void setup() {

		openBrowser("Chrome");
		AUT("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");

	}
	
	@Test(priority = 1)
	public void formFill() {
		
		FormORwithPF fpf = new FormORwithPF(driver);
		fpf.formFilling("Abhresh", "Sugandhi", "Pune");
	}

}
