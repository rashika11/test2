package caseStudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class caseStudy2 {
	
	WebDriver driver;
	
	// Open Browser
	@Test(priority = 0)
	public void browserSetup () {
	System.setProperty("webdriver.chrome.driver", "R:\\Learning Journey\\EDUREKA\\Test Analyst\\Selenium\\drivers\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
		
	//Get URL
	@Test(priority = 1)
	public void URL () {
	driver.get("https://www.flipkart.com/");
	}
	
	
	@Test(priority = 2)
	public void action () {
	//Close the Login Modal Screen
	driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();

	
	//Hover the Menu Electronics
	
	WebElement e = driver.findElement(By.xpath("//*[@class='_2M8cLY header-form-search']//following::div[39]"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(e).perform();
	
	
	//Click on Audio
	driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']")).click();
	
	
	/*
	 //span[@class="_2I9KP_"]
	//Hover the Menu Electronics and Click MI link
	
	WebElement ele = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[1]"));
	
	Actions actn = new Actions(driver);
	
	actn.moveToElement(ele).perform();*/
	
	
	//Get MI URL
	driver.get("https://www.flipkart.com/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi");
		
	// Searchfor“redmi go (black, 8 gb)”in the search bar
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("redmi go (black, 8 gb)");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).submit();
	
	//Switch to window
	driver.get("https://www.flipkart.com/redmi-go-black-8-gb/p/itmfeauu7ys4tkhb?pid=MOBFDZQHCJFYXZHX&lid=LSTMOBFDZQHCJFYXZHXOMENTR&marketplace=FLIPKART&q=redmi+go+%28black%2C+8+gb%29&store=tyy%2F4io&srno=s_1_1&otracker=AS_Query_OrganicAutoSuggest_4_14_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_4_14_na_na_na&fm=SEARCH&iid=5b3409c7-1623-4deb-a4e0-639333026bc4.MOBFDZQHCJFYXZHX.SEARCH&ppt=sp&ppn=sp&ssid=8l4e6xu20w0000001629591039266&qH=ec86b61bf79dce9b");	
	
	//Click on view details
	driver.findElement(By.xpath("//div[@class='_20cDxP']")).click();
	
	//Close view details Modal screen
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _1KAjNd']")).click();
	
	//Click on add to cart
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2uS5ZX _2Dfasx']")).click();
	
	
    //Kill the browser
	driver.quit();
	}
	
	}
	
