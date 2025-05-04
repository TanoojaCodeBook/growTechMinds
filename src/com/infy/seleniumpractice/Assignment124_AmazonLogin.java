package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment124_AmazonLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Actions ac=new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']"))).perform();
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Sign in']"))).perform();
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.id("ap_email_login")).sendKeys("tanoojatanooja8384@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tanunicky@789");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		//asking authentication
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles" + Keys.ENTER);		
	    WebElement sliderEle=driver.findElement(By.xpath("//div[@class='a-section s-range-input-container s-upper-bound']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true)", sliderEle);
	    int sliderEleWidth=sliderEle.getSize().getWidth();
	    System.out.println(sliderEleWidth);
	    
	   // int minPrice = Integer.parseInt(driver.findElement(By.xpath("//label[@class='a-form-label sf-range-slider-label sf-lower-bound-label']/span")).getText());
	   // System.out.println(minPrice);
       //int maxPrice=162600;                    
	    //int targetPrice = 30000;	
        // Calculate price per pixel
        //double pricePerPixel = (double)(maxPrice - minPrice) / sliderEleWidth;
        //System.out.println("Price per pixel: " + pricePerPixel);
        
        // Calculate pixels to move
       // int pixelsToMove = (int)((targetPrice - minPrice) / pricePerPixel);
       // System.out.println("Pixels to move: " + pixelsToMove);
        
        WebElement sliderMovingEle=driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_upper-bound-slider']"));
        Actions acc=new Actions(driver);
        acc.dragAndDropBy(sliderMovingEle, 100, 0).perform();
	
	}

}
