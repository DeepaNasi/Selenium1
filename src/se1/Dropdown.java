package se1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		WebElement courseNameElement = driver.findElement(By.id("course"));
		Select courseName_dd = new Select(courseNameElement);
		courseName_dd.selectByIndex(1); 
		
		Thread.sleep(2000);
		courseName_dd.deselectByValue("net");
		Thread.sleep(2000);
		courseName_dd.deselectByVisibleText("Phython");
		
		
		//Multiple Section
		
		WebElement idNameElement = driver.findElement(By.id("id"));
		Select idName_dd = new Select(idNameElement);
		idName_dd.selectByIndex(0); 
		
		Thread.sleep(2000);
		idName_dd.selectByValue("ij");
		Thread.sleep(2000);
		idName_dd.selectByVisibleText("NetBeans");
		
		//deselcting
		
        idName_dd.deselectByIndex(0); 
		Thread.sleep(2000);
		idName_dd.deselectByValue("ij");
		Thread.sleep(2000);
		idName_dd.deselectByVisibleText("NetBeans");
		
		//Get method Option
		
		List<WebElement> coursesAlvailble = courseName_dd.getOptions();
		System.out.println("coursesAlvailble");
		for(WebElement webElement : coursesAlvailble) 
		{
			System.out.println(webElement.getText());
		
			
		}
		System.out.println();
		
		List<WebElement> idesSelected	 = courseName_dd.getOptions();
		System.out.println("idesSelected");
		for(WebElement webElement : idesSelected) 
		{
			System.out.println(webElement.getText());
		
			
		}
		System.out.println();
		
		System.out.println("SelectedOption::");
		System.out.println(courseName_dd.getFirstSelectedOption().getText());
		
		
		
		
		
		
		
		
		
		
		
	}

}
