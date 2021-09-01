package module3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {

	public static void main(String[] args) throws InterruptedException {
	
		// Open Browser
		System.setProperty("webdriver.chrome.driver", "R:\\Learning Journey\\EDUREKA\\Test Analyst\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		// Get URL
		driver.get("https://www.linkedin.com/login");
		
		
		
		// Locator Techniques
		// ID Locator Techniques
		driver.findElement(By.id("username")).sendKeys("Rashika");
		Thread.sleep(2000);
		
		// Name Locator Techniques
		driver.findElement(By.name("session_password")).sendKeys("Ayzan");
		Thread.sleep(2000);
		
		// ClassName Locator Techniques
		driver.findElement(By.className("button__password-visibility")).click();
		Thread.sleep(2000);
		
		// LinkText Locator Techniques
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);
		
		//To come back to the login page
		driver.navigate().back();
		Thread.sleep(2000);
		
		// PartialLinkText Locator Techniques
		driver.findElement(By.partialLinkText("got password")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Rashika");
		Thread.sleep(2000);
		
		
		//css locator technique
		driver.findElement(By.cssSelector("input[id*=\"username\"]")).clear();
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
