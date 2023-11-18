package se1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bouncycastle.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Removechromemessage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions options=new ChromeOptions();
		
		//options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		//options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation")); //has error
		//options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
		//options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		List<String> eSwitches=new ArrayList<>();
		eSwitches.add("enable-automation");
		options.setExperimentalOption("excludeSwitches", eSwitches);
		options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://google.com");

	}

}
