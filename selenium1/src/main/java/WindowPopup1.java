import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowPopup1 {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("anjum3456@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("pass")).sendKeys("12345678");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Instagram")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(2000);
        System.out.println("clicked");
        //driver.findElement(By.partialLinkText("Sign up")).click();
        Thread.sleep(1000);
        System.out.println("sign up clicked");
        String window = driver.getWindowHandle();
        Thread.sleep(1000);
        System.out.println(window);
        Set<String> windows = driver.getWindowHandles();
        Thread.sleep(1000);
        System.out.println(windows);
        Thread.sleep(1000);
        Iterator<String> it = windows.iterator();
        Thread.sleep(2000);
        while (it.hasNext()){
            Thread.sleep(1000);
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
        System.out.println("printed");
        driver.close();




    }
}
