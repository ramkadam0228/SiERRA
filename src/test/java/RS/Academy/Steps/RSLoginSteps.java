package RS.Academy.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//import selenium.webdriver.support.ui;
//import static Darwin.BaseTest.driver;






public class RSLoginSteps{
    private WebDriver driver;
    private LoginPage lp;


    public RSLoginSteps(WebDriver driver, LoginPage lp) {
        this.driver = driver;
        this.lp = lp;

    }

    private static final Logger log = LoggerFactory.getLogger(RSLoginSteps.class);



    @Value("${RsAcademy}")
    private String link;



    @Given("user Launches RS page")
    public void userLaunchesPage() {
        System.out.println(link);
//        System.out.println(a);
        driver.get(link);
        driver.manage().window().maximize();
        log.info(driver.getTitle());
        System.out.println(driver.getTitle());
        Assert.assertEquals("Practice Page", driver.getTitle());
        System.out.println("WebDriver Session ID: " + ((RemoteWebDriver) DriverManager.getDriver()).getSessionId());



    }


    @When("user click on radio button")
    public void userClickOnRadioButton() throws InterruptedException {
        System.out.println("In When");
//        driver.findElement(By.xpath("//input[@value='radio1']")).click();
        lp.getRadio1().click();
        Thread.sleep(5000);

    }

    @Then("Radio button should be clickable")
    public void radioButtonShouldBeClickable() throws InterruptedException {
        System.out.println("In Then");

        lp.radioButtonShouldBeClickable();
//        driver.findElement(By.xpath("//input[@id='name']")).click();
//        WebElement text_box = driver.findElement(By.xpath("//input[@id='name']"));
//
//        text_box.sendKeys("Ram Kadam");
//        Thread.sleep(5000);
        lp.sendTestToTextBox();

    }


    @When("user click on {string} button")
    public void userClickOnButton(String arg0) throws InterruptedException {
        WebElement bt = selectRadioButtonByUser(arg0);
        bt.click();
        Thread.sleep(7000);
        System.out.println("Test Is Passed with Button " + arg0);
    }

    WebElement temp;

    private WebElement selectRadioButtonByUser(String radio){
        switch (radio) {
            case "radio1":

                temp = lp.getRadio1();
                break;
            case "radio2":
                temp= lp.getRadio2();
                break;
            case "radio3":
                temp= lp.getRadio3();
                break;

        }
        return temp;
    }

    @And("user select drop down value as  {string}")
    public void userSelectDropDownValueAs(String arg0) throws InterruptedException {
        lp.selectFromDD(arg0);
        System.err.println("============= Drop down selected as ==========" + arg0);
        Thread.sleep(3000);
    }

    @And("user select {string}")
    public void userSelect(String arg0) throws InterruptedException {
        lp.checkBoxClick(arg0);
        System.err.println("============= Check Box selected as ==========" + arg0);
        Thread.sleep(3000);
    }

    @Then("user click on {string}")
    public void userClickOn(String arg0) {
        lp.clickOnHideNShow(arg0);
        System.err.println("============= Check Box selected as ==========" + arg0);
    }


    //    @And("user select drop down value as  {string}")
//    public void userSelectDropDownValueAs(String arg0) throws InterruptedException {
//        selectValueFromDropDown(arg0);
//    }
//
//    private void selectValueFromDropDown(String sel) throws InterruptedException {
//        Select sel1 = new Select(lp.dd);
//           sel1.selectByVisibleText(sel);
//        Thread.sleep(5000);
//    }
        //    @And("user select {string}")
//    public void userSelect(String arg0) throws InterruptedException {
//
//           }

//    @Then("user click on {string}")
//    public void userClickOn(String arg0) {
//        System.out.println(arg0);
//    }


    }

