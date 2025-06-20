package dailyTasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopTask {

/*
 * 	Login to Demowebshop→Search for SmartPhone→click on search→Click on the Product→Click on 
	add your Review→give the review title→review Text→And Rating→click on submit 
	review→logout→quit the browser
	*/
	
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
		
	Thread.sleep(3000);
		//List<WebElement> products =driver.findElements(By.xpath("//input[@value='Add to cart']"));
		WebElement product =driver.findElement(By.xpath("//input[@value='Add to cart']"));
		for(int i =2;i<=4;i++) {
			product.click();
			for(int j=i;j<=4;j++) {
				product.click();
				driver.navigate().back();
			}
		}
		
		
	/*	
	
		//search bar
		WebElement searchBar =driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchBar.click();
		searchBar.sendKeys("SmartPhone");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	
		//product name
		WebElement productName=driver.findElement(By.xpath("//div[@class='product-item']"));
		productName.click();
		
		WebElement addReview=driver.findElement(By.xpath("//a[text()='Add your review']"));
		addReview.click();
		
		// write review
		WebElement addReviewTitle=driver.findElement(By.xpath("//input[@id='AddProductReview_Title']"));
		addReviewTitle.sendKeys("excellent");
		
		
		WebElement addReviewText=driver.findElement(By.xpath("//textArea[@id='AddProductReview_ReviewText']"));
		addReviewText.sendKeys("very good");
		
		
		WebElement addReviewRating=driver.findElement(By.xpath("//input[@name='AddProductReview.Rating']"));
		addReviewRating.click();
		
		WebElement submitReview=driver.findElement(By.xpath("//input[@value='Submit review']"));
		submitReview.click();
		
		//logout
		WebElement logOut=driver.findElement(By.xpath("//a[text()='Log out']"));
		logOut.click();
		
		driver.quit();*/
	}
}
