import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathCssPath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
//        driver.manage().window().getSize();
        driver.findElement(By.xpath("//a[text()='Customer Service']")).click();
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.cssSelector("a#u_0_0_rU")).click();
        driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).click();


    }
}
