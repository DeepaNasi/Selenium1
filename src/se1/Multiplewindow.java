package se1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplewindow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/blog/handle-multiple-windows-in-selenium/");
		Thread.sleep(5000);
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window is: " +parentWindow);
		driver.findElement(By.xpath("(//div[@class=\"icon-bar-first-fold\"]//a)[2]")).click();
				
		Set<String> allWindow = driver.getWindowHandles();
		for(String childWindow : allWindow)
		{
			if(!childWindow.equalsIgnoreCase(parentWindow)) 
			{
				driver.switchTo().window(childWindow);
				Thread.sleep(200);
				String Title = driver.getTitle();
				System.out.println(Title);
			}
			
			
		}
		driver.switchTo().window(parentWindow);
		System.out.println("Switched back to parent window successfully");
		String parentwintitle = driver.getTitle();
		System.out.println(parentwintitle);
	}
}


