package se1;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downloadingdiffformatefiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String fileType = "PDF";
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions(); //ChromeOptions is a class by which allows to download on local comp
		//then we have to set the preferences for this option then it will download on locals preferences will be in Maps key and values
				
		HashMap<String, Object> prefs = new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", "C:\\Users\\user\\Documents\\Test download"); // to download in other folders
		options.setExperimentalOption("prefs", prefs);
        
		WebDriver driver = new ChromeDriver(options);// we have to pass this parameter chromedriver otherwise it wont works
        driver.manage().window().maximize();
        driver.get("https://file-examples.com/");
        
        driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
       Thread.sleep(6000);
        driver.findElement(By.xpath("//td[text()='"+fileType+"']/following-sibling::td[2]/a")).click(); //to make generic for all type of formate create the Filetype 
        driver.findElement(By.xpath("//a[starts-with(text(),'Download sample')]")).click(); 
        Thread.sleep(6000);
        driver.quit();
	}
	

}
