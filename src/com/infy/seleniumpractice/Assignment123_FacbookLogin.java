package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assignment123_FacbookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tanoojatanooja8384@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tanu@123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String FailedMessage=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		System.out.println(FailedMessage);
	    SoftAssert sa=new SoftAssert();
	    sa.assertEquals(FailedMessage,"The email address you entered isn't connected to an account. Find your account and log in.");
	   
       sa.assertAll();
       driver.quit();
	}

}
