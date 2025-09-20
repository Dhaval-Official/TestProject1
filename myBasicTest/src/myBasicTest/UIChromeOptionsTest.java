package myBasicTest;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIChromeOptionsTest {
public static void main(String[] args) throws InterruptedException {
		
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//S26->S33						
		//S26: Downloads
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
		
		//S27: Certification Issues
		//Normal Scenario
/*		driver.manage().window().maximize();
		driver.get("https://self-signed.badssl.com");
		
		System.out.println(driver.getTitle());
		
		//Controlled scenario
		ChromeOptions option = new  ChromeOptions();
		option.setAcceptInsecureCerts(true);				//Expecting scenario
		WebDriver driver2 = new ChromeDriver(option);		//adding Expecting scenario in driver
		driver2.manage().window().maximize();
		driver2.get("https://self-signed.badssl.com");

		System.out.println(driver2.getTitle());
*/		
		
		//S28:	isDisplayed, isEnabled, isSelected
/*		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/practice/");
		
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		WebElement showBtn = driver.findElement(By.id("show-textbox"));
		WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
		
		System.out.println("text box is "+textBox.isDisplayed());
		
		hideBtn.click();
		System.out.println("text box is "+textBox.isDisplayed());
		
		showBtn.click();
		System.out.println("text box is "+textBox.isDisplayed());
		
		//isEnabled
		WebElement textBox2 = driver.findElement(By.id("enabled-example-input"));
		WebElement disableBtn = driver.findElement(By.id("disabled-button"));
		WebElement enableBtn = driver.findElement(By.id("enabled-button"));
		
		System.out.println(textBox2.isEnabled());
		disableBtn.click();
		Thread.sleep(3000);
		System.out.println(textBox2.isEnabled());
		enableBtn.click();
		Thread.sleep(3000);
		System.out.println(textBox2.isEnabled());
		
		//isSelected
		WebElement rd1 = driver.findElement(By.xpath("//input[@value='radio1']"));
		System.out.println("Radio Btn");
		System.out.println(rd1.isSelected());
		rd1.click();
		System.out.println(rd1.isSelected());
*/		
		
		//S29: Waits
/*		driver.manage().window().maximize();
		
		//Implicit wait 
		//this applies to all findElement Methods 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		//this applies to loading page
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		//this apples to script internal waits
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		
		driver.get("https://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("codenbox"+Keys.ENTER);	
			
		//Explicit Waits 
		//~ VerifyObjectPresent in SAFAL
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Codenbox – IT Solution & Services']")));
		link.click();
			
		//Fluent Wait 
		//~ VerifyObjectPresent in SAFAL with internal loops so that no need to check every milisecond
		//Max time for web driver to wait for a condition ~ checks Element in intervals for time till it is present
		Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))							//total max wait time
				.pollingEvery(Duration.ofSeconds(5))							//gap of wait time to check for i.e. here total 2 times will be checked at gaps of t seconds
				.ignoring(NoSuchElementException.class);
		
		fluent.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Codenbox – IT Solution & Services']")));
*/
/*		
		//S30: Booking Calendar Date 
		//S30 & S31 are connected	
		driver.get("https://codenboxautomationlab.com/about/booking/");
		driver.manage().window().maximize();

//		Thread.sleep(3000);
		
		//Selecting a future month & Year
		String bookingMonth= driver.findElement(By.cssSelector("div[class='datepick-header'] span:nth-child(1)")).getText();
		String bookingYear= driver.findElement(By.cssSelector("div[class='datepick-header'] span:nth-child(2)")).getText();
		
		
		while(!(bookingMonth.equalsIgnoreCase("April") && bookingYear.equals("2025"))) {
			
			driver.findElement(By.xpath("//a[normalize-space()='»']")).click();
			bookingMonth = driver.findElement(By.cssSelector("div[class='datepick-header'] span:nth-child(1)")).getText();
			bookingYear = driver.findElement(By.cssSelector("div[class='datepick-header'] span:nth-child(2)")).getText();
		}
		
		driver.findElement(By.xpath("//a[normalize-space()='8']")).click();
		
		
		//S31: Booking Time & Details
		//click on Static drop down 
		
//		driver.manage().window().maximize();
//		driver.get("https://codenboxautomationlab.com/about/booking/");
//		Thread.sleep(3000);
		
		WebElement timeSlot = driver.findElement(By.id("rangetime1"));
		timeSlot.click();
		Select s = new Select(timeSlot);
		s.selectByValue("17:00 - 18:00");
		Thread.sleep(3000);
		System.out.println(timeSlot.isDisplayed());
		
		driver.findElement(By.id("name1")).sendKeys("Dhaval");
		driver.findElement(By.id("secondname1")).sendKeys("Lakhani");
		driver.findElement(By.id("email1")).sendKeys("Testing@gmail.com");
		driver.findElement(By.id("details1")).sendKeys("Learning Selenium");
		driver.findElement(By.cssSelector("button[type='button']")).click();
		
		//booking confirmation
		String confirm = driver.findElement(By.xpath("//div[@class='wpbc_ty__message ']")).getText();
		
		if(confirm.contains("Many Thanks")) {
			System.out.println("Booking Done");
		} else {
			System.out.println("Booking not received");
		}

*/		
		//S32: IFrame
/*		
		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/practice/");
		
		int framesNums = driver.findElements(By.tagName("iframe")).size();
		System.out.println(framesNums);
		
		//switching into the Frame
		driver.switchTo().frame(0);
		String features = driver.findElement(By.xpath("//span[normalize-space()='Awesome features']")).getText();
		//other xpath span[contains(text(),'Awesome features')]
		System.out.println(features);
		
		//getting out of the frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("LinkedIn Profile")).click();
*/		
	
		//S33: Multi Window
/*		
		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/practice/");
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.id("openwindow")).click();		//new Window
		driver.findElement(By.linkText("Open Tab")).click();	//new Tab
		
		Thread.sleep(3000);
		
		Set<String> multiWindowIds = driver.getWindowHandles();
		
		for(String ids: multiWindowIds) {
			driver.switchTo().window(ids);
			System.out.println(driver.getTitle());
		}
		
		//getting back to parent Window
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.cssSelector("input[value='radio1']")).click();
*/		
		driver.quit();
		System.out.println("Done");
	}
}
