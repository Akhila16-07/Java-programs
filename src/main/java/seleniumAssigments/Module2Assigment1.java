package seleniumAssigments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module2Assigment1 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();		
		driver.get("https://demo.guru99.com/test/web-table-element.php");		
		Thread.sleep(2000);		
		driver.manage().window().maximize();
		
		//feteched the webelement of company
		List<WebElement> companiesList= driver.findElements(By.xpath("//table[@class='dataTable']//td[1]/a"));
		
		//printed all the companies name
		System.out.println("The company names in the table are ");
		for(WebElement companies:companiesList) {
			String companyName=companies.getText();
			System.out.println(companyName);
		}
		
		driver.quit();
	}
}
