package testngbasic;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataP {

	
	
	@Test(dataProvider = "loginTestData")
	//takes the parameters as string 
	public void TestLogin(String userName, String password) throws InterruptedException  {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("uid")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);	
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		driver.quit();

}
	
	@DataProvider(name = "loginTestData")
	public Object[][] loginData() 
	{
		
		Object[][] data = new  Object[2][2];
		
		data[0][0] ="mngr511436";
		data[0][1]="renetAj";
		
		
		data[1][0] ="9999999";
		data[1][1]="test123";
		
		return data;
		
	}
}