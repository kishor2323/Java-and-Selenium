package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleOfDropDown {

	public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("http://newtours.demoaut.com/mercuryregister.php");
    	
    	driver.manage().window().maximize();
    	
    	System.out.println("Page Title is : " +driver.getTitle());
    	
    	Select s=new Select(driver.findElement(By.name("country")));
    	
    	s.selectByVisibleText("INDIA");
    	
    	List<WebElement> l=s.getOptions();
    	
    	System.out.println("no.of countries are : " +l.size());
    	
    	for(int i=0; i<l.size(); i++)
    	{
    		System.out.println("All Items are "+l.get(i).getText());
    		
    	}
    	
    	Thread.sleep(3000);
    	
    	driver.close();
    	
    	

	}

}
