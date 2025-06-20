package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		
					//object creation for chrome browser
					ChromeDriver driver = new ChromeDriver();
					
					//driver - is a universal reference varaiable
					
					driver.manage().window().maximize();
					driver.get("file:///C:/Users/HP/Documents/ExcelR%20Courses/Selenium%20notes/sampleHtmlcode1.html");
					Thread.sleep(2000);
					
					//to interact with the elements, to verify the address
					// tag name- when multiple tag names are same then it will fetch the first one
					WebElement firstName= driver.findElement(By.tagName("input"));
					firstName.sendKeys("akhila");
					
					//cleared the text
					firstName.clear();
					
					//resended the text
					firstName.sendKeys("karthik");
					
					driver.findElement(By.id("lname")).sendKeys("musku");
					driver.findElement(By.className("fname")).sendKeys("sudharshan reddy");
					driver.findElement(By.tagName("button")).click();
					
					driver.quit();
	}
}
