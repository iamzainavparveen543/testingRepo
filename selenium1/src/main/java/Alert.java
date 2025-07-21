import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/index.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Alert!!']")).click();
        System.out.println("Alert on clicked");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//button[text()='Prompt']")).click();
        Thread.sleep(1000);
        System.out.println("clicked");
//            driver.switchTo().alert().dismiss();
        System.out.println("prompt");
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Prompt']")).sendKeys("Hello");
//        prompt.switchTo().alert().sendKeys("Hello");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        System.out.println("printed");
        driver.close();



    }
}
