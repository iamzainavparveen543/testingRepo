import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseKeywordAction {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//            driver.get("https://www.facebook.com/");
        driver.get("https://www.amazon.com/");
//        driver.get("https://emicalculator.net/");
        driver.manage().window().maximize();
//        WebElement loanElement = driver.findElement(By.xpath(("(//div[contains(@class,'ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min' )])[1]")));
        driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
        Thread.sleep(2000);
        WebElement imdb = driver.findElement(By.xpath("//h5[text()='IMDb']"));
        Thread.sleep(2000);


//        WebElement element = driver.findElement(By.id("email"));
//        WebElement element1 = driver.findElement(By.name("pass"));


        Actions action = new Actions(driver);
        Action action1 = action.moveToElement(imdb).click().build();
        action1.perform();

//        action.dragAndDropBy(loanElement,500,0).build().perform();


//      Action action1 = action.contextClick(element).build();
//        action1.perform();
//        Thread.sleep(1000);
////        keyBoard Action
//        action.moveToElement(element).sendKeys("122344")
//
//                .keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c")
//                .keyUp(Keys.CONTROL).moveToElement(element1).click()
//                .keyDown(Keys.CONTROL).sendKeys("v").build().perform();

//        Thread.sleep(2000);
//        action.moveByOffset(100,100).contextClick().build().perform();
//        Thread.sleep(2000);
//        element.sendKeys("zainav");
//        action.doubleClick(element).build().perform();

    }
}
