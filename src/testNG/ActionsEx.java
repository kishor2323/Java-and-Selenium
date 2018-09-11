package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx {

	public static void main(String[] args) throws InterruptedException {

		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    	
	    	WebDriver driver=new ChromeDriver();
	    	
	    	driver.get("https://www.flipkart.com/");
	    	
	    	driver.manage().window().maximize();
	    	
	    	System.out.println("Page Title is : " +driver.getTitle());
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	    	
	        Actions a =new Actions(driver); 
	    	
	    /*	WebElement electronics=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/span"));
	    	
	    	a.moveToElement(electronics).build().perform();
	    	
	    	Thread.sleep(3000);
	    	
	    	WebElement oppo=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/ul/li/ul/li[1]/ul/li[6]/a"));
	    	
	    	a.moveToElement(oppo).click().build().perform();
	    	
	    	Thread.sleep(3000);
	    	
	    	WebElement phone=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[3]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div/div/a"));
	    	
	    	a.moveToElement(phone).click().build().perform();*/
	    	
	    	Thread.sleep(3000);
	        
	        WebElement electronics=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/span"));
	        
	        WebElement oppo=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/ul/li/ul/li[1]/ul/li[6]/a"));
	        
	        a.moveToElement(electronics).pause(3000).moveToElement(oppo).click().build().perform();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[3]/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div[1]/div/div/div/a")).click();
	        
	        Thread.sleep(3000);
	    	
	    	//driver.quit();
	    	
	  	  
	}

}
