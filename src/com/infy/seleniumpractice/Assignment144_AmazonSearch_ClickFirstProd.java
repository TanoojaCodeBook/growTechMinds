package com.infy.seleniumpractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
public class Assignment144_AmazonSearch_ClickFirstProd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement search_bar_ele=driver.findElement(By.id("twotabsearchtextbox"));
		search_bar_ele.sendKeys("Mobiles"+Keys.ARROW_LEFT , Keys.ENTER);
		List<WebElement> mobiles_list=driver.findElements(By.xpath("//img[@class='s-image']"));
		List<WebElement> mobile_prices_list=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		mobiles_list.get(0).click();
		String firstMobile_price= mobile_prices_list.get(0).getText();
		System.out.println(firstMobile_price);
	  Set<String> windowHandles=	driver.getWindowHandles();
	  for(String eachId:windowHandles) {
		  driver.switchTo().window(eachId);
		  if(!(driver.getTitle().equals("Amazon.in : mobiles"))) {
			String mobilePrice=  driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		    System.out.println(mobilePrice);
			Assert.assertEquals(firstMobile_price, mobilePrice,"failed");
		  }else {
			  break;
		  }
	  }

	}

}
