package dailyTasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopAssigment2 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
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
		
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Books')]")).click();
		Thread.sleep(2000);
		
		List<WebElement> addToCartButton=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		Thread.sleep(2000);
		for(WebElement addToCart:addToCartButton ) {
			addToCart.click();
			Thread.sleep(2000);
		}
		
		WebElement shoppingCart=driver.findElement(By.xpath("//li[@id='topcartlink']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, 0);");
		shoppingCart.click();
		Thread.sleep(2000);
		
	
		double calculatedtotal=0.0;
		List<WebElement> totalCostOfEachProduct=driver.findElements(By.xpath("//span[@class='product-subtotal']"));
		for(WebElement  totalCost:totalCostOfEachProduct) {
			String textOfTotal=totalCost.getText();
			double d = Double.valueOf(textOfTotal);
			//System.out.println(d);
			calculatedtotal=calculatedtotal+d;
		
		}
		System.out.println("The total sum is " +calculatedtotal);
		
		WebElement actualTotalElement=driver.findElement(By.xpath("(//div[@class='total-info']//span[@class='product-price'])[1]"));
		String textOfTotal=actualTotalElement.getText();
		double  actualTotal= Double.valueOf(textOfTotal);
		
		if(calculatedtotal==actualTotal) {
			System.out.println("The calcuated and displayed total are same");
		}else {
			System.out.println("The calcuated and displayed total are not same");
		}
		
		//update

		List<WebElement> checkBoxButton =driver.findElements(By.xpath("//input[@name='removefromcart']"));
		for(WebElement checkBox : checkBoxButton ) {
			checkBox.click();
		}
		
		WebElement updateCartButton =driver.findElement(By.xpath("//input[@name='updatecart']"));
		updateCartButton.click();
		
		//logout
		WebElement logOut=driver.findElement(By.xpath("//a[text()='Log out']"));
		logOut.click();
		
		//driver.quit();
	}
}
