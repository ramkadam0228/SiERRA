package RS.Academy.Steps;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
//@ContextConfiguration(classes = {RsApplication.class, TestConfig.class})
@SpringBootTest(classes = TestConfig.class)
public class CucumberSpringConfiguration {
}
