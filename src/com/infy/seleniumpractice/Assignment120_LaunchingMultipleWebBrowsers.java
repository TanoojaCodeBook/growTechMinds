package com.infy.seleniumpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment120_LaunchingMultipleWebBrowsers {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver2=new EdgeDriver();
		FirefoxDriver driver3=new FirefoxDriver();
		driver.quit();
	}

}
