package Cucumber1.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaStepDeff {
    public WebDriver driver;

    @Given("open chrome browser")
    public void open_chrome_browser() throws Exception {
        Thread.sleep(1000);
        WebDriverManager.chromedriver().setup();
        Thread.sleep(1000);
        driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.manage().window().maximize();


    }

    @When("open url {string}")
    public void open_url(String URL) throws Exception {
        Thread.sleep(1000);
        driver.get(URL);

    }

    @And("enter user email")
    public void enter_user_email() throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("nazimali786@gmail.com");


    }

    @And("enter user password")
    public void enter_user_password() throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@aria-required='true'])[2]")).sendKeys("nazim123");


    }

    @And("user click on login")
    public void user_click_on_login() throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Then("account successfully created")
    public void account_successfully_created() throws Exception {
        Thread.sleep(1000);
        System.out.println("successful");

    }
}
//    ===========================================================






