package dailyTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilies.WebDriverUtilities;

public class MakeMyTripTask1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
		
		WebDriverUtilities uti = new WebDriverUtilities();
		uti.maximize(driver);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		WebElement closePopUp= driver.findElement(By.xpath("//span[@class='commonModal__close']"));
		closePopUp.click();
		Thread.sleep(2000);
		
		WebElement roundTripEle= driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		roundTripEle.click();
		Thread.sleep(4000);
		
		WebElement fromEle= driver.findElement(By.xpath("//input[@id='fromCity']"));
		fromEle.click();
		Thread.sleep(5000);
		WebElement fromPlaceholderEle= driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromPlaceholderEle.sendKeys("Bengaluru");
		Thread.sleep(4000);
		
		
		WebElement firstAutoSuggestEle= driver.findElement(By.xpath("//div[contains(@class,'react-autosuggest__section-container--first')]"));
		firstAutoSuggestEle.click();
		Thread.sleep(4000);
		
		WebElement toEle= driver.findElement(By.xpath("//input[@id='toCity']"));
		toEle.sendKeys("Bangkok");
		Thread.sleep(4000);
		WebElement firstAutoSuggestEleInTo= driver.findElement(By.xpath("//div[contains(@class,'react-autosuggest__section-container--first')]"));
		firstAutoSuggestEleInTo.click();
		Thread.sleep(2000);
		
		WebElement startDate= driver.findElement(By.xpath("//div[@aria-label='Fri Sep 06 2024']"));
		startDate.click();
		Thread.sleep(2000);
		
		WebElement endDateClick= driver.findElement(By.xpath("//div[@class='dateFiled active']"));
		endDateClick.click();
		Thread.sleep(2000);

		WebElement endDate= driver.findElement(By.xpath("//div[@aria-label='Sun Sep 08 2024']"));
		endDate.click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}
}
