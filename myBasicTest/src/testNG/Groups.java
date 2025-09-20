package testNG;

import org.testng.annotations.Test;

@Test(groups = "regression")
public class Groups {
	
	@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("I am Test 1");	
	}
	
	@Test(groups= {"sanity","smoke"}) 
	public void test2() {
		System.out.println("I am Test 2");	
	}
	
	@Test(groups= {"smoke"})
	public void test3() {
		System.out.println("I am Test 3");	
	}
	
	@Test(groups= {"smoke"})
	public void test4() {
		System.out.println("I am Test 4");	
	}
	
	@Test(groups= {"windows.regression"})
	public void test5() {
		System.out.println("I am Test 5");	
	}
	
	@Test(groups= {"ios.regression"})
	public void test6() {
		System.out.println("I am Test 6");	
	}
	
}
