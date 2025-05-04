package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment142_FlipkartLogin {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Actions ac=new Actions(driver);
		WebElement link_login=driver.findElement(By.xpath("//a[@title='Login']"));
		ac.moveToElement(link_login).perform();
		WebElement link_Signup=driver.findElement(By.xpath("//a[@title='Sign Up']"));
		ac.moveToElement(link_Signup).click().perform();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9390176832");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
