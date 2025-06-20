package seleniumAssigments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Module2Assigment3 {

	 public static void main(String[] args) throws InterruptedException, IOException {
		 
		 	ChromeOptions options =  new ChromeOptions();
		 	options.addArguments("--headless");
	       	ChromeDriver driver = new ChromeDriver(options);

	        // Open the URL
	        driver.get("https://jqueryui.com/");
	        Thread.sleep(2000);
	        
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        // Click on the Draggable link
	        WebElement draggableLink = driver.findElement(By.xpath("//a[text()='Draggable']"));
	        draggableLink.click();

	        // Take screenshot before drag
	        File screenshotBefore = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(screenshotBefore, new File(".\\src\\main\\resources\\Screenshots\\beforeDrag.png"));

	        Thread.sleep(3000);
	        
	        // Switch to the frame containing the draggable element
	        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	        driver.switchTo().frame(frame);

	        // Locate the draggable element
	        WebElement draggableElement = driver.findElement(By.id("draggable"));

	        // Get JavaScript Executor instance
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Define the JavaScript to set the position of the draggable element
	        String jsCode = "arguments[0].style.transform = 'translate(130px, 50px)';";
	        js.executeScript(jsCode, draggableElement);

	        // Take screenshot after drag
	        File screenshotAfter = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(screenshotAfter, new File(".\\src\\main\\resources\\Screenshots\\afterDrag.png"));

	        System.out.println("Screenshots taken before and after the drag operation.");
	        
	        // Clean up
	      //  driver.quit();
	 }
}
