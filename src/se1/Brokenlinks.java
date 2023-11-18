package se1;

import java.io.IOException;
import java.net.HttpURLConnection;
//import java.net.InetSocketAddress;
//import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
     //   driver.findElement(By.tagName("a"));
                
        Set<String> brokenlinkUrls = new HashSet<String>();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(WebElement link : links) 
        {
          	String linkURL = link.getAttribute("href");
          	
          	//In IT companies we have to use this Poxy settings
            //	Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("hostname", 80)); then pass parameter in open connection(proxy)
        	URL url = new URL(linkURL);
        	URLConnection urlConnection = url.openConnection();
        	HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;//casting
        	httpURLConnection.setConnectTimeout(5000);
        	httpURLConnection.connect();
        	if(httpURLConnection.getResponseCode() == 200) 
        	{
        		brokenlinkUrls.add(linkURL);
        		
        	}
      //{
        	//	System.out.println(linkURL + "-" + httpURLConnection.getResponseMessage());   }
        	//else {
        	//	System.err.println(linkURL + "-" + httpURLConnection.getResponseCode());
        	
        		httpURLConnection.disconnect();
                  //}
        }
        driver.quit();
        for(String brokenlinkUrl : brokenlinkUrls )
        {
        	System.err.println(brokenlinkUrl);
        }
        	
        }
           
	}

