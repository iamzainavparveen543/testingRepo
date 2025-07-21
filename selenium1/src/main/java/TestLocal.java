import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLocal {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String path ="C:\\Users\\Admin\\Desktop\\MyLearnings\\gitHub\\index.html";
        String finalpath = "file:///"+path.replace("\\","/");
        driver.get(finalpath);

    }
}
