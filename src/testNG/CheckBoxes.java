package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("http://newtours.demoaut.com/mercuryreservation.php");
    	
    	driver.manage().window().maximize();
    	
    	System.out.println("Page Title is : " +driver.getTitle());
    	
    	driver.findElement(By.linkText("REGISTER")).click();
    	
    	driver.findElement(By.id("email")).sendKeys("kihsor",Keys.TAB,"kittu123",Keys.TAB,"kittu123",Keys.ENTER);
    	
    	List<WebElement> l=driver.findElements(By.tagName("input"));
    	
    	System.out.println("Total Radio Buttons are : "+l.size());
    	
    	l.get(2).click();
    	
    	Thread.sleep(3000);
    	
    	driver.close();
    	
		

	}

}
