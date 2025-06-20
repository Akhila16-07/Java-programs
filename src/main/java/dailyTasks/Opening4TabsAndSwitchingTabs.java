package dailyTasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilies.WebDriverUtilities;

public class Opening4TabsAndSwitchingTabs {

    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverUtilities uti = new WebDriverUtilities();
        uti.maximize(driver);

        Robot robot = new Robot();

        // Open 3 new tabs (total 4 including the first one)
        for (int i = 1; i <= 3; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(1000); // Added delay to ensure tabs open properly
        }

        Thread.sleep(2000);

        // Get all window handles
        Set<String> allIds = driver.getWindowHandles();
        List<String> arr = new ArrayList<>(allIds);

        if (arr.size() < 4) {
            System.out.println("Not enough tabs opened.");
            driver.quit();
            return;
        }

        // Switch to the third tab and open Amazon
        driver.switchTo().window(arr.get(2));
        driver.get("https://www.amazon.in/");
        Thread.sleep(4000);

        // Switch to the first tab and open Facebook
        driver.switchTo().window(arr.get(0));
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        // Switch to the second tab and close it
        driver.switchTo().window(arr.get(1));
        driver.close();
        Thread.sleep(1000);

        // Switch to the fourth tab and close it
        driver.switchTo().window(arr.get(3));
        driver.close();

        Thread.sleep(2000);

        // Quit the driver to close remaining tabs
        driver.quit();
    }
}
