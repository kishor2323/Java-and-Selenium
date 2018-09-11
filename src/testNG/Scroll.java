package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.flipkart.com");
    	
    	driver.manage().window().maximize();
    	
    	System.out.println("Page Title is : " +driver.getTitle());
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
    	
    	for(int i=0;i<=20;i++)
    	{
    		
    		((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)","");
    		
    		//Thread.sleep(2000);
    		
    	}
    	
    	Thread.sleep(2000);
    	
    	for(int i=0;i<=20;i++)
    	{
    		
    		((RemoteWebDriver)driver).executeScript("window.scrollBy(0,-200)","");
    		
    		//Thread.sleep(2000);
    		
    	}
    	
    	Thread.sleep(3000);
    	
    	driver.close();

	}

}
