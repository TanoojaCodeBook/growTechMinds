package com.infy.seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment133_RightClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Mobiles')]"))).perform();
        ac.contextClick().perform();
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN); // Press Down arrow
        //Thread.sleep(2000);
       // robot.keyRelease(KeyEvent.VK_DOWN);
       //System.out.println("second down");
       // Thread.sleep(2000);
        //robot.keyRelease(KeyEvent.VK_DOWN);
       // System.out.println("Third down");
        //Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER); // Press Enter
       
	}

}
