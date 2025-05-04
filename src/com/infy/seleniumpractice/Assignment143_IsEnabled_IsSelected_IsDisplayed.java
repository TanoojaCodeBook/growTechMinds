package com.infy.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment143_IsEnabled_IsSelected_IsDisplayed {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/tanoo/AppData/Local/Microsoft/Windows/INetCache/IE/CXQRPWYX/JSAM_learningHTML1[1].html");
    //checking whether the element RAM is displayed or not
	System.out.println(driver.findElement(By.xpath("//td[text()='Ram']")).isDisplayed());
	//checking whether female radio button is enabled or not
	System.out.println(driver.findElement(By.xpath("//input[@type='radio'][2]")).isEnabled());
	//checking whether I have a Girl checkbox is selected or not
	System.out.println(driver.findElement(By.id("121")).isSelected());
	}

}
