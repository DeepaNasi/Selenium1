package se1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdownhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		
        List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
       
        System.out.println("No of options" +productTypes.size());
        
  //now all products will be stored in productTypes so by creating for each loop where we can take one product from list like ptype : productTypes
     
        for(WebElement ptype:productTypes )
        {
        	if(ptype.getText().equals("Accounts"))
        	{
        		ptype.click();
        		break;
        	}
        }

        //Product
        driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
        
        
        List<WebElement> products=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
        
        System.out.println("No of options" +products.size());
        
  //now all products will be stored in productTypes so by creating for each loop where we can take one product from list like ptype : productTypes
     
        for(WebElement product:products )
        {
        	if(product.getText().equals("Salary Accounts"))
        	{
        		product.click();
        		break;
        	}
       
        }
        driver.quit();
	}
	
	

}
