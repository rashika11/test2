package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) {
		
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver","R:\\Learning Journey\\EDUREKA\\Test Analyst\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		//Element Handling
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).sendKeys("Rashika");
		
		//Get Commands
		driver.get("URL");
		
	}
	
}


