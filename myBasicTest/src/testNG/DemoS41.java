package testNG;

import org.testng.annotations.Test;

public class DemoS41 {
	
	@Test
	public void S41_WebLogin() {
		System.out.println("This is Web Login");
	}
	
	@Test
	public void S41_APILogin() {
		System.out.println("This is API Login");
	}
	
	@Test
	public void S41_MobLogin() {			//this one need to be removed in S41
		System.out.println("This is Mob Login");
	}
}
