package seleniumAssigments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;

public class Module4Assigment {
    public static void main(String[] args) throws IOException, InterruptedException {
        
    	 WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        // Navigate to the URL
        driver.get("http://demo.guru99.com/V4/");
        driver.manage().window().maximize();
    	FileInputStream fis = new FileInputStream("C:\\Users\\USER\\ExcelrSelenium\\ExcelrSelenium1\\src\\test\\resources\\Data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		
		Thread.sleep(2000);
		Sheet sheet = book.getSheet("Sheet");
		//Row row = sheet.getRow(0);
	
       // Iterate through rows in the sheet
        for (Row row : sheet) {
            if (row.getRowNum() == 1) continue; // Skip header row

            // Read username and password from the sheet
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();
            System.out.println(username);
            System.out.println(password);
      

            // Enter username
            WebElement usernameField = driver.findElement(By.name("uid"));
            usernameField.sendKeys(username);

            // Enter password
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys(password);

            // Click Login button
            WebElement loginButton = driver.findElement(By.name("btnLogin"));
            loginButton.click();
        }

        System.out.println("Excel file read successfully!");
        driver.quit();
        
        
    }
}
