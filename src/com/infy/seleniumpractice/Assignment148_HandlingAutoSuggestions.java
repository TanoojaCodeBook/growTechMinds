package com.infy.seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment148_HandlingAutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		Actions ac=new Actions(driver);
		//tagname
		driver.findElement(By.tagName("textarea")).sendKeys("Gold Price Today");
		List<WebElement> autoSuggestion_list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	    for(WebElement eachEle:autoSuggestion_list) {
	    	System.out.println(eachEle.getText());
	    }
	}

}
