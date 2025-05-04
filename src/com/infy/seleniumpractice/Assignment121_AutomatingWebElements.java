package com.infy.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment121_AutomatingWebElements {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Tanooja");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ladi");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tanu@gmail.com");
		driver.findElement(By.xpath("//div[@class='form-group1'][5]/input")).sendKeys("9390176832");
	WebElement femailRadio=	driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", femailRadio);
		js.executeScript("arguments[0].click()", femailRadio);
	 WebElement cricketCheckbox=driver.findElement(By.xpath("//label[normalize-space()='Cricket']"));
	     js.executeScript("arguments[0].click()", cricketCheckbox);
	     driver.findElement(By.xpath("//label[text()='Languages']/following-sibling::input")).sendKeys("English");
		Thread.sleep(2000);
		
		WebElement skillsDd=driver.findElement(By.xpath("//label[text()='Skills']/following-sibling::select"));
		Select skillOptions=new Select(skillsDd);
		skillOptions.selectByVisibleText("Java");
		WebElement countryDd=driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select countryOptions=new Select(countryDd);
		countryOptions.selectByVisibleText("India");
		
		
		
	}

}
