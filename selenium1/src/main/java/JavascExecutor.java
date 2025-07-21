import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class JavascExecutor {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://paytm.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='DTH Recharge']")));
        JavascriptExecutor js = (JavascriptExecutor ) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        // Wait briefly after scroll
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}

        // Force click using JavaScript
        js.executeScript("arguments[0].click();", element);

        System.out.println("clicked");
    }
}
