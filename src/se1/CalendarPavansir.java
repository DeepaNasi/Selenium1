package se1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPavansir {

	public static void main(String[] args) throws InterruptedException {
		String month = "March 2019";
		String day= "20";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/hotels");	
	    driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
	    Thread.sleep(200);
	    while(true) 
	    {
	    	String text= driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
	    	if(text.equals(month))
	    	{
	    		break;
	    	}
	    	else
	    	{
	    		driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]/svg")).click();
	    		
	    	}
	    		    }
		
	    driver.findElement(By.xpath("//div[9]//div[1]//table[1]//tbody[1]//tr//td[contains(text(),'15')]")).click();
	}

}
