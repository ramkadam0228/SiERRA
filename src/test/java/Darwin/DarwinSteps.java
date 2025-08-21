package Darwin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DarwinSteps extends BaseTest {




//        Given("^When user click on \"([^\"]*)\" and enters \"([^\"]*)\" and \"([^\"]*)\"$", (String arg0, String arg1, String arg2) -> {
//            System.out.println("I am in Given");
//        });
//
//        When("^User click on Submit$", () -> {
//        });
//
//        Then("^Darwin Home Page should be displayed$", () -> {
//        });
        @Given("When user click on {string} and enters {string} and {string}")
        public void whenUserClickOnAndEntersAnd(String link, String userID, String Password) {
            getDriver().get(link);
            getDriver().manage().window().maximize();
                String inTitle = getDriver().getTitle();
                getDriver().findElement(By.linkText("SSO Login")).click();
                System.out.println(getDriver().getTitle());
                getDriver().findElement(By.className("user_icon")).click();
                getDriver().findElement(By.className("Logout")).click();
                String outTitle = getDriver().getTitle();
                System.out.println("Input Title " + inTitle);
                System.out.println("Output Title " + outTitle);
                Assert.assertEquals(inTitle,outTitle);
        }

        @When("User click on Submit")
        public void userClickOnSubmit() {
        }

        @Then("Darwin Home Page should be displayed")
        public void darwinHomePageShouldBeDisplayed() {
        }


}
