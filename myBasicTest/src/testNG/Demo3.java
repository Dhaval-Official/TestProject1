package testNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listenerz.class) 	//-- for Solo Listening
public class Demo3 {
	
	@Test
	public void webLogin() {
		System.out.println("test web login");	 
	}
	
	@Test 
	public void mobileLogin() {
		System.out.println("test mobile login");	
	}
	
	@Test
	public void apiLogin() {
		System.out.println("test api login");
		Assert.assertTrue(false);
	}
	
	@Test
	public void mobile_sso_Login() {
		System.out.println("test mobile SSO login");	
	}
	
}
