package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryFrameLak {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://jqueryui.com/");
    	
    	driver.manage().window().maximize();
    	
    	System.out.println("Page Title is : " +driver.getTitle());
    	
    	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[2]/a")).click();;
    	
    	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
    	
    	driver.findElement(By.id("tags")).sendKeys("kishor");
    	
    	driver.switchTo().defaultContent();
    	
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();;
    	
    	
    	Thread.sleep(3000);
    	
    	driver.close();

	}

}
