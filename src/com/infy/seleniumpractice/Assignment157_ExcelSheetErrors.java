package com.infy.seleniumpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment157_ExcelSheetErrors {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
   EdgeDriver driver=new EdgeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://www.amazon.in/");
   Actions ac=new Actions(driver);
   ac.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']/a"))).perform();
   //ac.moveToElement(driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[text()='Sign in']")).click()).perform();
   WebElement btn_signin=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[text()='Sign in']"));
   ac.moveToElement(btn_signin).click().perform();
 //letting the java know where exactly that excel file was located
   //if we give wrong excel sheet location we will get FileNotFoundException 
   FileInputStream excelfile=new FileInputStream("C:\\Users\\tanoo\\eclipse-workspace\\SeleniumJavaProject\\DataFolder\\AmazonLoginData.xlsx");
   //Opens an existing file and creates a Workbook object in java memory
   Workbook workbook=WorkbookFactory.create(excelfile);
   Sheet sheet=workbook.getSheet("Sheet1");
   Row row=sheet.getRow(1);
   Cell cell=row.getCell(0);
   //getting empty cell values gives NullPointerException
   Cell cell2=row.getCell(1);
    WebElement emailEle=  driver.findElement(By.id("ap_email_login"));
    emailEle.sendKeys(cell.getStringCellValue());
    WebElement btnContinue=driver.findElement(By.xpath("//input[@type='submit']"));
    btnContinue.click();
    WebElement passwordEle= driver.findElement(By.xpath("//input[@type='password']"));
    //if we are fetching numeric value with string method we will IllegalStateException. we can use getNumericValue()method to get numeric value from cell
    passwordEle.sendKeys(cell2.getStringCellValue());
    WebElement btnClick= driver.findElement(By.id("signInSubmit"));
    btnClick.click();
      }

}
