package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserProgram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		Thread.sleep(5000);
		
		System.out.println("WelCome To Chrome Driver");
		
		driver.close();
		
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\system8\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver1 = new FirefoxDriver();
		
		Thread.sleep(5000);
		
		driver.get("http://rrbsecunderabad.nic.in/");
		
		Thread.sleep(5000);
		
	    System.out.println("WelCome To Gecko Driver");
		
		driver.close();
		
	    System.setProperty("webdriver.ie.driver", "C:\\Users\\system8\\Downloads\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			
	    WebDriver driver2 = new InternetExplorerDriver();
			
		Thread.sleep(5000);
			
		driver.switchTo().alert().dismiss();
			
		driver.get("http://www.rrbkolkata.gov.in/");
						
		Thread.sleep(5000);
		
		System.out.println("WelCome To IE Driver");
			
		driver.close();


	}

}
