package se1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");	
	

         Calendar calendar = Calendar.getInstance();
         String targetDate = "06-Feb-2024";
         SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
         Date formattedTargetDate;
try {
     targetDateFormat.setLenient(false);
     formattedTargetDate	= targetDateFormat.parse(targetDate);
     calendar.setTime(formattedTargetDate);

int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
int targetMonth = calendar.get(Calendar.MONTH);
int targetYear = calendar.get(Calendar.YEAR);			
//Click on calendar
      driver.findElement(By.id("second_date_picker")).click();
      Thread.sleep(200);
//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();

//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="6"]

  //Thread.sleep(2000);		
  driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()=\"6\"]")).click();

}
catch (ParseException e) {
	
	throw new Exception("Invalid date is provided, please check input date");
	
	}

	}
}

// Vedio link  https://www.youtube.com/watch?v=HqzlDEPdJ3w

