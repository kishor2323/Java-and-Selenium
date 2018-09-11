package testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ReportNg {
	
	@Test
	
	public void First() {
		
		System.out.println("first reportng");
	}
	
    @Test
	
	public void second() {
		
		System.out.println("second reportng");
	}


    @Test

   public void third() {
	
    	Assert.fail();
	System.out.println(1/10);
   }


}



