import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wikipedia {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("searchInput")).sendKeys("The Alchemist");
        Thread.sleep(3000);
        System.out.println("Alchemist");
        driver.findElement(By.xpath("//i[text()='Search']")).click();
        Thread.sleep(2000);
        System.out.println("clicked");
        WebDriverWait wait = new WebDriverWait(driver,10);
        Thread.sleep(2000);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Developers']")));
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",element);
        Thread.sleep(2000);
        jse.executeScript("arguments[0].click();",element);
        System.out.println("create");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Get started")).click();
        System.out.println("get start clicked");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Learn about Wikimedia technology")).click();
        System.out.println("wikipedia clicked");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[text()='Read more on mediawiki.org'])[1]")).click();
        System.out.println("typed");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated()

    }
}
