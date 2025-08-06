package Cucumber1.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//create login class
public class LoginPage {
//    declare Webdriver
    WebDriver driver;
//    create parameterized constructor
    public LoginPage(WebDriver driver1){
       this.driver = driver1;
        PageFactory.initElements(driver1,this);

    }
    @FindBy(id = "email")
    WebElement Email;
    @FindBy(id = "pass")
    WebElement Pass;
    @FindBy(xpath = "//button[@name='login']")
    WebElement loginButton;
    public void enterEmail(String emailAdd)
    {
        Email.sendKeys(emailAdd );

    }
    public void enterPass(String pwd){
        Pass.sendKeys(pwd);
    }
    public void clickOnLogin() {
        loginButton.click();
    }
}

