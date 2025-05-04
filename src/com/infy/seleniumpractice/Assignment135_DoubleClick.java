package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment135_DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions ac=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        ac.moveToElement(ele).perform();
        ac.doubleClick(ele).perform(); 
        driver.switchTo().alert().accept();
	}

}
