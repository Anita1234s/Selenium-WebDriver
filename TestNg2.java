package anitaseltest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg2 {

	@Test
	public void appLaunch()
	
	{
		System.out.println("app launch test");
		
		
	}
	
	@Test
	public void appLogin()
	
	{
		System.out.println("app login test");
		
		
	}
	
	@BeforeMethod
	
	public void beforeMethodTest()
	{
		System.out.println("before method test");
	}

	
    @AfterMethod
	
	public void afterMethodTest()
	{
		System.out.println("after method test");
	}
	
	
}
