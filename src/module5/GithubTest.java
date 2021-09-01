package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubTest {


	public static void main(String[] args) throws InterruptedException {

		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"R:\\Learning Journey\\EDUREKA\\Test Analyst\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open the URL
		driver.get("http://github.com");

		// Click on a button
		driver.findElement(By.xpath("//*[@href='/login']")).click();

		Thread.sleep(3000);


		// Enter user Name
		driver.findElement(By.id("login_field")).sendKeys("rashika.z@outlook.com");

		// Enter password
		driver.findElement(By.id("password")).sendKeys("Australia110!");

		// Click on Login button
		driver.findElement(By.name("commit")).click();

		Thread.sleep(3000);
		
		// Click the button to open the signout element
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']")).click();

		Thread.sleep(3000);

		// Click on Sign Out button
		driver.findElement(
				By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']//following::button[15]"))
				.click();

		// Quit the browser
		driver.quit();
	}
}

	