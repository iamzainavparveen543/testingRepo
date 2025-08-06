package testng2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProviderClass {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "getData")
    public void ninjaLoginTest(String username, String password) throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://tutorialsninja.com/demo/");
        Thread.sleep(1000);
        driver.findElement(By.linkText("My Account")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("input-email")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.id("input-password")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(1000);

        // Optional: Add validation to confirm successful login
        Thread.sleep(2000);
        System.out.println("Tested login for user: " + username);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][] {
                {"mohdnoor123@gmail.com","noor1232"},
                {"mohdnoor124@gmail.com","noor1231"},
                {"mohdnoor125@gmail.com","noor1235"}
        };
    }

    @AfterMethod
    public void tearDown() {
    System.out.println("tear down");


    }
}
