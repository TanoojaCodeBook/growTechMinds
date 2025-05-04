package com.infy.seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment150_YoutubAutoSuggestions {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("selenium java" );
        List<WebElement> autoSuggestionList=driver.findElements(By.xpath("//div[@class='ytSuggestionComponentLeftContainer']/span"));
        for(WebElement eachEle: autoSuggestionList) {
        	System.out.println(eachEle.getText());
        }
	}

}
