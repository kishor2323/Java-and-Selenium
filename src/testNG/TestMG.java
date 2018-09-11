package testNG;
import org.testng.annotations.Test;


public class TestMG {

	
		
		@Test(priority=4,groups= {"sanity"})
		public void testA() {
			
			System.out.println("welcome to testNG");
			
			
			}
		
		
		@Test(priority=3,groups= {"smoke"})
		public void testK() {
			
			System.out.println("welcome to test");
			
			
			}
		
		@Test(priority=5)
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
		
		
		
		
		@Test(priority=8,groups= {"sanity"})
		public void testL() {
			
			System.out.println("welcome to gmail");
		}
		
		
	
		
	}



