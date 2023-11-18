package se1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadfilesbyrobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='uprcse-bold']")).click();
		//using sendKeys
		
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\user\\Documents\\Test download\\file-sample_150kB.pdf");
		
		//by using robot class method
		
		WebElement button = driver.findElement(By.xpath("//input[@id='file-upload]"));
		
		//here we can use action class also to move the element to next window
		JavascriptExecutor js= (JavascriptExecutor)driver;		
		js.executeScript("arguments[0].click();",button); //click on action the button
		
		/* 
		 * 1. copy the path
		 * 2. CTRL +V
		 * 3. Enter
		 * */
		
		
	Robot rb= new Robot();
	rb.delay(200);
	
	//put path to file in a clipboard
	StringSelection ss=new StringSelection("C:\\Users\\user\\Documents\\Test download\\file-sample_150kB.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	
	//CTRL +V
	rb.keyPress(KeyEvent.VK_CONTROL); // press on CTRL key
	rb.keyPress(KeyEvent.VK_V); //press on CTRL key
	
	
	rb.keyRelease(KeyEvent.VK_CONTROL); // release on CTRL key
	rb.keyRelease(KeyEvent.VK_V); //release  on CTRL key
	
	//Enter
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	//write code for Submit
	
driver.quit();

		

	}

}
