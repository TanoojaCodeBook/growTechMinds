package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment129_DragAndDrop {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/drag-and-drop/");
		Actions ac=new Actions(driver);
		WebElement cucumber_source=driver.findElement(By.id("drag1"));
		WebElement cucumber_destination=driver.findElement(By.id("div2"));
		ac.dragAndDrop(cucumber_source, cucumber_destination).perform();
        WebElement growTechMinds_source=driver.findElement(By.id("drag2"));
        WebElement growTechMinds_destination=driver.findElement(By.xpath("//div[@id='container']"));
        ac.dragAndDrop(growTechMinds_source, growTechMinds_destination).perform();
	}

}
