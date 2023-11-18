package se1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PavansirWindlowhandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		
		//getWindowHandle()
		
//		String windowID=  driver.getWindowHandle(); //return ID of single browser window/tab
//		System.out.println(windowID);		
		
		
		//getWindowHandles()
		
		/*
		 * driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click(); //open
		 * \s another browser window - child window
		 * 
		 * Set<String> windowIDs=driver.getWindowHandles();
		 * 
		 * //1. frist method by Iterator
		 * 
		 * 
		 * Iterator<String> it=windowIDs.iterator(); //we have iterator method which
		 * will returns String and stores in object 'it'
		 * String parentWidowID=it.next(); 
		 * String childWindowID=it.next();
		 * 
		 * System.out.println("Parent Window Id is=" +parentWidowID);
		 * System.out.println("Child Window Id is=" +childWindowID);
		 */
			
		
		//2. second method  - using List/ArrayList
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowIDs=driver.getWindowHandles();
		List<String>windowIDsList=new ArrayList(windowIDs);
		
	/*	String parentWidowID=windowIDsList.get(0);
		String childWindowID=windowIDsList.get(1);
		
		
		System.out.println("Parent Window Id is=" +parentWidowID);
		System.out.println("Child Window Id is=" +childWindowID);
		
		//How to use window Id's for switching
		
		
		driver.switchTo().window(parentWidowID);
		System.out.println("Parent window title:" +driver.getTitle());
		
		
		driver.switchTo().window(childWindowID);
		System.out.println("Child window title:" +driver.getTitle());
		
		*/
	
		// By using for each loop to make everything in one go
		
		for(String winid:windowIDsList)
		{
			//System.out.println(winid);
			
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}

	}

}
