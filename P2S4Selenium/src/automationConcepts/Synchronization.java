package automationConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	WebDriver oBrowser ;
	
	public void exForImplicitWait()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		WebDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php");
		
		oBrowser.manage().window().maximize();
		oBrowser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		oBrowser.findElement(By.id("Loan_Amount123")).clear();
		oBrowser.findElement(By.id("Loan_Amount")).sendKeys("5000");
	}

	public void exForExplicitWaitThreadSleep() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		WebDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php");
		
		oBrowser.manage().window().maximize();
		oBrowser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		oBrowser.findElement(By.id("Fileupload")).click();
		
		Thread.sleep(60000);
		
		Assert.assertTrue("Fail, File is not successfully uploaded", oBrowser.findElements(By.xpath("//h1[contains(.,'thanks for uploading')]")).size()>0);
		System.out.println("Pass, File is successfully uploaded");
		
	}

	@Test
	public void exForExplicitWaitWDW() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		WebDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php");
		
		oBrowser.manage().window().maximize();
		oBrowser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		oBrowser.findElement(By.id("Fileupload")).click();
		
		WebDriverWait oWDW = new WebDriverWait(oBrowser, 60);
		oWDW.until(ExpectedConditions.elementToBeClickable(oBrowser.findElement(By.xpath("//h1[contains(.,'thanks for uploading')]"))));
		
		Assert.assertTrue("Fail, File is not successfully uploaded", oBrowser.findElements(By.xpath("//h1[contains(.,'thanks for uploading')]")).size()>0);
		System.out.println("Pass, File is successfully uploaded");
		
	}
}
