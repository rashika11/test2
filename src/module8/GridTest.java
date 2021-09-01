package module8;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridTest {

	WebDriver driver;

	@Parameters("System")
	@Test(priority = 0)
	public void Nodes(String device) throws Exception {

		if (device.equalsIgnoreCase("Node1")) {
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(new URL("http://192.168.1.102:5757/wd/hub"), cap);

		} else if (device.equalsIgnoreCase("Node2")) {
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://192.168.1.102:22601/wd/hub"), cap);
		}
	}

	@Test(priority = 1, dependsOnMethods = "Nodes")
	public void OpenAUT() throws Exception {
		
		Thread.sleep(5000);
		
		// Open the AUT
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.xpath("//*[@aria-label='dismiss-this-banner']")).click();
	}

	
	@Test(priority = 2, dependsOnMethods = "OpenAUT")
	public void Validate() {
		// Capture the Heading of the Page
		String actualHeading = driver.findElement(By.tagName("h1")).getText();
		System.out.println(actualHeading);

		String expectedHeading = "Selenium automates browsers. That's it!";
		
		// validate the actual title VS Expected Title
		boolean headingMatchResults = actualHeading.equals(expectedHeading);

		System.out.println("Heading Match Results are: " + headingMatchResults);
	
	}

}