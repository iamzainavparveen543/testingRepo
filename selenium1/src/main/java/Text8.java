import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Text8 {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://paytm.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("Bus")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@id,'dwebSourceInput')]")).sendKeys("Dehli");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='dwebDestinationInput']")).sendKeys("Mumbai");
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.id("ac"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();",element);
        System.out.println("clicked");
        driver.findElement(By.xpath("(//div[@class='HQfRO'])[1]")).click();
        driver.close();





    }
}
