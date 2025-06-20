package dailyTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilies.WebDriverUtilities;

public class RedBus_HiddenPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverUtilities uti = new WebDriverUtilities();
		uti.maximize(driver);
		// syntax driver.get("https://username:password@url")
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'14')])[1]")).click();
		
	}
}
