package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Assignment140_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement ele_prime=driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(ele_prime).perform();
		ele_prime.click();
		String actual_tile=driver.getTitle();
		Assert.assertEquals(actual_tile, "Amazon.in: Amazon Prime - Shopping Plans starting ₹399/year","failed");
	}

}
