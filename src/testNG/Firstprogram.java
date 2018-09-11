package testNG;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Firstprogram {
	
	public WebDriver driver;
	

        @BeforeMethod
        
        public void first() throws InterruptedException
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
        public void signon()
        {
        	driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
        }
        
        @Test(priority=2)
        public void register() {
        	
        	driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
        	
        }
        
        @Test(priority=3)
        public void support()
        {
        	driver.findElement(By.xpath("//a[text()='SUPPORT']")).click();
        }
        
        @Test(priority=4)
        public void contact() {
        	
        	driver.findElement(By.xpath("//a[text()='CONTACT']")).click();
        	
        }
        
       
        @Test(priority=5)
        public void home()
        {
        	driver.findElement(By.xpath("//a[text()='Home']")).click();
        }
        
        @Test(priority=6)
        public void flights() {
        	
        	driver.findElement(By.xpath("//a[text()='Flights']")).click();
        	
        }
        
        @Test(priority=7)
        public void hotels()
        {
        	driver.findElement(By.xpath("//a[text()='Hotels']")).click();
        }
        
        @Test(priority=8)
        public void carrentals() {
        	
        	driver.findElement(By.xpath("//a[text()='Car Rentals']")).click();
        	
        }
   
        
        @Test(priority=9)
        public void cruises() {
        	
        	driver.findElement(By.xpath("//a[text()='Cruises']")).click();
        	
        }
        
        @Test(priority=10)
        public void destinations()
        {
        	driver.findElement(By.xpath("//a[text()='Destinations']")).click();
        }
        
        @Test(priority=11)
        public void vacations() {
        	
        	driver.findElement(By.xpath("//a[text()='Vacations']")).click();
        	
        }
        
        
       
        
}




































