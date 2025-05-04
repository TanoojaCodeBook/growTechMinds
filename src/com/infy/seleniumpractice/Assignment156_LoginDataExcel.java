package com.infy.seleniumpractice;

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

public class Assignment156_LoginDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement userNameEle=driver.findElement(By.id("username"))
;       WebElement passwordEle=driver.findElement(By.id("password"));
      //let java know where the excel file is
      FileInputStream file=new FileInputStream("C:\\Users\\tanoo\\eclipse-workspace\\SeleniumJavaProject\\DataFolder\\LoginData.xlsx");
      //Opens an existing file and creates a Workbook object in java memory
      Workbook workBook=WorkbookFactory.create(file);
      //opening sheet
      Sheet sheet=workBook.getSheet("Sheet1");
      Row row=sheet.getRow(1);
      Cell cell=row.getCell(0);
      Cell cell2=row.getCell(1);
      //cell.getStringCellValue();  // if you know it’s a string
      //cell.getNumericCellValue(); // if you know it’s a number
      //cell.getCellType(); cell type checking

      userNameEle.sendKeys(cell.getStringCellValue());
      passwordEle.sendKeys(cell2.getStringCellValue());
      driver.findElement(By.id("submit")).click();
	}

}
