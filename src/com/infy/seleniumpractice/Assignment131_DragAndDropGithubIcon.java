package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment131_DragAndDropGithubIcon {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/drag-and-drop/");
		Actions ac=new Actions(driver);
		WebElement github_source=driver.findElement(By.id("drag5"));
		WebElement github_destination=driver.findElement(By.id("div2"));
		ac.dragAndDrop(github_source, github_destination).perform();
	}

}
