package RS.Academy.Steps;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/RS.Academy/RsLoginMultipleActions.feature",
        glue = "RS.Academy", // Package where step definitions are located
//        plugin = {"pretty", "html:target/cucumber-reports/cucumber-report.html"},
//        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
        plugin = {"pretty", "json:target/allure-results/cucumber.json","html:target/cucumber-reports/cucumber-report.html"}
)
public class RSCucumberTests {
}

