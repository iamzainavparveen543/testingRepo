import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\MyLearnings\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.amazon.in/");

    }
}
