package se1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowhandlebygenericMethodbyNaveen {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[3]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[4]")).click();
		
		Set<String> handles= driver.getWindowHandles();
		List<String> hlist = new ArrayList<String>(handles);
		if(switchToRightWindow("Facebook", hlist))
		{
			System.out.println(driver.getCurrentUrl() + ":" +driver.getTitle());
			
		}
				
		switchToParent(parentWindowId);
		
	}
	public static void switchToParent(String parentWindowId)
	{
		driver.switchTo().window(parentWindowId);
	}
	
	public static boolean switchToRightWindow(String windowTitle, List<String> hlist)
	{
		for(String e : hlist)
		{
			String title = driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle))
			{
				System.out.println("Found the right win....");
				return true;
			}
		}
		return false;
		
	}
	
}
