package se1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

	
	
	public class testngBasic {
		
		@Test
		public void TestGoogle() throws InterruptedException {
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			
			driver.findElement(By.name("q")).sendKeys("HYR tutorials", Keys.ENTER);
			System.out.println(driver.getTitle());
			Thread.sleep(50000);
			driver.quit();
			
			
		}
	
	}


