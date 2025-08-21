package RS.Academy.Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;



//@Component
public class BaseTest {



    static final Logger logger = LoggerFactory.getLogger(BaseTest.class);


    @Autowired
    private WebDriver driver;

    @Autowired
    private LoginPage lp;


    @Before
    public void setUp(){
        System.out.println("============ Set Up Method =========");
    }


    @AfterAll
    public static void tearDown(){
        System.out.println("Closing the driver");
        DriverManager.getDriver().manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);

//        if(DriverManager.getDriver() != null){
            DriverManager.quitDriver();
//        }
        logger.info("Driver Closed");
    }

}
