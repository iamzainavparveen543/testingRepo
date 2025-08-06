import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

public class MakeMyTrip {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        Actions action = new Actions(driver);
         action.moveByOffset(50,50).click().build().perform();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,10);
        Thread.sleep(1000);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Mobile')]")));
        Thread.sleep(2000);
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        Thread.sleep(2000);
//        js.executeScript("arguments[0].click();",element);
        System.out.println("clicked");
        driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile')]")).sendKeys("9084408050");
        Thread.sleep(1000);
        System.out.println("typed");
        TakesScreenshot ts = (TakesScreenshot) driver;
        Thread.sleep(1000);
        File source = ts.getScreenshotAs(OutputType.FILE);
        System.out.println("created");
        Thread.sleep(1000);
        System.out.println(source);
        Thread.sleep(1000);
        File file = new File("C:\\Users\\Admin\\Desktop\\MyLearnings\\gitHub\\makemytrip.png");
        Thread.sleep(1000);
        System.out.println(" Take to screenshot");
        FileUtils.copyFile(source,file);
        Thread.sleep(1000);
        System.out.println(" execution finished");
    }
}
