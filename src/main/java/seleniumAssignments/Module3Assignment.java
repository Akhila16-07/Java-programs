package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Module3Assignment {
    static WebDriver driver;

    @BeforeTest
    public void initialization() throws InterruptedException {
        // Initialize WebDriver
    	 driver = new ChromeDriver();
         driver.get("https://demo.guru99.com/test/login.html"); // Correct URL for login
         Thread.sleep(2000); // Allow time for page to load
         driver.manage().window().maximize();
    }

    @Test(dataProvider = "loginData")
    public void login(String username, String password) {
        // Locate and interact with email field
        WebElement loginField = driver.findElement(By.id("email"));
        loginField.clear();
        loginField.sendKeys(username);

        // Locate and interact with password field
        WebElement passwordField = driver.findElement(By.id("passwd"));
        passwordField.clear();
        passwordField.sendKeys(password);

        System.out.println("Attempted login with Username: " + username + " and Password: " + password);
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        // Data provider with test login data
        return new Object[][]{
            {"test1@gmail.com", "password1"},
        };
    }

    @AfterTest
    public void applicationClose() {
        // Close the browser
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed successfully.");
        }
    }
}
