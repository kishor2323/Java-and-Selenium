package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg {

	
	@Test(priority=4,groups= {"sanity"})
	public void testA() {
		
		System.out.println("welcome to testNG");
		
		
		}
	
	
	@Test(priority=3,groups= {"smoke"})
	public void testK() {
		
		System.out.println("welcome to test");
		
		
		}
	
	@Test(priority=5,invocationCount=4)
	public void testB() {
		
		System.out.println("welcome to testN");
		
		
		}
	
	
	@Test(priority=2,enabled=false)
	public void testC() {
		
		System.out.println("welcome to testNGg");
		
		
		}
	
	@Test(priority=1,description="welcome kishor",groups= {"smoke"})
	public void testD() {
		
		System.out.println("welcome to testNfG");
	}
	
	@Test(priority=6)
	public void testM() {
		
		Assert.fail();
		
		System.out.println("welcome to login");
		
		
		}
	
	@Test(priority=7,dependsOnMethods= {"testM"})
	public void testN() {
		
		System.out.println("welcome to logout");
	}
	
	
	@Test(priority=8,groups= {"sanity"})
	public void testL() {
		
		System.out.println("welcome to gmail");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test(dataProvider="add")
	{
		int a=10;
		int b=20;
				
		int c;
		
		System.out.println("value of c="+c);
		
		
		
		}*/
	
}
