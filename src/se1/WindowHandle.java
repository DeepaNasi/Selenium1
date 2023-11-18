package se1;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2000);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");	
		
		String parenthandle= driver.getWindowHandle();
		System.out.println("parent window " +parenthandle);
		driver.findElement(By.id("newWindowBtn")).click();
		
		//to store the handles unique window we go for set 
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles)
		{
			System.out.println(handle);
			if(!handle.equals(parenthandle)) 
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("Deepa");
				Thread.sleep(2000);
				driver.close();
				
			}
		}
		
		//again we have to switch to paraent wondow previously we will be in child window control
		
		driver.switchTo().window(parenthandle);
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Deepa Nasi");
		Thread.sleep(2000);
		driver.quit();

	}

}
