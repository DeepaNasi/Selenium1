package testngbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic {
		//testng xml file is a configration file inside this CF we are going to mention our test cases what we want to execute and which order we want to execute and how many time we need to execute
		@Test
		public void TestGoogle() throws Exception {
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			
			driver.findElement(By.name("q")).sendKeys("HYR tutorials", Keys.ENTER);
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			driver.quit();
			
		}
	//here it taken facebook as first execution because it has test method name as TestFacebook so F letters comes first then G
		@Test
		public void TestFacebook() throws Exception {
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.Facebook.com");
			driver.manage().window().maximize();
			
			
		//	driver.findElement(By.name("q")).sendKeys("HYR tutorials", Keys.ENTER);
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			driver.quit();
			
		}

}
