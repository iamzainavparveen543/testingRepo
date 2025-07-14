import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.youtube.com/");
        driver1.manage().window().maximize();
        driver1.navigate().to("https://www.facebook.com");
        WebElement Element  = driver1.findElement(By.name("email"));
        Element.sendKeys("rakhi542@gmail.com");
        driver1.findElement(By.id("pass")).sendKeys("198765");
        driver1.findElement(By.name("login")).click();
        driver1.findElement(By.linkText("Forgotten password?")).click();
        driver1.findElement(By.partialLinkText("Meta")).click();
    }
}
