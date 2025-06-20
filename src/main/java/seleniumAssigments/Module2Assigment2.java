package seleniumAssigments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module2Assigment2 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();	
		driver.get("https://demo.guru99.com/test/delete_customer.php");		
		Thread.sleep(2000);		
		driver.manage().window().maximize();
		
		WebElement customerId= driver.findElement(By.xpath("//input[@name='cusid']"));		
		customerId.sendKeys("111");
		
		WebElement submitBtn= driver.findElement(By.xpath("//input[@name='submit']"));
		submitBtn.submit();
		
		
		//switching to alert
		// Handle first alert (confirmation prompt)
        Alert alert = driver.switchTo().alert();
        System.out.println("First Alert Message: " + alert.getText());
        Thread.sleep(2000); // Wait for 2 seconds to observe
        alert.accept(); // Click OK on the first alert

        //Thread.sleep(5000);
        // Handle second alert (success or failure prompt)
        //Alert secondAlert = driver.switchTo().alert();
        System.out.println("Second Alert Message: " + alert.getText());
        Thread.sleep(2000); // Wait for 2 seconds to observe
        alert.accept(); // Click OK on the second alert
		
	}
}
