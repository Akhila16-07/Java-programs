package dailyTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTask {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(8000);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("muskuakhila@gmail.com",Keys.TAB,"Kanni123",Keys.TAB);
		Thread.sleep(2000);
		username.sendKeys(Keys.ENTER);
		Thread.sleep(6000);

		
		WebElement searchEle= driver.findElement(By.xpath("//span[contains(text(),'Search')]"));
		searchEle.click();
		Thread.sleep(1000);
		
		WebElement searchInputEle= driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchInputEle.sendKeys("hemsqalearning");
		Thread.sleep(3000);
		
		WebElement hemqalearingEle= driver.findElement(By.xpath("(//div[contains(@class, 'xwib8y2 x1y')])[1]"));
		hemqalearingEle.click();
		Thread.sleep(10000);
		
		WebElement msgTohemqalearing= driver.findElement(By.xpath("//div[contains(text(),'Message')]"));
		msgTohemqalearing.click();
		Thread.sleep(5000);
		
		WebElement notificationMsgNotNow= driver.findElement(By.xpath("//button[contains(text(),'Not Now')]"));
		notificationMsgNotNow.click();
		
		Thread.sleep(4000);
		WebElement msgEle= driver.findElement(By.xpath("//div[@aria-label='Message']"));
		msgEle.sendKeys("Good Evening");
		
		Thread.sleep(2000);
		WebElement sendEle= driver.findElement(By.xpath("//div[contains(text(),'Send')]"));
		sendEle.click();
		
		driver.quit();
		
		
	}
}
