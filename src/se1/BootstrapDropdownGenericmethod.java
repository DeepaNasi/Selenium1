package se1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdownGenericmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//ProductType
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		
        List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
       
        System.out.println("No of options" +productTypes.size());
        selectOptionFromDropDown(productTypes, "Accounts");
        
  //now all products will be stored in productTypes so by creating for each loop where we can take one product from list like ptype : productTypes
     
        //Product
        driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
        
        
        List<WebElement> products=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
        
        System.out.println("No of options" +products.size());
        selectOptionFromDropDown(products, "Salary Accounts");
        
  //now all products will be stored in productTypes so by creating for each loop where we can take one product from list like ptype : productTypes
     Thread.sleep(500);
              driver.quit();
	}
	//generic method
	public static void selectOptionFromDropDown(List<WebElement> options, String value) 
	{
		for(WebElement option:options )
        {
        	if(option.getText().equals(value))
        	{
        		option.click();
        		break;
        	}
       
        }
	}

}
