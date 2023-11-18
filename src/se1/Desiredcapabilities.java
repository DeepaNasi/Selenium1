package se1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Desiredcapabilities {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities caps=new DesiredCapabilities();
		//caps.setAcceptInsecureCerts(true);
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		options.merge(caps);
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://cacert.com");
		
		//it is not running with this version as we need selenium v4.0.0-rc-2

		
		/*
		 * WARNING: Unable to find an exact match for CDP version 115, so returning the closest version found: 114

		 * As per Selenium documentation,
		 * 
		 * The version v4.0.0-rc-1 supports CDP versions: 85, 92, 93.
		 * 
		 * But you are using 94 version of Chrome and ChromeDriver. So please update
		 * your dependencies to latest version v4.0.0-rc-2
		 * 
		 * Dependency:
		 * 
		 * <dependency> <groupId>org.seleniumhq.selenium</groupId>
		 * <artifactId>selenium-java</artifactId> <version>4.0.0-rc-2</version>
		 * </dependency>
		 * 
		 * Reference: https://github.com/SeleniumHQ/selenium/blob/trunk/java/CHANGELOG
		 * 
		 * 
		 * https://stackoverflow.com/questions/69466279/java-selenium-unable-to-find-an-exact-match-for-cdp-version-94-so-returning
		 */
	}

}
