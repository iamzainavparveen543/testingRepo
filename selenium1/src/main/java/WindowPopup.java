import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowPopup {
    public static void main(String[] args)throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.name("username")).sendKeys(" 9084408050,zainav, zainav@786gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("2356789");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Sign up")).click();
        System.out.println("clicked");
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("sajid123@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("1234567");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        System.out.println("typed");
        Thread.sleep(1000);
        String window = driver.getWindowHandle();
        Thread.sleep(1000);
        System.out.println(window);
        System.out.println("printed");
        Thread.sleep(1000);
        Set<String> windows = driver.getWindowHandles();
        Thread.sleep(1000);
        System.out.println("get window handle");
        System.out.println(windows);
        Thread.sleep(1000);
        System.out.println("create");
//        condition1
       for (String handle : windows){
            System.out.println(handle);
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
            driver.switchTo().window(handle);

       }
//            condition2
//        Iterator<String> it = windows.iterator();
//        while (it.hasNext()){
//            driver.switchTo().window(it.next());
//            System.out.println(driver.getTitle());
//        }
        driver.navigate().back();




        driver.close();
    }
}
