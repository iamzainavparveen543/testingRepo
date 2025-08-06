package testng2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;


public class OpenBrowser {

    ChromeDriver driver;

    @BeforeMethod
    public void Before_method(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void browserOpen(){
        driver.get("https://www.facebook.com/");
        String actualResult = driver.getTitle();
        String expectedResult = "google";
        Assert.assertEquals(actualResult,expectedResult);

    }
    @AfterMethod
    public void takeAScreenshot(ITestResult result)throws Exception{
        if (result.getStatus()==ITestResult.FAILURE){
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            System.out.println(source);
            File file = new File("C:\\Users\\Admin\\Desktop\\MyLearnings\\gitHub\\Failure.png");
            FileUtils.copyFile(source,file);
        }
        driver.close();
    }

}
