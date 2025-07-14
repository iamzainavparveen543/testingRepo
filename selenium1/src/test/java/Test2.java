import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test2 {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver wdr= new ChromeDriver();
        wdr.get("https://www.amazon.com/");
        wdr.manage().window().maximize();
        wdr.manage().window().fullscreen();
        System.out.println(wdr.manage().window().getSize());
        wdr.getCurrentUrl();
        wdr.navigate().to("https://flipcart.com/");
        wdr.close();
        wdr.quit();







    }
}
