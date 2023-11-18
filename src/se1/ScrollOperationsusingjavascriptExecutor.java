package se1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollOperationsusingjavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
//scrollTo specific position
		
		/*
		 * JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		 * jsExecutor.executeScript("window.scrollTo(0,1000)");
		 */
		
//	scrollTo Bottom of the page 
		
//		JavascriptExecutor  jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
//	scrollTo To element location
		
//		WebElement element = driver.findElement(By.xpath("(//a[@class=\"tymore\"])[5]"));		
//		JavascriptExecutor  jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("window.scrollTo(arguments[0],arguments[1])",element.getLocation().x,element.getLocation().y);
	
	
//	scrollBy
//		JavascriptExecutor  jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("window.scrollTo(0,1000)");
//		Thread.sleep(5000);
//		
//		jsExecutor.executeScript("window.scrollBy(0,1000)");
		
		
	
//   ScrollIntoView
		
		WebElement element = driver.findElement(By.xpath("(//a[@class=\"tymore\"])[5]"));		
    	JavascriptExecutor  jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView()", element);
		
	
	}
	

}
