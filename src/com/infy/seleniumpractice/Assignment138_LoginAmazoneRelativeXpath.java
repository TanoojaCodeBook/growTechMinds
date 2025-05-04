package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment138_LoginAmazoneRelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Actions ac=new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']"))).perform();
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Sign in']"))).perform();
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.id("ap_email_login")).sendKeys("tanoojatanooja8384@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ravali12345");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		//asking authentication
	}

}
