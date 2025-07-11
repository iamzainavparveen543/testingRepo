import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\MyLearnings\\chromedriver.exe");
        ChromeDriver dr = new ChromeDriver();
        dr.get("https://www.amazon.in/");

    }
}
