package com.infy.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment125_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("have to enter url of which we have to test");
		//locators
		driver.findElement(By.id("id of the element"));
		driver.findElement(By.tagName("tag name of the element"));
		driver.findElement(By.className("class name of the element")); //tag and class name locators useful 
		//when we want to locate multiple elements
		driver.findElement(By.linkText("linktextof the element"));
		driver.findElement(By.partialLinkText("partial text from that llink"));
		

	}

}
