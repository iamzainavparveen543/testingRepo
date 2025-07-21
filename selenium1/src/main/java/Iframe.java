import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) throws  Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/index.html");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Hello");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        System.out.println("checked");
        Thread.sleep(1000);
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        System.out.println("finished");
        driver.close();





    }
}
