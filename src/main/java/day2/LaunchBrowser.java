package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	/*	//no need of set.property for 4. version
		// object creation for specfic browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//lauch the url
		driver.get("https://elearning.excelr.com/dashboard");
		
		//get the title of title
		String title = driver.getTitle();
		System.out.println(title);
		
		//get current url
		String  currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//
		driver.quit(); */
	

			public static WebDriver driver;
			public static void firefoxLaunch() throws Throwable {
			// TODO Auto-generated method stub
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(5000);
			driver.quit();
			}
			public static void ChromeLaunch() throws Throwable {
			// TODO Auto-generated method stub
			driver=new ChromeDriver();
			driver.get("https://www.myntra.com/");
			Thread.sleep(5000);
			driver.quit();
			}
			public static void EdgeLaunch() throws
			InterruptedException {
			// TODO Auto-generated method stub
			driver=new EdgeDriver();
			driver.get("https://www.redbus.com/");
			Thread.sleep(5000);
			driver.quit();
			}
			public static void main(String[] args) throws Throwable {
			firefoxLaunch();
			ChromeLaunch();
			EdgeLaunch();
			
	}
}
