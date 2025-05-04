package com.infy.seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment147_TextOfEachLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement search_bar_ele=driver.findElement(By.id("twotabsearchtextbox"));
		search_bar_ele.sendKeys("Mobiles"+Keys.ARROW_LEFT , Keys.ENTER);
		List<WebElement> totalLinksList=driver.findElements(By.tagName("a"));
		System.out.println("totalLinks: "+totalLinksList.size());
		
		for(WebElement eachEle: totalLinksList) {
			
			String text=eachEle.getText()
;			System.out.println(text);
		}
	}

}
