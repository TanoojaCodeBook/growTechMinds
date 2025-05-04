package com.infy.seleniumpractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment155_screenshotDateTime {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		LocalDateTime dateTime=LocalDateTime.now();
		DateTimeFormatter df= DateTimeFormatter.ofPattern("yyyy-MMMM-dd_hh-mm-ss"); 
		//don't use double colon between hh and mm and ss use hyphen other wise we will file not found excetption
		String todayDateTime=df.format(dateTime);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\tanoo\\eclipse-workspace\\SeleniumJavaProject\\Screenshots2\\"+todayDateTime+".png" );
        FileHandler.copy(source, destination);

	}

}
