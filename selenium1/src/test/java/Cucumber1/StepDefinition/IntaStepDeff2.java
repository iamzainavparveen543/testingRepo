package Cucumber1.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntaStepDeff2 {
    public WebDriver driver;
    @Given("user open chrome browser")
    public void user_open_chrome_browser()throws Exception {
        Thread.sleep(1000);
        driver = new ChromeDriver();
        Thread.sleep(1000);
        WebDriverManager.chromedriver().setup();
        Thread.sleep(1000);
        driver.manage().window().maximize();

    }

    @When("user open url {string}")
    public void user_enter_url(String instUrl){
        driver.get(instUrl);
    }
    @And("user enter email")
    public void user_enter_email()throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("nazimali786@gmail.com");

    }
    @And("user enter password")
    public void user_enter_password()throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@aria-required='true'])[2]")).sendKeys("nazim123");

    }

    @And("user click on login with facebook")
    public void user_click_login_with_facebook()throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Log in with Facebook")).click();
    }

    @And("user enter email address and password")
    public void user_enter_email_address_and_password()throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("noor786@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("noor123");
    }

    @Then("successful login")
    public void successful_login() throws Exception{
        Thread.sleep(1000);
        System.out.println("successful login");

    }

}
