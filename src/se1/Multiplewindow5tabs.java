package se1;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplewindow5tabs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/blog/handle-multiple-windows-in-selenium/");
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window is: " +parentWindow);
		driver.findElement(By.xpath("(//div[@class=\"icon-bar-first-fold\"]//a)[2]")).click();
		driver.findElement(By.xpath("(//div[@class=\"icon-bar-first-fold\"]//a)[4]")).click();
		//driver.findElement(By.xpath("(//div[@class=\"icon-bar-first-fold\"]//a)[5]")).click();
				
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		while((iterator.hasNext())) {
			String childWindow = iterator.next();
			System.out.println(childWindow);
			if(!childWindow.equalsIgnoreCase(parentWindow));
			{
			driver.switchTo().window(childWindow);
			
			if(driver.getTitle().equalsIgnoreCase("LinkedIn Login, Sign in | LinkedIn")) 
			{
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Nasi");
				
			}
			
			if(driver.getTitle().equalsIgnoreCase("Facebook")) 
			{
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Nasi Nasi");
				System.out.println("Susscessfuly entred the name");
				Thread.sleep(200);
				driver.close();
			}
					
				
			}
			
			 driver.switchTo().window(parentWindow); String til = driver.getTitle();
			 System.out.println(til);
			 
						
			}
	driver.quit();
	}
}
	




