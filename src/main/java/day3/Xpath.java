package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");
		driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akhila");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("akhila@12");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	
}
