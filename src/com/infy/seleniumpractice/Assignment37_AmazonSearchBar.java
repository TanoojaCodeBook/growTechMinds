package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment37_AmazonSearchBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement search_bar_ele=driver.findElement(By.id("twotabsearchtextbox"));
		search_bar_ele.sendKeys("Mobiles"+Keys.ARROW_LEFT , Keys.ENTER);
		//when we use more than two keys functionalities then separate them with comma if there are in single line
		

	}

}
