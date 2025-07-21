import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test7 {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.switchTo().frame(1);
        driver.manage().window().maximize();
        Thread.sleep(2000);
//        Actions actions = new Actions(driver);
//        actions.moveByOffset(50,50).click().build().perform();
        driver.findElement(By.linkText("Music")).click();


    }
}
