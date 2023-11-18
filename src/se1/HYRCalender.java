package se1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HYRCalender {
	
	// Vedio link  https://www.youtube.com/watch?v=HqzlDEPdJ3w
	
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		//current date
		driver.findElement(By.id("second_date_picker")).click(); // calendar is opened 
		Thread.sleep(5000);	
		selectDate(driver, "07/Jul/2023", "dd/MMM/yyyy");
		
		//past date
		driver.findElement(By.id("second_date_picker")).click(); // calendar is opened 
		Thread.sleep(5000);	
		selectDate(driver, "07/Jun/2021", "dd/MMM/yyyy");
		
		//future date
		driver.findElement(By.id("second_date_picker")).click(); // calendar is opened 
		Thread.sleep(5000);	
		selectDate(driver, "07/Jun/2024", "dd/MMM/yyyy");
		
			}
	

	public static void selectDate(WebDriver driver,String targetDate,String dateFormat) throws Exception
	{
		
       Calendar calendar = Calendar.getInstance();
		
		//String targetDate = "06-Feb-2024";
		SimpleDateFormat targetDateFormat = new SimpleDateFormat(dateFormat);
		Date formattedTargetDate;
		try {
		targetDateFormat.setLenient(false);
		formattedTargetDate	= targetDateFormat.parse(targetDate);
		calendar.setTime(formattedTargetDate);
		
	//	int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
		int targetMonth = calendar.get(Calendar.MONTH);
		int targetYear = calendar.get(Calendar.YEAR);			
		//********************************************************************************************************		
		//driver.findElement(By.id("second_date_picker")).click();
		//Thread.sleep(200);
		//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
		
		//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="6"]
	   //*****************************************************************************************************************************
		//selecting the past and future date		
		// Past date Tdate - feb 25 2021 Actual date - june 24 2021
			
		String actualDate = driver.findElement(By.className("ui-datepicker-title")).getText(); // June 2021
		calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
		
		int actualMonth = calendar.get(Calendar.MONTH);
		int actualYear = calendar.get(Calendar.YEAR);	
		
		// we have to click on previous and next button repeatedly so we have use while condition rather than if condition (if condition will click only one)
		
		while(targetMonth < actualMonth || targetYear < actualYear) 
		{
			Thread.sleep(200);
			driver.findElement(By.className("ui-datepicker-prev")).click();	
			Thread.sleep(200);
			actualDate = driver.findElement(By.className("ui-datepicker-title")).getText(); 
			
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate)); // 25 2021
			actualMonth = calendar.get(Calendar.MONTH); // we cannot use same name hence we need to remove int(variables) it becomes overriding
			actualYear = calendar.get(Calendar.YEAR);	
			Thread.sleep(200);			
		}
		
		//Future date
		
				while(targetMonth > actualMonth || targetYear > actualYear) 
				{
					Thread.sleep(200);
					driver.findElement(By.className("ui-datepicker-next")).click();	
					Thread.sleep(200);
					actualDate = driver.findElement(By.className("ui-datepicker-title")).getText(); 
					
					calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate)); // 25 2024
					actualMonth = calendar.get(Calendar.MONTH); // we cannot use same name hence we need to remove int(variables) it becomes overriding
					actualYear = calendar.get(Calendar.YEAR);	
					
				}	
				
		  Thread.sleep(2000);		
		  driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDate+"]")).click();
		
		}
		catch (ParseException e) {
			
			throw new Exception("Invalid date is provided, please check input date");
			
			}
		
		
		
	}
	
}
