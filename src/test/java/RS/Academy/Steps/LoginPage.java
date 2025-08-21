package RS.Academy.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class LoginPage {


    private static final Logger log = LoggerFactory.getLogger(LoginPage.class);
    //    @Autowired
    private final WebDriver driver;
    // Constructor

    @Autowired
    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this); // Initialize WebElements
        System.out.println("------------------ Web Driver Initialized ---------");
        this.driver = DriverManager.getDriver(); // Always gets valid driver
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//input[@value='radio1']")
    private WebElement radio1;



    public WebElement getRadio1() {
        return radio1;
    }

    public void setRadio1(WebElement radio1) {
        this.radio1 = radio1;
    }

    @FindBy(xpath = "//input[@value='radio2']")
    private WebElement radio2;

    public WebElement getRadio2() {
        return radio2;
    }

    public void setRadio2(WebElement radio2) {
        this.radio2 = radio2;
    }

    public WebElement getRadio3() {
        return radio3;
    }

    public void setRadio3(WebElement radio3) {
        this.radio3 = radio3;
    }

    @FindBy(xpath = "//input[@value='radio3']")
    private WebElement radio3;

    @FindBy(xpath = "//select[@id='dropdown-class-example']")
    private WebElement dd;

    public void selectFromDD(String ddValue){
        Select sel = new Select(dd);
        sel.selectByVisibleText(ddValue);
        log.info("Drop Down Value is selected as " + ddValue);
    }

    @FindBy(xpath = "//input[@id='checkBoxOption1']")
    private WebElement cboption1;

    @FindBy(xpath = "//input[@id='checkBoxOption2']")
    private WebElement cboption2;

    @FindBy(xpath = "//input[@id='checkBoxOption3']")
    private WebElement cboption3;

    public void checkBoxClick(String cb){
        switch (cb) {
            case "Option1": cboption1.click();break;
            case "Option2": cboption2.click();break;
            case "Option3": cboption3.click();break;
        }
    }

    @FindBy(xpath = "//input[@id='hide-textbox']")
    private WebElement hide;

    @FindBy(xpath = "//input[@id='show-textbox']")
    private WebElement show;

    @FindBy(xpath = "//input[@id='displayed-text']")
    private WebElement showtext;


    public void clickOnHideNShow(String hs) {
       switch(hs){
           case "Hide": hide.click();
               System.out.println("Hide Button clicked");
               break;
           case "Show": show.click();
               showtext.sendKeys("Ram Kadam");
               System.out.println("Text Entered");



       }


    }

    @FindBy(xpath="//input[@id='name']")
    private WebElement rb;

    @FindBy(xpath="//input[@id='name']")
    private WebElement textbox;

    public void radioButtonShouldBeClickable(){
//        driver.findElement(By.xpath("//input[@id='name']")).click();
        rb.click();
    }

    public void sendTestToTextBox() throws InterruptedException {
//        WebElement text_box = driver.findElement(By.xpath("//input[@id='name']"));

        textbox.sendKeys("Ram Kadam");
        Thread.sleep(5000);
    }

}
