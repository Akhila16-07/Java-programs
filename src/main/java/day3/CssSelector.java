package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://elearning.excelr.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[id='free-course']")).click();
		
	//	driver.quit();
	}
}
