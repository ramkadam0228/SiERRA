package RS.Academy.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;


public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null || isSessionInvalid(driver)) {
            driver = new ChromeDriver(); // Or use WebDriverManager
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private static boolean isSessionInvalid(WebDriver driver) {
        try {
            SessionId sessionId = ((RemoteWebDriver) driver).getSessionId();
            return sessionId == null;
        } catch (Exception e) {
            return true; // Assume invalid if exception is thrown
        }
    }
}





