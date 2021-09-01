package caseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class caseStudy1 {
	
	public static void main(String[] args) throws InterruptedException {

	// Open Browser
	System.setProperty("webdriver.chrome.driver", "R:\\Learning Journey\\EDUREKA\\Test Analyst\\Selenium\\drivers\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	
		
	//Get URL
	driver.get("https://www.facebook.com/");
	
	// Verify whether the background color of the ‘LogIn’ button is blue 
	String clr = driver.findElement(By.xpath("//button[@data-testid=\'royal_login_button\']")).getCssValue("background-color");
	
	// click on the ‘Forgotten password?’
	driver.findElement(By.linkText("Forgotten password?")).click();
	
	//Verify whether the color of the label-‘Email or phone’ that is above the text box for entering Email or phone is white
	String bckgclr = driver.findElement(By.xpath("//input[@aria-label=\'Email or phone\']")).getCssValue("background-color");
	
	//Verify whether the ‘Log In’button is enabled by default
	Boolean enabld = driver.findElement(By.xpath("//*[@id=\'login_form\']/div[2]/div[3]/div/div/div[1]/div/span/span")).isEnabled();
	
	
	//Verify whether the URL contains the word ‘facebook’in it
	//Now click on the ‘Forgotten account?
	driver.findElement(By.partialLinkText("Forgotten")).click();

	
	
	//Using CSS Selector,enter the mobile number: 999999 in the text box
	driver.findElement(By.xpath("//input[@id=\'identify_email\']")).sendKeys("999999");
	
	
	//Click on the ‘Search’ button.
	driver.findElement(By.xpath("//button[@id=\'did_submit\']")).click();
	
	
	// Verify whether the text-‘Find Your Account’ is displayed on the page
	if(driver.findElement(By.xpath("//*[@id=\'identify_yourself_flow\']/div/div[1]/div/div[2]/h2"))!= null){

		System.out.println("Element is Present");

		}else{

		System.out.println("Element is Absent");

		}

	System.out.println(clr);
	System.out.println(bckgclr);
	System.out.println(enabld);
		
	Thread.sleep(3000);
   // kill the browser	
   driver.close();
		
		
		
}
	
}
