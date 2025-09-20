package myBasicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;			//IMP 

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

public class Sele4New {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		//S34->S37					
		//S34: relative Locators
 		//S34 & S35 are connected
  
  		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/practice/");
		System.out.println("Done2");
  
		//above() - Find Element above of Open Tab btn
		WebElement openTab = driver.findElement(By.id("opentab"));
		String ele = driver.findElement(with(By.tagName("legend")).above(openTab)).getText();
		
		System.out.println(ele);
		
		//below() - Find Element below of Enable btn
		WebElement enable = driver.findElement(By.id("enabled-button"));
		driver.findElement(with(By.tagName("input")).below(enable)).sendKeys("Best Selenium Course");
				
		//S35: relative Locators 2
		
		//near() - click on 1st check box
		WebElement checkBox = driver.findElement(By.xpath("//legend[text()='Checkbox Example']"));
		driver.findElement(with(By.tagName("input")).near(checkBox)).click();	
		
		//toLeftOf click on Hide btn which is on left of Show Btn
		WebElement show = driver.findElement(By.id("show-textbox"));
		driver.findElement(with(By.tagName("input")).toLeftOf(show)).click();
		
		//toRightOf click on Alert btn which is on Right of text Field
		WebElement textField = driver.findElement(By.id("name"));
		driver.findElement(with(By.tagName("input")).toRightOf(textField)).click();
		
		
		//S36: Invoke Multi Window
/*		
		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/practice/");
		
		//Getting IDs of windows
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> itr = handles.iterator();
		
		String parentWindowHandle = itr.next();
		String childWindowHandle = itr.next();
		
		driver.switchTo().window(childWindowHandle);
		
		//open codenbox on new window
		driver.get("https://codenbox.com");
		String title = driver.getTitle();
		driver.switchTo().window(parentWindowHandle);
		
		WebElement show = driver.findElement(By.id("show-textbox"));
		driver.findElement(with(By.tagName("input")).toLeftOf(show)).click();
*/		
		
		//S37: ScreenShot
/*		
		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/practice/");
		
		WebElement myName = driver.findElement(By.id("name"));
		myName.sendKeys("Dhaval");
		
		//taking a pic
		File srcFile = myName.getScreenshotAs(OutputType.FILE);
		
		String destn = System.getProperty("user.dir");
		System.out.println(destn);
		FileUtils.copyFile(srcFile, new File(destn+"/testOutput/"+"name.png"));
*/		
		driver.quit();
		System.out.println("Doneaa");
		
	}
}
