package com.infy.seleniumpractice;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignemtnn149_PractoAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.practo.com/?utm_source=google&utm_medium=cpc&utm_campaign=brand-search-practo-consult&sem=true&gad_source=1&gclid=CjwKCAjw-qi_BhBxEiwAkxvbkBw8Ou0X0yMe9lYhbWVbakclx439f-JrpsXkGWRJGlJ2NTv7fnqdnxoCtLkQAvD_BwE");
		WebElement searchBox_ele=driver.findElement(By.xpath("//input[@placeholder='Search doctors, clinics, hospitals, etc.']"));
		searchBox_ele.sendKeys("gynecologist");
		Thread.sleep(2000);
		List<WebElement> autoSuggestionsList=driver.findElements(By.xpath("//div[@class='c-omni-suggestion-group']/div/span/div"));
        System.out.println(autoSuggestionsList.size());
		for(WebElement eachEle:autoSuggestionsList) {
        	System.out.println(eachEle.getText());
        }
		for(WebElement eachEle:autoSuggestionsList) {
        	if(eachEle.getText().equals("Gynecologist/obstetrician")) {
        		eachEle.click();
        		break;
        	}
        }
		Assert.assertTrue(driver.getTitle().contains("Find Best Gynecologists/Obstetricians"));
	}
	

}
