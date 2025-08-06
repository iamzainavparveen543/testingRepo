package Cucumber1.StepDefinition;

import Cucumber1.PageObject.CreateAccountPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stepdefine extends BaseClass {
//    private static final Logger log = LoggerFactory.getLogger(Stepdefine.class);
    public WebDriver driver;
    public CreateAccountPage CreateAc;
//    use scenario Hooks
//    @Before
//    public void BeforeHook(){
//        System.out.println("use before hooks.......");
//    }
//    @Before(order = 1)
//    public void BeforeHook1(){
//        System.out.println("use before hooks1.......");
//    }
//
//    @After
//    public void AfterHook(){
//        System.out.println("use after hooks......");
//    }
//    @After(order = 1)
//    public void AfterHook1(){
//        System.out.println("use after hooks1......");
//    }
//
////    use before Step Hooks
//    @BeforeStep
//    public void BeforeStep(){
//        System.out.println("use before step hook.......");
//    }
//    @AfterStep
//    public void AfterStep(){
//        System.out.println("use after step hook......");
//    }
    @Given("user open Chrome browser")
    public void user_open_chrome_browser()throws Exception {
        Thread.sleep(1000);
        WebDriverManager.chromedriver().setup();
        Thread.sleep(1000);
        driver = new ChromeDriver();
        Thread.sleep(1000);
        CreateAc = new CreateAccountPage(driver);
        Thread.sleep(1000);
        driver.manage().window().maximize();
    }
    @When("user open URL {string}")
    public void user_open_url(String url) throws Exception {
        Thread.sleep(2000);
        driver.get(url);
    }
    @And("user enters email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String emailAdd, String password) throws Exception {
        Thread.sleep(2000);
        CreateAc.enterEmailId(emailAdd);
        Thread.sleep(1000);
        CreateAc.enterPassword(password);
    }


    @And("user click on create a new account")
    public void user_click_on_create_a_new_account()throws Exception{
        Thread.sleep(1000);
        CreateAc.createAccount();
    }

    @And("user enters user_info")
    public void user_enters_user_info() throws Exception {
        Thread.sleep(1000);
        CreateAc.enterFirstName("anjum");
        Thread.sleep(1000);
        CreateAc.enterLastName("parveen");
        Thread.sleep(1000);
        CreateAc.enterDay("7");
        Thread.sleep(1000);
        CreateAc.enterMonth("february");
        Thread.sleep(1000);
        CreateAc.enterYear("2003");
        Thread.sleep(1000);
        CreateAc.setGender();
        Thread.sleep(1000);
        CreateAc.enterEmailOrNum("anjumparveen123@gmail.com");
        Thread.sleep(1000);
        CreateAc.enterPass("anjum786");
        Thread.sleep(1000);

    }

    @Then("account should be created successfully")
    public void account_should_be_created_successfully()throws Exception {
        Thread.sleep(1000);
        System.out.println("account successful created");
    }

}
