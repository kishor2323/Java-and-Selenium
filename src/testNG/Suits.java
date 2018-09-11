package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suits {

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("welcome to BeforeSUITE");
	}

	@Test
	public void testclass()
	{
		System.out.println("declaring before suite");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("welcome to AfterSUITE");
	}
	

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("welcome to BeforeCLASS");
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println("welcome to AfterCLASS");
	}
	
	

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("welcome to BeforeMETHOD");
	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("welcome to AfterMETHOD");
	}
	
}
