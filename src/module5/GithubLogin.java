package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GithubLogin {


	
	WebDriver driver;
	
	
	@BeforeSuite
	public void browser() {

		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"R:\\Learning Journey\\EDUREKA\\Test Analyst\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@BeforeTest
	public void URL() {

		// Open the URL
		driver.get("http://github.com");

	}

	@BeforeClass
	public void clickSignInPage() throws Exception {

		// Click on a button
		driver.findElement(By.xpath("//*[@href='/login']")).click();

		Thread.sleep(3000);

	}

	@Test
	public void logIn() throws Exception {

		// Enter user Name
		driver.findElement(By.id("login_field")).sendKeys("rashika.z@outlook.com");

		// Enter password
		driver.findElement(By.id("password")).sendKeys("Australia110!");

		// Click on Login button
		driver.findElement(By.name("commit")).click();

		Thread.sleep(3000);

	}

	@AfterTest
	public void logOut() throws Exception {

		// Click the button to open the signout element
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']")).click();

		Thread.sleep(3000);

		// Click on Sign Out button
		driver.findElement(
				By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']//following::button[15]"))
				.click();

	}

	@AfterSuite
	public void shuttingDown() {
		// Quit the browser
		driver.quit();
	}
}

