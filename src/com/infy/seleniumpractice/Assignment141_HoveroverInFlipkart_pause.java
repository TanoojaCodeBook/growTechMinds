package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Assignment141_HoveroverInFlipkart_pause {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement fashon_ele=driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(fashon_ele).perform();
		driver.findElement(By.linkText("Men's T-Shirts")).click();	
		String actual_tile=driver.getTitle();
		Assert.assertEquals(actual_tile,"T-shirts for men at Best Price in India | Flipkart","failed");
		
	}

}
