package se1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipledropdownGeneric {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
    driver.manage().window().maximize();
    
    //Approach 1 
    
		//Select noOfEmpsdrp=new Select(driver.findElement(By.name("NoOfEmployees")));
		//noOfEmpsdrp.selectByVisibleText("16 - 20");
		
		//Select industrydrp=new Select(driver.findElement(By.name("Industry")));
		//industrydrp.selectByVisibleText("Travel");
		
		//Select countrydrp=new Select(driver.findElement(By.name("NoOfEmployees")));
		//countrydrp.selectByVisibleText("Aruba");
		
		//Approach 2
      
    
    WebElement noOfEmpsdrp=driver.findElement(By.name("NoOfEmployees"));
    selectOptionFromDropDown(noOfEmpsdrp, " 16 - 20 ");	
    
    WebElement industrydrp=driver.findElement(By.name("Industry"));
    selectOptionFromDropDown(industrydrp, "Healthcare ");	
    
    WebElement countrydrp=driver.findElement(By.name("Country"));
    selectOptionFromDropDown(countrydrp, " Ghana ");	
    
   }
	
	//user defined method 
     public static void selectOptionFromDropDown(WebElement ele, String value)
     {
    	 
    	 Select drp=new Select(ele);
    	 
    	 List<WebElement>allOptions=drp.getOptions();
    	 for(WebElement option:allOptions) 
    	      {
    		     if(option.getText().equals("value"))
    		     {
    		    	option.click();
    		    	break;
       		     }
    		 
    	      }
    	 
    	 
    	 
     }
	
	
	
	
	
	
	
	
	
	
	
}
