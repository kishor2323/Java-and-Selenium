package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://telangana.gov.in");
    	
    	driver.manage().window().maximize();
    	
    	System.out.println("Page Title is : " +driver.getTitle());
    	
    	//Row Count
    	
    	List<WebElement> Rowcnt=driver.findElements(By.xpath("//*[@id=\"GoTProfile\"]/tbody/tr"));
    	
    	System.out.println("Row count is : " +Rowcnt.size());
    	
    	//Column Count
    	
        List<WebElement> Colcnt=driver.findElements(By.xpath("//*[@id=\"GoTProfile\"]/tbody/tr[1]/td"));
    	
    	System.out.println("Column count is : " +Colcnt.size());
    	
    	String data;
    	
    	//Table Data
    	
    	for (int i=1; i<=Rowcnt.size(); i++)
    	{
    		for (int j=1; j<=Colcnt.size(); j++)
    		{
    			
    			data=driver.findElement(By.xpath("//*[@id=\"GoTProfile\"]/tbody/tr[" +i+ "]/td["+j+"]")).getText();
    			System.out.println("Row Count is : " +i+ ",  Column Count is : "+j+ "Table Data is " +data);
    		}
    	}
    	
    	Thread.sleep(3000);
    	
    	driver.close();
		
		

	}

}
