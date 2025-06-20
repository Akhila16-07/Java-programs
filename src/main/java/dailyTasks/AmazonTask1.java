package dailyTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilies.WebDriverUtilities;



public class AmazonTask1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverUtilities uti = new WebDriverUtilities();
		uti.maximize(driver);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		
		WebElement searchEle=driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
		searchEle.sendKeys("laptop",Keys.ENTER);
		
		Thread.sleep(3000);
		WebElement frthrthLaptopEle=driver.findElement(By.xpath("//div[@data-cel-widget='search_result_5']//span[@class='a-price-whole']"));
		uti.javascriptExecutorScrollIntoVieToElement(driver, frthrthLaptopEle);
		String textOfPrice=frthrthLaptopEle.getText();
		System.out.println(textOfPrice);
		
		Thread.sleep(3000);
		WebElement addToCartfrthrthLaptopEle=driver.findElement(By.xpath("//div[@data-cel-widget='search_result_5']//button[contains(text(),'Add to cart')]"));
		addToCartfrthrthLaptopEle.click();
		
		driver.quit();
		
	}
}
