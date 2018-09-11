package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) throws InterruptedException {
		

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("http://google.com");
    	
    	driver.manage().window().maximize();
    	
    	System.out.println("Page Title is : " +driver.getTitle());
    	
    	driver.findElement(By.id("lst-ib")).sendKeys(Keys.SHIFT, "kishor");
    	
    	Thread.sleep(3000);
    	
    	driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER);
    	
    	//Thread.sleep(3000);
    	
    	//driver.findElement(By.id("lst-ib")).clear();
    	
    	List<WebElement> l=driver.findElements(By.xpath("//a"));
    	
    	System.out.println("links size is : "+l.size());
    	
    	for(int i=0; i<l.size(); i++)
    	{
    		System.out.println("All Links are : " +l.get(i).getText());
    	}
    	
    	
    	Thread.sleep(3000);
    	
    	driver.close();


		

	}

}
