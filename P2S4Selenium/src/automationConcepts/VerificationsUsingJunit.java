package automationConcepts;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class VerificationsUsingJunit {

	//Dynamic verification

	WebDriver oBrowser=null;
	
	public void launchApplication(String sBrowserType, String sURL)
	{
		
		if(sBrowserType.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
			oBrowser = new ChromeDriver();
		}
		else if(sBrowserType.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\FFGeckoDriver.exe");
			oBrowser = new FirefoxDriver();
		}
		oBrowser.get(sURL);
		
		oBrowser.manage().window().maximize();
	}

	@Test
	public void exForverifications()
	{
		launchApplication("Chrome", "http://www.deal4loans.com/Contents_Calculators.php");
		
		try{
			Assert.assertTrue("Fail, EMI Calculator Page is not successfully loaded", oBrowser.findElement(By.xpath("//h1[contains(.,'EMI Calculator')]")).isDisplayed());
			System.out.println("Pass, EMI Calculator Page successfully loaded");		
		}catch(Exception e)
		{
			System.out.println("Fail, EMI Calculator Page is not successfully loaded");
		}
		
		Assert.assertTrue("Fail, EMI Calculator Page is not successfully loaded", oBrowser.findElements(By.xpath("//h1[contains(.,'EMI Calculator')]")).size()>0);
		System.out.println("Pass, EMI Calculator Page successfully loaded");
		
		oBrowser.findElement(By.id("Loan_Amount")).clear();
		oBrowser.findElement(By.id("Loan_Amount")).sendKeys("5000");
		
		oBrowser.findElement(By.name("rate")).click();
		
		String sExpectedLAText = "Five thousand";
		String sActualLAText = oBrowser.findElement(By.id("wordloanAmount")).getText();
		sExpectedLAText = sExpectedLAText.toLowerCase();
		sActualLAText = sActualLAText.toLowerCase();
		
		Assert.assertTrue("Fail, LA text is not displayed as expected", sActualLAText.contains(sExpectedLAText));
		System.out.println("Pass, LA text displayed as expected");
				
		oBrowser.findElement(By.name("rate")).clear();
		oBrowser.findElement(By.name("rate")).sendKeys("5");
		
		oBrowser.findElement(By.name("months")).clear();
		oBrowser.findElement(By.name("months")).sendKeys("20");
		
		oBrowser.findElement(By.xpath("//input[@value='Calculate']")).click();
				
		String sExpectedCalcEMI = "261.08";
		String sActualCalcEMI = oBrowser.findElement(By.name("pay")).getAttribute("value");
		
		Assert.assertTrue("Fail, Calculated EMI is not as expected", sExpectedCalcEMI.equals(sActualCalcEMI));
		System.out.println("Pass, Calculated EMI is as expected");
		
		
	}
	
	
}


































