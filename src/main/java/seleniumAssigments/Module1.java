package seleniumAssigments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Module1 {

	public static void main(String[] args) throws InterruptedException {
	//driver intialisation
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demo.guru99.com/test/radio.html");		
		Thread.sleep(2000);		
		driver.manage().window().maximize();
		
		String expectedPageTitle="Radio Button & Check Box Demo";
		
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		
	//verifying the page title
		
		if(pageTitle.equals(expectedPageTitle)) {
			System.out.println("Page title contains " +expectedPageTitle);
		}else {
			System.out.println("Page title doesnot contains " +expectedPageTitle);
		}
		
		//find option and select
		WebElement radioBtn= driver.findElement(By.xpath("//input[@value='Option 1']"));
		radioBtn.click();
		System.out.println("Found option 1 and selected");
		
		//find checkbox
		List<WebElement> checkboxList=driver.findElements(By.xpath("//input[contains(@id, 'vfb-6')]"));
		int checkboxsize=checkboxList.size();
		
		//System.out.println(checkboxsize);
		//System.out.println(checkboxsize-1);
		
		//selected the checkbox2 and checkbox3
		for(int i=checkboxsize-2; i<checkboxsize; i++) {
			checkboxList.get(i).click();
		Thread.sleep(1000);
		}
		System.out.println("Selected checkbox 1 and checkbox 2");
		
		//****************************************************************************************
		
		//opened new website
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		Thread.sleep(2000);
		//country dropdown
		WebElement dropdownlist= driver.findElement(By.xpath("//select[@name='country']"));
		Select dropdown =new Select(dropdownlist);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

	    // Scroll to the element
		js.executeScript("window.scrollBy(0,500)");
		//selected the kuwait by value
	    dropdown.selectByValue("KUWAIT");
		
	    // Get the selected option and print it
        String selectedCountry = dropdown.getFirstSelectedOption().getText();
        System.out.println("Selected country: " + selectedCountry);
        
		driver.quit();	
	}
}
