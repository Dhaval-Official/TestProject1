package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoreAnnotations {
	
	//here test1 is dependent on test2 
	
	@Test(priority =0, alwaysRun=true)
	public void test1() {
		System.out.println("I am dependent on 1st");	
	}
	
	@Test(priority = -1, enabled=false)
	public void test2() {
		System.out.println("I am 1st ");
		Assert.assertEquals("Hi", "Ho");
		
	}
	 
	@Test 
	public void test3() {
		System.out.println("I will run any ways");	
	}
	
	
	
}
