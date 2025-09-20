package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Demo4 {			//for ReRunFails

	@AfterSuite
	public void webLogin() {
		System.out.println("Case after Whole Suite");	 
	}
	
	@Test
	public void last() {
		System.out.println("my last test method");	
	}
	
	@Test
	public void last2() {
		System.out.println("just another case");	
	}
	
	@Test(priority=0, enabled=true, retryAnalyzer = testNG.ReRunFails.class)
	public void display() {
		System.out.println("test to Display");
		Assert.assertEquals("he","hi");
	}
	
}
