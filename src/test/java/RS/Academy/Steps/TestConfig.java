package RS.Academy.Steps;

import io.cucumber.plugin.event.Node;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//import static RS.Academy.Steps.DriverManager.driver;


@Configuration
public class TestConfig {



    @Bean
    @Scope("singleton")
    public WebDriver webDriver() {
        System.out.println("----------------  Creating Bean for WebDriver----------------- ");
        WebDriverManager.chromedriver().setup();
//        return DriverManager.getDriver();
        return DriverManager.getDriver();
    }

//    WebDriver driver1 = DriverManager.getDriver();

    @Bean
    public LoginPage LoginPage( WebDriver driver) {
        return new LoginPage(driver);
    }


//    @Bean
//    public LoginPage loginPage() {
//        System.out.println("----------------  Creating Bean for login page----------------- ");
//        System.out.println((new LoginPage()).toString());
//        System.out.println("----------------  Creating Bean for login page----------------- ");
//        return new LoginPage();
//    }


}
