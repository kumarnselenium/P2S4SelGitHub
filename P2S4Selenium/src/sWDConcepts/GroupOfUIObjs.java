package sWDConcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupOfUIObjs {

	public void getPopularDeals()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\LatestBrowsers\\chromedriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
				
		oBrowser.get("https://www.redflagdeals.com/");
		
		List<WebElement> uiAllPopularDeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
		
		int iTotalNOfDeals = uiAllPopularDeals.size();
		
		System.out.println("Total Nof deals " + iTotalNOfDeals);
		
		for(int i=0; i<iTotalNOfDeals; i++)
		{
			System.out.println(uiAllPopularDeals.get(i).getText());
		}
	}
	
	public void getPopularDealsForEach()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\LatestBrowsers\\chromedriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
				
		oBrowser.get("https://www.redflagdeals.com/");
		
		List<WebElement> uiAllPopularDeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
				
		for(WebElement uiEachDeal:uiAllPopularDeals)
		{
			System.out.println(uiEachDeal.getText());
		}
	}
	
	public void getPopularDealsEriteToNotepad() throws FileNotFoundException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\LatestBrowsers\\chromedriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
				
		oBrowser.get("https://www.redflagdeals.com/");
		
		List<WebElement> uiAllPopularDeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
			
		//Create Empty file
		File oFile =new File("C:\\Selenium\\Selenium Docs\\P2S4 Class Notes\\RedFlagDeals.txt");
		
		//Write 
		PrintWriter oPWS = new PrintWriter(oFile);
		
		for(WebElement uiEachDeal:uiAllPopularDeals)
		{
			oPWS.println(uiEachDeal.getText());
		}
		
		//Save
		oPWS.flush();
		
		//Close
		oPWS.close();
		
	}

	@Test
	public void handleAllCheckBoxes()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\LatestBrowsers\\chromedriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
				
		oBrowser.get("https://www.ebay.com/sch/ebayadvsearch");
		
		List<WebElement> uiAllCheckBoxes = oBrowser.findElements(By.xpath("//input[@type='checkbox']"));
		
		//List<WebElement> uiAlltextBoxes = oBrowser.findElements(By.xpath("//input[@type='text']"));
		
		//List<WebElement> uiAllListBoxes = oBrowser.findElements(By.tagName("select"));
		
		int iTotalNOfCheckBoxes = uiAllCheckBoxes.size();
		
		System.out.println("Total Nof deals " + iTotalNOfCheckBoxes);
		
		for(int i=0; i<iTotalNOfCheckBoxes; i++)
		{
			if(!(uiAllCheckBoxes.get(i).isSelected()))
			{
				uiAllCheckBoxes.get(i).click();
			}
		}
	}

}



