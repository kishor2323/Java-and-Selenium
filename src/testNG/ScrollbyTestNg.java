package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollbyTestNg {
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void startingapp() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.flipkart.com/");
    	System.out.println("Page Title is : " +driver.getTitle());
    	 
    	driver.manage().window().maximize();
    	
    	
    	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
    	
    
    	
		
	}
	
	@AfterMethod
	
	public void closeapp() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	@Test
	
	public void srolldown() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		for (int i=0; i<=20; i++)
		{
			
			((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)","");
			
			Thread.sleep(2000);
		}
		for (int i=0; i<=20; i++)
		{
			((RemoteWebDriver)driver).executeScript("window.scrollBy(0,-200)","");
			
			Thread.sleep(2000);
		}
	}
}
	
	