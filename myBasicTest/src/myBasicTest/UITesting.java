package myBasicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UITesting {
	
	public static void main(String[] args) throws InterruptedException {
//S17->S21		
		WebDriver driver = new ChromeDriver();
		
		
		//S17: Basic Navigations
/*		driver.get("https://google.ca/");
		
		driver.manage().window().maximize();
		System.out.println("Google title for 1st visit is: "+driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://codenbox.com/");
		System.out.println("Codenbox title for 1st visit is: "+driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().back();			//goes back to ggogle.ca
		System.out.println("Google title for 2nd visit is: "+driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.navigate().forward();		//goes back to codenbox.com
		System.out.println("Codenbox title for 2nd visit is: "+driver.getTitle());

		Thread.sleep(1000);
*/
		
		//S18: Static Dropdowns
/*		driver.get("https://www.goindigo.in/"); //Site is Risky
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[@class='notsearchable booking-widget-field']//span[text()='Travellers + Special Fares']")).click();
		
		WebElement addPassenger = driver.findElement(By.xpath("//div[@aria-label=\"Senior Citizen (>60 years)\"]/parent::div/parent::div//i[2]"));
		addPassenger.click();
		addPassenger.click();
*/		
		//S19: Dynamic Dropdowns
/*		driver.get("https://codenboxautomationlab.com/practice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("can");
		
		Thread.sleep(2000);
		
		//locate list of search results
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		int count = list.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			String country =  list.get(i).getText();
			if(country.equalsIgnoreCase("canada")) {
				list.get(i).click();
				break;
			}
		}
		System.out.println("Nothing found");
*/		
		//S20: Mouse & Keyboard keys
/*		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/practice/");
		
		Actions a = new Actions(driver);		//Argument is the driver that will do the work
		
		//Hover Mouse
		WebElement courses =  driver.findElement(By.xpath("//li[@id='menu-item-63']"));
		a.moveToElement(courses).build().perform();
		
		//Hold Shift & Search
		WebElement search = driver.findElement(By.xpath("(//input[@placeholder=\"Search...\"])[2]"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("selenium").doubleClick().build().perform();
		
		//Right click & open in new tab
		WebElement youtube = driver.findElement(By.linkText("Free courses on YouTube"));
		a.moveToElement(youtube).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
*/		
		//S21: Radiobutton
/*		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/practice/");
		
		//select 2nd radio button
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		
		//select group of radio button * click on radio3
		List<WebElement> rdButtons = driver.findElements(By.cssSelector(".radioButton"));
		int count = rdButtons.size();
		
		for(int i=0;i<count;i++) {
			String radioName = rdButtons.get(i).getAttribute("value");
			if(radioName.equalsIgnoreCase("radio3")) {
				rdButtons.get(i).click();
//				break;
				//isSelected Method: returns boolean
				System.out.println(rdButtons.get(i).isSelected());
				break;
			}
			
		}
*/		
		
		//S21: CheckBox
/*		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/practice/");
		
		//selecting option 2 & 3
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		WebElement checkbox = driver.findElement(By.id("checkBoxOption3"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
*/		
		
		//S21: CheckBox
/*		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/practice/");
		
		driver.findElement(By.id("name")).sendKeys("Hii");
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
*/		
		
		
		
		
		
		
		
		
//
		
		
		
		
		System.out.println("Done");
	}
}
