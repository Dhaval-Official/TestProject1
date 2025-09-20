package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test(groups= {"sanity"})
	public void webLogin() {
		System.out.println("test to validate web login");	
	}
	
	@Test
	public void mobileLogin() {
		System.out.println("test to validate mobile login");	
	}
	
	@Test
	public void apiLogin() {
		System.out.println("test to validate api login");
	}
	
	@Test
	public void mobile_sso_Login() {
		System.out.println("test to validate mobile SSO login");	
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am before Suite");	
	}
	
	@AfterSuite
	public void afterallSuite() {
		System.out.println("I am after all Suite");	
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("I am before all Class here");	
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am after all Class");	
	}
	
	@BeforeMethod 
	public void beforMyyMethods() {
		System.out.println("I will be before everyone in my class------------------");	
	}
	
	@AfterMethod (alwaysRun=true)
	public void afterMyyMethods() {
		System.out.println("I will be After everyone in my class-------------------");	
	}
	
}


