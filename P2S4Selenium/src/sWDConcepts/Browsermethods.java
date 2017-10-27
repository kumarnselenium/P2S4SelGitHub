package sWDConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethods {

	@Test
	public void searchItem()
	{
		//1	Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\LatestBrowsers\\chromedriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
				
		
		oBrowser.manage().window().maximize();
		
		//2	launch www.ebay.com
		oBrowser.navigate().to("https://www.ebay.com/");
		
		System.out.println(oBrowser.getTitle());
		
		//3	Enter "Laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
				
		//4	Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
		
		oBrowser.navigate().back();
		
		oBrowser.navigate().forward();
		
		System.out.println(oBrowser.getCurrentUrl());
		
		System.out.println(oBrowser.getPageSource());
		
	//	oBrowser.close();
		
		oBrowser.quit();
		
		
	}
	
}
