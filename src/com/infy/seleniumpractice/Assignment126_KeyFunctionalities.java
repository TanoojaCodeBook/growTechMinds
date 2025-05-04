package com.infy.seleniumpractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Assignment126_KeyFunctionalities {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		WebElement box1=driver.findElement(By.id("inputText1"));
		WebElement box2=driver.findElement(By.id("inputText2"));
		//copy paste
		box1.sendKeys("Tanuja");
		box1.sendKeys(Keys.CONTROL + "a");  //it's better to write each command in separate lines to get accurate results
		box1.sendKeys(Keys.CONTROL+"c");
		box2.sendKeys(Keys.CONTROL+"v");
		//Space and semicolon
		box1.sendKeys(Keys.ENTER);
		box1.sendKeys("New"+Keys.SPACE+"Nagole"+Keys.SPACE+"colony"+Keys.SEMICOLON);
		box1.sendKeys(Keys.ENTER);
		//numpad6 will print 6
		box1.sendKeys("Road Number "+Keys.NUMPAD6);
		//arrow up --cursor will one step up
		box1.sendKeys(Keys.ARROW_UP);
		box1.sendKeys(Keys.ARROW_DOWN);
		box1.sendKeys(Keys.ENTER);
		//removing last letter -back_space key
		box1.sendKeys("back_space"+Keys.BACK_SPACE);
		box1.sendKeys(Keys.ENTER);
		//delete key --If you position the cursor in the middle or 
		//beginning of the text, and then send Keys.DELETE, it will remove the character after the cursor.
		box1.sendKeys("deleting");
		box1.sendKeys(Keys.ARROW_LEFT, Keys.ARROW_LEFT);
		box1.sendKeys(Keys.DELETE);
		
		

	}

}
