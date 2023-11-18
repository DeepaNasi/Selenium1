package se1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImages {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		VerifyBrokenImage();
	}
	
	public static void VerifyBrokenImage() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		 List<WebElement> images =   driver.findElements(By.tagName("img"));
		 System.out.println(images.size());
		 
		//we have to iterate this one
		 
		 for(WebElement image : images) // For each loop means for each images i need one image
		 {
			 
			 String imageSrc = image.getAttribute("src")	;
			 //we have not used driver.findelement due to we need to get image values so
			 //now we need to create the url connection then request to server if we get response as 200 then it is valid
			 // we have a class called ULR we have create the object
			 
			 URL url = new URL(imageSrc);
			 
			 // we have to create the connetion
			 //url.openConnection(); will create URL connection obj
			 
			 try {
				  URLConnection urlconnection = url.openConnection(); //here URLConnection is generic one but if want to send any request  we have to send in http therefore we have convert to http
				  HttpURLConnection httpURLConnection =  (HttpURLConnection)  urlconnection;      // HTTpURLConnection is an abstract class we cannot create object then we did casting for (HttpURLConnection)  urlconnection
				  httpURLConnection.setConnectTimeout(5000);	 
						 
				  httpURLConnection.connect();
				 
			 if(httpURLConnection.getResponseCode() == 200)
				    {
					  System.out.println(imageSrc +  " >> "  + httpURLConnection.getResponseCode() +  " >> "  + httpURLConnection.getResponseMessage());
					 }
					 
					 else
					  System.err.println(imageSrc + " >> " + httpURLConnection.getResponseCode() +  " >> "  + httpURLConnection.getResponseMessage());
				 
				 httpURLConnection.disconnect();
		     } 
			       catch (IOException e) 
			       {
			        	// TODO Auto-generated catch block
			        	System.err.println(imageSrc);
			       }
		 }
			 
			 driver.quit();	 
	 }
		
}
	
	


