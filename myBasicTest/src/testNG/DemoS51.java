package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoS51 {
	
	@Parameters({"Baseurl","Username", "SubURL"})
	@Test
	public void search(String URL, String name, String url2) {
		System.out.println("Helloooo");
		System.out.println(URL+" "+name+" "+url2);	
	}
	
}
