package com.infy.seleniumpractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment152_ScreenshotWithClassNameDateTime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		LocalDate date=LocalDate.now();
		DateTimeFormatter df= DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
		String todayDate=df.format(date);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\tanoo\\eclipse-workspace\\SeleniumJavaProject\\Screenshots2\\"
		+new Assignment152_ScreenshotWithClassNameDateTime().getClass()+"_"+todayDate+".png" );
        FileHandler.copy(source, destination);
	}

}
