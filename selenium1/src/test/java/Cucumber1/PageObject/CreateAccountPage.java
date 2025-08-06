package Cucumber1.PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import java.security.PublicKey;

public class CreateAccountPage {
    WebDriver driver;

    public CreateAccountPage(WebDriver dr){
        driver = dr;
        PageFactory.initElements(dr,this);

    }

    @FindBy(name = "email")
    WebElement Email;
    @FindBy(name = "pass")
    WebElement Pass;
    @FindBy(linkText = "Create new account")
    WebElement CreateAccount;
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement FirstName;
    @FindBy(xpath = "//input[@name='lastname']")
    WebElement LastName;
    @FindBy(id = "day" )
    WebElement Day;
    @FindBy(name = "birthday_month")
    WebElement Month;
    @FindBy(name = "birthday_year")
    WebElement Year;
    @FindBy(xpath = "//input[@name='sex' and @value='1']")
    WebElement Gender;
    @FindBy(name = "reg_email__")
    WebElement Email1;
    @FindBy(name = "reg_passwd__")
    WebElement Password;


    public void enterEmailId(String email){
        Email.sendKeys(email);
    }
    public void enterPassword(String password){
        Pass.sendKeys(password);
    }
    public void createAccount(){
        CreateAccount.click();
    }
    public void enterFirstName(String fname){
        FirstName.sendKeys(fname);
    }
    public void enterLastName(String lname){
        LastName.sendKeys(lname);
    }
    public void enterDay(String day){
        Day.sendKeys(day);
    }
    public void enterMonth(String month){
        Month.sendKeys(month);
    }
    public void enterYear(String year){
        Year.sendKeys(year);
    }
    public void setGender(){
        Gender.click();
    }
    public void enterEmailOrNum(String emailNum){
        Email1.sendKeys(emailNum);
    }
    public void enterPass(String pass){
        Password.sendKeys(pass);
    }

}
