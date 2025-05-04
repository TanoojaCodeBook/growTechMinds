package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment136_GoldPriceSearchInGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		Actions ac=new Actions(driver);
		//tagname
		//driver.findElement(By.tagName("textarea")).sendKeys("Gold Price Today");
		//using abosulte xpath
		WebElement search_bar_ele=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/textarea[1]"));
		search_bar_ele.sendKeys("Gold Price Today");
		//search_bar_ele.sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(2000);
		search_bar_ele.sendKeys(Keys.ENTER);
		
		
		
        
	}

}
