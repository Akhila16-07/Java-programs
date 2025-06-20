package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_IsDisplayed_IsSelected{

	public static void main(String[] args) throws InterruptedException {
		isEnabled();
		isDisplayed();
		isSelected();
	}
	public static void isEnabled() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0%22");
		Thread.sleep(2000);
		WebElement yesBtn= driver.findElement(By.xpath("//button[@id='btn']"));
		Thread.sleep(2000);
		if(yesBtn.isEnabled()) {
			yesBtn.click();
			System.out.println("Yes button is clicked");
		}else {
			System.out.println("Yes button is not enabled");
		}
		driver.quit();
	}
	
	public static void isSelected() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(2000);
		WebElement whatappBtn= driver.findElement(By.xpath("//input[@id='domain2']"));
		Thread.sleep(2000);
		whatappBtn.click();
		if(whatappBtn.isSelected()) {
			System.out.println("Whatsapp button is selected");
		}else {
			System.out.println("Whatsapp button is not selected");
		}
		driver.quit();
	}
	

	public static void isDisplayed() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//login buton
		WebElement loginButton =driver.findElement(By.xpath("//a[text()='Log in']"));
		loginButton.click();
		
		//email
		WebElement email =driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("muskuakhila@gmail.com");
		
		//password
		WebElement password =driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("Testing@123");
		
		//login
		WebElement login =driver.findElement(By.xpath("//input[@value='Log in']"));
		login.click();
		Thread.sleep(2000);
		
		WebElement accountLogin= driver.findElement(By.xpath("//div[@class='header-links']//a[@class='account']"));
		Thread.sleep(2000);
		if(accountLogin.isDisplayed()) {
			System.out.println("Account is logged succesfully and user is displayed");
		}else {
			System.out.println("Account is not logged succesfully and user is not displayed");
		}
		driver.quit();
	}
	
}
