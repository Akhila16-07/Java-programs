package genericUtilies;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {

	/*****************    browser     ***************/
	// method to maximize the browser
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	// method to minimize the browser
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	/**********************end browser*****************************/
	
	/*********************wait****************************/
	// method to wait for some time
	public WebDriverWait WebDriverWaitObject(WebDriver driver, int sec) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		return wait;
		
	}
	
	//mtd to wait for some timwe the page load
	public void waitforPageLoad(WebDriver driver, int sec) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
		driver.manage().window().maximize();
		
	}
	
	//wait untill the element is visible
	public void waitUntilEleVisible(WebDriver driver, WebElement element,int sec) {
		WebDriverWaitObject(driver,sec).until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitUntilAlertIsPresent(WebDriver driver,int sec) {
		WebDriverWaitObject(driver,sec).until(ExpectedConditions.alertIsPresent());
	}
	
	public void waitUntilElementToBeClickable(WebDriver driver, WebElement element,int sec) {
		WebDriverWaitObject(driver,sec).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void presenceOfAllElementsLocatedBy(WebDriver driver, WebElement element,int sec) {
		//WebDriverWaitObject(driver,sec).until(ExpectedConditions.invisibilityOfElementLocated((By) element));
	}
	
	/***********************************End*****************************/
	
	/******************Drop down ****************************/
	//creation of object for dropdown
	public Select selectDropDownOptionsObject(WebElement element) {
		Select sel = new Select(element);
		return sel;		
	}
	
	public void selectDropDownOptionsObject(String text_value, WebElement element) {
		selectDropDownOptionsObject(element).selectByValue(text_value);
	}
	public void selectDropDownOptionsObject(WebElement element,int index) {
		selectDropDownOptionsObject(element).selectByIndex(index);
	}
	
	public void selectDropDownOptionsObject(WebElement element,String value) {
		selectDropDownOptionsObject(element).selectByVisibleText(value);
	}

	/**************************END************************************/	
	
	
	/*******************Mouse actions  ************************/
	//Creation of object for mouse action
	public Actions mouseHoverClickObject(WebDriver driver) {
		Actions act = new  Actions(driver);
		return act;
		
	}
	
	public void mouseHoverSendKeysClick(WebDriver driver) {
		mouseHoverClickObject(driver).sendKeys(Keys.ENTER).perform();
	}
	
	//click the element with mouse
	public void mouseHoverClick(WebDriver driver,WebElement element) {
		mouseHoverClickObject(driver).click(element).perform();
	}
	
	public void mouseHoverDoubleClick(WebDriver driver,WebElement element) {
		mouseHoverClickObject(driver).doubleClick(element).perform();
	}
	
	public void mouseHoverDragAndDrop(WebDriver driver,WebElement src, WebElement destination) {
		mouseHoverClickObject(driver).dragAndDrop(src, destination);
	}
	
	//to right click
	public void mouseHoverRightClick(WebDriver driver) {
		mouseHoverClickObject(driver).contextClick().perform();
	}
	
	//scroll action with mouse hover
	public void mouseHoverScrollAction(WebDriver driver,int x,int y) {
		mouseHoverClickObject(driver).moveByOffset(x, y);
	}
	
	//to right click with the element
	public void mouseHoverRightClick(WebDriver driver,WebElement elemeent) {
		mouseHoverClickObject(driver).contextClick(elemeent).perform();
	}
	/*****************************end*******************************/
	
	/************************Alert********************************/
	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void alertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void alertSendKeys(WebDriver driver, String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	
	/*****************************end*******************************/
	
	public void javascriptExecutorById(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('text-field').value='ABC'");			
	}
	
	public void javascriptExecutorByTextPass(WebDriver driver,WebElement element,String text) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=' "+text+" '",element);			
	}
	
	public void javascriptExecutorByHiddenElement(WebDriver driver,WebElement element,String text) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=' "+text+" '",element);				
	}
	
	public void javascriptExecutorScrollBy(WebDriver driver,int x,int y) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");			
	}
	
	public void javascriptExecutorScrollIntoVieToElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",element );			
	}
}
