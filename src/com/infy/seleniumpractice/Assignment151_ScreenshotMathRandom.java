package com.infy.seleniumpractice;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
public class Assignment151_ScreenshotMathRandom {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TakesScreenshot ts=(TakesScreenshot)driver;	
		driver.get("https://www.practo.com/?utm_source=google&utm_medium=cpc&utm_campaign=brand-search-practo-consult&sem=true&gad_source=1&gclid=CjwKCAjw-qi_BhBxEiwAkxvbkBw8Ou0X0yMe9lYhbWVbakclx439f-JrpsXkGWRJGlJ2NTv7fnqdnxoCtLkQAvD_BwE");
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\tanoo\\eclipse-workspace\\SeleniumJavaProject\\Screenshots\\"+Math.random()+".png");
	    FileHandler.copy(source, destination); //no need apache poi and poi ooxml dependencies
	    WebElement searchBox_ele=driver.findElement(By.xpath("//input[@placeholder='Search doctors, clinics, hospitals, etc.']"));
		searchBox_ele.sendKeys("gynecologist");
		Thread.sleep(2000);
	File source2=	ts.getScreenshotAs(OutputType.FILE);
	File destination2=new File("C:\\Users\\tanoo\\eclipse-workspace\\SeleniumJavaProject\\Screenshots\\"+Math.random()+".png");
	FileHandler.copy(source2, destination2);
		List<WebElement> autoSuggestionsList=driver.findElements(By.xpath("//div[@class='c-omni-suggestion-group']/div/span/div"));
        System.out.println(autoSuggestionsList.size());
		for(WebElement eachEle:autoSuggestionsList) {
        	System.out.println(eachEle.getText());
        }
		for(WebElement eachEle:autoSuggestionsList) {
        	if(eachEle.getText().equals("Gynecologist/obstetrician")) {
        		eachEle.click();
        	File source3=	ts.getScreenshotAs(OutputType.FILE);
        	File destination3=new File("C:\\Users\\tanoo\\eclipse-workspace\\SeleniumJavaProject\\Screenshots\\"+Math.random()+".png");
            FileHandler.copy(source3, destination3);
        	break;
        	}
        }
		Assert.assertTrue(driver.getTitle().contains("Find Best Gynecologists/Obstetricians"));

	}

}
