package Darwin;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

@Component
public class BaseTest {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver ==null){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
    public static void quiteDriver(){
        if(driver !=null){
            driver.quit();
            driver=null;
        }
    }

    @After
    public void tearDown(){
        System.out.println("Closing browser");
        driver.quit();
    }
}
