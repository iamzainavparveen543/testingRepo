import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test7 {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,10);
        Thread.sleep(3000);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shorts"))).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Home"))).click();
        Thread.sleep(5000);
       WebElement element =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Music']"))));
               element.click();
        Thread.sleep(5000);

    }
}
