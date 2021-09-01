package certificationProject.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import module10.utilities.BaseClass_PageFactory;


public class FormORwithPF extends BaseClass_PageFactory {

	public FormORwithPF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "ts_first_name")
	WebElement fName;
	
	@FindBy(name = "ts_last_name")
	WebElement lName;
	
	@FindBy(id = "ts_address")
	WebElement add;
	
	
	public void formFilling(String fname, String lname, String address) {
		
		enterText(fName, fname);
		enterText(lName, lname);
		enterText(add, address);
		
	}
	
	
}
