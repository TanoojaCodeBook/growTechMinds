package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment127_selectClassMethods {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement skillsDd=driver.findElement(By.xpath("//label[text()='Skills']/following-sibling::select"));
		Select skillOptions=new Select(skillsDd);
		skillOptions.selectByVisibleText("Java");
		//or
		skillOptions.selectByIndex(3);
		WebElement countryDd=driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select countryOptions=new Select(countryDd);
		countryOptions.selectByVisibleText("India");
		

	}

}
