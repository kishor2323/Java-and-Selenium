package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Secondprogram {
	
	public WebDriver driver;
	

    @BeforeMethod
    
    public void second() throws InterruptedException
    {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
    	driver=new ChromeDriver();
    	
    	driver.get("https://www.google.com");
    	
    	driver.manage().window().maximize();
    	
    	driver.findElement(By.id("lst-ib")).sendKeys("mercury tours", Keys.ENTER);
    	
    	driver.findElement(By.className("r")).click();
    	
    	        	
    }
    
    @AfterMethod
    
    public void closeapp() throws InterruptedException
    {
    	        	
    	//close the application
    	
    	Thread.sleep(3000);
    	
    	driver.close();
    }

    
    
    @Test(priority=1)
    public void username() {
    	
     System.out.println("Element is Existed " +driver.findElement(By.name("userName")).isDisplayed());
    	
    }
    
    @Test(priority=2)
    public void password() {
    	        	
    System.out.println("Element is Existed " +driver.findElement(By.name("password")).isDisplayed());
    	
    }
    
    @Test(priority=3)
    public void username1()
    {
    	driver.findElement(By.name("userName")).sendKeys("kishor");
    }
    
    @Test(priority=4)
    public void password2() {
    	        	
    driver.findElement(By.name("password")).sendKeys("kittu123");
    	
    }
    
    @Test(priority=5)
    public void ligin() {
    	        	
    driver.findElement(By.name("login")).click();
    	
    }
	
	

}
