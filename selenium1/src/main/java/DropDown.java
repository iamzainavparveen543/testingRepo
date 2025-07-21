
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.facebook.com/");
        driver2.manage().window().maximize();
        WebElement element =driver2.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]"));
        //element.click();
        System.out.println(element.getText());
        System.out.println(element.getAttribute("Id"));
        System.out.println(element.getAttribute("class"));
        System.out.println(element.getAttribute("role"));
        System.out.println(element.getAttribute("href"));
        element.click();
        driver2.findElements(By.xpath("//a[text()='Create new account']"));
        Thread.sleep(2000);
         Select selectDay = new Select(driver2.findElement(By.xpath("//select[@name='birthday_day']")));
         Select selectMonth =  new Select(driver2.findElement(By.xpath("//select[@name='birthday_month']")));
         Select selectYear = new Select(driver2.findElement(By.xpath("//select[@aria-label='Year']")));
         selectDay.selectByValue("1");
         selectMonth.selectByIndex(0);
         selectYear.selectByVisibleText("2025");


    }
}
