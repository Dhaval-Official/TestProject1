package myBasicTest;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UIAdvanceTesting {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//S24: Cookies
/*		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Get all cookies
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
	
		for(Cookie cookie: allCookies) {
			System.out.println(cookie.getName() + "\t" +cookie.getValue() + "\t" + cookie.getPath() + "\t" + cookie.getDomain());	
		}
		driver.manage().deleteAllCookies();
		
		Set<Cookie> allCookiesAfterDelete = driver.manage().getCookies();
		System.out.println(allCookiesAfterDelete.size());
*/		
		
		//S25: Broken Links
/*		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/");
		driver.manage().deleteAllCookies();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for(WebElement link :allLinks) {
			
			String url = link.getAttribute("href");
			
			//verify if URL is empty 
			if(url == null || url.isEmpty()) {
				System.out.println("url is empty");
				continue;
			}			
			//if it's not empty check url is broken or invalid
			try {
				
				HttpURLConnection urlRequest = (HttpURLConnection)(new URL(url).openConnection());
				urlRequest.connect();	//connects to server
				if(urlRequest.getResponseCode() >= 400) {
					System.out.println(url + " is Broken");
				} else {
					System.out.println(url + " is valid");
				}
				
			} catch(IOException e) {
				System.out.println(url + " is Invalid");
				e.printStackTrace();
			}
			
		}
*/		
		
		//S27: Downloads
/*		
		//setting chrome options to enable download prompts & specify locations
		//initializing chrome options
		ChromeOptions option = new  ChromeOptions();
		
		HashMap<String, Object> hm = new HashMap<>();
		
		//getting user directory
		String dfilePath = System.getProperty("user.dir");
		System.out.println(dfilePath);
		
		hm.put("profile.default_content_settings.popups", 0);
		hm.put("download.default_directory", dfilePath);
		
		option.setExperimentalOption("prefs", hm);
		
		//checking if file already exists
		File downloadDir = new File(dfilePath);
		File[] downloadedFiles = downloadDir.listFiles();
		if(downloadedFiles!=null) {
			for(File file : downloadedFiles) {
				if(file.getName().startsWith("APKFiles")) {
					file.delete();
					System.out.println("Deleted old Files "+file.getName());
				}
			}
		}
		
		
		WebDriver driver2 = new ChromeDriver(option);
		driver2.manage().window().maximize();
		driver2.get("https://codenboxautomationlab.com/practice/");
			
		driver2.findElement(By.linkText("Download Apk files")).click();
		Thread.sleep(40000);
		
		File downloadedFile = new File(dfilePath+"/APKFiles-1.zip");
		if(downloadedFile.exists()) {
			System.out.println("Downloaded Successfully");
		} else {
			System.out.println("Didn't Downloaded Successfully");
		}
*/		
		
		//S28: Certification Issues
		//Normal Scenario
		driver.manage().window().maximize();
		driver.get("https://self-signed.badssl.com");
		
		System.out.println(driver.getTitle());
		
		ChromeOptions option = new  ChromeOptions();
		option.setAcceptInsecureCerts(true);
		WebDriver driver2 = new ChromeDriver(option);
		driver2.manage().window().maximize();
		driver2.get("https://self-signed.badssl.com");
		Thread.sleep(5000);
		System.out.println(driver2.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
		
		System.out.println("Done");
	}
}
