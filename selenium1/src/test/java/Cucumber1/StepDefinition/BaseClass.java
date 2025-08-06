package Cucumber1.StepDefinition;

import Cucumber1.PageObject.CreateAccountPage;
import Cucumber1.PageObject.LoginPage;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

//parent class
public class BaseClass {

    public WebDriver driver;
    public   CreateAccountPage CreateAc;
    public LoginPage loginPage;
    public static Logger Log;


}
