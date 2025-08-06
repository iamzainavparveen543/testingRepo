import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class ScriptExecutor1 {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.paytm.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Mobile Recharge']")));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(4000);
        jse.executeScript("arguments[0].click();", element);
        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com/");

        Thread.sleep(2000);
        jse.executeScript("document.getElementById('email').value='zainav786@gmail.com'");
        Thread.sleep(2000);
        jse.executeScript("document.getElementById('pass').value='987655'");
        Thread.sleep(2000);
        String window = driver.getWindowHandle();
        Thread.sleep(1000);
        System.out.println(window);
        Set<String> windows = driver.getWindowHandles();
        Thread.sleep(1000);
            System.out.println(windows);
        Thread.sleep(2000);
        Iterator<String> it = windows.iterator();
        Thread.sleep(1000);
        while (it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
        driver.close();


        System.out.println("create");
    }
}
