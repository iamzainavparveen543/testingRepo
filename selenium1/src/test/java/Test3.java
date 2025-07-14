import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        WebElement element = driver.findElement(By.id("email"));
        element.sendKeys("mahi542@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("12345");
        //driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.partialLinkText("Meta")).click();





    }
}

