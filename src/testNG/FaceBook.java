package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBook {
	
	public WebDriver driver;
	
	
	@BeforeMethod
	
	public void openfacebook()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	
	public void closefacebook() throws InterruptedException
	
	{
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
	@Test
	public void title() {
		
		System.out.println("Page Title is : "+driver.getTitle());
	}
	
	@Test
	public void username() {
		
		driver.findElement(By.name("firstname")).sendKeys("krishna");
	}
	
	@Test
	public void username2() {
		
		driver.findElement(By.name("firstname")).sendKeys("krishna");
		
		driver.findElement(By.name("lastname")).sendKeys("kishor");
	}
	
	@Test
	public void email() {
		
		driver.findElement(By.name("firstname")).sendKeys("krishna");
		
		driver.findElement(By.name("lastname")).sendKeys("kishor");
		
		driver.findElement(By.name("reg_email__")).sendKeys("kitkat.239@gmail.com");
		
	}
	
	@Test
	public void emailconfirm() {
		
		driver.findElement(By.name("firstname")).sendKeys("krishna");
		
		driver.findElement(By.name("lastname")).sendKeys("kishor");
		
		driver.findElement(By.name("reg_email__")).sendKeys("kitkat.239@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kitkat.239@gmail.com");
	}
	
	@Test
	public void password() {
		
		driver.findElement(By.name("firstname")).sendKeys("krishna");
		
		driver.findElement(By.name("lastname")).sendKeys("kishor");
		
		driver.findElement(By.name("reg_email__")).sendKeys("kitkat.239@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kitkat.239@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("kittu786");
		
	}
	
	@Test
	public void birthday() {
		
		driver.findElement(By.name("firstname")).sendKeys("krishna");
		
		driver.findElement(By.name("lastname")).sendKeys("kishor");
		
		driver.findElement(By.name("reg_email__")).sendKeys("kitkat.239@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kitkat.239@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("kittu786");
		
		Select s=new Select(driver.findElement(By.id("day")));
		
		s.selectByVisibleText("17");
		
		Select s1=new Select(driver.findElement(By.id("month")));
		
		s1.selectByVisibleText("May");
		
		Select s2=new Select(driver.findElement(By.id("year")));
		
		s2.selectByVisibleText("1988");
		
	}
	
	@Test
	public void gender() {
		
		driver.findElement(By.name("firstname")).sendKeys("krishna");
		
		driver.findElement(By.name("lastname")).sendKeys("kishor");
		
		driver.findElement(By.name("reg_email__")).sendKeys("kitkat.239@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kitkat.239@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("kittu786");
		
		Select s=new Select(driver.findElement(By.id("day")));
		
		s.selectByVisibleText("17");
		
		Select s1=new Select(driver.findElement(By.id("month")));
		
		s1.selectByVisibleText("May");
		
		Select s2=new Select(driver.findElement(By.id("year")));
		
		s2.selectByVisibleText("1988");
		
		List<WebElement> l=driver.findElements(By.name("sex"));
		
		l.get(1).click();
		
	}
	
	@Test
	public void signup() {
		
		driver.findElement(By.name("firstname")).sendKeys("krishna");
		
		driver.findElement(By.name("lastname")).sendKeys("kishor");
		
		driver.findElement(By.name("reg_email__")).sendKeys("kitkat.239@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kitkat.239@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("kittu786");
		
		Select s=new Select(driver.findElement(By.id("day")));
		
		s.selectByVisibleText("17");
		
		Select s1=new Select(driver.findElement(By.id("month")));
		
		s1.selectByVisibleText("May");
		
		Select s2=new Select(driver.findElement(By.id("year")));
		
		s2.selectByVisibleText("1988");
		
		List<WebElement> l=driver.findElements(By.name("sex"));
		
		l.get(1).click();
		
		driver.findElement(By.id("u_0_11")).click();
		
	}
	
	

}




























