package myBasicTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class MyFirstTest {

	public static void main(String[] args) {
		
//		ChromeDriver driver1 = new ChromeDriver();
//		FirefoxDriver driver2 = new FirefoxDriver();

		
//Traditional way: Call Chromedriver.exe to navigate with chrome browser
//DisAdvantage if Chrome version changes need to update the driver
		
//		System.setProperty("Webdriver.chrome.driver", "//home//dhaval");
//		WebDriver driver3 = new ChromeDriver();
		
//New Way: After Sele 4.6 No need to match driver & Browser versions
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://google.com/");
		
//		WebDriver driver4 = new FirefoxDriver();
//		driver4.get("https://codenbox.com/");
		
		
		
		
	}
	
}