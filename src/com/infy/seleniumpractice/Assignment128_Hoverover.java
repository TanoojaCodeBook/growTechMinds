package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment128_Hoverover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		//using Actions class we can perform hoverover , right click and drag and drop and double click
		Actions ac=new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']"))).perform();

	}

}
