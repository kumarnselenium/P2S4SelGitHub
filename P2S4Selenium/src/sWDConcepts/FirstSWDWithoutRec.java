package sWDConcepts;

import org.junit.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;

public class FirstSWDWithoutRec {

	WebDriver oBrowser;
	
	public void openBrowser(String sBrowserType, String sURL)
	{
			if(sBrowserType.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Downloads/chromedriver");
				oBrowser = new ChromeDriver();
			}
			else if(sBrowserType.equals("Firefox"))
			{
				//System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\LatestBrowsers\\geckodriver.exe");
				oBrowser = new FirefoxDriver();				
			}
			else if(sBrowserType.equals("IE"))
			{
				//System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\LatestBrowsers\\IEDriverServer.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			//	oBrowser = new InternetExplorerDriver(capabilities);						
			}
			else if(sBrowserType.equals("HTMLUnitDriver"))
			{
			//	oBrowser = new WebDriver();				
			}
				
			oBrowser.get(sURL);
			
			oBrowser.manage().window().maximize();
				
	}
	
	@Test
	public void searchItemChrome()
	{
		//1	Open Chrome Browser
		openBrowser("Chrome", "https://www.ebay.com/");
		
		//3	Enter "Laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
				
		//4	Click on Search button
		oBrowser.findElement(By.xpath("//input[@value='Search']")).click();
	}
	
	public void searchItemIE()
	{
		openBrowser("IE", "https://www.ebay.com/");
		
		//2	launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3	Enter "Laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
				
		//4	Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
	}

	public void searchItemFirefox()
	{
		//1	Open Chrome Browser
		openBrowser("Firefox", "https://www.ebay.com/");
		
		//2	launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3	Enter "Laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
				
		//4	Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
	}
	
	public void searchItemHTMLUnitDr()
	{
		//1	Open Chrome Browser
		//System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\LatestBrowsers\\geckodriver.exe");
		openBrowser("HTMLUnit", "https://www.ebay.com/");
		
		System.out.print(oBrowser.getTitle());
		
		//3	Enter "Laptop" in search text box
		//oBrowser.findElement(By.id("gh-ac")).clear();
		//oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
				
		//4	Click on Search button
		//oBrowser.findElement(By.id("gh-btn")).click();
		
		
	}
	
	
}




