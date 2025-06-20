package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethoods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://elearning.excelr.com/dashboard");
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		driver.navigate().to("https://www.orangehrm.com/");
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
	}
}
