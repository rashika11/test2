package module11.actions;

import org.openqa.selenium.By;

import module11.utilities.BaseClass;

public class ActionKeywords extends BaseClass {

	public static void openbrowser() {
		openBrowser("Chrome");
	}

	public static void navigation() {
		openUrl("https://www.google.com");
	}

	public static void ClickGmail() throws Exception {
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
	}
	
	public static void Quit() {
		
		driver.quit();
	}
}
