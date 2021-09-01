package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args) {

		//Open the browser
		System.setProperty("webdriver.chrome.driver","R:\\Learning Journey\\EDUREKA\\Test Analyst\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		//Open the URL
		driver.get("https://www.linkedin.com/login?");
		
		//Click and Type text
		driver.findElement(By.id("username")).sendKeys("Rashika");
		
		//Quit
		driver.quit();
		
 }
}
