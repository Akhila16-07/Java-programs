package day3;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserResolution {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		Dimension d=new Dimension(500,500);java.awt.Dimension awtDimension = new java.awt.Dimension(1024, 768);
		org.openqa.selenium.Dimension seleniumDimension = new org.openqa.selenium.Dimension(awtDimension.width, awtDimension.height);
		driver.manage().window().setSize(seleniumDimension);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		// to drag a browser
		Point p = new Point(1000,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
