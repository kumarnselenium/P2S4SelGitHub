package automationConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Changing
public class Parameterization {
	
	public void searchItemIE()
	{
		ExcelRead oSearchSht = new ExcelRead("C:\\Selenium\\Selenium Docs\\P2S4 Class Notes\\eBayTestData.xls", "eBaySearch");
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\LatestBrowsers\\chromedriver.exe");
		WebDriver oBrowser = new ChromeDriver();
		
		//2	launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3	Enter "Laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys(oSearchSht.getCellData("SearhFor", 1));
				
		//4	Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
	}
	
	@Test
	public void dataDrivenScenario()
	{
		ExcelRead oSearchSht = new ExcelRead("C:\\Selenium\\Selenium Docs\\P2S4 Class Notes\\eBayTestData.xls", "eBaySearch");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\LatestBrowsers\\chromedriver.exe");
		WebDriver oBrowser = new ChromeDriver();
		
		for(int iRow=1; iRow<oSearchSht.rowCount(); iRow++)
		{			
			//2	launch www.ebay.com
			oBrowser.get("https://www.ebay.com/");
			
			//3	Enter "Laptop" in search text box
			oBrowser.findElement(By.id("gh-ac")).clear();
			oBrowser.findElement(By.id("gh-ac")).sendKeys(oSearchSht.getCellData("SearhFor", iRow));
					
			//4	Click on Search button
			oBrowser.findElement(By.id("gh-btn")).click();
		}
	}

}
