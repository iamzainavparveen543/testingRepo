import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test6{
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        // Step 1: Go to recharge page directly
        driver.get("https://paytm.com/recharge");
        Thread.sleep(1000);
        WebElement mobileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='tel']")));
        mobileInput.sendKeys("7030709543");

        System.out.println(" Mobile number entered successfully");
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[1]"))).sendKeys("jio");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@type,'text')])[2]"))).sendKeys("139");
//        driver.close();
    }
}
