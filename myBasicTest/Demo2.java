package testNG;

import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	public void webLogin() {
		System.out.println("test to validate web login");	 
	}
	
	@Test(groups= {"sanity","smoke"}) 
	public void mobileLogin() {
		System.out.println("test to validate mobile login");	
	}
	
	@Test
	public void apiLogin() {
		System.out.println("test to validate api login");
	}
	
	@Test(groups= {"sanity"}) 
	public void mobile_sso_Login() {
		System.out.println("test to validate mobile SSO login");	
	}
	
}
