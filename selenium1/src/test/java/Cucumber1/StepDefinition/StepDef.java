package Cucumber1.StepDefinition;

import Cucumber1.PageObject.CreateAccountPage;
import Cucumber1.PageObject.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.LogManager;


public class StepDef extends BaseClass{
    public WebDriver driver;
    public LoginPage loginPage;

    //    use scenario hooks
    @Before
    public void setup()throws Exception{
//        Log = LogManager.getLogger("StepDef");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(1000);
        loginPage = new LoginPage(driver);
    }

    @Given("user open Chrome Browser")
    public void user_open_chrome_browser()throws Exception {

        Thread.sleep(1000);
//        CreateAc = new CreateAccountPage(driver);
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }
    @When("user open url {string}")
    public void user_open_url(String url) throws Exception {
        Thread.sleep(2000);
       driver.get(url);
    }
    @And("user enters Email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String emailadd, String password) throws Exception {
        Thread.sleep(2000);
        loginPage.enterEmail(emailadd);
        Thread.sleep(1000);
        loginPage.enterPass(password);
        Thread.sleep(1000);
//        CreateAc.enterEmailId(emailadd);
        Thread.sleep(1000);
//        CreateAc.enterPassword(password);
    }
    @And("user click on login button")
    public void user_click_on_login_button() throws Exception{
        Thread.sleep(2000);
        loginPage.clickOnLogin();
    }
    @Then("user should be redirected to the dashboard")
    public void user_should_be_redirected_to_the_dashboard() throws Exception {
        Thread.sleep(2000);
        System.out.println("Logged in and redirected (You can verify the title or URL here)");
    }
    @After
    public void tearDown(){
        System.out.println("tear Down");
    }


//    ==============================================================================================
//
//    @Given("user open chrome browser")
//    public void user_open_chrome_browser1()throws Exception {
//        Thread.sleep(1000);
//        WebDriverManager.chromedriver().setup();
//        Thread.sleep(1000);
//        driver = new ChromeDriver();
//        Thread.sleep(1000);
//        CreateAc = new CreateAccountPage(driver);
//        Thread.sleep(1000);
//        driver.manage().window().maximize();
//    }
//    @When("user open url {string}")
//    public void user_open_url1(String url) throws Exception {
//        Thread.sleep(2000);
//        driver.get(url);
//    }
//
//    @And("user click on create a new account")
//    public void user_click_on_create_a_new_account()throws Exception{
//        Thread.sleep(1000);
//        CreateAc.createAccount();
//    }
//
//    @And("user enters user_info")
//    public void user_enters_user_info() throws Exception {
//        Thread.sleep(1000);
//       CreateAc.enterFirstName("anjum");
//        Thread.sleep(1000);
//        CreateAc.enterLastName("parveen");
//        Thread.sleep(1000);
//        CreateAc.enterDay("7");
//        Thread.sleep(1000);
//        CreateAc.enterMonth("5");
//        Thread.sleep(1000);
//        CreateAc.enterYear("2003");
//        Thread.sleep(1000);
//
//        Thread.sleep(1000);
//        CreateAc.enterEmailOrNum("anjumparveen123@gmail.com");
//        Thread.sleep(1000);
//        CreateAc.enterPass("anjum786");
//        Thread.sleep(1000);
//
//    }
//
//    @Then("account should be created successfully")
//    public void account_should_be_created_successfully()throws Exception {
//        Thread.sleep(1000);
//       System.out.println("account successful created");
//    }

}

