package com.infy.seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment134_RigtClickGmailInGoogle {

	public static void main(String[] args) throws AWTException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		Actions ac=new Actions(driver);
		Robot rb=new Robot();
		WebElement link_profile_icon=driver.findElement(By.xpath("//div[@class='LX3sZb']/div/header/div[3]/a"));
		ac.moveToElement(link_profile_icon).perform();
		ac.contextClick().perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);

	}

}
