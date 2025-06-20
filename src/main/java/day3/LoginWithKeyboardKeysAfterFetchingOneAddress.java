package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithKeyboardKeysAfterFetchingOneAddress {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		//login buton
		WebElement loginButton =driver.findElement(By.xpath("//a[text()='Log in']"));
		loginButton.click();
		
		//email
		WebElement email =driver.findElement(By.xpath("//input[@id='Email']"));
		//fetch by address with the help of keyboard
		email.sendKeys("muskuakhila@gmail.com",Keys.TAB,"Testing@123",Keys.TAB);
		Thread.sleep(2000);
		email.sendKeys(Keys.ENTER);
		
		
	}
}
