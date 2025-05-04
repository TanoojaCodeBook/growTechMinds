package com.infy.seleniumpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment122_FechingGoogleTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver()
;
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
	}

}
