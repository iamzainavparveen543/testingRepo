import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScriptExecutor1 {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.paytm.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Mobile Recharge']")));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(4000);
        jse.executeScript("arguments[0].click();", element);
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com/");

        Thread.sleep(2000);
        jse.executeScript("document.getElementById('email').value='zainav786@gmail.com'");
        jse.executeScript("document.getElementById('pass').value='987655'");

        System.out.println("create");
    }
}
